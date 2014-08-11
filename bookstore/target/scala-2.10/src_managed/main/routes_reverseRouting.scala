// @SOURCE:C:/bookstore/conf/routes
// @HASH:a99969ff0524a128a40ecd262757bdde7078bd50
// @DATE:Wed Oct 02 13:30:31 SGT 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:27
class ReverseRentalManager {
    

// @LINE:27
def borrow(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "borrow")
}
                                                
    
}
                          

// @LINE:24
// @LINE:23
// @LINE:22
class ReverseStudentManager {
    

// @LINE:23
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:24
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:22
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:15
def update(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "edit")
}
                                                

// @LINE:14
def edit(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "edit")
}
                                                

// @LINE:18
def deleteBook(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "delete")
}
                                                

// @LINE:9
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "create")
}
                                                

// @LINE:13
def editList(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "editList")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:10
def newBook(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "create")
}
                                                

// @LINE:19
def removeNow(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "deleteBook")
}
                                                
    
}
                          

// @LINE:30
class ReverseAssets {
    

// @LINE:30
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  


// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:27
class ReverseRentalManager {
    

// @LINE:27
def borrow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RentalManager.borrow",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "borrow"})
      }
   """
)
                        
    
}
              

// @LINE:24
// @LINE:23
// @LINE:22
class ReverseStudentManager {
    

// @LINE:23
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentManager.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:24
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentManager.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:22
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentManager.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:15
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "edit"})
      }
   """
)
                        

// @LINE:14
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.edit",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "edit"})
      }
   """
)
                        

// @LINE:18
def deleteBook : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteBook",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delete"})
      }
   """
)
                        

// @LINE:9
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "create"})
      }
   """
)
                        

// @LINE:13
def editList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editList"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:10
def newBook : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newBook",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "create"})
      }
   """
)
                        

// @LINE:19
def removeNow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.removeNow",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteBook"})
      }
   """
)
                        
    
}
              

// @LINE:30
class ReverseAssets {
    

// @LINE:30
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:27
class ReverseRentalManager {
    

// @LINE:27
def borrow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RentalManager.borrow(), HandlerDef(this, "controllers.RentalManager", "borrow", Seq(), "GET", """ Borrow""", _prefix + """borrow""")
)
                      
    
}
                          

// @LINE:24
// @LINE:23
// @LINE:22
class ReverseStudentManager {
    

// @LINE:23
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentManager.authenticate(), HandlerDef(this, "controllers.StudentManager", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:24
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentManager.logout(), HandlerDef(this, "controllers.StudentManager", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:22
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentManager.login(), HandlerDef(this, "controllers.StudentManager", "login", Seq(), "GET", """ Login""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:15
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.update(), HandlerDef(this, "controllers.Application", "update", Seq(), "POST", """""", _prefix + """edit""")
)
                      

// @LINE:14
def edit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.edit(), HandlerDef(this, "controllers.Application", "edit", Seq(), "GET", """""", _prefix + """edit""")
)
                      

// @LINE:18
def deleteBook(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteBook(), HandlerDef(this, "controllers.Application", "deleteBook", Seq(), "GET", """ Delete""", _prefix + """delete""")
)
                      

// @LINE:9
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.create(), HandlerDef(this, "controllers.Application", "create", Seq(), "GET", """ Create""", _prefix + """create""")
)
                      

// @LINE:13
def editList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editList(), HandlerDef(this, "controllers.Application", "editList", Seq(), "GET", """ Edit""", _prefix + """editList""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:10
def newBook(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newBook(), HandlerDef(this, "controllers.Application", "newBook", Seq(), "POST", """""", _prefix + """create""")
)
                      

// @LINE:19
def removeNow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.removeNow(), HandlerDef(this, "controllers.Application", "removeNow", Seq(), "POST", """""", _prefix + """deleteBook""")
)
                      
    
}
                          

// @LINE:30
class ReverseAssets {
    

// @LINE:30
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
                  
      