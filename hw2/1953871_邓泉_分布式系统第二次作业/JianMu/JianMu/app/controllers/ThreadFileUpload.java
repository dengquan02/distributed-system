package controllers;

import dto.UploadResponse;
import play.libs.Files;
import play.libs.Json;
import play.mvc.Http;
import play.mvc.Result;
import services.DatasetService;

import java.util.concurrent.Callable;

import static play.mvc.Results.*;

public class ThreadFileUpload implements Callable<Result> {

    private Integer count;
    private Http.MultipartFormData<Files.TemporaryFile> body;
    private Http.MultipartFormData.FilePart<Files.TemporaryFile> uploadedFile;
    private DatasetService datasetService;

    public ThreadFileUpload(Http.MultipartFormData<Files.TemporaryFile> body, Http.MultipartFormData.FilePart<Files.TemporaryFile> uploadedFile,DatasetService datasetService,Integer count) {
        this.body = body;
        this.uploadedFile = uploadedFile;
        this.datasetService = datasetService;
        this.count = count;
    }

    @Override
    public Result call(){
        if (uploadedFile == null) {
            return badRequest(Json.toJson(
                    new UploadResponse(false, String.valueOf(400), "file is null")));
        }
        boolean saveResult = datasetService.saveDataset(uploadedFile);
        if (saveResult) {
            System.out.println(count + " : 线程");
            return ok(Json.toJson(
                    new UploadResponse(true, String.valueOf(200),
                            "successfully uploaded " + uploadedFile.getFilename())));
        } else {
            return internalServerError(Json.toJson(
                    new UploadResponse(false, String.valueOf(500),
                            "failed because of internal server error")));
        }
    }
}
