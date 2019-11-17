
package views.html

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
/*8.2*/import helper._

object layout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Http.Session,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*10.2*/(title: String)(session : Http.Session)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*11.1*/("""
"""),format.raw/*12.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*15.62*/("""
        """),format.raw/*16.9*/("""<title>"""),_display_(/*16.17*/title),format.raw/*16.22*/("""</title>
"""),format.raw/*17.51*/("""
        """),format.raw/*18.9*/("""<link rel="stylesheet" type="text/css" href=""""),_display_(/*18.55*/routes/*18.61*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*18.103*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*19.55*/routes/*19.61*/.Assets.versioned("css/bootstrap-table.min.css")),format.raw/*19.109*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*20.55*/routes/*20.61*/.Assets.versioned("css/style.css")),format.raw/*20.95*/("""">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
            <a class="navbar-brand" href="#">Company Directory App</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a class="nav-item nav-link active" href=""""),_display_(/*30.64*/routes/*30.70*/.EmployeeController.index()),format.raw/*30.97*/("""">Home <span class="sr-only">(current)</span></a>
                    """),_display_(/*31.22*/if(session.getOptional("admin").isPresent)/*31.64*/ {_display_(Seq[Any](format.raw/*31.66*/("""
                        """),format.raw/*32.25*/("""<a class="nav-item nav-link bg-primary text-white" href=""""),_display_(/*32.83*/routes/*32.89*/.EmployeeController.create()),format.raw/*32.117*/("""">Add Employee</a>
                    """)))}),format.raw/*33.22*/("""
                """),format.raw/*34.17*/("""</div>
            </div>
            """),_display_(/*36.14*/if(session.getOptional("username").isPresent)/*36.59*/ {_display_(Seq[Any](format.raw/*36.61*/("""
                """),format.raw/*37.17*/("""<span class="nav-item navbar-text col-sm-2 text-capitalize bg-primary text-white font-weight-bolder">Welcome """),_display_(/*37.127*/session/*37.134*/.getOptional("firstname").get()),format.raw/*37.165*/("""</span>
                <a href=""""),_display_(/*38.27*/routes/*38.33*/.EmployeeController.logOut()),format.raw/*38.61*/("""" class="btn btn-dark my-2 my-sm-0">Log Out</a>

            """)))}/*40.14*/else/*40.19*/{_display_(Seq[Any](format.raw/*40.20*/("""
                """),format.raw/*41.17*/("""<span class="nav-item navbar-text">Not LoggedIn</span>
            """)))}),format.raw/*42.14*/("""

        """),format.raw/*44.9*/("""</nav>
        """),format.raw/*46.32*/("""
        """),format.raw/*47.9*/("""<div class="container">
            """),_display_(/*48.14*/content),format.raw/*48.21*/("""
        """),format.raw/*49.9*/("""</div>


        <script src=""""),_display_(/*52.23*/routes/*52.29*/.Assets.versioned("js/jquery-3.4.1.min.js")),format.raw/*52.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*53.23*/routes/*53.29*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*53.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*54.23*/routes/*54.29*/.Assets.versioned("js/bootstrap-table.min.js")),format.raw/*54.75*/(""""></script>
        <script src=""""),_display_(/*55.23*/routes/*55.29*/.Assets.versioned("js/myscript.js")),format.raw/*55.64*/("""" type="text/javascript"></script>

    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,session:Http.Session,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(session)(content)

  def f:((String) => (Http.Session) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (session) => (content) => apply(title)(session)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-11-16T21:26:28.796869
                  SOURCE: /Users/mehdi/playProjects/employeedirectory/app/views/layout.scala.html
                  HASH: cef47c6f780338bafa7935cc16b726287627505a
                  MATRIX: 651->261|991->279|1140->334|1168->335|1248->440|1284->449|1319->457|1345->462|1382->521|1418->530|1491->576|1506->582|1570->624|1654->681|1669->687|1739->735|1823->792|1838->798|1893->832|2548->1460|2563->1466|2611->1493|2709->1564|2760->1606|2800->1608|2853->1633|2938->1691|2953->1697|3003->1725|3074->1765|3119->1782|3185->1821|3239->1866|3279->1868|3324->1885|3462->1995|3479->2002|3532->2033|3593->2067|3608->2073|3657->2101|3738->2163|3751->2168|3790->2169|3835->2186|3934->2254|3971->2264|4014->2369|4050->2378|4114->2415|4142->2422|4178->2431|4236->2462|4251->2468|4315->2511|4399->2568|4414->2574|4475->2614|4559->2671|4574->2677|4641->2723|4702->2757|4717->2763|4773->2798
                  LINES: 24->8|29->10|34->11|35->12|38->15|39->16|39->16|39->16|40->17|41->18|41->18|41->18|41->18|42->19|42->19|42->19|43->20|43->20|43->20|53->30|53->30|53->30|54->31|54->31|54->31|55->32|55->32|55->32|55->32|56->33|57->34|59->36|59->36|59->36|60->37|60->37|60->37|60->37|61->38|61->38|61->38|63->40|63->40|63->40|64->41|65->42|67->44|68->46|69->47|70->48|70->48|71->49|74->52|74->52|74->52|75->53|75->53|75->53|76->54|76->54|76->54|77->55|77->55|77->55
                  -- GENERATED --
              */
          