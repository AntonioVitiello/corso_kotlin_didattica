package ant.vit.corsokotlin

import ant.vit.corsokotlin.step05.Variabili
import org.junit.Test

/**
 * Created by Antonio Vitiello
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class VariabiliUnitTest {

    @Test
    fun datiPrimitivi() {
        val variabili = Variabili()
        variabili.datiPrimitivi()
    }

    @Test
    fun conversioniDiTipi() {
        val variabili = Variabili()
        variabili.conversioniDiTipi()
    }

    @Test
    fun perditaDiPrecisione() {
        val variabili = Variabili()
        variabili.perditaDiPrecisione()
    }

    @Test
    fun typeInference() {
        val variabili = Variabili()
        variabili.typeInference()
    }

    @Test
    fun concatenazioneJavaStyle() {
        val variabili = Variabili()
    }

    @Test
    fun concatenazioneWithStringTemplate() {
        val variabili = Variabili()
    }

}