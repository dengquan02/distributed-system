// @GENERATOR:play-routes-compiler
// @SOURCE:X:/JianMu/conf/routes
// @DATE:Wed Sep 29 08:54:43 CST 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def sort(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "sort")
    }
  
    // @LINE:8
    def uploadFromWebPage(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "uploadwebpage")
    }
  
    // @LINE:15
    def visual(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "visual" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)))))
    }
  
    // @LINE:11
    def viewDataset(name:String, inline:Boolean = true, sort:String = "uploadDate", ascending:Boolean = false): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "view/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)) + play.core.routing.queryString(List(if(inline == true) None else Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("inline", inline)), if(sort == "uploadDate") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sort", sort)), if(ascending == false) None else Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("ascending", ascending)))))
    }
  
    // @LINE:5
    def index(sort:String = "uploadDate", ascending:Boolean = false): Call = {
      
      Call("GET", _prefix + play.core.routing.queryString(List(if(sort == "uploadDate") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sort", sort)), if(ascending == false) None else Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("ascending", ascending)))))
    }
  
    // @LINE:9
    def fileUploadApi(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "uploads")
    }
  
    // @LINE:12
    def downloadApp(sort:String = "uploadDate", ascending:Boolean = false): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "downloadapp" + play.core.routing.queryString(List(if(sort == "uploadDate") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sort", sort)), if(ascending == false) None else Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("ascending", ascending)))))
    }
  
    // @LINE:14
    def trajectory(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "trajectory" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)))))
    }
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
