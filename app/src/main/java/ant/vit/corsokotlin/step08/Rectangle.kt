package ant.vit.corsokotlin.step08

import java.util.*
import kotlin.math.abs

/**
 * Created by Antonio Vitiello
 */
class Rectangle private constructor(val height: Int, val width: Int) {

    companion object {
        private const val TAG = "Rectangle"
        private val random = Random()

        fun createRectangle(height: Int, width: Int): Rectangle {
            return Rectangle(height, width)
        }

        fun createRandomRectangle(): Rectangle {
//            return Rectangle(abs(random.nextInt()), abs(random.nextInt()))
//            return Rectangle(rand(1, 100), rand(1, 100))
            return Rectangle((1..100).random(), (1..100).random())
        }

        fun rand(from: Int, to: Int): Int {
            return random.nextInt(to - from) + from
        }
    }

    val isSquare: Boolean
        get() = height == width

    override fun toString(): String {
        return "[h=$height, w=$width]"
    }

}
