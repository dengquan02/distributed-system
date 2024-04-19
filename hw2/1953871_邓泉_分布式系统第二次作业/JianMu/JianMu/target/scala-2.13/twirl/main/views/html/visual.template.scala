
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

object visual extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(allTrajectory: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>trajectory classification</title>
        <style>
                html,
                body,
                #map """),format.raw/*12.22*/("""{"""),format.raw/*12.23*/("""
                    """),format.raw/*13.21*/("""width: 100%;
                    height: 100%;
                    margin: 0;
                    padding: 0;
                """),format.raw/*17.17*/("""}"""),format.raw/*17.18*/("""

                """),format.raw/*19.17*/(""".demo-title """),format.raw/*19.29*/("""{"""),format.raw/*19.30*/("""
                    """),format.raw/*20.21*/("""position: absolute;
                    top: 25px;
                    left: 25px;
                    z-index: 1;
                """),format.raw/*24.17*/("""}"""),format.raw/*24.18*/("""

                """),format.raw/*26.17*/("""h1 """),format.raw/*26.20*/("""{"""),format.raw/*26.21*/("""
                    """),format.raw/*27.21*/("""font-size: 18px;
                    margin: 0;
                    color: rgb(180, 180, 190);
                """),format.raw/*30.17*/("""}"""),format.raw/*30.18*/("""

                """),format.raw/*32.17*/("""h3 """),format.raw/*32.20*/("""{"""),format.raw/*32.21*/("""
                    """),format.raw/*33.21*/("""font-size: 12px;
                    font-weight: normal;
                    margin-top: 5px;
                    color: rgb(150, 150, 150);
                """),format.raw/*37.17*/("""}"""),format.raw/*37.18*/("""
        """),format.raw/*38.9*/("""</style>
    </head>

    <body>
        <div class="demo-title">
            <h1>轨迹分类</h1>
            <h3>所有数据各运动模式轨迹情况</h3>
        </div>
        <div id="map"></div>
        <script src="https://webapi.amap.com/maps?v=2.0&key=37f1f9cb88dbbf5a536591ba33b30b00&plugin=AMap.Scale,AMap.ToolBar"></script>
        <script src="https://webapi.amap.com/loca?v=2.0.0&key=37f1f9cb88dbbf5a536591ba33b30b00"></script>
        <script src="assets/javascripts/GPSconvert.js"></script>
        <script>
                var map = (new AMap.Map('map', """),format.raw/*51.48*/("""{"""),format.raw/*51.49*/("""
                    """),format.raw/*52.21*/("""zoom: 15.8,
                    center: [121.215, 31.284],
                    showLabel: false,
                    viewMode: '3D',
                    mapStyle: 'amap://styles/grey',
                    pitch: 40,
                """),format.raw/*58.17*/("""}"""),format.raw/*58.18*/("""));

                var loca = new Loca.Container("""),format.raw/*60.47*/("""{"""),format.raw/*60.48*/("""
                    """),format.raw/*61.21*/("""map,
                """),format.raw/*62.17*/("""}"""),format.raw/*62.18*/(""");
                window._loca = loca;
                var allTrajectory = """),_display_(/*64.38*/allTrajectory),format.raw/*64.51*/(""";
                var features = [];
                for (var i = 0; i < allTrajectory.length; i++) """),format.raw/*66.64*/("""{"""),format.raw/*66.65*/("""
                    """),format.raw/*67.21*/("""for(var key in allTrajectory[i])"""),format.raw/*67.53*/("""{"""),format.raw/*67.54*/("""
                        """),format.raw/*68.25*/("""var feature = """),format.raw/*68.39*/("""{"""),format.raw/*68.40*/("""
                            """),format.raw/*69.29*/(""""type": "Feature",
                            "properties": """),format.raw/*70.43*/("""{"""),format.raw/*70.44*/("""
                                """),format.raw/*71.33*/(""""type": key
                            """),format.raw/*72.29*/("""}"""),format.raw/*72.30*/(""",
                            "geometry": """),format.raw/*73.41*/("""{"""),format.raw/*73.42*/("""
                                """),format.raw/*74.33*/(""""type": "LineString",
                                "coordinates":GPS.gcj_encrypt(allTrajectory[i][key])
                            """),format.raw/*76.29*/("""}"""),format.raw/*76.30*/("""
                        """),format.raw/*77.25*/("""}"""),format.raw/*77.26*/(""";
                        features.push(feature)
                    """),format.raw/*79.21*/("""}"""),format.raw/*79.22*/("""
                    """),format.raw/*80.21*/("""console.log(features)
                """),format.raw/*81.17*/("""}"""),format.raw/*81.18*/("""

                """),format.raw/*83.17*/("""var geo = new Loca.GeoJSONSource("""),format.raw/*83.50*/("""{"""),format.raw/*83.51*/("""
                    """),format.raw/*84.21*/("""//url: 'https://a.amap.com/Loca/static/loca-v2/demos/mock_data/bj_bus.json',
                    data: """),format.raw/*85.27*/("""{"""),format.raw/*85.28*/("""
                        """),format.raw/*86.25*/(""""type": "FeatureCollection",
                        "features": features
                    """),format.raw/*88.21*/("""}"""),format.raw/*88.22*/("""
                """),format.raw/*89.17*/("""}"""),format.raw/*89.18*/(""");

                var layer = new Loca.PulseLineLayer("""),format.raw/*91.53*/("""{"""),format.raw/*91.54*/("""
                    """),format.raw/*92.21*/("""// loca,
                    zIndex: 10,
                    opacity: 1,
                    visible: true,
                    zooms: [2, 22],
                """),format.raw/*97.17*/("""}"""),format.raw/*97.18*/(""");

                var headColors = ['#EFBB51', '#4CC19B', '#E06AC4', '#F15C1A', '#7A0FA6'];

                console.log('geo', geo);
                layer.setSource(geo);
                layer.setStyle("""),format.raw/*103.32*/("""{"""),format.raw/*103.33*/("""
                    """),format.raw/*104.21*/("""altitude: 0,
                    lineWidth: 2,
                    // 脉冲头颜色
                    headColor: (_, feature) => """),format.raw/*107.48*/("""{"""),format.raw/*107.49*/("""
                        """),format.raw/*108.25*/("""if(feature.properties.type==="Walk")
                            return headColors[0];
                        else if(feature.properties.type==="Run")
                            return headColors[1];
                        else if(feature.properties.type==="Bike")
                            return headColors[2];
                        else if(feature.properties.type==="Car")
                            return headColors[3];
                        else
                            return headColors[4];
                    """),format.raw/*118.21*/("""}"""),format.raw/*118.22*/(""",
                    // 脉冲尾颜色
                    trailColor: 'rgba(128, 128, 128, 0.5)',
                    // 脉冲长度，0.25 表示一段脉冲占整条路的 1/4
                    interval: 0.25,
                    // 脉冲线的速度，几秒钟跑完整段路
                    duration: 5000,
                """),format.raw/*125.17*/("""}"""),format.raw/*125.18*/(""");
                loca.add(layer);
                loca.animate.start();

                // 图例
                var lengend = new Loca.Legend("""),format.raw/*130.47*/("""{"""),format.raw/*130.48*/("""
                    """),format.raw/*131.21*/("""loca: loca,
                    title: """),format.raw/*132.28*/("""{"""),format.raw/*132.29*/("""
                        """),format.raw/*133.25*/("""label: 'Mode',
                        fontColor: 'rgba(255,255,255,0.4)',
                        fontSize: '16px'
                    """),format.raw/*136.21*/("""}"""),format.raw/*136.22*/(""",
                    style: """),format.raw/*137.28*/("""{"""),format.raw/*137.29*/("""
                        """),format.raw/*138.25*/("""backgroundColor: 'rgba(255,255,255,0.1)',
                        left: '20px',
                        bottom: '40px',
                        fontSize: '12px'
                    """),format.raw/*142.21*/("""}"""),format.raw/*142.22*/(""",
                    dataMap: [
                        """),format.raw/*144.25*/("""{"""),format.raw/*144.26*/("""label: 'Walk', color: headColors[0]"""),format.raw/*144.61*/("""}"""),format.raw/*144.62*/(""",
                        """),format.raw/*145.25*/("""{"""),format.raw/*145.26*/("""label: 'Run', color: headColors[1]"""),format.raw/*145.60*/("""}"""),format.raw/*145.61*/(""",
                        """),format.raw/*146.25*/("""{"""),format.raw/*146.26*/("""label: 'Bike', color: headColors[2]"""),format.raw/*146.61*/("""}"""),format.raw/*146.62*/(""",
                        """),format.raw/*147.25*/("""{"""),format.raw/*147.26*/("""label: 'Car', color: headColors[3]"""),format.raw/*147.60*/("""}"""),format.raw/*147.61*/(""",
                        """),format.raw/*148.25*/("""{"""),format.raw/*148.26*/("""label: 'Other', color: headColors[4]"""),format.raw/*148.62*/("""}"""),format.raw/*148.63*/(""",
                    ],
                """),format.raw/*150.17*/("""}"""),format.raw/*150.18*/(""");

                loca.animate.start();
                var dat = new Loca.Dat();
                dat.addLayer(layer, '轨迹');

        </script>
    </body>
