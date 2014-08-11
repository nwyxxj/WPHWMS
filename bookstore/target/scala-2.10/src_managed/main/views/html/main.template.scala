
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
    </head>
    <body>
      """),_display_(Seq[Any](/*10.8*/if(session.get("user")!=null)/*10.37*/{_display_(Seq[Any](format.raw/*10.38*/("""
        <a href=""""),_display_(Seq[Any](/*11.19*/routes/*11.25*/.StudentManager.logout())),format.raw/*11.49*/("""">Log Out</a>
      """)))})),format.raw/*12.8*/("""
      <h1>"""),_display_(Seq[Any](/*13.12*/title)),format.raw/*13.17*/("""</h1>
      
      """),_display_(Seq[Any](/*15.8*/content)),format.raw/*15.15*/("""
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.Html = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 02 13:30:32 SGT 2013
                    SOURCE: C:/bookstore/app/views/main.scala.html
                    HASH: 150175be23ca7213008da71f048caa493a278381
                    MATRIX: 727->1|834->31|922->84|948->89|1022->128|1060->157|1099->158|1154->177|1169->183|1215->207|1267->228|1315->240|1342->245|1397->265|1426->272
                    LINES: 26->1|29->1|35->7|35->7|38->10|38->10|38->10|39->11|39->11|39->11|40->12|41->13|41->13|43->15|43->15
                    -- GENERATED --
                */
            