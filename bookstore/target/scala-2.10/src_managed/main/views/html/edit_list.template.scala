
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
object edit_list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Book],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(books: List[Book]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.21*/("""

"""),_display_(Seq[Any](/*3.2*/main("Edit books")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
  <table border="1">
    <tr>
      <th>Id</th>
      <th>Title</th>
      <th>Credit needed</th>
    </tr>    
    """),_display_(Seq[Any](/*10.6*/for(b <- books) yield /*10.21*/{_display_(Seq[Any](format.raw/*10.22*/("""
    <tr>
      <td><form action=""""),_display_(Seq[Any](/*12.26*/routes/*12.32*/.Application.edit())),format.raw/*12.51*/("""">"""),_display_(Seq[Any](/*12.54*/b/*12.55*/.getId())),format.raw/*12.63*/("""
      <input type = "hidden" name="id" value="""),_display_(Seq[Any](/*13.47*/b/*13.48*/.getId())),format.raw/*13.56*/(""" ></td>
      <td><input type = "hidden" name="title" value="""),_display_(Seq[Any](/*14.54*/b/*14.55*/.getTitle())),format.raw/*14.66*/(""" >"""),_display_(Seq[Any](/*14.69*/b/*14.70*/.getTitle())),format.raw/*14.81*/("""</td> 
      <td><input type = "hidden" name="credit" value="""),_display_(Seq[Any](/*15.55*/b/*15.56*/.getCredit())),format.raw/*15.68*/(""" >"""),_display_(Seq[Any](/*15.71*/b/*15.72*/.getCredit())),format.raw/*15.84*/("""</td>
      <td><input type="submit" value="Edit"></td></form>
    </tr>
    """)))})),format.raw/*18.6*/("""
  </table>
""")))})))}
    }
    
    def render(books:List[Book]): play.api.templates.Html = apply(books)
    
    def f:((List[Book]) => play.api.templates.Html) = (books) => apply(books)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 02 13:30:32 SGT 2013
                    SOURCE: C:/bookstore/app/views/edit_list.scala.html
                    HASH: a5881d6b4d3f6d3eb71f3241f3cafd7a1cfd4595
                    MATRIX: 731->1|827->20|866->25|892->43|931->45|1091->170|1122->185|1161->186|1234->223|1249->229|1290->248|1329->251|1339->252|1369->260|1453->308|1463->309|1493->317|1591->379|1601->380|1634->391|1673->394|1683->395|1716->406|1814->468|1824->469|1858->481|1897->484|1907->485|1941->497|2053->578
                    LINES: 26->1|29->1|31->3|31->3|31->3|38->10|38->10|38->10|40->12|40->12|40->12|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|42->14|42->14|42->14|43->15|43->15|43->15|43->15|43->15|43->15|46->18
                    -- GENERATED --
                */
            