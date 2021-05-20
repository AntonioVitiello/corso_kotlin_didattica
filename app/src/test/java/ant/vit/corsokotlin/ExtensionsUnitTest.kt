package ant.vit.corsokotlin

import ant.vit.corsokotlin.step11.Extensions
import ant.vit.corsokotlin.step11.before
import org.junit.Test

/**
 * Created by Antonio Vitiello
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExtensionsUnitTest {

    @Test
    fun isPair() {
        val estensioni = Extensions()
        val number = (0..10).random()
        estensioni.isPair(number)
    }

    @Test
    fun isOdd() {
        val estensioni = Extensions()
        val number = (0..10).random()
        estensioni.isOdd(number)
    }

    @Test
    fun callFunctionExtension() {
        val myString = "Kotlin corso di Links"
        println(myString)

        val beforeString = myString.before("di")
        println("beforeString: $beforeString")

        val beforeSpace = myString.before()
        println("beforeSpace: $beforeSpace")
    }

    @Test
    fun beforeString() {
        val estensioni = Extensions()
        estensioni.beforeString("Kotlin corso di Links")
    }

    @Test
    fun beforeSpace() {
        val estensioni = Extensions()
        estensioni.beforeSpace("Kotlin corso di Links")
    }

    @Test
    fun isPalindrome() {
        val estensioni = Extensions()
        estensioni.isPalindrome()
    }

}