
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

object trajectory extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(trajectory: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">
        <title>轨迹回放</title>
        <link rel="stylesheet" href="https://a.amap.com/jsapi_demos/static/demo-center/css/demo-center.css"/>
        <style>
                html, body, #container """),format.raw/*12.40*/("""{"""),format.raw/*12.41*/("""
                    """),format.raw/*13.21*/("""height: 100%;
                    width: 100%;
                """),format.raw/*15.17*/("""}"""),format.raw/*15.18*/("""

                """),format.raw/*17.17*/(""".color """),format.raw/*17.24*/("""{"""),format.raw/*17.25*/("""
                    """),format.raw/*18.21*/("""width: 5rem;
                    height: 0.6rem;
                    display: inline-block;
                    margin: 0 1rem;
                """),format.raw/*22.17*/("""}"""),format.raw/*22.18*/("""

                """),format.raw/*24.17*/(""".input-card .btn """),format.raw/*24.34*/("""{"""),format.raw/*24.35*/("""
                    """),format.raw/*25.21*/("""margin-right: 1.2rem;
                    width: 9rem;
                """),format.raw/*27.17*/("""}"""),format.raw/*27.18*/("""

                """),format.raw/*29.17*/(""".input-card .btn:last-child """),format.raw/*29.45*/("""{"""),format.raw/*29.46*/("""
                    """),format.raw/*30.21*/("""margin-right: 0;
                """),format.raw/*31.17*/("""}"""),format.raw/*31.18*/("""
        """),format.raw/*32.9*/("""</style>
    </head>
    <body>
        <div id="container"></div>
        <div class="info">
            预测轨迹:<div class='color' style='background-color: red'></div><br>
            实际轨迹:<div class='color' style='background-color: #0091ea'></div>
            <div class="input-card">
                <h4>轨迹回放控制</h4>
                <div class="input-item">
                    <input type="button" class="btn" value="开始动画" id="start" onclick="startAnimation()"/>
                    <input type="button" class="btn" value="暂停动画" id="pause" onclick="pauseAnimation()"/>
                </div>
                <div class="input-item">
                    <input type="button" class="btn" value="继续动画" id="resume" onclick="resumeAnimation()"/>
                    <input type="button" class="btn" value="停止动画" id="stop" onclick="stopAnimation()"/>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="https://webapi.amap.com/maps?v=1.4.15&key=37f1f9cb88dbbf5a536591ba33b30b00"></script>
        <script src="assets/javascripts/GPSconvert.js"></script>
        <script>
                var trajectory ="""),_display_(/*54.34*/trajectory),format.raw/*54.44*/(""";
                var firstPoint = [];
                firstPoint.push(trajectory[0]);
                var marker,
                        lineArr = GPS.gcj_encrypt(trajectory);
                var map = new AMap.Map("container", """),format.raw/*59.53*/("""{"""),format.raw/*59.54*/("""
                    """),format.raw/*60.21*/("""resizeEnable: true,
                    center: GPS.gcj_encrypt(firstPoint)[0],
                    zoom: 17
                """),format.raw/*63.17*/("""}"""),format.raw/*63.18*/(""");

                marker = new AMap.Marker("""),format.raw/*65.42*/("""{"""),format.raw/*65.43*/("""
                    """),format.raw/*66.21*/("""map: map,
                    position: GPS.gcj_encrypt(firstPoint)[0],
                    icon: "https://webapi.amap.com/images/car.png",
                    offset: new AMap.Pixel(-26, -13),
                    autoRotation: true,
                    angle: -90,
                """),format.raw/*72.17*/("""}"""),format.raw/*72.18*/(""");

                // 绘制轨迹
                var polyline = new AMap.Polyline("""),format.raw/*75.50*/("""{"""),format.raw/*75.51*/("""
                    """),format.raw/*76.21*/("""map: map,
                    path: lineArr,
                    showDir: true,
                    strokeColor: "#0091ea",  //线颜色
                    // strokeOpacity: 1,     //线透明度
                    strokeWeight: 6,      //线宽
                    // strokeStyle: "solid"  //线样式
                """),format.raw/*83.17*/("""}"""),format.raw/*83.18*/(""");

                var passedPolyline = new AMap.Polyline("""),format.raw/*85.56*/("""{"""),format.raw/*85.57*/("""
                    """),format.raw/*86.21*/("""map: map,
                    // path: lineArr,
                    strokeColor: "#AF5",  //线颜色
                    // strokeOpacity: 1,     //线透明度
                    strokeWeight: 6,      //线宽
                    // strokeStyle: "solid"  //线样式
                """),format.raw/*92.17*/("""}"""),format.raw/*92.18*/(""");


                marker.on('moving', function (e) """),format.raw/*95.50*/("""{"""),format.raw/*95.51*/("""
                    """),format.raw/*96.21*/("""passedPolyline.setPath(e.passedPath);
                """),format.raw/*97.17*/("""}"""),format.raw/*97.18*/(""");

                map.setFitView();

                function startAnimation() """),format.raw/*101.43*/("""{"""),format.raw/*101.44*/("""
                    """),format.raw/*102.21*/("""marker.moveAlong(lineArr, 200);
                """),format.raw/*103.17*/("""}"""),format.raw/*103.18*/("""

                """),format.raw/*105.17*/("""function pauseAnimation() """),format.raw/*105.43*/("""{"""),format.raw/*105.44*/("""
                    """),format.raw/*106.21*/("""marker.pauseMove();
                """),format.raw/*107.17*/("""}"""),format.raw/*107.18*/("""

                """),format.raw/*109.17*/("""function resumeAnimation() """),format.raw/*109.44*/("""{"""),format.raw/*109.45*/("""
                    """),format.raw/*110.21*/("""marker.resumeMove();
                """),format.raw/*111.17*/("""}"""),format.raw/*111.18*/("""

                """),format.raw/*113.17*/("""function stopAnimation() """),format.raw/*113.42*/("""{"""),format.raw/*113.43*/("""
                    """),format.raw/*114.21*/("""marker.stopMove();
                """),format.raw/*115.17*/("""}"""),format.raw/*115.18*/("""
        """),format.raw/*116.9*/("""</script>
    </body>
