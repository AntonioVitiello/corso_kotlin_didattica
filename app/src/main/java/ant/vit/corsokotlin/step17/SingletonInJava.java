package ant.vit.corsokotlin.step17;

import java.util.Date;

/**
 * Created by Antonio Vitiello on 24/05/2021.
 */

public final class SingletonInJava {
    private static SingletonInJava instance;
    private Date dateOfStart;


    private SingletonInJava() {
        dateOfStart = new Date();
        System.out.println("SingletonInJava class invoked");
    }

    public static SingletonInJava getInstance() {
        if (instance == null) {
            instance = new SingletonInJava();
        }
        return instance;
    }

    public Date getDateOfStart() {
        return dateOfStart;
    }

}
