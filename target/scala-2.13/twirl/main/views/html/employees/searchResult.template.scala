
package views.html.employees

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import java.util
/*2.2*/import misc.Search

object searchResult extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[Search],Optional[util.List[Employee]],Http.Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(myForm : Form[Search], employees: Optional[util.List[Employee]])(session : Http.Session):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*4.1*/("""
"""),format.raw/*6.1*/("""

"""),_display_(/*8.2*/layout("Search Result")/*8.25*/(session)/*8.34*/ {_display_(Seq[Any](format.raw/*8.36*/("""
    """),_display_(/*9.6*/form(action=routes.EmployeeController.search, Symbol("class") -> "m-3")/*9.77*/ {_display_(Seq[Any](format.raw/*9.79*/("""
        """),_display_(/*10.10*/CSRF/*10.14*/.formField),format.raw/*10.24*/("""
        """),format.raw/*11.9*/("""<div class="row">
            <div class="col">
                <input name="query" value="" class="form-control mr-md-2 " type="search" placeholder="Search" aria-label="Search">
                """),format.raw/*14.189*/("""
            """),format.raw/*15.13*/("""</div>
            <div class="col">
                <button class="btn btn-outline-success my-sm-0" type="submit">Search</button>
            </div>
        </div>
        <div class="row input-group">
            <div class="col-md-2">
                <input type="radio" name="searchType" class="col-md-2" value="email" checked>Email
            </div>
            <div class="col-md-2">
                <input type="radio" name="searchType" class="col-md-2" value="phone">Phone
            </div>
        </div>
    """)))}),format.raw/*28.6*/("""
    """),format.raw/*29.5*/("""<div id="empTableHolder" class="container">
        """),_display_(/*30.10*/if(employees.isPresent)/*30.33*/ {_display_(Seq[Any](format.raw/*30.35*/("""
            """),format.raw/*31.13*/("""<h4 class="flex-md-row">Search Result(s):</h4>
            <table id="empTable">
                <thead>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Office</th>
                    <th>Phone</th>
                    <th>Address</th>
                </thead>
                <tbody>
                """),_display_(/*42.18*/for(employee <- employees.get()) yield /*42.50*/ {_display_(Seq[Any](format.raw/*42.52*/("""
                    """),format.raw/*43.21*/("""<tr>
                        <td>"""),_display_(/*44.30*/employee/*44.38*/.fname),format.raw/*44.44*/("""</td>
                        <td>"""),_display_(/*45.30*/employee/*45.38*/.lname),format.raw/*45.44*/("""</td>
                        <td>"""),_display_(/*46.30*/employee/*46.38*/.email),format.raw/*46.44*/("""</td>
                        <td>"""),_display_(/*47.30*/employee/*47.38*/.office.officename),format.raw/*47.56*/("""</td>
                        <td>
                        """),_display_(/*49.26*/for(phone <- employee.phones) yield /*49.55*/ {_display_(Seq[Any](format.raw/*49.57*/("""
                            """),format.raw/*50.29*/("""<span>"""),_display_(/*50.36*/phone/*50.41*/.phonenumber),format.raw/*50.53*/("""</span><br/>
                        """)))}),format.raw/*51.26*/("""
                        """),format.raw/*52.25*/("""</td>

                        """),_display_(/*54.26*/if(session.getOptional("admin").isPresent)/*54.68*/ {_display_(Seq[Any](format.raw/*54.70*/("""
                            """),format.raw/*55.29*/("""<td>"""),_display_(/*55.34*/employee/*55.42*/.address),format.raw/*55.50*/("""</td>
                        """)))}/*56.26*/else if(session.getOptional("username").get() == employee.email)/*56.90*/ {_display_(Seq[Any](format.raw/*56.92*/("""
                            """),format.raw/*57.29*/("""<td>"""),_display_(/*57.34*/employee/*57.42*/.address),format.raw/*57.50*/("""</td>
                        """)))}/*58.26*/else/*58.31*/{_display_(Seq[Any](format.raw/*58.32*/("""
                            """),format.raw/*59.29*/("""<td></td>
                        """)))}),format.raw/*60.26*/("""
                    """),format.raw/*61.21*/("""</tr>
                """)))}),format.raw/*62.18*/("""
                """),format.raw/*63.17*/("""</tbody>
            </table>
        """)))}/*65.10*/else/*65.15*/{_display_(Seq[Any](format.raw/*65.16*/("""
            """),format.raw/*66.13*/("""<h3>No Employees Found!</h3>
        """)))}),format.raw/*67.10*/("""
    """),format.raw/*68.5*/("""</div>
""")))}))
      }
    }
  }

  def render(myForm:Form[Search],employees:Optional[util.List[Employee]],session:Http.Session): play.twirl.api.HtmlFormat.Appendable = apply(myForm,employees)(session)

  def f:((Form[Search],Optional[util.List[Employee]]) => (Http.Session) => play.twirl.api.HtmlFormat.Appendable) = (myForm,employees) => (session) => apply(myForm,employees)(session)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-11-17T10:37:03.449162
                  SOURCE: /Users/mehdi/playProjects/employeedirectory/app/views/employees/searchResult.scala.html
                  HASH: 3efead79ecb2dad46d1f3fae5dd4f6c3e5a5bb6b
                  MATRIX: 661->1|685->19|1064->39|1226->131|1270->129|1297->147|1325->150|1356->173|1373->182|1412->184|1443->190|1522->261|1561->263|1598->273|1611->277|1642->287|1678->296|1902->663|1943->676|2494->1197|2526->1202|2606->1255|2638->1278|2678->1280|2719->1293|3139->1686|3187->1718|3227->1720|3276->1741|3337->1775|3354->1783|3381->1789|3443->1824|3460->1832|3487->1838|3549->1873|3566->1881|3593->1887|3655->1922|3672->1930|3711->1948|3798->2008|3843->2037|3883->2039|3940->2068|3974->2075|3988->2080|4021->2092|4090->2130|4143->2155|4202->2187|4253->2229|4293->2231|4350->2260|4382->2265|4399->2273|4428->2281|4478->2312|4551->2376|4591->2378|4648->2407|4680->2412|4697->2420|4726->2428|4776->2459|4789->2464|4828->2465|4885->2494|4951->2529|5000->2550|5054->2573|5099->2590|5157->2629|5170->2634|5209->2635|5250->2648|5319->2686|5351->2691
                  LINES: 24->1|25->2|30->3|33->5|36->4|37->6|39->8|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|45->14|46->15|59->28|60->29|61->30|61->30|61->30|62->31|73->42|73->42|73->42|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|80->49|80->49|80->49|81->50|81->50|81->50|81->50|82->51|83->52|85->54|85->54|85->54|86->55|86->55|86->55|86->55|87->56|87->56|87->56|88->57|88->57|88->57|88->57|89->58|89->58|89->58|90->59|91->60|92->61|93->62|94->63|96->65|96->65|96->65|97->66|98->67|99->68
                  -- GENERATED --
              */
          