
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Employee],Http.Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(myForm : Form[Employee])(session : Http.Session):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.6*/import helper._


Seq[Any](format.raw/*2.1*/("""
    """),format.raw/*4.1*/("""
    """),_display_(/*5.6*/layout("Edit Employee")/*5.29*/(session)/*5.38*/ {_display_(Seq[Any](format.raw/*5.40*/("""


        """),_display_(/*8.10*/form(action = routes.EmployeeController.update(myForm.get().id))/*8.74*/ {_display_(Seq[Any](format.raw/*8.76*/("""
            """),_display_(/*9.14*/CSRF/*9.18*/.formField),format.raw/*9.28*/("""
            """),_display_(/*10.14*/inputText(myForm("title"),Symbol("_label") -> "Title", Symbol("name") -> "tt", Symbol("size") -> "100", Symbol("class") -> "form-control")),format.raw/*10.152*/("""
            """),_display_(/*11.14*/inputText(myForm("year"),Symbol("_label") -> "Year",Symbol("name") -> "year", Symbol("size") -> "10", Symbol("class") -> "form-control col-md-2")),format.raw/*11.159*/("""
            """),_display_(/*12.14*/inputText(myForm("rating"),Symbol("_label") -> "Rating",Symbol("name") -> "rating", Symbol("size") -> "10", Symbol("class") -> "form-control col-md-2")),format.raw/*12.165*/("""
            """),_display_(/*13.14*/inputText(myForm("company"),Symbol("_label") -> "Company",Symbol("name") -> "company", Symbol("size") -> "100", Symbol("class") -> "form-control")),format.raw/*13.160*/("""

            """),format.raw/*15.13*/("""<button type="submit" name="save" class="btn btn-primary">Update</button>

        """)))}),format.raw/*17.10*/("""
    """)))}),format.raw/*18.6*/("""


"""))
      }
    }
  }

  def render(myForm:Form[Employee],session:Http.Session): play.twirl.api.HtmlFormat.Appendable = apply(myForm)(session)

  def f:((Form[Employee]) => (Http.Session) => play.twirl.api.HtmlFormat.Appendable) = (myForm) => (session) => apply(myForm)(session)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-11-16T21:26:28.833649
                  SOURCE: /Users/mehdi/playProjects/employeedirectory/app/views/employees/edit.scala.html
                  HASH: 4cb0231190905caf3f5b30ead276f8ea8aed2723
                  MATRIX: 978->1|1100->57|1144->51|1175->73|1206->79|1237->102|1254->111|1293->113|1331->125|1403->189|1442->191|1482->205|1494->209|1524->219|1565->233|1725->371|1766->385|1933->530|1974->544|2147->695|2188->709|2356->855|2398->869|2513->953|2549->959
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|36->5|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|42->11|42->11|43->12|43->12|44->13|44->13|46->15|48->17|49->18
                  -- GENERATED --
              */
          