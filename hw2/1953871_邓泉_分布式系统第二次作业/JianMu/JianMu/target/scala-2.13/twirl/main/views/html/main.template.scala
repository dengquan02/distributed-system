
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href=""""),_display_(/*14.39*/routes/*14.45*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*14.95*/("""">
        <title>"""),_display_(/*15.17*/title),format.raw/*15.22*/("""</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.59*/routes/*16.65*/.Assets.versioned("images/favicon.png")),format.raw/*16.104*/("""">
    </head>
    <body>
        <div class="container-fluid">
            """),_display_(/*20.14*/content),format.raw/*20.21*/("""
        """),format.raw/*21.9*/("""</div>

        <script src=""""),_display_(/*23.23*/routes/*23.29*/.Assets.versioned("javascripts/jquery-3.4.1.min.js")),format.raw/*23.81*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*24.23*/routes/*24.29*/.Assets.versioned("javascripts/popper.min.js")),format.raw/*24.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*25.23*/routes/*25.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*25.78*/("""" type="text/javascript"></script>
    </body>
    <footer class="page-footer font-smaller pt-2">
        <div class="text-center">
            <p class="text-muted font-weight-lighter">Favicon made by
                <a target="_blank" href="https://www.flaticon.com/authors/catkuro" title="catkuro">catkuro</a>
                from <a target="_blank" href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a>
            </p>
        </div>
    </footer>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-09-29T08:54:44.033286800
                  SOURCE: X:/JianMu/app/views/main.scala.html
                  HASH: d33303001a46122d1933686e3f097814d17781e0
                  MATRIX: 1201->255|1325->286|1352->287|1587->495|1602->501|1673->551|1719->570|1745->575|1839->642|1854->648|1915->687|2019->764|2047->771|2083->780|2140->810|2155->816|2228->868|2312->925|2327->931|2394->977|2478->1034|2493->1040|2563->1089
                  LINES: 33->7|38->8|39->9|44->14|44->14|44->14|45->15|45->15|46->16|46->16|46->16|50->20|50->20|51->21|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25
                  -- GENERATED --
              */
          