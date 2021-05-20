package ant.vit.corsokotlin.step12

/**
 * Created by Antonio Vitiello
 */
fun nonInlined(block: () -> Unit) {
    println("before")
    block()
    println("after")
}

fun main(args: Array<String>) {
    nonInlined {
        println("do something here")
    }
}