</html>
"""))
      }
    }
  }

  def render(allTrajectory:String): play.twirl.api.HtmlFormat.Appendable = apply(allTrajectory)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (allTrajectory) => apply(allTrajectory)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-09-29T08:54:44.083301400
                  SOURCE: X:/JianMu/app/views/visual.scala.html
                  HASH: df1ea8e35e90932820e1ea1d88714c3ff0a50452
                  MATRIX: 949->1|1066->25|1093->26|1409->314|1438->315|1487->336|1641->462|1670->463|1716->481|1756->493|1785->494|1834->515|1993->646|2022->647|2068->665|2099->668|2128->669|2177->690|2316->801|2345->802|2391->820|2422->823|2451->824|2500->845|2686->1003|2715->1004|2751->1013|3320->1554|3349->1555|3398->1576|3658->1808|3687->1809|3766->1860|3795->1861|3844->1882|3893->1903|3922->1904|4026->1981|4060->1994|4188->2094|4217->2095|4266->2116|4326->2148|4355->2149|4408->2174|4450->2188|4479->2189|4536->2218|4625->2279|4654->2280|4715->2313|4783->2353|4812->2354|4882->2396|4911->2397|4972->2430|5135->2565|5164->2566|5217->2591|5246->2592|5343->2661|5372->2662|5421->2683|5487->2721|5516->2722|5562->2740|5623->2773|5652->2774|5701->2795|5832->2898|5861->2899|5914->2924|6036->3018|6065->3019|6110->3036|6139->3037|6223->3093|6252->3094|6301->3115|6489->3275|6518->3276|6752->3481|6782->3482|6832->3503|6984->3626|7014->3627|7068->3652|7629->4184|7659->4185|7955->4452|7985->4453|8157->4596|8187->4597|8237->4618|8305->4657|8335->4658|8389->4683|8554->4819|8584->4820|8642->4849|8672->4850|8726->4875|8936->5056|8966->5057|9052->5114|9082->5115|9146->5150|9176->5151|9231->5177|9261->5178|9324->5212|9354->5213|9409->5239|9439->5240|9503->5275|9533->5276|9588->5302|9618->5303|9681->5337|9711->5338|9766->5364|9796->5365|9861->5401|9891->5402|9961->5443|9991->5444
                  LINES: 28->1|33->2|34->3|43->12|43->12|44->13|48->17|48->17|50->19|50->19|50->19|51->20|55->24|55->24|57->26|57->26|57->26|58->27|61->30|61->30|63->32|63->32|63->32|64->33|68->37|68->37|69->38|82->51|82->51|83->52|89->58|89->58|91->60|91->60|92->61|93->62|93->62|95->64|95->64|97->66|97->66|98->67|98->67|98->67|99->68|99->68|99->68|100->69|101->70|101->70|102->71|103->72|103->72|104->73|104->73|105->74|107->76|107->76|108->77|108->77|110->79|110->79|111->80|112->81|112->81|114->83|114->83|114->83|115->84|116->85|116->85|117->86|119->88|119->88|120->89|120->89|122->91|122->91|123->92|128->97|128->97|134->103|134->103|135->104|138->107|138->107|139->108|149->118|149->118|156->125|156->125|161->130|161->130|162->131|163->132|163->132|164->133|167->136|167->136|168->137|168->137|169->138|173->142|173->142|175->144|175->144|175->144|175->144|176->145|176->145|176->145|176->145|177->146|177->146|177->146|177->146|178->147|178->147|178->147|178->147|179->148|179->148|179->148|179->148|181->150|181->150
                  -- GENERATED --
              */
          