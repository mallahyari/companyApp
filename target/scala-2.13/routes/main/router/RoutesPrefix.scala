// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mehdi/playProjects/employeedirectory/conf/routes
// @DATE:Sat Nov 16 21:43:20 EST 2019


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
