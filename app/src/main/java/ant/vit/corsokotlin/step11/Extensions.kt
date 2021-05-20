package ant.vit.corsokotlin.step11

/**
 * Created by Antonio Vitiello on 07/05/2021.
 */
class Extensions {

    fun isPair(number: Int) {
        val pairWithUtils = Utils.isPair(number)
        val pairWithExtensions = number.isPair()
        val responses = Responses(pairWithUtils.toString(), pairWithExtensions.toString())

        println("$number is pair? $responses")
    }

    fun isOdd(number: Int) {
        val oddWithUtils = Utils.isOdd(number)
        val oddWithExtensions = number.isOdd()
        val responses = Responses(oddWithUtils.toString(), oddWithExtensions.toString())

        println("$number is odd? $responses")
    }

    fun beforeString(myString: String) {
        println("Initial string is: $myString")
        val beforeStringWithUtils = Utils.before(myString, "di")
        val beforeStringExtensions = myString.before("di")
        val responses = Responses(beforeStringWithUtils, beforeStringExtensions)

        println("string before \"di\" is: $responses")
    }

    fun beforeSpace(myString: String) {
        println("Initial string is: $myString")
        val beforeSpaceWithUtils = Utils.before(myString)
        val beforeSpaceExtensions = myString.before()
        val responses = Responses(beforeSpaceWithUtils, beforeSpaceExtensions)

        println("string before first space \" \" is: $responses")
    }

    fun isPalindrome() {
        val inputList: List<String> =
            listOf("DvD", "DVDRIP", "Anna", "HANNA", "KaYaK", "KOTLIN", "AVALLAVA", "EREGGERE", "INGEGNI", "Android")
        val message = "%s %s a palindrome."
        inputList.forEach {
            val formattedMessage = if (it.isPalindrome()) "IS" else "is NOT"
            println(String.format(message, it, formattedMessage))
        }
    }


    data class Responses(val withUtils: String, val withExtensions: String)

}

fun main(args: Array<String>) {
    val estensioni = Extensions()

    var number = (0..10).random()
    estensioni.isPair(number)

    number = (0..10).random()
    estensioni.isOdd(number)

    estensioni.beforeString("Kotlin corso di Links")

    estensioni.beforeSpace("Kotlin corso di Links")
}
