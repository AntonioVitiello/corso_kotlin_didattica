package ant.vit.corsokotlin.step03;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Antonio Vitiello
 */
public class JUserBean {
    private String name;
    private int id;

    public JUserBean(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    @Override
    public String toString() {
        return "JUserBean(name=" + this.name + ", id=" + this.id + ")";
    }

    @Override
    public boolean equals(Object other) {
        if (this != other) {
            if (other instanceof JUserBean) {
                JUserBean userBean = (JUserBean) other;
                if (name.equals(userBean.name) && id == userBean.id) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public int hashCode() {
        return (name != null ? name.hashCode() : 0) * 31 + this.id;
    }

}
