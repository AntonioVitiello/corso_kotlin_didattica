package ant.vit.corsokotlin.step03.realkotlin

/**
 * Created by Antonio Vitiello
 */
data class UserBean(var name: String? = "qqq", var id: String = "123") {

    private val variabile1 = "Corso Kotlin"
    private lateinit var variabile2: String


    override fun toString(): String {

        variabile2 = "2"
        System.out.println(variabile2)

        return name + "Antonio!" + id
    }
}