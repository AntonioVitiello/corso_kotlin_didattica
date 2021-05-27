package ant.vit.corsokotlin.step14

import android.util.Log
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Antonio Vitiello on 11/05/2021.
 */
fun Date.format(dateFormat: SimpleDateFormat): String {
    return dateFormat.format(this)
}

fun String.parseDateOrNull(dateFormat: SimpleDateFormat): Date? {
    return if (isEmpty()) {
        null
    } else {
        try {
            dateFormat.parse(this)
        } catch (exc: ParseException) {
            Log.e("parseDateOrNull", "Error while parsing date:[$this].", exc)
            null
        }
    }
}

fun Date.formatISO8601OrNull(): String {
    return Utils.iso8601DateFormat.format(this)
}

