
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("Login")/*1.15*/{_display_(Seq[Any](format.raw/*1.16*/("""
  <form action=""""),_display_(Seq[Any](/*2.18*/routes/*2.24*/.StudentManager.authenticate())),format.raw/*2.54*/("""" method="POST">
    """),_display_(Seq[Any](/*3.6*/if(flash.get("error"))/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""
      <div class="notification failure">
      """),_display_(Seq[Any](/*5.8*/flash/*5.13*/.get("error"))),format.raw/*5.26*/("""
    """)))})),format.raw/*6.6*/("""
    Username
    <input type="textbox" name="user"><br/>
    Password
    <input type="textbox" name="password"><br/>
    <input type="submit" value="Login"><br/>
  </form>

""")))})),format.raw/*14.2*/("""
  """))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 02 13:01:05 SGT 2013
                    SOURCE: C:/bookstore/app/views/login.scala.html
                    HASH: 51e268b1cbf1dd857377809a9f793f12329aef27
                    MATRIX: 796->1|817->14|855->15|909->34|923->40|974->70|1031->93|1061->115|1100->117|1185->168|1198->173|1232->186|1269->193|1484->377
                    LINES: 29->1|29->1|29->1|30->2|30->2|30->2|31->3|31->3|31->3|33->5|33->5|33->5|34->6|42->14
                    -- GENERATED --
                */
            