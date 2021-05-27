package ant.vit.corsokotlin.step16

/**
 * Created by Antonio Vitiello on 16/05/2021.
 */
class AnonymousObjectInKotlin {

    private interface IHelloWorld {
        fun greet()
        fun greetSomeone(someone: String)
    }

    fun sayHelloInEnglish() {
        class EnglishGreeting : IHelloWorld {
            override fun greet() {
                greetSomeone("world")
            }

            override fun greetSomeone(someone: String) {
                println("Hello $someone")
            }
        }

        val helloWorld = EnglishGreeting()
        helloWorld.greet()
        helloWorld.greetSomeone("Antonio")
    }

    fun sayHelloInSpanish() {
        val spanishGreeting = object : IHelloWorld {
            override fun greet() {
                greetSomeone("mundo")
            }

            override fun greetSomeone(someone: String) {
                println("Hola, $someone")
            }
        }

        spanishGreeting.greet()
        spanishGreeting.greetSomeone("Antonio")
    }

}

fun main(args: Array<String>) {
    val helloWorld = AnonymousObjectInKotlin()
    helloWorld.sayHelloInEnglish()
    helloWorld.sayHelloInSpanish()
}