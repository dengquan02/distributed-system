// @GENERATOR:play-routes-compiler
// @SOURCE:X:/JianMu/conf/routes
// @DATE:Wed Sep 29 08:54:43 CST 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
