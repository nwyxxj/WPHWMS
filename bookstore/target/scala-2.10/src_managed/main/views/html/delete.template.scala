
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
object delete extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Book],play.api.templates.Html] {

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
      """),_display_(Seq[Any](/*11.8*/defining(0)/*11.19*/ { count=>_display_(Seq[Any](format.raw/*11.29*/("""
      <tr>
        <td><form action=""""),_display_(Seq[Any](/*13.28*/routes/*13.34*/.Application.removeNow())),format.raw/*13.58*/("""">"""),_display_(Seq[Any](/*13.61*/b/*13.62*/.getId())),format.raw/*13.70*/("""
        <input type = "hidden" name="id" value="""),_display_(Seq[Any](/*14.49*/b/*14.50*/.getId())),format.raw/*14.58*/(""" ></td>
        <td><input type = "hidden" name="title" value="""),_display_(Seq[Any](/*15.56*/b/*15.57*/.getTitle())),format.raw/*15.68*/(""" >"""),_display_(Seq[Any](/*15.71*/b/*15.72*/.getTitle())),format.raw/*15.83*/("""</td> 
        <td><input type = "hidden" name="credit" value="""),_display_(Seq[Any](/*16.57*/b/*16.58*/.getCredit())),format.raw/*16.70*/(""" >"""),_display_(Seq[Any](/*16.73*/b/*16.74*/.getCredit())),format.raw/*16.86*/("""</td>
        <td><input type="checkbox" name="delete["""),_display_(Seq[Any](/*17.50*/count)),format.raw/*17.55*/("""]" value="""),_display_(Seq[Any](/*17.65*/b/*17.66*/.getId())),format.raw/*17.74*/("""></td>
      </tr>
      """)))})),format.raw/*19.8*/("""
    """)))})),format.raw/*20.6*/("""
  </table>
  <input type = "submit" value="Delete"></form>
""")))})),format.raw/*23.2*/("""
"""))}
    }
    
    def render(books:List[Book]): play.api.templates.Html = apply(books)
    
    def f:((List[Book]) => play.api.templates.Html) = (books) => apply(books)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 04 15:28:40 SGT 2013
                    SOURCE: C:/bookstore/app/views/delete.scala.html
                    HASH: 598cdd6c11fcdf093de8ab6311dd1ba159069173
                    MATRIX: 728->1|824->20|863->25|893->47|932->49|1092->174|1123->189|1162->190|1206->199|1226->210|1274->220|1351->261|1366->267|1412->291|1451->294|1461->295|1491->303|1577->353|1587->354|1617->362|1717->426|1727->427|1760->438|1799->441|1809->442|1842->453|1942->517|1952->518|1986->530|2025->533|2035->534|2069->546|2161->602|2188->607|2234->617|2244->618|2274->626|2333->654|2371->661|2466->725
                    LINES: 26->1|29->1|31->3|31->3|31->3|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|41->13|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|43->15|43->15|43->15|44->16|44->16|44->16|44->16|44->16|44->16|45->17|45->17|45->17|45->17|45->17|47->19|48->20|51->23
                    -- GENERATED --
                */
            