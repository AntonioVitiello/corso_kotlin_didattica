package ant.vit.corsokotlin.step11

/**
 * Created by Antonio Vitiello on 07/05/2021.
 */
class Utils {

    companion object {
        fun isPair(number: Int): Boolean {
            return number % 2 == 0
        }

        fun isOdd(number: Int): Boolean {
            return !isPair(number)
        }

        fun before(astring: String, separator: String = " "): String {
            val indexOfSeparator = astring.indexOf(separator)
            return if (indexOfSeparator < 0) astring else astring.substring(0, indexOfSeparator)
        }
    }

}
