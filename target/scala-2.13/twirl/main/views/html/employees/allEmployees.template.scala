
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

object allEmployees extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[Employee],Http.Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[Employee])(session : Http.Session):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""

"""),_display_(/*4.2*/layout("All Employees")/*4.25*/(session)/*4.34*/ {_display_(Seq[Any](format.raw/*4.36*/("""
    """),format.raw/*5.5*/("""<div id="empTableHolder" class="container">
        <table id="empTable">
            <thead>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Address</th>
            </thead>
            <tbody>
            """),_display_(/*14.14*/for(employee <- employees) yield /*14.40*/ {_display_(Seq[Any](format.raw/*14.42*/("""
                """),format.raw/*15.17*/("""<tr>
                    <td>"""),_display_(/*16.26*/employee/*16.34*/.fname),format.raw/*16.40*/("""</td>
                    <td>"""),_display_(/*17.26*/employee/*17.34*/.lname),format.raw/*17.40*/("""</td>
                    <td>"""),_display_(/*18.26*/employee/*18.34*/.email),format.raw/*18.40*/("""</td>
                    <td>"""),_display_(/*19.26*/employee/*19.34*/.address),format.raw/*19.42*/("""</td>
                </tr>
            """)))}),format.raw/*21.14*/("""
            """),format.raw/*22.13*/("""</tbody>
        </table>
    </div>
""")))}))
      }
    }
  }

  def render(employees:List[Employee],session:Http.Session): play.twirl.api.HtmlFormat.Appendable = apply(employees)(session)

  def f:((List[Employee]) => (Http.Session) => play.twirl.api.HtmlFormat.Appendable) = (employees) => (session) => apply(employees)(session)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-11-16T21:26:28.883334
                  SOURCE: /Users/mehdi/playProjects/employeedirectory/app/views/employees/allEmployees.scala.html
                  HASH: 9e510f68983a0ade3945f3ae8bd3db9ba4ab2b93
                  MATRIX: 986->1|1131->53|1159->56|1190->79|1207->88|1246->90|1277->95|1587->378|1629->404|1669->406|1714->423|1771->453|1788->461|1815->467|1873->498|1890->506|1917->512|1975->543|1992->551|2019->557|2077->588|2094->596|2123->604|2195->645|2236->658
                  LINES: 28->1|33->2|35->4|35->4|35->4|35->4|36->5|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|52->21|53->22
                  -- GENERATED --
              */
          