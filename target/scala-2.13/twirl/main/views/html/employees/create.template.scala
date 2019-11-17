
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

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[Employee],util.Map[String, String],Http.Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(myForm : Form[Employee], offices : util.Map[String,String])(session : Http.Session):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/layout("Create Employee")/*6.27*/(session)/*6.36*/{_display_(Seq[Any](format.raw/*6.37*/("""
    """),_display_(/*7.6*/form(action = routes.EmployeeController.save())/*7.53*/ {_display_(Seq[Any](format.raw/*7.55*/("""
            """),_display_(/*8.14*/CSRF/*8.18*/.formField),format.raw/*8.28*/("""
            """),_display_(/*9.14*/inputText(myForm("fname"),Symbol("_label") -> "First Name", Symbol("name") -> "fname", Symbol("class") -> "form-control col-md-5 mb-5", Symbol("required") -> "true")),format.raw/*9.179*/("""
            """),_display_(/*10.14*/inputText(myForm("lname"),Symbol("_label") -> "Last Name",Symbol("name") -> "lname",  Symbol("class") -> "form-control col-md-5 mb-5", Symbol("required") -> "true")),format.raw/*10.178*/("""
            """),_display_(/*11.14*/inputText(myForm("email"),Symbol("_label") -> "Email",Symbol("name") -> "email", Symbol("class") -> "form-control col-md-5 mb-5", Symbol("required") -> "true")),format.raw/*11.173*/("""
            """),_display_(/*12.14*/inputText(myForm("address"),Symbol("_label") -> "Address",Symbol("name") -> "address", Symbol("class") -> "form-control col-md-5 mb-5", Symbol("required") -> "true")),format.raw/*12.179*/("""
            """),format.raw/*13.13*/("""<div id="phoneHolder" class="">
                """),_display_(/*14.18*/inputText(myForm("phonenumber[]"),Symbol("_label") -> "Phone Number",Symbol("name") -> "phone", Symbol("class") -> "form-control col-md-3 mb-5", Symbol("required") -> "true")),format.raw/*14.192*/("""
            """),format.raw/*15.13*/("""</div>
                    <div class="container row">
                        <button type="button" id="addBtn" class="btn btn-primary mb-2">Add Phone</button>
                        <button type="button" id="removeBtn" class="btn btn-primary mx-sm-3 mb-2">Remove Phone</button>
                    </div>

            """),_display_(/*21.14*/select(myForm("office.id"), options(offices), Symbol("_label") -> "Office", Symbol("_default") -> "-- Choose an office --", Symbol("class") -> "form-control col-md-3 mb-3", Symbol("required") -> "true")),format.raw/*21.216*/("""

             """),format.raw/*23.14*/("""<div class="">
                 <button class="btn btn-success" type="submit">Create Employee</button>
                 <a href="" id="add" class="btn btn-light mx-4" role="button">Cancel</a>
             </div>

        """)))}),format.raw/*28.10*/("""
""")))}),format.raw/*29.2*/("""


"""),format.raw/*32.1*/("""a"""))
      }
    }
  }

  def render(myForm:Form[Employee],offices:util.Map[String, String],session:Http.Session): play.twirl.api.HtmlFormat.Appendable = apply(myForm,offices)(session)

  def f:((Form[Employee],util.Map[String, String]) => (Http.Session) => play.twirl.api.HtmlFormat.Appendable) = (myForm,offices) => (session) => apply(myForm,offices)(session)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-11-16T23:07:02.119265
                  SOURCE: /Users/mehdi/playProjects/employeedirectory/app/views/employees/create.scala.html
                  HASH: b68bace70d71101845f4d76ebd47b2ecc0d25af0
                  MATRIX: 661->1|1029->19|1186->106|1230->104|1257->122|1284->124|1317->149|1334->158|1372->159|1403->165|1458->212|1497->214|1537->228|1549->232|1579->242|1619->256|1805->421|1846->435|2032->599|2073->613|2254->772|2295->786|2482->951|2523->964|2599->1013|2795->1187|2836->1200|3185->1522|3409->1724|3452->1739|3705->1961|3737->1963|3767->1966
                  LINES: 24->1|29->2|32->4|35->3|36->5|37->6|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|41->10|41->10|42->11|42->11|43->12|43->12|44->13|45->14|45->14|46->15|52->21|52->21|54->23|59->28|60->29|63->32
                  -- GENERATED --
              */
          