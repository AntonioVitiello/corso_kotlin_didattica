package ant.vit.corsokotlin.step03

import java.util.*

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

    fun setName(name: String?) {
        this.name = name
    }

    fun getId(): Int {
        return id
    }

    fun setId(id: Int) {
        this.id = id
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false
        val jUserBean = other as JUserBean
        return id == jUserBean.id &&
                name == jUserBean.name
    }

    override fun hashCode(): Int {
        return Objects.hash(name, id)
    }

    override fun toString(): String {
        return "JUserBean{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}'
    }

}