
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Book],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(books: List[Book]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.21*/("""

"""),_display_(Seq[Any](/*3.2*/main("View books")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
  <table border="1">
    <tr>
      <th>Id</th>
      <th>Title</th>
      <th>Credit needed</th>
    </tr>    
    """),_display_(Seq[Any](/*10.6*/for(b <- books) yield /*10.21*/{_display_(Seq[Any](format.raw/*10.22*/("""
    <tr>
      <td><form action=""""),_display_(Seq[Any](/*12.26*/routes/*12.32*/.RentalManager.borrow())),format.raw/*12.55*/("""">"""),_display_(Seq[Any](/*12.58*/b/*12.59*/.getId())),format.raw/*12.67*/("""
      <input type = "hidden" name="id" value="""),_display_(Seq[Any](/*13.47*/b/*13.48*/.getId())),format.raw/*13.56*/(""" ></td>
      <td><input type = "hidden" name="title" value="""),_display_(Seq[Any](/*14.54*/b/*14.55*/.getTitle())),format.raw/*14.66*/(""" >"""),_display_(Seq[Any](/*14.69*/b/*14.70*/.getTitle())),format.raw/*14.81*/("""</td> 
      <td><input type = "hidden" name="credit" value="""),_display_(Seq[Any](/*15.55*/b/*15.56*/.getCredit())),format.raw/*15.68*/(""" >"""),_display_(Seq[Any](/*15.71*/b/*15.72*/.getCredit())),format.raw/*15.84*/("""</td>
      <td><input type="submit" value="Borrow"></td></form>
    </tr>
    """)))})),format.raw/*18.6*/("""
  </table>
  <form action="""),_display_(Seq[Any](/*20.17*/routes/*20.23*/.Application.editList())),format.raw/*20.46*/(""">
    <input type="submit" value="Edit Book Details">
  </form>
  <form action="""),_display_(Seq[Any](/*23.17*/routes/*23.23*/.Application.create())),format.raw/*23.44*/(""">
    <input type="submit" value="Add New Book">
  </form>
  <form action="""),_display_(Seq[Any](/*26.17*/routes/*26.23*/.Application.deleteBook())),format.raw/*26.48*/(""">
    <input type="submit" value="Delete Book..">
  </form>
""")))})),format.raw/*29.2*/("""
"""))}
    }
    
    def render(books:List[Book]): play.api.templates.Html = apply(books)
    
    def f:((List[Book]) => play.api.templates.Html) = (books) => apply(books)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 02 13:31:05 SGT 2013
                    SOURCE: C:/bookstore/app/views/index.scala.html
                    HASH: 666393e7b7c2bb0e3e0f4d07f5e953ec019e4113
                    MATRIX: 727->1|823->20|860->23|886->41|925->43|1078->161|1109->176|1148->177|1219->212|1234->218|1279->241|1318->244|1328->245|1358->253|1441->300|1451->301|1481->309|1578->370|1588->371|1621->382|1660->385|1670->386|1703->397|1800->458|1810->459|1844->471|1883->474|1893->475|1927->487|2038->567|2102->595|2117->601|2162->624|2278->704|2293->710|2336->731|2447->806|2462->812|2509->837|2601->898
                    LINES: 26->1|29->1|31->3|31->3|31->3|38->10|38->10|38->10|40->12|40->12|40->12|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|42->14|42->14|42->14|43->15|43->15|43->15|43->15|43->15|43->15|46->18|48->20|48->20|48->20|51->23|51->23|51->23|54->26|54->26|54->26|57->29
                    -- GENERATED --
                */
            