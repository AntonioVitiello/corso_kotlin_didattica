package ant.vit.corsokotlin

import ant.vit.corsokotlin.step10.ForLoop
import org.junit.Test

/**
 * Created by Antonio Vitiello
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class FoorLoopUnitTest {

    @Test
    fun countRangeTo() {
        val forLoop = ForLoop()
        forLoop.countRangeTo(10)
    }

    @Test
    fun countUntilTo() {
        val forLoop = ForLoop()
        forLoop.countUntilTo(10)
    }

    @Test
    fun countDownTo() {
        val forLoop = ForLoop()
        forLoop.countDownTo(100, 90)
    }

    @Test
    fun forInCharacters() {
        val forLoop = ForLoop()
        forLoop.forInCharacters("Lorem Ipsum Kotlin")
    }

    @Test
    fun forEachCharacter() {
        val forLoop = ForLoop()
        forLoop.forEachCharacter("Lorem Ipsum Kotlin".reversed())
    }

    @Test
    fun forInList() {
        val theList = listOf("Kotlin", "Java", "XML", "Groovie")
        val forLoop = ForLoop()
        forLoop.forInList(theList)
    }

    @Test
    fun forEachList() {
        val theList = listOf("Kotlin", "Java", "XML", "Groovie")
        val forLoop = ForLoop()
        forLoop.forEachList(theList.reversed())
    }

    @Test
    fun forInListWithIndex() {
        val theList = listOf("Kotlin", "Java", "XML", "Groovie")
        val forLoop = ForLoop()
        forLoop.forEachListIndexed(theList)
    }

}