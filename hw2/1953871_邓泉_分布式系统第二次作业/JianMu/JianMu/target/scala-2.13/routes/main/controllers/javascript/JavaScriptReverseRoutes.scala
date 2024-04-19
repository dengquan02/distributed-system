// @GENERATOR:play-routes-compiler
// @SOURCE:X:/JianMu/conf/routes
// @DATE:Wed Sep 29 08:54:43 CST 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def sort: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.sort",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sort"})
        }
      """
    )
  
    // @LINE:8
    def uploadFromWebPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.uploadFromWebPage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "uploadwebpage"})
        }
      """
    )
  
    // @LINE:15
    def visual: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.visual",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "visual" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name0)])})
        }
      """
    )
  
    // @LINE:11
    def viewDataset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.viewDataset",
      """
        function(name0,inline1,sort2,ascending3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "view/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0)) + _qS([(inline1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Boolean]].javascriptUnbind + """)("inline", inline1)), (sort2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sort", sort2)), (ascending3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Boolean]].javascriptUnbind + """)("ascending", ascending3))])})
        }
      """
    )
  
    // @LINE:5
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function(sort0,ascending1) {
          return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(sort0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sort", sort0)), (ascending1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Boolean]].javascriptUnbind + """)("ascending", ascending1))])})
        }
      """
    )
  
    // @LINE:9
    def fileUploadApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.fileUploadApi",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "uploads"})
        }
      """
    )
  
    // @LINE:12
    def downloadApp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.downloadApp",
      """
        function(sort0,ascending1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "downloadapp" + _qS([(sort0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sort", sort0)), (ascending1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Boolean]].javascriptUnbind + """)("ascending", ascending1))])})
        }
      """
    )
  
    // @LINE:14
    def trajectory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.trajectory",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "trajectory" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name0)])})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
