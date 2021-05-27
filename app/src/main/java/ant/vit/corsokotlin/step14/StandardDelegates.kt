package ant.vit.corsokotlin.step14

import java.util.*

/**
 * Created by Antonio Vitiello on 11/05/2021.
 */
class StandardDelegates {
    private var serverDate: String? = null
    private lateinit var currentDate: Date
    private val parsedMessage: String
    private val formattedMessage: String
    private val parsedIdMessage: String

    init {
        loadDataFake()
        parsedMessage = "Parsed date is: %s"
        formattedMessage = "Formatted date is: %s"
        parsedIdMessage = "Parsed id:%s, with url:%s"
    }

    private fun loadDataFake() {
        println("loading fake data...")
        serverDate = "2021-06-05T00:00:00.000Z"
        currentDate = Date()
    }

    fun formatDateWithDelegate() {
        val formatedDate = Utils.formatDateOrNull(Utils.shortDateFormat, currentDate)
        val message = String.format(formattedMessage, formatedDate)
        println(message)
    }

    fun parseDateWithDelegate() {
        val parsesDate = Utils.parseDateOrNull(Utils.iso8601DateFormat, serverDate)
        val message = String.format(parsedMessage, parsesDate)
        println(message)
    }

    fun formatCurrentDateWithDelegate() {
        val currentDate = Utils.formatCurrentDateShort()
        val message = String.format(formattedMessage, currentDate)
        println(message)
    }

    fun parseIdInUrlPath(url: String) {
        val idParsed = Utils.urlToIdOrNull(url)
        val message = String.format(parsedIdMessage, idParsed, url)
        println(message)
    }

    fun parseIdInUrlQuery(url: String, paramName: String) {
        val idParsed = Utils.urlToIdOrNull(url, paramName)
        val message = String.format(parsedIdMessage, idParsed, url)
        println(message)
    }

}