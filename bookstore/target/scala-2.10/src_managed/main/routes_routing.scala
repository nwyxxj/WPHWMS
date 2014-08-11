// @SOURCE:C:/bookstore/conf/routes
// @HASH:a99969ff0524a128a40ecd262757bdde7078bd50
// @DATE:Wed Oct 02 13:30:31 SGT 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Application_create1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("create"))))
        

// @LINE:10
private[this] lazy val controllers_Application_newBook2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("create"))))
        

// @LINE:13
private[this] lazy val controllers_Application_editList3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editList"))))
        

// @LINE:14
private[this] lazy val controllers_Application_edit4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("edit"))))
        

// @LINE:15
private[this] lazy val controllers_Application_update5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("edit"))))
        

// @LINE:18
private[this] lazy val controllers_Application_deleteBook6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete"))))
        

// @LINE:19
private[this] lazy val controllers_Application_removeNow7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteBook"))))
        

// @LINE:22
private[this] lazy val controllers_StudentManager_login8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:23
private[this] lazy val controllers_StudentManager_authenticate9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:24
private[this] lazy val controllers_StudentManager_logout10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:27
private[this] lazy val controllers_RentalManager_borrow11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("borrow"))))
        

// @LINE:30
private[this] lazy val controllers_Assets_at12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """create""","""controllers.Application.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """create""","""controllers.Application.newBook()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editList""","""controllers.Application.editList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """edit""","""controllers.Application.edit()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """edit""","""controllers.Application.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete""","""controllers.Application.deleteBook()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteBook""","""controllers.Application.removeNow()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.StudentManager.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.StudentManager.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.StudentManager.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """borrow""","""controllers.RentalManager.borrow()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Application_create1(params) => {
   call { 
        invokeHandler(controllers.Application.create(), HandlerDef(this, "controllers.Application", "create", Nil,"GET", """ Create""", Routes.prefix + """create"""))
   }
}
        

// @LINE:10
case controllers_Application_newBook2(params) => {
   call { 
        invokeHandler(controllers.Application.newBook(), HandlerDef(this, "controllers.Application", "newBook", Nil,"POST", """""", Routes.prefix + """create"""))
   }
}
        

// @LINE:13
case controllers_Application_editList3(params) => {
   call { 
        invokeHandler(controllers.Application.editList(), HandlerDef(this, "controllers.Application", "editList", Nil,"GET", """ Edit""", Routes.prefix + """editList"""))
   }
}
        

// @LINE:14
case controllers_Application_edit4(params) => {
   call { 
        invokeHandler(controllers.Application.edit(), HandlerDef(this, "controllers.Application", "edit", Nil,"GET", """""", Routes.prefix + """edit"""))
   }
}
        

// @LINE:15
case controllers_Application_update5(params) => {
   call { 
        invokeHandler(controllers.Application.update(), HandlerDef(this, "controllers.Application", "update", Nil,"POST", """""", Routes.prefix + """edit"""))
   }
}
        

// @LINE:18
case controllers_Application_deleteBook6(params) => {
   call { 
        invokeHandler(controllers.Application.deleteBook(), HandlerDef(this, "controllers.Application", "deleteBook", Nil,"GET", """ Delete""", Routes.prefix + """delete"""))
   }
}
        

// @LINE:19
case controllers_Application_removeNow7(params) => {
   call { 
        invokeHandler(controllers.Application.removeNow(), HandlerDef(this, "controllers.Application", "removeNow", Nil,"POST", """""", Routes.prefix + """deleteBook"""))
   }
}
        

// @LINE:22
case controllers_StudentManager_login8(params) => {
   call { 
        invokeHandler(controllers.StudentManager.login(), HandlerDef(this, "controllers.StudentManager", "login", Nil,"GET", """ Login""", Routes.prefix + """login"""))
   }
}
        

// @LINE:23
case controllers_StudentManager_authenticate9(params) => {
   call { 
        invokeHandler(controllers.StudentManager.authenticate(), HandlerDef(this, "controllers.StudentManager", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:24
case controllers_StudentManager_logout10(params) => {
   call { 
        invokeHandler(controllers.StudentManager.logout(), HandlerDef(this, "controllers.StudentManager", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:27
case controllers_RentalManager_borrow11(params) => {
   call { 
        invokeHandler(controllers.RentalManager.borrow(), HandlerDef(this, "controllers.RentalManager", "borrow", Nil,"GET", """ Borrow""", Routes.prefix + """borrow"""))
   }
}
        

// @LINE:30
case controllers_Assets_at12(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}
    
}
        