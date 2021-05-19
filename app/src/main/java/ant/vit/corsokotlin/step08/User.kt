package ant.vit.corsokotlin.step08

import ant.vit.corsokotlin.step06.StringheAdvanced


/**
 * Created by Antonio Vitiello on 18/05/2021.
 */
class User constructor(val name: String) {
    private lateinit var surname: String
    private val subUsers = mutableListOf<User>()

    constructor(name: String, surname: String) : this(name) {
        this.surname = surname
    }

    constructor(name: String, parent: User) : this(name) {
        parent.subUsers.add(this)
        surname = name
    }

    /**
     * Con la sintassi this::surname otteniamo una reference alla proprietà surname
     */
    override fun toString(): String {
        var tostring = "User(name=$name, "
        if(::surname.isInitialized){
            tostring += "surname=$surname, "
        }
        tostring += "subUsers=${subUsers}"
        return tostring
    }
}

fun main(args: Array<String>) {
    val user1 = User("Aldo", "Baglio")
    val user2 = User("Giovanni")
    val user3 = User("Giacomo", user1)
    println(user1)
    println(user2)
    println(user3)

    StringheAdvanced.Foo("foo!", 1, true)
}
