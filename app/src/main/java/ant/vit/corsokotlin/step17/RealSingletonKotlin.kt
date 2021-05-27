package ant.vit.corsokotlin.step17

import ant.vit.corsokotlin.step14.Utils
import ant.vit.corsokotlin.step14.format
import java.util.*

/**
 * Created by Antonio Vitiello on 24/05/2021.
 */
object RealSingletonKotlin {
    val dateOfstart = Date()

    init {
        println("RealSingletonInKotlin class invoked!")
    }

    fun getDateOfStartISO8601(): String {
        return dateOfstart.format(Utils.iso8601DateFormat)
    }
}