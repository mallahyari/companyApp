// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mehdi/playProjects/employeedirectory/conf/routes
// @DATE:Sat Nov 16 21:43:20 EST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  EmployeeController_0: controllers.EmployeeController,
  // @LINE:37
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    EmployeeController_0: controllers.EmployeeController,
    // @LINE:37
    Assets_1: controllers.Assets
  ) = this(errorHandler, EmployeeController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, EmployeeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.EmployeeController.index(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employees""", """controllers.EmployeeController.index(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employees/hompage""", """controllers.EmployeeController.login(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employees/hompage""", """controllers.EmployeeController.index(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employees/create""", """controllers.EmployeeController.create(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employees/""" + "$" + """id<[^/]+>""", """controllers.EmployeeController.show(id:Integer, request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employees/edit/""" + "$" + """id<[^/]+>""", """controllers.EmployeeController.edit(id:Integer, request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employees/create""", """controllers.EmployeeController.save(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employees/search""", """controllers.EmployeeController.search(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employees/""" + "$" + """id<[^/]+>""", """controllers.EmployeeController.update(id:Integer, request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/logout""", """controllers.EmployeeController.logOut(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_EmployeeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_EmployeeController_index0_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      EmployeeController_0.index(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "index",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_EmployeeController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees")))
  )
  private[this] lazy val controllers_EmployeeController_index1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      EmployeeController_0.index(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "index",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """employees""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_EmployeeController_login2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees/hompage")))
  )
  private[this] lazy val controllers_EmployeeController_login2_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      EmployeeController_0.login(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "login",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """employees/hompage""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_EmployeeController_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees/hompage")))
  )
  private[this] lazy val controllers_EmployeeController_index3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      EmployeeController_0.index(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "index",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """employees/hompage""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_EmployeeController_create4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees/create")))
  )
  private[this] lazy val controllers_EmployeeController_create4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      EmployeeController_0.create(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "create",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """employees/create""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_EmployeeController_show5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeController_show5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      EmployeeController_0.show(fakeValue[Integer], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "show",
      Seq(classOf[Integer], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """employees/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_EmployeeController_edit6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeController_edit6_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      EmployeeController_0.edit(fakeValue[Integer], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "edit",
      Seq(classOf[Integer], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """employees/edit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_EmployeeController_save7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees/create")))
  )
  private[this] lazy val controllers_EmployeeController_save7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      EmployeeController_0.save(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "save",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """employees/create""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_EmployeeController_search8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees/search")))
  )
  private[this] lazy val controllers_EmployeeController_search8_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      EmployeeController_0.search(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "search",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """employees/search""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_EmployeeController_update9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeController_update9_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      EmployeeController_0.update(fakeValue[Integer], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "update",
      Seq(classOf[Integer], classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """employees/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_EmployeeController_logOut10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/logout")))
  )
  private[this] lazy val controllers_EmployeeController_logOut10_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      EmployeeController_0.logOut(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "logOut",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """employee/logout""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
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
  
    // @LINE:6
    case controllers_EmployeeController_index0_route(params@_) =>
      call { 
        controllers_EmployeeController_index0_invoker.call(
          req => EmployeeController_0.index(req))
      }
  
    // @LINE:9
    case controllers_EmployeeController_index1_route(params@_) =>
      call { 
        controllers_EmployeeController_index1_invoker.call(
          req => EmployeeController_0.index(req))
      }
  
    // @LINE:11
    case controllers_EmployeeController_login2_route(params@_) =>
      call { 
        controllers_EmployeeController_login2_invoker.call(
          req => EmployeeController_0.login(req))
      }
  
    // @LINE:13
    case controllers_EmployeeController_index3_route(params@_) =>
      call { 
        controllers_EmployeeController_index3_invoker.call(
          req => EmployeeController_0.index(req))
      }
  
    // @LINE:18
    case controllers_EmployeeController_create4_route(params@_) =>
      call { 
        controllers_EmployeeController_create4_invoker.call(
          req => EmployeeController_0.create(req))
      }
  
    // @LINE:20
    case controllers_EmployeeController_show5_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_EmployeeController_show5_invoker.call(
          req => EmployeeController_0.show(id, req))
      }
  
    // @LINE:22
    case controllers_EmployeeController_edit6_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_EmployeeController_edit6_invoker.call(
          req => EmployeeController_0.edit(id, req))
      }
  
    // @LINE:25
    case controllers_EmployeeController_save7_route(params@_) =>
      call { 
        controllers_EmployeeController_save7_invoker.call(
          req => EmployeeController_0.save(req))
      }
  
    // @LINE:27
    case controllers_EmployeeController_search8_route(params@_) =>
      call { 
        controllers_EmployeeController_search8_invoker.call(
          req => EmployeeController_0.search(req))
      }
  
    // @LINE:29
    case controllers_EmployeeController_update9_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_EmployeeController_update9_invoker.call(
          req => EmployeeController_0.update(id, req))
      }
  
    // @LINE:33
    case controllers_EmployeeController_logOut10_route(params@_) =>
      call { 
        controllers_EmployeeController_logOut10_invoker.call(
          req => EmployeeController_0.logOut(req))
      }
  
    // @LINE:37
    case controllers_Assets_versioned11_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
