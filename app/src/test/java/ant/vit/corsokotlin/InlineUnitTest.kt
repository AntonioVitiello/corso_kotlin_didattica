package ant.vit.corsokotlin

import ant.vit.corsokotlin.step12.InlineJava
import ant.vit.corsokotlin.step12.InlineKotlin
import org.junit.Test

/**
 * Created by Antonio Vitiello
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class InlineUnitTest {

    @Test
    fun printWithFunctionExplicitInJava() {
        val inlineJava = InlineJava()
        inlineJava.printWithFunctionExplicit()
    }

    @Test
    fun printWithLambdaExpressionInJava() {
        val inlineJava = InlineJava()
        inlineJava.printWithLambda()
    }

    @Test
    fun printWithLambdaExpressionBestInJava() {
        val inlineJava = InlineJava()
        inlineJava.printWithLambdaBest()
    }

    @Test
    fun printLambdaNotInlineInKotlin() {
        val kotlinClass = InlineKotlin()
        kotlinClass.printLambdaNotInline()
    }

    @Test
    fun printLambdaInlineInKotlin() {
        val kotlinClass = InlineKotlin()
        kotlinClass.printLambdaInline()
    }

}