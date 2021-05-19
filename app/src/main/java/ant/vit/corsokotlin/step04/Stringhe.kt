package ant.vit.corsokotlin.step04

import java.math.BigDecimal

/**
 * Created by Antonio Vitiello on 04/05/2021.
 * Mutable / Immutabile variables
 * nullable / unnullable variables
 */
class Stringhe {

    fun escapedString() {
        println("Welcome to this \"Kotlin\" course!")
        println("Welcome to this \\Kotlin\\ course: 123\$")
        println("Welcome to this Kotlin\b course!")
        println("Welcome\r to this Kotlin course!")
        println("Welcome\n to this Kotlin course!")
    }

    fun multilineString() {
        val rawCrawl = """Lorem ipsum dolor sit amet,
  consectetur adipiscing elit.
    Cras in nunc nisl.
      Duis accumsan metus nisi,
        vitae sollicitudin enim tristique sed.
          Vestibulum at…"""

        println(rawCrawl)
    }

    fun multilineStringWithDefaultMargin() {
        val rawCrawl = """Lorem ipsum dolor sit amet,
  |consectetur adipiscing elit.
    |Cras in nunc nisl.
      |Duis accumsan metus nisi,
        |vitae sollicitudin enim tristique sed.
          |Vestibulum at…"""

        println(rawCrawl.trimMargin())
    }

    fun multilineStringWithCustomMargin() {
        val rawCrawl = """Lorem ipsum dolor sit amet,
  >consectetur adipiscing elit.
    >Cras in nunc nisl.
      >Duis accumsan metus nisi,
        >vitae sollicitudin enim tristique sed.
          >Vestibulum at…"""

        println(rawCrawl.trimMargin(">"))
    }

    fun concatenazioneJavaStyle() {
        val unIntero: Int = 5
        val unaStringa: String = "Ciao!"
        val unaLista: List<String> = listOf("1", "2", "3", "stella!")
        val unDecimal: BigDecimal = BigDecimal("123.456")

        println("Hei " + unaStringa + ", ecco un intero: " + unIntero + ", Prezzo: " + unDecimal + "€, ed una lista: " + unaLista + ", con " + unaLista.size + " elementi")
    }

    fun concatenazioneWithStringTemplate() {
        val unIntero = 5
        val unaStringa = "Ciao!"
        val unaLista = listOf("1", "2", "3", "stella!")
        val unDecimal = BigDecimal("123.456")

        println("Hei $unaStringa, ecco un intero: $unIntero, Prezzo: $unDecimal€, ed una lista: $unaLista, con ${unaLista.size} elementi")
    }

}

fun main(args: Array<String>) {
    val stringhe = Stringhe()
    stringhe.escapedString()
    stringhe.multilineString()
    stringhe.multilineStringWithDefaultMargin()
    stringhe.multilineStringWithCustomMargin()
    stringhe.concatenazioneJavaStyle()
    stringhe.concatenazioneWithStringTemplate()
}

