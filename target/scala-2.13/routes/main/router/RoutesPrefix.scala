// @GENERATOR:play-routes-compiler
// @SOURCE:/home/siamak/Documents/calculator/conf/routes
// @DATE:Mon Dec 02 07:08:06 PST 2019


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
