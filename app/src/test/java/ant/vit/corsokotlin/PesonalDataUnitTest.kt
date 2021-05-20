package ant.vit.corsokotlin

import ant.vit.corsokotlin.step13.PersonalData
import org.junit.Test

/**
 * Created by Antonio Vitiello
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class PesonalDataUnitTest {

    @Test
    fun getFullNameJavaStyle() {
        val personalData = PersonalData()
        println("FullName: ${personalData.getFullNameJavaStyle()}")
    }

    @Test
    fun getFullNameJavaStyleLittleImproved() {
        val personalData = PersonalData()
        println("FullName: ${personalData.getFullNameJavaStyleLittleImproved()}")
    }

    @Test
    fun getFullNameJavaStyleImproved() {
        val personalData = PersonalData()
        println("FullName: ${personalData.getFullNameJavaStyleImproved()}")
    }

    @Test
    fun getFullNameWithPair() {
        val personalData = PersonalData()
        println("FullName: ${personalData.getFullNameWithPair()}")
    }

    @Test
    fun getFullNameWithPairInfix() {
        val personalData = PersonalData()
        println("FullName: ${personalData.getFullNameWithPairInfix()}")
    }

    @Test
    fun getFullNameBest() {
        val personalData = PersonalData()
        println("FullName: ${personalData.getFullNameBest()}")
    }

    @Test
    fun getFullNameBestInfix() {
        val personalData = PersonalData()
        println("FullName: ${personalData.getFullNameBestInfix()}")
    }

}