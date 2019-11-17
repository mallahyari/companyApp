
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

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Employee,Http.Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employee : Employee)(session : Http.Session):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""

"""),_display_(/*4.2*/layout("Employee Information")/*4.32*/(session)/*4.41*/ {_display_(Seq[Any](format.raw/*4.43*/("""
    """),_display_(/*5.6*/if(session.getOptional("username").isPresent)/*5.51*/ {_display_(Seq[Any](format.raw/*5.53*/("""
        """),format.raw/*6.9*/("""<div class="container">
            <h3>Employee Details</h3>
            <table data-toggle="table" class="table">
                <thead>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Email</th>
                        <th>Address</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>"""),_display_(/*19.30*/employee/*19.38*/.fname),format.raw/*19.44*/("""</td>
                        <td>"""),_display_(/*20.30*/employee/*20.38*/.lname),format.raw/*20.44*/("""</td>
                        <td>"""),_display_(/*21.30*/employee/*21.38*/.email),format.raw/*21.44*/("""</td>
                        <td>"""),_display_(/*22.30*/employee/*22.38*/.address),format.raw/*22.46*/("""</td>
                    </tr>
                </tbody>
            </table>
            <div class="">
                <a href=""""),_display_(/*27.27*/routes/*27.33*/.EmployeeController.edit(employee.id)),format.raw/*27.70*/("""" class="btn btn-primary">Edit</a>
            </div>
        </div>
    """)))}/*30.6*/else/*30.11*/{_display_(Seq[Any](format.raw/*30.12*/("""
        """),format.raw/*31.9*/("""<div class="container">
            <h4>You need to sign in.</h4>
        </div>
    """)))}),format.raw/*34.6*/("""

""")))}),format.raw/*36.2*/("""


"""))
      }
    }
  }

  def render(employee:Employee,session:Http.Session): play.twirl.api.HtmlFormat.Appendable = apply(employee)(session)

  def f:((Employee) => (Http.Session) => play.twirl.api.HtmlFormat.Appendable) = (employee) => (session) => apply(employee)(session)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-11-16T22:22:23.979094
                  SOURCE: /Users/mehdi/playProjects/employeedirectory/app/views/employees/show.scala.html
                  HASH: 46a8cabe9240fd05dbfd6e36a02852ee542b18ae
                  MATRIX: 972->1|1111->47|1139->50|1177->80|1194->89|1233->91|1264->97|1317->142|1356->144|1391->153|1879->614|1896->622|1923->628|1985->663|2002->671|2029->677|2091->712|2108->720|2135->726|2197->761|2214->769|2243->777|2401->908|2416->914|2474->951|2566->1025|2579->1030|2618->1031|2654->1040|2770->1126|2803->1129
                  LINES: 28->1|33->2|35->4|35->4|35->4|35->4|36->5|36->5|36->5|37->6|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|58->27|58->27|58->27|61->30|61->30|61->30|62->31|65->34|67->36
                  -- GENERATED --
              */
          