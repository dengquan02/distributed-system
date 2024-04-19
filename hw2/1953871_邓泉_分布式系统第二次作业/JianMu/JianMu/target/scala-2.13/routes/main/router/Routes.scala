// @GENERATOR:play-routes-compiler
// @SOURCE:X:/JianMu/conf/routes
// @DATE:Wed Sep 29 08:54:43 CST 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  HomeController_1: controllers.HomeController,
  // @LINE:17
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    HomeController_1: controllers.HomeController,
    // @LINE:17
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index(sort:String ?= "uploadDate", ascending:Boolean ?= false)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sort""", """controllers.HomeController.sort(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """uploadwebpage""", """controllers.HomeController.uploadFromWebPage(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """uploads""", """controllers.HomeController.fileUploadApi(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """view/""" + "$" + """name<[^/]+>""", """controllers.HomeController.viewDataset(name:String, inline:Boolean ?= true, sort:String ?= "uploadDate", ascending:Boolean ?= false)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """downloadapp""", """controllers.HomeController.downloadApp(sort:String ?= "uploadDate", ascending:Boolean ?= false)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """trajectory""", """controllers.HomeController.trajectory(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visual""", """controllers.HomeController.visual(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index(fakeValue[String], fakeValue[Boolean]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[String], classOf[Boolean]),
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_HomeController_sort1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sort")))
  )
  private[this] lazy val controllers_HomeController_sort1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_1.sort(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "sort",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """sort""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_uploadFromWebPage2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uploadwebpage")))
  )
  private[this] lazy val controllers_HomeController_uploadFromWebPage2_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_1.uploadFromWebPage(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "uploadFromWebPage",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """uploadwebpage""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_fileUploadApi3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uploads")))
  )
  private[this] lazy val controllers_HomeController_fileUploadApi3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_1.fileUploadApi(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "fileUploadApi",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """uploads""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_viewDataset4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("view/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_viewDataset4_invoker = createInvoker(
    HomeController_1.viewDataset(fakeValue[String], fakeValue[Boolean], fakeValue[String], fakeValue[Boolean]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "viewDataset",
      Seq(classOf[String], classOf[Boolean], classOf[String], classOf[Boolean]),
      "GET",
      this.prefix + """view/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_downloadApp5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("downloadapp")))
  )
  private[this] lazy val controllers_HomeController_downloadApp5_invoker = createInvoker(
    HomeController_1.downloadApp(fakeValue[String], fakeValue[Boolean]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "downloadApp",
      Seq(classOf[String], classOf[Boolean]),
      "GET",
      this.prefix + """downloadapp""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_trajectory6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("trajectory")))
  )
  private[this] lazy val controllers_HomeController_trajectory6_invoker = createInvoker(
    HomeController_1.trajectory(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "trajectory",
      Seq(classOf[String]),
      "GET",
      this.prefix + """trajectory""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_visual7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visual")))
  )
  private[this] lazy val controllers_HomeController_visual7_invoker = createInvoker(
    HomeController_1.visual(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "visual",
      Seq(classOf[String]),
      "GET",
      this.prefix + """visual""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_HomeController_index0_route(params@_) =>
      call(params.fromQuery[String]("sort", Some("uploadDate")), params.fromQuery[Boolean]("ascending", Some(false))) { (sort, ascending) =>
        controllers_HomeController_index0_invoker.call(HomeController_1.index(sort, ascending))
      }
  
    // @LINE:6
    case controllers_HomeController_sort1_route(params@_) =>
      call { 
        controllers_HomeController_sort1_invoker.call(
          req => HomeController_1.sort(req))
      }
  
    // @LINE:8
    case controllers_HomeController_uploadFromWebPage2_route(params@_) =>
      call { 
        controllers_HomeController_uploadFromWebPage2_invoker.call(
          req => HomeController_1.uploadFromWebPage(req))
      }
  
    // @LINE:9
    case controllers_HomeController_fileUploadApi3_route(params@_) =>
      call { 
        controllers_HomeController_fileUploadApi3_invoker.call(
          req => HomeController_1.fileUploadApi(req))
      }
  
    // @LINE:11
    case controllers_HomeController_viewDataset4_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[Boolean]("inline", Some(true)), params.fromQuery[String]("sort", Some("uploadDate")), params.fromQuery[Boolean]("ascending", Some(false))) { (name, inline, sort, ascending) =>
        controllers_HomeController_viewDataset4_invoker.call(HomeController_1.viewDataset(name, inline, sort, ascending))
      }
  
    // @LINE:12
    case controllers_HomeController_downloadApp5_route(params@_) =>
      call(params.fromQuery[String]("sort", Some("uploadDate")), params.fromQuery[Boolean]("ascending", Some(false))) { (sort, ascending) =>
        controllers_HomeController_downloadApp5_invoker.call(HomeController_1.downloadApp(sort, ascending))
      }
  
    // @LINE:14
    case controllers_HomeController_trajectory6_route(params@_) =>
      call(params.fromQuery[String]("name", None)) { (name) =>
        controllers_HomeController_trajectory6_invoker.call(HomeController_1.trajectory(name))
      }
  
    // @LINE:15
    case controllers_HomeController_visual7_route(params@_) =>
      call(params.fromQuery[String]("name", None)) { (name) =>
        controllers_HomeController_visual7_invoker.call(HomeController_1.visual(name))
      }
  
    // @LINE:17
    case controllers_Assets_versioned8_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
