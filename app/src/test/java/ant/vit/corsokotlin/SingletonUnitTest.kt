package ant.vit.corsokotlin

import ant.vit.corsokotlin.step14.formatISO8601OrNull
import ant.vit.corsokotlin.step17.RealSingletonKotlin
import ant.vit.corsokotlin.step17.SingletonInJava
import ant.vit.corsokotlin.step17.SingletonInKotlin
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class SingletonUnitTest {

    @Test
    fun getDateOfStartJava() {
        val instance = SingletonInJava.getInstance()
//        val dateOfStart = Utils.formatDateOrNull(Utils.iso8601DateFormat, instance.dateOfStart)

        val dateOfStart = instance.dateOfStart.formatISO8601OrNull()


        println("SingletonInJava, dateOfStart: $dateOfStart")
    }

    @Test
    fun getDateOfStartKotlin() {
        val instance = SingletonInKotlin.getInstance()
        val dateOfStart = instance.dateOfStart.formatISO8601OrNull()
        println("SingletonInJava, dateOfStart: $dateOfStart")
    }

    @Test
    fun getDateOfStartRealKotlin() {
        val dateOfStart = RealSingletonKotlin.dateOfstart
        val dateOfStartF = RealSingletonKotlin.getDateOfStartISO8601()

        println("RealSingletonInJava, dateOfStart: $dateOfStart")
        println("RealSingletonInJava, dateOfStart: $dateOfStartF")
    }
}