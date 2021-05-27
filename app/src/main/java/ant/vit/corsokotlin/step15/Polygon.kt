package ant.vit.corsokotlin.step15

import kotlin.math.pow
import kotlin.math.sqrt

/**
 * Created by Antonio Vitiello on 12/05/2021.
 */
interface Shape {
    fun area(): Double
    fun perimeter(): Double
}

open class Polygon(val twoDimensional: Boolean) : Shape {

    override fun area(): Double {
        TODO("Not yet implemented")
        //override me
    }

    override fun perimeter(): Double {
        //override me
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return if(twoDimensional) "Polygon two-dimensional" else "Polygon non two-dimensional"
    }
}



class Rectangle(private val width: Double, private val length: Double) : Polygon(true) {

    //costruttore vuoto, si può anche sostituire con un valore di default sul costruttore primario
    constructor() : this(1.0, 1.0)

    /**
     * A = w * l
     */
    override fun area(): Double {
        return width * length
    }

    /**
     * P = 2(w + l)
     */
    override fun perimeter(): Double {
        return 2 * (width + length)
    }
}



class Triangle(private val a: Double = 1.0, private val b: Double = 1.0, private val c: Double = 1.0) : Polygon(true) {

    /**
     * A = SquareRoot(s * (s - a) * (s - b) * (s - c))
     * where s = P/2 = (a + b + c) / 2
     */
    override fun area(): Double {
        val semiPerimeter = (a + b + c) / 2
        return sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c))
    }

    /**
     * P = a + b + c
     */
    override fun perimeter(): Double {
        return a + b + c
    }
}



class Circle(private val radius: Double = 1.0) : Polygon(true) {

    /**
     * A = π r^2
     */
    override fun area(): Double {
        return Math.PI * radius.pow(2.0)
    }

    /**
     * P = 2πr
     */
    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}



/* Error: This type is final, so it cannot be inherited from
class MyCircle(private val radius: Double = 1.0) : Circle(1.0) {

}
*/
