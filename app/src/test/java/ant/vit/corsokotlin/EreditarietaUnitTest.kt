package ant.vit.corsokotlin

import ant.vit.corsokotlin.step15.Circle
import ant.vit.corsokotlin.step15.Ereditarieta
import ant.vit.corsokotlin.step15.Rectangle
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class EreditarietaUnitTest {
    @Test
    fun golf7Test() {
        val golf = Ereditarieta.Golf("MI123456", "Golf 7", "1281713hj2h24du23hnj")
        val verificaAssicurazione = golf.verificaAssicurazione()
        println("verificaAssicurazione: $verificaAssicurazione")
        if (verificaAssicurazione) {
            golf.accendi()
            golf.marcia(1)
            golf.accellera()
            golf.frena()
            golf.parcheggia()
        }
    }

    @Test
    fun rectangleTest() {
        val width = 5.0
        val height = 7.0
        val rectangle = Rectangle(width, height)
        println("Rectangle [$width, $height], perimetro: ${rectangle.perimeter()}, area: ${rectangle.area()}")
    }

    @Test
    fun circleTest() {
        val radius = 5.0
        val circle = Circle(radius)
        println("Circle [$circle], circonferenza: ${circle.perimeter()}, area: ${circle.area()}")
    }

}