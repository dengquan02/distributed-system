
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import java.util
/*3.2*/import dto.{Condition, DatasetDescription, WebpageDataset}
/*4.2*/import play.mvc.Http.Request

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[String,String,util.List[DatasetDescription],Form[WebpageDataset],Form[Condition],Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(cSort: String, cAscending: String, datasets: util.List[DatasetDescription], uploadForm: Form[WebpageDataset], condForm: Form[Condition])(implicit request: Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.1*/("""
"""),_display_(/*7.2*/main("Telco Data")/*7.20*/ {_display_(Seq[Any](format.raw/*7.22*/("""
    """),format.raw/*8.5*/("""<h3>电信数据
        <a href="https://github.com/tongjimobiml/JianMu" target="_blank">
            <img alt="github link" width=21" height="21"
            src=""""),_display_(/*11.19*/routes/*11.25*/.Assets.versioned("images/github-mark.png")),format.raw/*11.68*/("""">
        </a>
    </h3>
    """),format.raw/*14.40*/("""
    """),_display_(/*15.6*/request/*15.13*/.flash.asScala.data.map/*15.36*/ { case (name, value) =>_display_(Seq[Any](format.raw/*15.60*/("""
        """),format.raw/*16.9*/("""<div class=""""),_display_(/*16.22*/name),format.raw/*16.26*/("""">"""),_display_(/*16.29*/value),format.raw/*16.34*/("""</div>
    """)))}),format.raw/*17.6*/("""
    """),format.raw/*18.5*/("""<hr/>

    <h5>下载App</h5>
    <div><a href=""""),_display_(/*21.20*/routes/*21.26*/.HomeController.downloadApp(cSort, java.lang.Boolean.parseBoolean(cAscending))),format.raw/*21.104*/("""">下载</a></div>
    <hr/>

    """),format.raw/*24.66*/("""
    """),_display_(/*25.6*/if(uploadForm.hasGlobalErrors)/*25.36*/ {_display_(Seq[Any](format.raw/*25.38*/("""
        """),_display_(/*26.10*/uploadForm/*26.20*/.globalErrors.asScala.map/*26.45*/ { error: play.data.validation.ValidationError =>_display_(Seq[Any](format.raw/*26.94*/("""
            """),format.raw/*27.13*/("""<div class="alert alert-warning">
                """),_display_(/*28.18*/error/*28.23*/.key),format.raw/*28.27*/(""": """),_display_(/*28.30*/error/*28.35*/.message),format.raw/*28.43*/("""
            """),format.raw/*29.13*/("""</div>
        """)))}),format.raw/*30.10*/("""
    """)))}),format.raw/*31.6*/("""
    """),format.raw/*32.5*/("""<h5>上传数据集</h5>
    """),_display_(/*33.6*/helper/*33.12*/.form(action = routes.HomeController.uploadFromWebPage, Symbol("enctype") -> "multipart/form-data", Symbol("class") -> "form-inline")/*33.145*/ {_display_(Seq[Any](format.raw/*33.147*/("""
        """),_display_(/*34.10*/helper/*34.16*/.CSRF.formField),format.raw/*34.31*/("""
        """),format.raw/*35.9*/("""<input type="hidden" name="sort" value=""""),_display_(/*35.50*/cSort),format.raw/*35.55*/("""">
        <input type="hidden" name="ascending" value=""""),_display_(/*36.55*/cAscending),format.raw/*36.65*/("""">
        <div class="form-row align-items-bottom">
            <div class="col-auto">
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <label for="token" class="input-group-text">Token</label>
                    </div>
                    <input type="password" id="token" name="token" class="form-control">
                </div>
            </div>
            <div class="col-auto">
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <label for="file" class="input-group-text">数据集</label>
                    </div>
                    <input type="file" id="file" name="file" class="form-control">
                </div>
            </div>
            <div class="col-auto">
                <button type="submit" class="btn btn-dark mb-2">上传</button>
            </div>
        </div>
    """)))}),format.raw/*58.6*/("""
    """),format.raw/*59.5*/("""<hr/>

    """),_display_(/*61.6*/if(condForm.hasGlobalErrors)/*61.34*/ {_display_(Seq[Any](format.raw/*61.36*/("""
        """),_display_(/*62.10*/condForm/*62.18*/.globalErrors.asScala.map/*62.43*/ { error: play.data.validation.ValidationError =>_display_(Seq[Any](format.raw/*62.92*/("""
            """),format.raw/*63.13*/("""<div class="alert alert-warning">
                """),_display_(/*64.18*/error/*64.23*/.key),format.raw/*64.27*/(""": """),_display_(/*64.30*/error/*64.35*/.message),format.raw/*64.43*/("""
            """),format.raw/*65.13*/("""</div>
        """)))}),format.raw/*66.10*/("""
    """)))}),format.raw/*67.6*/("""
    """),format.raw/*68.5*/("""<h5>已有数据列表 <small class="lead"> ( 数据集总数: """),_display_(/*68.47*/(datasets.size)),format.raw/*68.62*/(""" """),format.raw/*68.63*/(""") </small> </h5>
    """),_display_(/*69.6*/helper/*69.12*/.form(action = routes.HomeController.sort, Symbol("enctype") -> "multipart/form-data", Symbol("class") -> "form-inline")/*69.132*/ {_display_(Seq[Any](format.raw/*69.134*/("""
        """),_display_(/*70.10*/helper/*70.16*/.CSRF.formField),format.raw/*70.31*/("""
        """),format.raw/*71.9*/("""<div class="form-row align-items-bottom">
            <div class="col-auto">
                """),_display_(/*73.18*/defining(Seq("name" -> "文件名", "recordNum" -> "数据量", "recordStartDate" -> "数据开始时间",
                    "recordEndDate" -> "数据结束时间", "uploadDate" -> "上传时间", "fileSize" -> "数据文件大小"))/*74.98*/ { opts =>_display_(Seq[Any](format.raw/*74.108*/("""
                    """),format.raw/*75.21*/("""<div class="input-group mb-2">
                        <div class="input-group-prepend">
                            <label for="sort" class="input-group-text">排序标准</label>
                        </div>
                        <select id="sort" name="sort" class="form-control">
                            """),_display_(/*80.30*/for((value, label) <- opts) yield /*80.57*/ {_display_(Seq[Any](format.raw/*80.59*/("""
                                """),format.raw/*81.33*/("""<option """),_display_(/*81.42*/if(value.contentEquals(cSort))/*81.72*/ {_display_(Seq[Any](format.raw/*81.74*/("""selected""")))}),format.raw/*81.83*/(""" """),format.raw/*81.84*/("""value=""""),_display_(/*81.92*/value),format.raw/*81.97*/(""""> """),_display_(/*81.101*/label),format.raw/*81.106*/(""" """),format.raw/*81.107*/("""</option>
                            """)))}),format.raw/*82.30*/("""
                        """),format.raw/*83.25*/("""</select>
                    </div>
                """)))}),format.raw/*85.18*/("""
            """),format.raw/*86.13*/("""</div>
            <div class="col-auto">
                """),_display_(/*88.18*/defining(Seq("true" -> "升序", "false" -> "降序"))/*88.64*/ {opts =>_display_(Seq[Any](format.raw/*88.73*/("""
                    """),format.raw/*89.21*/("""<div class="input-group mb-2">
                        <div class="input-group-prepend">
                            <label for="ascending" class="input-group-text">升/降序 &#8693;</label>
                        </div>
                        <select id="ascending" name="ascending" class="form-control">
                            """),_display_(/*94.30*/for((value, label) <- opts) yield /*94.57*/ {_display_(Seq[Any](format.raw/*94.59*/("""
                                """),format.raw/*95.33*/("""<option """),_display_(/*95.42*/if(value.contentEquals(cAscending))/*95.77*/ {_display_(Seq[Any](format.raw/*95.79*/("""selected""")))}),format.raw/*95.88*/(""" """),format.raw/*95.89*/("""value=""""),_display_(/*95.97*/value),format.raw/*95.102*/(""""> """),_display_(/*95.106*/label),format.raw/*95.111*/(""" """),format.raw/*95.112*/("""</option>
                            """)))}),format.raw/*96.30*/("""
                        """),format.raw/*97.25*/("""</select>
                    </div>
                """)))}),format.raw/*99.18*/("""
            """),format.raw/*100.13*/("""</div>
            <div class="col-auto">
                <button type="submit" class="btn btn-info mb-2">排序</button>
                <a target="_blank"  href=""""),_display_(/*103.44*/routes/*103.50*/.HomeController.visual("")),format.raw/*103.76*/("""">轨迹分类可视化</a>
            </div>
        </div>
    """)))}),format.raw/*106.6*/("""
    """),format.raw/*107.5*/("""<br/>
    <table class="table table-striped table-bordered table-hover table-sm">
        <thead class="thead-light">
            <tr>
                <th>文件名</th> <th>数据量/条</th>
                <th>数据开始时间</th> <th>数据结束时间</th>
                <th>上传时间</th> <th>文件大小</th>
                <th>预览</th>
                <th>下载</th>
                <th>轨迹</th>
            </tr>
        </thead>
        <tbody>
            """),_display_(/*120.14*/for(ds <- datasets) yield /*120.33*/ {_display_(Seq[Any](format.raw/*120.35*/("""
                """),format.raw/*121.17*/("""<tr>
                    <td>"""),_display_(/*122.26*/ds/*122.28*/.getName),format.raw/*122.36*/("""</td> <td>"""),_display_(/*122.47*/ds/*122.49*/.getRecordNum),format.raw/*122.62*/("""</td>
                    <th>"""),_display_(/*123.26*/ds/*123.28*/.getRecordStartDate),format.raw/*123.47*/("""</th> <th>"""),_display_(/*123.58*/ds/*123.60*/.getRecordEndDate),format.raw/*123.77*/("""</th>
                    <th>"""),_display_(/*124.26*/ds/*124.28*/.getUploadDate),format.raw/*124.42*/("""</th> <th>"""),_display_(/*124.53*/ds/*124.55*/.getReadableFileSize),format.raw/*124.75*/("""</th>
                    <th><a target="_blank" href=""""),_display_(/*125.51*/routes/*125.57*/.HomeController.viewDataset(ds.getName, java.lang.Boolean.TRUE, cSort, cAscending)),format.raw/*125.139*/("""">&#10140;</a></th>
                    <th><a href=""""),_display_(/*126.35*/routes/*126.41*/.HomeController.viewDataset(ds.getName, java.lang.Boolean.FALSE, cSort, cAscending)),format.raw/*126.124*/("""">&#10515;</a></th>
                    <th><a target="_blank" href=""""),_display_(/*127.51*/routes/*127.57*/.HomeController.trajectory(ds.getName)),format.raw/*127.95*/("""">&#10140;</a></th>
                </tr>
            """)))}),format.raw/*129.14*/("""
        """),format.raw/*130.9*/("""</tbody>
    </table>
""")))}),format.raw/*132.2*/("""
"""))
      }
    }
  }

  def render(cSort:String,cAscending:String,datasets:util.List[DatasetDescription],uploadForm:Form[WebpageDataset],condForm:Form[Condition],request:Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(cSort,cAscending,datasets,uploadForm,condForm)(request,messages)

  def f:((String,String,util.List[DatasetDescription],Form[WebpageDataset],Form[Condition]) => (Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (cSort,cAscending,datasets,uploadForm,condForm) => (request,messages) => apply(cSort,cAscending,datasets,uploadForm,condForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-09-29T08:54:44.008282900
                  SOURCE: X:/JianMu/app/views/index.scala.html
                  HASH: c40b8ef631bef79f07f9057a86a770c5db868eb8
                  MATRIX: 651->1|675->20|741->80|1175->110|1463->305|1490->307|1516->325|1555->327|1586->332|1771->490|1786->496|1850->539|1908->604|1940->610|1956->617|1988->640|2050->664|2086->673|2126->686|2151->690|2181->693|2207->698|2249->710|2281->715|2353->760|2368->766|2468->844|2526->935|2558->941|2597->971|2637->973|2674->983|2693->993|2727->1018|2814->1067|2855->1080|2933->1131|2947->1136|2972->1140|3002->1143|3016->1148|3045->1156|3086->1169|3133->1185|3169->1191|3201->1196|3247->1216|3262->1222|3405->1355|3446->1357|3483->1367|3498->1373|3534->1388|3570->1397|3638->1438|3664->1443|3748->1500|3779->1510|4755->2456|4787->2461|4825->2473|4862->2501|4902->2503|4939->2513|4956->2521|4990->2546|5077->2595|5118->2608|5196->2659|5210->2664|5235->2668|5265->2671|5279->2676|5308->2684|5349->2697|5396->2713|5432->2719|5464->2724|5533->2766|5569->2781|5598->2782|5646->2804|5661->2810|5791->2930|5832->2932|5869->2942|5884->2948|5920->2963|5956->2972|6077->3066|6266->3246|6315->3256|6364->3277|6700->3586|6743->3613|6783->3615|6844->3648|6880->3657|6919->3687|6959->3689|6999->3698|7028->3699|7063->3707|7089->3712|7121->3716|7148->3721|7178->3722|7248->3761|7301->3786|7386->3840|7427->3853|7513->3912|7568->3958|7615->3967|7664->3988|8023->4320|8066->4347|8106->4349|8167->4382|8203->4391|8247->4426|8287->4428|8327->4437|8356->4438|8391->4446|8418->4451|8450->4455|8477->4460|8507->4461|8577->4500|8630->4525|8715->4579|8757->4592|8946->4753|8962->4759|9010->4785|9094->4838|9127->4843|9574->5262|9610->5281|9651->5283|9697->5300|9755->5330|9767->5332|9797->5340|9836->5351|9848->5353|9883->5366|9942->5397|9954->5399|9995->5418|10034->5429|10046->5431|10085->5448|10144->5479|10156->5481|10192->5495|10231->5506|10243->5508|10285->5528|10369->5584|10385->5590|10490->5672|10572->5726|10588->5732|10694->5815|10792->5885|10808->5891|10868->5929|10955->5984|10992->5993|11046->6016
                  LINES: 24->1|25->3|26->4|31->5|36->6|37->7|37->7|37->7|38->8|41->11|41->11|41->11|44->14|45->15|45->15|45->15|45->15|46->16|46->16|46->16|46->16|46->16|47->17|48->18|51->21|51->21|51->21|54->24|55->25|55->25|55->25|56->26|56->26|56->26|56->26|57->27|58->28|58->28|58->28|58->28|58->28|58->28|59->29|60->30|61->31|62->32|63->33|63->33|63->33|63->33|64->34|64->34|64->34|65->35|65->35|65->35|66->36|66->36|88->58|89->59|91->61|91->61|91->61|92->62|92->62|92->62|92->62|93->63|94->64|94->64|94->64|94->64|94->64|94->64|95->65|96->66|97->67|98->68|98->68|98->68|98->68|99->69|99->69|99->69|99->69|100->70|100->70|100->70|101->71|103->73|104->74|104->74|105->75|110->80|110->80|110->80|111->81|111->81|111->81|111->81|111->81|111->81|111->81|111->81|111->81|111->81|111->81|112->82|113->83|115->85|116->86|118->88|118->88|118->88|119->89|124->94|124->94|124->94|125->95|125->95|125->95|125->95|125->95|125->95|125->95|125->95|125->95|125->95|125->95|126->96|127->97|129->99|130->100|133->103|133->103|133->103|136->106|137->107|150->120|150->120|150->120|151->121|152->122|152->122|152->122|152->122|152->122|152->122|153->123|153->123|153->123|153->123|153->123|153->123|154->124|154->124|154->124|154->124|154->124|154->124|155->125|155->125|155->125|156->126|156->126|156->126|157->127|157->127|157->127|159->129|160->130|162->132
                  -- GENERATED --
              */
          