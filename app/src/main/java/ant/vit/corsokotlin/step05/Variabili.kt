package ant.vit.corsokotlin.step05

/**
 * Created by Antonio Vitiello on 04/05/2021.
 */
class Variabili {

    fun datiPrimitivi() {
        val aByte: Byte = 123 //8bit: -128,..,+127
        val aShort: Short = 12345 //16bit: -32.768,..,+32.767
        val anInt: Int = 12345 //32bit: -2.147.483.648,..,+2.147.483.647
        val aFloat: Float = 123.45f //32bit: -2.147.483.648,..,+2.147.483.647
        val aLong: Long = 12345L //64bit: -9.223.372.036.854.775.808,..,9.223.372.036.854.775.807
        val aDouble: Double = 123.45 //64bit: -9.223.372.036.854.775.808,..,9.223.372.036.854.775.807

        val pigreco: Double = Math.PI //3,141592653589793
        val eulero: Double = Math.E   //2,718281828459045

        println(
            """anInt:$anInt
         aLong:$aLong
         aDouble:$aDouble
         aFloat:$aFloat
         aByte:$aByte
         aShort:$aShort
         
         pigreco:$pigreco
         eulero:$eulero"""
        )
    }

    fun conversioniDiTipi() {
        val aDouble: Double = 12345.0
        val fromDoubleToInt: Int = aDouble.toInt()
        val fromDoubleToFloat: Float = aDouble.toFloat()
        val fromDoubleToLong: Long = aDouble.toLong()

        println(
            """aDouble:$aDouble
        fromDoubleToInt:$fromDoubleToInt
        fromDoubleToFloat:$fromDoubleToFloat
        fromDoubleToLong:$fromDoubleToLong"""
        )
    }

    /**
     * Byte  => 8bit: -128,..,+127
     * Short => 16bit: -32.768,..,+32.767
     * Int   => 32bit: -2.147.483.648,..,+2.147.483.647
     * Float => 32bit: -2.147.483.648,..,+2.147.483.647
     * Long  => 64bit: -9.223.372.036.854.775.808,..,9.223.372.036.854.775.807
     * Double=> 64bit: -9.223.372.036.854.775.808,..,9.223.372.036.854.775.807
     */
    fun perditaDiPrecisione() {
        val fromLongToString: String = Long.MAX_VALUE.toString()
        val fromLongToShort: Short = Long.MAX_VALUE.toShort()
        val fromLongToInt: Int = Long.MAX_VALUE.toInt()
        val fromLongToFloat: Float = Long.MAX_VALUE.toFloat()
        val fromLongToByte: Byte = Long.MAX_VALUE.toByte()
        val fromLongToDouble: Double = Long.MAX_VALUE.toDouble()

        println(
            """maxLong:${Long.MAX_VALUE}
         fromLongToString:$fromLongToString
         fromLongToByte:$fromLongToByte
         fromLongToShort:$fromLongToShort
         fromLongToInt:$fromLongToInt
         fromLongToFloat:$fromLongToFloat
         fromLongToDouble:$fromLongToDouble"""
        )
    }

    fun typeInference() {
        val astring = Long.MAX_VALUE.toString()
        val abyte = astring.toLong().toByte()
        val ashort = astring.toLong().toShort()
        val anint = astring.toLong().toInt()
        val afloat = astring.toFloat()
        val along = astring.toLong()
        val adouble = astring.toDouble()

        println(
            """astring: $astring
        |abyte: $abyte
        |ashort: $ashort
        |anint: $anint
        |afloat: $afloat
        |along: $along
        |adouble: $adouble""".trimMargin()
        )
    }

}

fun main(args: Array<String>) {
    val variabili = Variabili()
    variabili.datiPrimitivi()
    variabili.conversioniDiTipi()
    variabili.perditaDiPrecisione()
    variabili.typeInference()
}
