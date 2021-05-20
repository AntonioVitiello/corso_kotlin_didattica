package ant.vit.corsokotlin.step13

import ant.vit.corsokotlin.step11.with

/**
 * Created by Antonio Vitiello
 */
class PersonalData {
    private lateinit var name: String
    private lateinit var surname: String

    init {
        loadDataFake()
    }

    /**
     * fake data loading...
     */
    private fun loadDataFake() {
        println("loading fake data...")
        name = "Antonio"
        surname = "Vitiello"
    }

    fun getFullNameJavaStyle(): List<String> {
        val mutableList = mutableListOf<String>()
        mutableList.add(name)
        mutableList.add(surname)
        return mutableList.toList()
    }

    fun getFullNameJavaStyleLittleImproved(): List<String> {
        return mutableListOf<String>().apply {
            add(name)
            add(surname)
        }.toList()
    }

    fun getFullNameJavaStyleImproved(): List<String> {
        return listOf(name, surname)
    }

    fun getFullNameWithPair(): Pair<String, String> {
        return Pair(name, surname)
    }

    /**
     * using infix
     */
    fun getFullNameWithPairInfix(): Pair<String, String> {
        return name to surname
    }


    data class FullName(val name: String, val surname: String)

    fun getFullNameBest(): FullName {
        return FullName(name, surname)
    }

    /**
     * using custom infix
     */
    fun getFullNameBestInfix(): FullName {
        return name with surname
    }

}