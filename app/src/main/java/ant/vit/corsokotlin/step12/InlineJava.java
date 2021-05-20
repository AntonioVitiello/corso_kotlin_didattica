package ant.vit.corsokotlin.step12;

import java.util.function.Function;

/**
 * Created by Antonio Vitiello
 */
public class InlineJava {

    private void printWithFunction(Function<String, Void> function) {
        System.out.println("before");
        function.apply("block applied!");
        System.out.println("after");
    }

    public void printWithFunctionExplicit() {
        Function<String, Void> function = new Function<String, Void>() {
            @Override
            public Void apply(String msg) {
                System.out.println("do something with message: " + msg);
                return null;
            }
        };

        printWithFunction(function);
    }

    public void printWithLambda() {
        Function<String, Void> function = msg -> {
            System.out.println("do something with message: " + msg);
            return null;
        };

        printWithFunction(function);
    }

    public void printWithLambdaBest() {
        printWithFunction(msg -> {
            System.out.println("do something with message: " + msg);
            return null;
        });
    }

}
