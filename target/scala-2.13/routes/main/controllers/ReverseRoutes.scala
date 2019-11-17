// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mehdi/playProjects/employeedirectory/conf/routes
// @DATE:Sat Nov 16 21:43:20 EST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseEmployeeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "employees/create")
    }
  
    // @LINE:33
    def logOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employee/logout")
    }
  
    // @LINE:27
    def search(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "employees/search")
    }
  
    // @LINE:29
    def update(id:Integer): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "employees/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:22
    def edit(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employees/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:20
    def show(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employees/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:18
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employees/create")
    }
  
    // @LINE:6
    def index(): Call = {
    
      () match {
      
        // @LINE:6
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
    // @LINE:11
    def login(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "employees/hompage")
    }
  
  }

  // @LINE:37
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
