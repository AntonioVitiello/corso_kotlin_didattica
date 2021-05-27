package ant.vit.corsokotlin.step14

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Antonio Vitiello on 11/05/2021.
 */
@SuppressLint("SimpleDateFormat")
class Utils {

    companion object {
        val shortDateFormat by lazy { SimpleDateFormat("dd/MM/yyyy") }
        val iso8601DateFormat by lazy { SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'") }
        private val urlToIdRegex by lazy { "/[0-9]+".toRegex() }
        private lateinit var queryParam: String
        private val urlQueryToIdRegex by lazy { "$queryParam=[0-9]+".toRegex() }

        fun formatDateOrNull(dateFormat: SimpleDateFormat, date: Date?): String? {
            return date?.format(dateFormat)
        }

        fun parseDateOrNull(dateFormat: SimpleDateFormat, string: String?): Date? {
            return string?.parseDateOrNull(dateFormat)
        }

        fun formatCurrentDateShort(): String {
            return formatDateOrNull(shortDateFormat, Date())!!
        }

        fun urlToIdOrNull(url: String?): String? {
            return if (url != null) {
                val result = urlToIdRegex.find(url)?.value
                //remove first slash
                result?.filter {
                    it.isDigit()
                }
            } else {
                null
            }
        }

        fun urlToIdOrNull(url: String?, paramName: String): String? {
            return if (url != null) {
                queryParam = paramName
                val result = urlQueryToIdRegex.find(url)?.value
                //remove all non digits
                result?.filter {
                    it.isDigit()
                }
            } else {
                null
            }
        }

    }

}