</html>
"""))
      }
    }
  }

  def render(trajectory:String): play.twirl.api.HtmlFormat.Appendable = apply(trajectory)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (trajectory) => apply(trajectory)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-09-29T08:54:44.055291700
                  SOURCE: X:/JianMu/app/views/trajectory.scala.html
                  HASH: 90c02b0cdd8e6d72259ecad3e6693cb78a88be5e
                  MATRIX: 953->1|1067->22|1094->23|1539->440|1568->441|1617->462|1708->525|1737->526|1783->544|1818->551|1847->552|1896->573|2068->717|2097->718|2143->736|2188->753|2217->754|2266->775|2365->846|2394->847|2440->865|2496->893|2525->894|2574->915|2635->948|2664->949|2700->958|3875->2106|3906->2116|4164->2346|4193->2347|4242->2368|4395->2493|4424->2494|4497->2539|4526->2540|4575->2561|4885->2843|4914->2844|5019->2921|5048->2922|5097->2943|5422->3240|5451->3241|5538->3300|5567->3301|5616->3322|5906->3584|5935->3585|6017->3639|6046->3640|6095->3661|6177->3715|6206->3716|6316->3797|6346->3798|6396->3819|6473->3867|6503->3868|6550->3886|6605->3912|6635->3913|6685->3934|6750->3970|6780->3971|6827->3989|6883->4016|6913->4017|6963->4038|7029->4075|7059->4076|7106->4094|7160->4119|7190->4120|7240->4141|7304->4176|7334->4177|7371->4186
                  LINES: 28->1|33->2|34->3|43->12|43->12|44->13|46->15|46->15|48->17|48->17|48->17|49->18|53->22|53->22|55->24|55->24|55->24|56->25|58->27|58->27|60->29|60->29|60->29|61->30|62->31|62->31|63->32|85->54|85->54|90->59|90->59|91->60|94->63|94->63|96->65|96->65|97->66|103->72|103->72|106->75|106->75|107->76|114->83|114->83|116->85|116->85|117->86|123->92|123->92|126->95|126->95|127->96|128->97|128->97|132->101|132->101|133->102|134->103|134->103|136->105|136->105|136->105|137->106|138->107|138->107|140->109|140->109|140->109|141->110|142->111|142->111|144->113|144->113|144->113|145->114|146->115|146->115|147->116
                  -- GENERATED --
              */
          