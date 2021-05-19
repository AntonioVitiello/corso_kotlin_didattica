package ant.vit.corsokotlin.step09

/**
 * Created by Antonio Vitiello on 11/05/2021.
 */
enum class Language { KOTLIN, JAVA, XML, GROOVIE }


enum class Musketeers(val monsieur: String) {
    ATHOS("Monsieur Athos"),
    PORTHOS("Monsieur Porthos"),
    ARAMIS("Monsieur Aramis"),
    DARTAGNAN("Monsieur D'Artagnan");

    override fun toString(): String {
        return monsieur
    }
}


    enum class Planet(val planetName: String) {
    MERCURY("Mercury"), VENUS("Venus"),
    EARTH("Earth"), MARS("Mars"),
    JUPITER("Jupiter"), SATURN("Saturn"),
    URANUS("Uranus"), NEPTUNE("Neptune");

    companion object {
        fun find(hisName: String): Planet? {
            Planet.values().forEach {
                if (it.planetName.equals(hisName, true)) {
                    return it
                }
            }
            return null
        }
    }
}
