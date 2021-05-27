package ant.vit.corsokotlin

import ant.vit.corsokotlin.step16.AnonymousObjectInJava
import ant.vit.corsokotlin.step16.AnonymousObjectInKotlin
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class AnonymousObjectUnitTest {

    @Test
    fun sayHelloInEnglishJava() {
        val anonymousObjectInJava = AnonymousObjectInJava()
        anonymousObjectInJava.sayHelloInEnglish()
    }

    @Test
    fun sayHelloInSpanishJava() {
        val anonymousObjectInJava = AnonymousObjectInJava()
        anonymousObjectInJava.sayHelloInSpanish()
    }

    @Test
    fun sayHelloInEnglishKoltin() {
        val anonymousObjectInJava = AnonymousObjectInKotlin()
        anonymousObjectInJava.sayHelloInEnglish()
    }

    @Test
    fun sayHelloInSpanishKoltin() {
        val anonymousObjectInJava = AnonymousObjectInKotlin()
        anonymousObjectInJava.sayHelloInSpanish()
    }


}