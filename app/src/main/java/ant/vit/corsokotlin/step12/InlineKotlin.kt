package ant.vit.corsokotlin.step12

/**
 * Created by Antonio Vitiello
 */
class InlineKotlin {

    private fun printWithLambdaNotInline(block: (String) -> Unit) {
        println("before")
        block.invoke("block applied!")
        println("after")
    }

    private inline fun printWithLambdaInline(block: (String) -> Unit) {
        println("before")
        block.invoke("block applied!")
        println("after")
    }

    /**
     * equivalente a:
     * inlined(new Function<String, Void>() {
     *   @Override
     *   public Void apply(String msg) {
     *     System.out.println("do something with: " + msg);
     *     return null;
     *   }
     * });
     * cioè verrà creata una istanza di Function
     * otterrai un codice più ottimizzato in termini di occupazione
     * ma meno efficiente: più lento e con maggiore occupazione di memoria
     */
    fun printLambdaNotInline() {
        printWithLambdaNotInline { msg ->
            println("do something with message: $msg")
        }
    }

    /**
     * equivalente a:
     * System.out.println("before");
     * System.out.println("block applied!");
     * System.out.println("after");
     * Non verrà creata una istanza di Function,
     * invece il codice attorno all'invocazione della funzione "block" all'interno della funzione inline
     * verrà copiato nella chiamata, quindi otterrai qualcosa di simile nel bytecode => più veloce
     * ma meno ottimizzato in termini di occupazione
     */
    fun printLambdaInline() {
        printWithLambdaInline { msg: String ->
            println("do something with message: $msg")
        }
    }

}