package ant.vit.corsokotlin.step01

/**
 * Created by Antonio Vitiello
 */
class KUserBean {
    private var name: String? = null
    private var id: Int = 0

    constructor(name: String?, id: Int) {
        this.name = name
        this.id = id
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getId(): Int {
        return id
    }

    fun setId(id: Int) {
        this.id = id
    }

}