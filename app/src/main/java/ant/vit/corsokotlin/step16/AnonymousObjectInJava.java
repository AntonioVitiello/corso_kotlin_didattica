package ant.vit.corsokotlin.step16;

/**
 * Created by Antonio Vitiello on 16/05/2021.
 */

public class AnonymousObjectInJava {

    private interface IHelloWorld {
        void greet();

        void greetSomeone(String someone);
    }

    public void sayHelloInEnglish() {
        class EnglishGreeting implements IHelloWorld {
            @Override
            public void greet() {
                greetSomeone("world");
            }

            @Override
            public void greetSomeone(String someone) {
                System.out.println("Hello " + someone);
            }
        }

        IHelloWorld helloWorld = new EnglishGreeting();
        helloWorld.greet();
        helloWorld.greetSomeone("Antonio");
    }

    public void sayHelloInSpanish() {
        IHelloWorld helloWorld = new IHelloWorld() {

            public void greet() {
                greetSomeone("mundo");
            }

            public void greetSomeone(String someone) {
                System.out.println("Hola, " + someone);
            }
        };

        helloWorld.greet();
        helloWorld.greetSomeone("Antonio");
    }


    public static void main(String[] args) {
        AnonymousObjectInJava helloWorld = new AnonymousObjectInJava();
        helloWorld.sayHelloInEnglish();
        helloWorld.sayHelloInSpanish();
    }

}