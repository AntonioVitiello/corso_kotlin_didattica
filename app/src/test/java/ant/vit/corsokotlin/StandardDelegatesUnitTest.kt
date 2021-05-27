package ant.vit.corsokotlin

import ant.vit.corsokotlin.step14.StandardDelegates
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class StandardDelegatesUnitTest {

    @Test
    fun formatCurrentDateWithDelegate() {
        val standardDelegates = StandardDelegates()
        standardDelegates.formatCurrentDateWithDelegate()
    }

    @Test
    fun formatServerDateWithDelegate() {
        val standardDelegates = StandardDelegates()
        standardDelegates.formatDateWithDelegate()
    }

    @Test
    fun parseIdInUrl() {
        val standardDelegates = StandardDelegates()
        val url = "http://dominio.com/item/id/12345"
        val parseIdInUrl = standardDelegates.parseIdInUrlPath(url)
    }

    @Test
    fun parseQueryParamInUrl() {
        val url = "http://dominio.com/item_id=12345"
        val standardDelegates = StandardDelegates()
        standardDelegates.parseIdInUrlQuery(url, "item_id")
    }
}