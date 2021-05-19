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

    @Test
    fun calculateWithLambda() {
        val funzioni = Funzioni()
        funzioni.calculateWithLambda(5, 4)
    }

    @Test
    fun callFunctionWithFunctionWithoutParameter() {
        val funzioni = Funzioni()

        //passo un funzione (Lambda Expression) senza parametri nella firma
        funzioni.callMe({ println("Lorem ipsum dolor sit amet") })
    }

    @Test
    fun loadDataFromRestService() {
        val funzioni = Funzioni()
        val restUrl = "https://foo.company.api/v2/get_date?item=12345"
        val message = "Success: %s received from REST service: %s"

        funzioni.loadDataFromRestService(restUrl, { data ->
            println(String.format(message, data, restUrl))
        })
    }

    @Test
    fun callFunctionWithFunctionWithParameter() {
        val funzioni = Funzioni()

        //passo un funzione (Lambda Expression) con un parametro nella firma
        funzioni.callMeOne({ file: File -> println(file.path) })
    }

    @Test
    fun callFunctionFunctionWithParameterAndOutput() {
        val funzioni = Funzioni()

        //passo una Lambda Expression con un parametro nella firma e ritorna il pathname aggiornato
        funzioni.callMeAndGetString({ file: File ->
            return@callMeAndGetString "/newPath/${file.path}"
        })
    }

    @Test
    fun callFunctionFunctionWithTwoParameter() {
        val funzioni = Funzioni()

        //passo una Lambda Expression con due parametri nella firma
        funzioni.callMeTwo({ file: File, flag: Boolean ->
            val pathname = if (flag) file.path else file.parent ?: "/"
            println(pathname)
        })

        //passo una Lambda Expression con due parametri nella firma
        funzioni.callMeTwo({ file: File, flag: Boolean ->
            println(if (flag) file.path else file.parent ?: "/")
        })
    }

}