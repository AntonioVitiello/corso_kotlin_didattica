package ant.vit.corsokotlin.step06

import java.math.BigDecimal
import java.util.*

/**
 * Created by Antonio Vitiello on 04/05/2021.
 * Mutable / Immutabile variables
 * nullable / unnullable variables
 */
class StringheAdvanced {
    fun variabiliMutabili() {
        var unIntero = 1
        var unaStringa = "Ciao"
        var unaLista = listOf("1", "2", "3", "stella!")
        var unDecimal = BigDecimal(123.45)

        unIntero = 2
        unaStringa = "Hello!"
        unaLista = listOf("4", "5", "6", "stella!")
        unDecimal = BigDecimal("789.012")

        println(
            """unaStringa: $unaStringa
        unaLista: $unaLista
        unIntero: $unIntero
        unDecimal: $unDecimal"""
        )
    }

    fun variabiliNullabili() {
        var unIntero: Int? = null
        var unaStringa: String? = null
        var unaLista: List<String>? = null
        var unDecimal: BigDecimal? = null

        unIntero = 123
        unaStringa = "Ciao!"
        unaLista = listOf("1", "2", "3", "stella!")
        unDecimal = BigDecimal("123.456")

        println(
            """unaStringa: $unaStringa
        unaLista:  $unaLista
        unIntero:  $unIntero
        unDecimal: $unDecimal€"""
        )
    }

    class Foo(val first: String, val second: Int, val third: Boolean?)

    fun withAnIstanceJavaStyle() {
        val foo = Foo("Lorem Ipsum", 0, null)
        val first = foo.first
        val second = foo.second
        val third = foo.third

        println("Foo is: first=" + first + ", second=" + second + ", third=" + third)
    }

    fun withAnIstanceBetter() {
        val foo = Foo("Lorem Ipsum", 0, null)
        with(foo) {
            println("Foo is: first=$first, second=$second, third=$third")
        }
    }

    data class FooData(val first: String, val second: Int, val third: Boolean?)

    fun withAnIstanceBest() {
        val fooData = FooData("Lorem Ipsum", 0, null)
        println("Foo is: $fooData")
    }

    fun listeImmutabili() {
        val listaImmutabile = listOf("1", "2", "3", "stella!")
        val mapImmutabile = mapOf<String, String>(Pair("key1", "val1"), Pair("key2", "val2"))

//    listaImmutabile.clear()
//    listaImmutabile.add("4")
//    mapImmutabile.put(Pair("key3", "val3"))

        println(
            """listaImmutabile: $listaImmutabile
        |mapImmutabile: $mapImmutabile
        |primoElementoLista: ${listaImmutabile[0]}
        |elementoMap(key1): ${mapImmutabile["key1"]}""".trimMargin()
        )
    }

    fun listeMutabili() {
        val listaMutabile = mutableListOf<String>("1", "2", "3", "stella!")
        val mapMutabile = mutableMapOf<String, String>(Pair("key1", "val1"), Pair("key2", "val2"))

        listaMutabile.clear()
        listaMutabile.add("4")
        mapMutabile.put("key3", "val3")

        println(
            """listaMutabile: $listaMutabile
        |mapMutabile: $mapMutabile""".trimMargin()
        )
    }

    fun operazioniConTipiNullabili() {
        val aMutableList: MutableList<String>? = loadMutableList(false)
        aMutableList?.add("123")
        println("aMutableList: $aMutableList")

        val aNotNullList: MutableList<String>? = loadMutableList(true)
        aNotNullList!!.add("Ok!")
        println("aNotNullList: $aNotNullList")
    }

    fun loadMutableList(notnullRequired: Boolean): MutableList<String>? {
        println("notnullRequired: $notnullRequired")
        return if (notnullRequired) {
            mutableListOf("1", "2", "3")
        } else {
            null
        }
    }

    fun operazioniConTipiNullabiliRandom() {
        val aMutableList: MutableList<String>? = loadMutableListRandom()
        aMutableList?.add("123")
        println("aMutableList: $aMutableList")

        val aNotNullList: MutableList<String>? = loadMutableListRandom(true)
        aNotNullList!!.add("Ok!")
        println("aNotNullList: $aNotNullList")
    }

    fun loadMutableListRandom(notnullRequired: Boolean = Random().nextBoolean()): MutableList<String>? {
        println("notnullRequired: $notnullRequired")
        return if (notnullRequired) {
            mutableListOf("1", "2", "3")
        } else {
            null
        }
    }

    fun comparisons() {
        val stringLowercase = "lorem ipsum dolor sit amet"
        val stringUppercase = stringLowercase.toUpperCase(Locale.getDefault())
        val compareIgnoreCase = stringLowercase.compareTo(stringUppercase, true)
        val compareWithUpperCases = stringLowercase == stringUppercase

        println(
            """compareIgnoreCase: $compareIgnoreCase
        |compareWithUpperCases: $compareWithUpperCases""".trimMargin()
        )
        println(
            """-oppure:
        |stringa1: "$stringLowercase"
        |stringa2: "$stringUppercase"
        |with ignorecase=true: ${if (compareIgnoreCase == 0) "Le due stringhe sono uguali" else "Le due stringhe sono diverse"}
        |with ignorecase=false: ${if (compareWithUpperCases) "Le due stringhe sono uguali" else "Le due stringhe sono diverse"}""".trimMargin()
        )
    }
}

fun main(args: Array<String>) {
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