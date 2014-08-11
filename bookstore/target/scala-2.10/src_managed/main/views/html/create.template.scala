
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
object create extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("Create Book")/*1.21*/ {_display_(Seq[Any](format.raw/*1.23*/("""
    
  <form method="POST" action=""""),_display_(Seq[Any](/*3.32*/routes/*3.38*/.Application.newBook())),format.raw/*3.60*/("""">
    Id:
    <input type="text" name="id"><br/>
    Title:
    <input type="text" name="title"><br/>
    Credits needed:
    <input type="text" name="credit"><br/>
    <input type="submit" value="Add"><br/>
""")))})))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 01 00:02:28 SGT 2013
                    SOURCE: C:/bookstore/app/views/create.scala.html
                    HASH: 973eb253651205ecb044d611ff066d9630a45c59
                    MATRIX: 797->1|824->20|863->22|937->61|951->67|994->89
                    LINES: 29->1|29->1|29->1|31->3|31->3|31->3
                    -- GENERATED --
                */
            