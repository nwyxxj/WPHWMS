
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
object delete_list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Book],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(books: List[Book]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.21*/("""

"""),_display_(Seq[Any](/*3.2*/main("Delete book(s)")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
  <table border="1">
    <tr>
      <th>Id</th>
      <th>Title</th>
      <th>Credit needed</th>
    </tr>    
    """),_display_(Seq[Any](/*10.6*/for(b <- books) yield /*10.21*/{_display_(Seq[Any](format.raw/*10.22*/("""
      <tr>
        <td><form action=""""),_display_(Seq[Any](/*12.28*/routes/*12.34*/.Application.removeNow())),format.raw/*12.58*/("""" method="POST">"""),_display_(Seq[Any](/*12.75*/b/*12.76*/.getId())),format.raw/*12.84*/("""
        <input type = "hidden" name="id" value="""),_display_(Seq[Any](/*13.49*/b/*13.50*/.getId())),format.raw/*13.58*/(""" ></td>
        <td><input type = "hidden" name="title" value="""),_display_(Seq[Any](/*14.56*/b/*14.57*/.getTitle())),format.raw/*14.68*/(""" >"""),_display_(Seq[Any](/*14.71*/b/*14.72*/.getTitle())),format.raw/*14.83*/("""</td> 
        <td><input type = "hidden" name="credit" value="""),_display_(Seq[Any](/*15.57*/b/*15.58*/.getCredit())),format.raw/*15.70*/(""" >"""),_display_(Seq[Any](/*15.73*/b/*15.74*/.getCredit())),format.raw/*15.86*/("""</td>
        <td><input type="submit" value="Delete"></td></form>
      </tr>
   """)))})),format.raw/*18.5*/("""
  </table>
""")))})))}
    }
    
    def render(books:List[Book]): play.api.templates.Html = apply(books)
    
    def f:((List[Book]) => play.api.templates.Html) = (books) => apply(books)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 04 15:30:14 SGT 2013
                    SOURCE: C:/bookstore/app/views/delete_list.scala.html
                    HASH: 48ec41476fe13990236d779997b95a11e67402e8
                    MATRIX: 733->1|829->20|868->25|898->47|937->49|1097->174|1128->189|1167->190|1244->231|1259->237|1305->261|1358->278|1368->279|1398->287|1484->337|1494->338|1524->346|1624->410|1634->411|1667->422|1706->425|1716->426|1749->437|1849->501|1859->502|1893->514|1932->517|1942->518|1976->530|2093->616
                    LINES: 26->1|29->1|31->3|31->3|31->3|38->10|38->10|38->10|40->12|40->12|40->12|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|42->14|42->14|42->14|43->15|43->15|43->15|43->15|43->15|43->15|46->18
                    -- GENERATED --
                */
            