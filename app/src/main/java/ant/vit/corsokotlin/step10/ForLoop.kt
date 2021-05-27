package ant.vit.corsokotlin.step10

/**
 * Created by Antonio Vitiello on 06/05/2021.
 */
class ForLoop {

    fun countRangeTo(toTop: Int) {
        for (i in 0..toTop) {
            println("index = $i")
        }
    }

    fun countUntilTo(toTop: Int) {
        for (i in 0 until toTop) {
            println("index = $i")
        }
    }

    fun countDownTo(fromTop: Int, toBottom: Int) {
        for (i in fromTop downTo toBottom) {
            println("index = $i")
        }
    }

    fun forInCharacters(message: String) {
        for (index in message.indices) {
            println("character($index) = ${message[index]}")
        }
    }

    fun forEachCharacter(message: String) {
        message.forEach {
            println("character = $it")
        }
    }

    fun forEachIndexCharacters(message: String) {
        message.forEachIndexed { i, c ->
            println("character($i) = $c")
        }
    }

    fun forInList(list: List<String>) {
        for (index in list.indices) {
            println(list[index])
        }
    }

    fun forEachList(list: List<String>) {
        list.forEach {
            println(it)
        }
    }

    fun forEachListIndexed(list: List<String>) {
        list.forEachIndexed { i, item ->
            println("the element at $i is $item")
        }
    }

}