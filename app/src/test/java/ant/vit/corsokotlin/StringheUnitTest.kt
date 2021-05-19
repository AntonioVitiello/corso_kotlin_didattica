package ant.vit.corsokotlin

import ant.vit.corsokotlin.step04.Stringhe
import org.junit.Test

/**
 * Created by Antonio Vitiello
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class StringheUnitTest {

    @Test
    fun escapedString() {
        val stringhe = Stringhe()
        stringhe.escapedString()
    }

    @Test
    fun multilineString() {
        val stringhe = Stringhe()
        stringhe.multilineString()
    }

    @Test
    fun multilineStringWithDefaultMargin() {
        val stringhe = Stringhe()
        stringhe.multilineStringWithDefaultMargin()
    }

    @Test
    fun multilineStringWithCustomMargin() {
        val stringhe = Stringhe()
        stringhe.multilineStringWithCustomMargin()
    }

    @Test
    fun concatenazioneJavaStyle() {
        val stringhe = Stringhe()
        stringhe.concatenazioneJavaStyle()
    }

    @Test
    fun concatenazioneWithStringTemplate() {
        val stringhe = Stringhe()
        stringhe.concatenazioneWithStringTemplate()
    }

}