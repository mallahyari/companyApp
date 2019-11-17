
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
/*2.2*/import misc.Search

object homepage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Search],Http.Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(myForm : Form[Search])(session : Http.Session):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*4.1*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/layout("Home Page")/*7.21*/(session)/*7.30*/ {_display_(Seq[Any](format.raw/*7.32*/("""
    """),_display_(/*8.6*/if(session.getOptional("success").isPresent)/*8.50*/ {_display_(Seq[Any](format.raw/*8.52*/("""
        """),format.raw/*9.9*/("""<div class="alert alert-warning col-md-6 m-3">
            <strong>Done!</strong> """),_display_(/*10.37*/session/*10.44*/.getOptional("success").get()),format.raw/*10.73*/("""
        """),format.raw/*11.9*/("""</div>
    """)))}),format.raw/*12.6*/("""

    """),_display_(/*14.6*/form(action=routes.EmployeeController.search, Symbol("class") -> "m-3")/*14.77*/ {_display_(Seq[Any](format.raw/*14.79*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""
        """),format.raw/*16.9*/("""<div class="row">
            <div class="col">
                <input name="query" value="" class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">

"""),format.raw/*20.173*/("""
            """),format.raw/*21.13*/("""</div>
            <div class="col">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
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


    """)))}),format.raw/*36.6*/("""



""")))}))
      }
    }
  }

  def render(myForm:Form[Search],session:Http.Session): play.twirl.api.HtmlFormat.Appendable = apply(myForm)(session)

  def f:((Form[Search]) => (Http.Session) => play.twirl.api.HtmlFormat.Appendable) = (myForm) => (session) => apply(myForm)(session)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-11-16T22:40:32.507807
                  SOURCE: /Users/mehdi/playProjects/employeedirectory/app/views/employees/homepage.scala.html
                  HASH: e13833d5c933bbb776b2932072a6edb0e3c1e56e
                  MATRIX: 661->2|1006->22|1126->72|1170->70|1197->88|1224->90|1251->109|1268->118|1307->120|1338->126|1390->170|1429->172|1464->181|1574->264|1590->271|1640->300|1676->309|1718->321|1751->328|1831->399|1871->401|1908->411|1921->415|1952->425|1988->434|2196->785|2237->798|2795->1326
                  LINES: 24->2|29->3|32->5|35->4|36->6|37->7|37->7|37->7|37->7|38->8|38->8|38->8|39->9|40->10|40->10|40->10|41->11|42->12|44->14|44->14|44->14|45->15|45->15|45->15|46->16|50->20|51->21|66->36
                  -- GENERATED --
              */
          