
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
object edit extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: String, title: String, credit: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.45*/("""

"""),_display_(Seq[Any](/*3.2*/main("Edit Book")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
    
  <form method="POST" action=""""),_display_(Seq[Any](/*5.32*/routes/*5.38*/.Application.update())),format.raw/*5.59*/("""">
    Id:
    <input type="text" name="id" value="""),_display_(Seq[Any](/*7.41*/id)),format.raw/*7.43*/(""" readonly><br/>
    Title:
    <input type="text" name="title" value="""),_display_(Seq[Any](/*9.44*/title)),format.raw/*9.49*/("""><br/>
    Credits needed:
    <input type="text" name="credit" value="""),_display_(Seq[Any](/*11.45*/credit)),format.raw/*11.51*/("""><br/>
    <input type="submit" value="Update"><br/>
""")))})))}
    }
    
    def render(id:String,title:String,credit:String): play.api.templates.Html = apply(id,title,credit)
    
    def f:((String,String,String) => play.api.templates.Html) = (id,title,credit) => apply(id,title,credit)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 01 00:15:50 SGT 2013
                    SOURCE: C:/bookstore/app/views/edit.scala.html
                    HASH: 60867fb5a834fa9594e20f939020508be0e82f64
                    MATRIX: 736->1|856->44|895->49|920->66|959->68|1033->107|1047->113|1089->134|1177->187|1200->189|1307->261|1333->266|1442->339|1470->345
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|35->7|35->7|37->9|37->9|39->11|39->11
                    -- GENERATED --
                */
            