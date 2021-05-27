package ant.vit.corsokotlin.step16

import android.os.Handler
import android.os.Looper
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doOnTextChanged

/**
 * Created by Antonio Vitiello on 12/05/2021.
 */
class AnonymousOrLambda {
    private val button: Button? = null
    private val editText: EditText? = null

    fun useAnonimousObject() {
        //1
        println("start-1")
        Handler(Looper.getMainLooper()).postDelayed(object : Runnable {
            override fun run() {
                println("end-1: do something after 1000 ms!")
            }
        }, 1000L)

        //2
        button?.setOnClickListener {
            object : View.OnClickListener {
                override fun onClick(v: View?) {
                    println("do something on button click!")
                }
            }
        }

        //3
        editText?.addTextChangedListener {
            object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                    println("do something on beforeTextChanged!")
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    println("do something on onTextChanged!")
                }

                override fun afterTextChanged(s: Editable?) {
                    println("do something on afterTextChanged!")
                }
            }

        }

    }

    fun useLambdaExpression() {
        //1
        Handler(Looper.getMainLooper()).postDelayed({
            println("do something after 1000 ms!")
        }, 1000L)

        //2
        button?.setOnClickListener { println("do something on button click!") }

        //3 Can't use Lambda on "object" that implements more than 1 function, so we use Extensions
        editText?.doOnTextChanged { text, start, before: Int, count: Int ->
            println("do something on onTextChanged!")
        }
    }

}
