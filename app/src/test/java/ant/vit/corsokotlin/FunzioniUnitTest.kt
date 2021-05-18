package ant.vit.corsokotlin

import ant.vit.corsokotlin.step07.Funzioni
import org.junit.Test
import java.io.File

/**
 * Created by Antonio Vitiello
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class FunzioniUnitTest {

    @Test
    fun testPrintTotalLenght() {
        val funzioni = Funzioni()
        funzioni.printTotalLenght("Lorem ipsum", "dolor sit amet")
    }

    @Test
    fun testGetTotalLenght() {
        val funzioni = Funzioni()
        val totalLenght = funzioni.getTotalLenght("Lorem ipsum", "dolor sit amet")
        println("TotalLenght: $totalLenght")
    }

    @Test
    fun testMultiply() {
        val funzioni = Funzioni()
        val multiply = funzioni.multiply("Lorem ipsum", "dolor sit amet")
        println("multiply: $multiply")
    }

    @Test
    fun testSetGetTitle() {
        val funzioni = Funzioni()
        funzioni.title = "Star-Trek"
        val title = funzioni.title
        println("title: $title")
    }

    @Test
    fun testSetGetChars() {
        val funzioni = Funzioni()
        funzioni.titleChars = "Star-Wars".toList()
        val titleChars = funzioni.titleChars
        println("${"Star Wars".toList()}")
        println("title chars: $titleChars}")
    }

    @Test
    fun callFunctionWithDefault() {
        //local function
        fun showMood(funzioni: Funzioni) {
            println("My mood is: ${funzioni.getMyMood()}")
        }

        val funzioni = Funzioni()

        funzioni.setMyMoodWithDefault("assonnato")
        showMood(funzioni)

        funzioni.setMyMoodWithDefault()
        showMood(funzioni)
    }

    @Test
    fun calFunctionWithManyParameters() {
        val funzioni = Funzioni()

        //passo un funzione (Lambda Expression) senza parametri nella firma
        funzioni.callFunctionWithManyParameters()
    }

    @Test
    fun printWithLambda() {
        val funzioni = Funzioni()
        funzioni.printWithLambda()
    }

}