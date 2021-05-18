package ant.vit.corsokotlin.step02;

/**
 * Created by Antonio Vitiello
 */
public class JUserBean {
    private final String name;
    private final int id;

    public JUserBean(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}
