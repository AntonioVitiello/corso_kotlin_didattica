package ant.vit.corsokotlin.step01;

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

}
