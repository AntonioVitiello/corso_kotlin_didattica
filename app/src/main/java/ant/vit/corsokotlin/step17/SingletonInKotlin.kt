package ant.vit.corsokotlin.step17

import java.util.*

/**
 * Created by Antonio Vitiello on 24/05/2021.
 */
class SingletonInKotlin private constructor() {
    val dateOfStart: Date

    companion object {
        private var instance: SingletonInKotlin? = null

        fun getInstance(): SingletonInKotlin {
            instance = instance ?: SingletonInKotlin()
            return instance!!
        }

        fun getInstance2(): SingletonInKotlin {
            if (instance == null) {
                instance = SingletonInKotlin()
            }
            return instance!!
        }
    }

    init {
        dateOfStart = Date()
        println("SingletonInJava class invoked")
    }
}