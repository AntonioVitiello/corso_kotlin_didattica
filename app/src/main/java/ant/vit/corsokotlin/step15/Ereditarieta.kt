package ant.vit.corsokotlin.step15

/**
 * Created by Antonio Vitiello on 14/05/2021.
 */
class Ereditarieta {

    open class Veicolo(val marca: String, val modello: String) {

        fun accendi() {
            println("Il veicolo è stato acceso")
        }

        fun marcia(marcia: Int) {
            println("Il veicolo ha inserito la marcia: $marcia")
        }

        fun accellera() {
            println("Il veicolo accellera")
        }

        fun frena() {
            println("Il veicolo frena")
        }

        fun parcheggia() {
            println("Il veicolo parcheggia")
        }
    }

    class Golf constructor(marca: String, modello: String, val targa: String) : Veicolo(marca, modello) {

        constructor(targa: String) : this("Volkswagen", "Golf", targa) {

        }

        fun verificaAssicurazione(): Boolean {
            return PraRemoteServer.verificaAssicurazione(targa)
        }
    }

    class PraRemoteServer {
        companion object {
            fun verificaAssicurazione(targa: String): Boolean {
                return if (targa.length > 2) true else false
            }
        }
    }
}