package ant.vit.corsokotlin.step06

/**
 * Created by Antonio Vitiello on 19/05/2021.
 */
class Walker {
    private val semaforo = listOf("rosso", "verde", "giallo")

    private fun getColoreSemaforo(): String {
        return semaforo.random()
    }

    fun canWalkerWalk(): Boolean {
        val flag = when (getColoreSemaforo()) {
            "rosso" -> {
                println("colore: rosso")
                false
            }
            "verde" -> {
                println("colore: verde")
                true
            }
            "giallo" -> {
                println("colore: giallo")
                true
            }
            else -> {
                println("color not in semaforo")
                false
            }
        }
        return flag
    }

    fun canWalkerWalk(colore: String? = null): Boolean {
        val choose = colore ?: getColoreSemaforo()
        val flag = when (choose) {
            "rosso" -> {
                println("colore: rosso")
                false
            }
            "verde" -> {
                println("colore: verde")
                true
            }
            "giallo" -> {
                println("colore: giallo")
                true
            }
            else -> {
                println("not in semaforo: $choose")
                false
            }
        }
        return flag
    }

}

fun main(args: Array<String>) {
    val walker = Walker()
    if (walker.canWalkerWalk()) {
        println("Walker: GO!")
    } else {
        println("Walker: STOP")
    }

    walker.canWalkerWalk("viola")

    StringheAdvanced.Foo("first", 2, true)
}