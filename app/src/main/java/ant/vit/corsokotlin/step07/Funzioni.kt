package ant.vit.corsokotlin.step07


/**
 * Created by Antonio Vitiello on 05/05/2021.
 */
class Funzioni {
    private var chapterTitle = "Lorem ipsum dolor sit amet"
    private var charList = chapterTitle.toMutableList()
    private var myMood: String? = null

    /**
     * una funzione SEMPLICE: println()
     */
    fun println(message: Any?) {
        System.out.println(message)
    }

    /**
     * Una funzione semplice con 2 parametri in input
     */
    fun printTotalLenght(first: String, second: String) {
        println("TotalLenght is: ${first.length + second.length}")
    }

    /**
     * Una funzione semplice con 2 parametri in input ed uno in output
     */
    fun getTotalLenght(first: String, second: String): Int {
        val totalLenght = first.length + second.length
        return totalLenght
    }

    /**
     * Una funzione semplice con 2 parametri in input ed uno in output con sintassi semplificata
     */
    fun multiply(first: String, second: String) = first.length * second.length

    /**
     * Una property con le sue get/set sintassi contratta
     */
    var title: String
        get() = chapterTitle
        set(value) {
            chapterTitle = value
        }

    /**
     * Una property con get/set che fanno anche altre operazioni
     */
    var titleChars: List<Char>?
        get() = charList
        set(value) {
            charList.clear()
            if (value != null) {
                charList.addAll(value)
            }
        }

    /**
     * Funzione con un parametro definito con un valore di default
     */
    fun setMyMoodWithDefault(mood: String = "affamato") {
        myMood = mood
    }

    fun getMyMood(): String? {
        return myMood
    }

    /**
     * Funzione Estensione: definita come una TOP LEVEL FUNCTION!
     * definita in Estensioni.kt
     */
//    fun String.before(separator: String = " "): String {
//        val indexOfSeparator = this.indexOf(separator)
//        return if (indexOfSeparator < 0) this else this.substring(0, indexOfSeparator)
//    }

    fun functionWithManyParameters(job: String, name: String, age: String, surname: String, gender: String, title: String) {
        println(
            """title: $title
            |name: $name
            |surname: $surname
            |age: $age
            |gender: $gender
            |job: $job""".trimMargin()
        )
    }

    fun callFunctionWithManyParameters() {
        functionWithManyParameters(
            title = "Mrs",
            name = "Jeronimo",
            surname = "Stilton",
            age = "20",
            gender = "M",
            job = "Private investigator"
        )
    }

    /**
     * Kotlin Lambda Expressions
     */
    val hello = { System.out.println("Hello") }
    val world: () -> Unit = { System.out.println("World") }
    val sout: (String) -> Unit = { s -> println(s) }
    val serr = { s: String -> System.err.println(s) }
    val serrIt: (String) -> Unit = {
        System.err.println(it)
    }
    val helloFullName: (String, String) -> Unit = { name: String, surname ->
        println("Hello $name $surname!")
    }
    val helloFullNamePair: (Pair<String, String>) -> Unit = {
        println("Hello ${it.first} ${it.second}!")
    }
    val helloFullNameTriple: (Triple<String, Int, Boolean>) -> Unit = {
        println("Triple ${it.first} ${it.second} ${it.third}")
    }

    fun printWithLambda() {
        hello.invoke()
        world()
        sout("Hello world out!")
        serr("Hello world err!")
        serrIt("Hello world err! (it)")
        helloFullName("Antonio", "Vitiello")
        helloFullNamePair(Pair("Antonio", "Vitiello"))
        helloFullNameTriple.invoke(Triple("Corso Kotlin", 1, true))
    }

}