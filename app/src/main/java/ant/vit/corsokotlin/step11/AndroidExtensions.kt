package ant.vit.corsokotlin.step11

import ant.vit.corsokotlin.step13.PersonalData
import java.util.*

/**
 * Created by Antonio Vitiello
 */

/**
 * Funzioni definite come TOP LEVEL FUNCTION!
 */

fun Int.isPair(): Boolean {
    return this % 2 == 0
}

fun Int.isOdd(): Boolean {
    return !isPair()
}

fun String.before(separator: String = " "): String {
    val indexOfSeparator = this.indexOf(separator)
    return if (indexOfSeparator < 0) this else this.substring(0, indexOfSeparator)
}

fun String.isPalindrome(): Boolean {
    val normalizedString = toLowerCase(Locale.getDefault())
    val splits = normalizedString.split(" ")
    val reversedString = splits.joinToString(" ") { split -> split.reversed() }
    return normalizedString == reversedString
}

/**
 * Full name infix function
 */
infix fun String.with(surname: String): PersonalData.FullName = PersonalData.FullName(this, surname)