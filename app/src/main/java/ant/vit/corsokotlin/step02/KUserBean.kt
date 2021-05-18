package ant.vit.corsokotlin.step02

/**
 * Created by Antonio Vitiello
 */
class KUserBean {
    private var name: String? = null
    private var id = 0

    constructor(name: String?, id: Int) {
        this.name = name
        this.id = id
    }

    fun getName(): String? {
        return name
    }

    fun getId(): Int {
        return id
    }

}