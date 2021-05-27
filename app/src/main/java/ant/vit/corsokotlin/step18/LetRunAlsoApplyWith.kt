package ant.vit.corsokotlin.step18

/**
 * Created by Antonio Vitiello on 24/05/2021.
 */
class LetRunAlsoApplyWith {
    var user: User? = null
    val list = mutableListOf<User>()
    var users: MutableList<User>? = null

    class User(var name: String, val logged: Boolean)

    fun doLetTestThreadSafe(): String {
        val a = user?.let {
            "${it.name}, isLogged: ${it.logged}}"
        } ?: run {
            "User undefined!"
        }.also { "$it <<end" }

        return a
    }

    /**
     * Can't do that
     */
/*
    fun doLetTestNotThreadsafe(): String {
        return if (user != null) {
            "${user.name}, isLogged: ${user.logged}}"
        } else {
            "User undefined!"
        }
    }
*/

    fun doApplyTest(): String {
        var string: String? = null
        user?.apply {
            name = "Antonio"
            string = "${name}, isLogged: ${logged}}"
        } ?: run {
            user = User("Kotlin", false)
            string = "User undefined!"
        }

        return string!!
    }

    fun switchData(data: List<User>?) {
        if (data != null) {
            list.apply {
                clear()
                addAll(data)
            }
        } else {
            list.clear()
        }
    }

    fun doSomethingData(data: List<User>) {
        users?.apply {
            clear()
            addAll(data)
        } ?: run {
            users = mutableListOf()
        }
    }

    fun find(u: User): User? {
        return list.firstOrNull {
            it == u
        }
    }

    fun doSomethingWithData(data: List<User>) {
        with(data) {
            val filter = this.filter { it.logged }
            if (filter.isEmpty()) {
                list.clear()
            } else {
                list.addAll(filter)
            }
        }
    }

}