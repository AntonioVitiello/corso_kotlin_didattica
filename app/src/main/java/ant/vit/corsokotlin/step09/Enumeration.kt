package ant.vit.corsokotlin.step09

/**
 * Created by Antonio Vitiello on 06/05/2021.
 */
class Enumeration {

    /**
     * Simple enumeration
     */
    fun listLenguages() {
        Language.values().forEach {
            println("${it.ordinal}) $it")
        }
    }


    /**
     * Do something on enumeration selected
     */
    fun welcomeToMusketeer(musketeer: Musketeers) {
        when (musketeer) {
            Musketeers.ATHOS -> println("Welcome to: ${Musketeers.ATHOS}")
            Musketeers.PORTHOS -> println("Welcome to: ${Musketeers.PORTHOS}")
            Musketeers.ARAMIS -> println("Welcome to: ${Musketeers.ARAMIS}")
            Musketeers.DARTAGNAN -> println("Welcome to: ${Musketeers.DARTAGNAN}")
        }
    }


    /**
     * find enum by his property value
     */
    fun findPlanetFromName(planetName: String) {
        val planet = Planet.find(planetName)
        println("Found planet: $planet")
    }

}

fun main(args: Array<String>) {
    val enumeration = Enumeration()
    enumeration.listLenguages()

    val musketeer = Musketeers.values().random()
    enumeration.welcomeToMusketeer(musketeer)

    val planets = listOf<String>("Mercury", "VENUS", "EartH", "mars", "jupiteR", "SATURn", "uranus", "Neptune", "Antonio")
    val randomPlanetName = planets.random()
    println("Find planet by string name: $randomPlanetName")
    enumeration.findPlanetFromName(randomPlanetName)
}
