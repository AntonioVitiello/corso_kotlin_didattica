package ant.vit.corsokotlin

import ant.vit.corsokotlin.step06.StringheAdvanced
import org.junit.Test

/**
 * Created by Antonio Vitiello
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class StringheAdvancedUnitTest {

    @Test
    fun variabiliMutabili() {
        val stringheAdvanced = StringheAdvanced()
        stringheAdvanced.variabiliMutabili()
    }

    @Test
    fun variabiliNullabili() {
        val stringheAdvanced = StringheAdvanced()
        stringheAdvanced.variabiliNullabili()
    }

    @Test
    fun withAnIstanceJavaStyle() {
        val stringheAdvanced = StringheAdvanced()
        stringheAdvanced.withAnIstanceJavaStyle()
    }

    @Test
    fun withAnIstanceBetter() {
        val stringheAdvanced = StringheAdvanced()
        stringheAdvanced.withAnIstanceBetter()
    }

    @Test
    fun withAnIstanceBest() {
        val stringheAdvanced = StringheAdvanced()
        stringheAdvanced.withAnIstanceBest()
    }

    @Test
    fun listeImmutabili() {
        val stringheAdvanced = StringheAdvanced()
        stringheAdvanced.listeImmutabili()
    }

    @Test
    fun listeMutabili() {
        val stringheAdvanced = StringheAdvanced()
        stringheAdvanced.listeMutabili()
    }

    @Test
    fun operazioniConTipiNullabili() {
        val stringheAdvanced = StringheAdvanced()
        stringheAdvanced.operazioniConTipiNullabili()
    }

    @Test
    fun operazioniConTipiNullabiliRandom() {
        val stringheAdvanced = StringheAdvanced()
        stringheAdvanced.operazioniConTipiNullabiliRandom()
    }

    @Test
    fun comparisons() {
        val stringheAdvanced = StringheAdvanced()
        stringheAdvanced.comparisons()
    }

    @Test
    fun aaa() {
        val stringheAdvanced = StringheAdvanced()
        stringheAdvanced.variabiliMutabili()
        stringheAdvanced.variabiliNullabili()
        stringheAdvanced.withAnIstanceJavaStyle()
        stringheAdvanced.withAnIstanceBetter()
        stringheAdvanced.withAnIstanceBest()
        stringheAdvanced.listeImmutabili()
        stringheAdvanced.listeMutabili()
        stringheAdvanced.operazioniConTipiNullabili()
        stringheAdvanced.operazioniConTipiNullabiliRandom()
        stringheAdvanced.comparisons()
    }

}