package ant.vit.corsokotlin

import ant.vit.corsokotlin.step08.Rectangle
import org.junit.Test

/**
 * Created by Antonio Vitiello
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class RectangleUnitTest {

    @Test
    fun testRectangle() {
        var rectangle = Rectangle.createRectangle(50, 50)
        println("rectangle$rectangle, isSquare:${rectangle.isSquare}")

        rectangle = Rectangle.createRandomRectangle()
        println("rectangle$rectangle, isSquare:${rectangle.isSquare}")
    }

}