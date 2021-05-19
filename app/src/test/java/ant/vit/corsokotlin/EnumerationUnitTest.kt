package ant.vit.corsokotlin

import ant.vit.corsokotlin.step09.Enumeration
import ant.vit.corsokotlin.step09.Musketeers
import org.junit.Test

/**
 * Created by Antonio Vitiello
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class EnumerationUnitTest {

    @Test
    fun listLenguages() {
        val enumeration = Enumeration()
        enumeration.listLenguages()
    }

    @Test
    fun welcomeToMusketeer() {
        val enumeration = Enumeration()
        val musketeer = Musketeers.values().random()
        enumeration.welcomeToMusketeer(musketeer)
    }

    @Test
    fun findPlanetFromName() {
        val enumeration = Enumeration()
        val planets = listOf<String>("Mercury", "VENUS", "EartH", "mars", "jupiteR", "SATURn", "uranus", "Neptune", "Antonio")
        val randomPlanetName = planets.random()

        println("Find planet by string name: $randomPlanetName")
        enumeration.findPlanetFromName(randomPlanetName)
    }

}