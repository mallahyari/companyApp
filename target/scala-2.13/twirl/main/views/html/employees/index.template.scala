
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[User],Http.Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm : Form[User], session : Http.Session):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._;


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/layout("Login Page")/*6.22*/(session)/*6.31*/ {_display_(Seq[Any](format.raw/*6.33*/("""
    """),_display_(/*7.6*/form(routes.EmployeeController.login(), Symbol("class") -> "form-signin")/*7.79*/ {_display_(Seq[Any](format.raw/*7.81*/("""
        """),_display_(/*8.10*/CSRF/*8.14*/.formField),format.raw/*8.24*/("""
        """),_display_(/*9.10*/inputText(userForm("username"), Symbol("_label") -> "Username", Symbol("placeholder") -> "Username", Symbol("class") -> "form-control mb-4")),format.raw/*9.150*/("""
        """),_display_(/*10.10*/inputText(userForm("password"), Symbol("_label") -> "Password", Symbol("type") -> "password", Symbol("placeholder") -> "Password", Symbol("class") -> "form-control mb-4")),format.raw/*10.180*/("""
"""),format.raw/*11.72*/("""
"""),format.raw/*12.114*/("""
"""),format.raw/*13.72*/("""
"""),format.raw/*14.113*/("""

        """),format.raw/*16.9*/("""<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    """)))}),format.raw/*17.6*/("""
""")))}))
      }
    }
  }

  def render(userForm:Form[User],session:Http.Session): play.twirl.api.HtmlFormat.Appendable = apply(userForm,session)

  def f:((Form[User],Http.Session) => play.twirl.api.HtmlFormat.Appendable) = (userForm,session) => apply(userForm,session)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-11-16T21:26:28.870710
                  SOURCE: /Users/mehdi/playProjects/employeedirectory/app/views/employees/index.scala.html
                  HASH: a5bd714287b05736294e3ab3ba71275afe602e89
                  MATRIX: 975->1|1095->51|1140->49|1167->68|1195->71|1223->91|1240->100|1279->102|1310->108|1391->181|1430->183|1466->193|1478->197|1508->207|1544->217|1705->357|1742->367|1934->537|1963->609|1993->723|2022->795|2052->908|2089->918|2204->1003
                  LINES: 28->1|31->3|34->2|35->4|37->6|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|41->10|41->10|42->11|43->12|44->13|45->14|47->16|48->17
                  -- GENERATED --
              */
          