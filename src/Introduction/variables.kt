package Introduction

    fun main(){
        /**
         * Variables in java.
         */

        var myInt: Int = 200
        var alsoMyInt = 300
        var myLong: Long = 200102010201L
        var alsoMyLong = 20201020102010L
        var myByte: Byte = 20
        var alsoMyByte = 21
        var myShort: Short = 2001
        var alsoMyShort = 21001
        var myDouble: Double = 2010.99
        var alsoMyDouble = 2912.82919
        var myFloat: Float = 881.99F
        var alsoMyfloat = 9.0293F

        /**
         * Variable conversion
         */

        var myConvertToInte = myFloat.toInt()

        println(myConvertToInte)

        /**
         * We then run our function
         */

        demoChar()

        /**
         * We run the deBolean function
         */

        demoBoolean()
    }

private fun demoChar(){
    /**
     * Here we write all the character datatypes in kotlin
     */

    var myChar: Char = 'A'
    var myAcc = '\t'
    var infinity = '\u221E'

    /**
     * We go ahead and print the entire code string to the line
     */

    println("Character is $myChar")
    println("The tab is $myAcc next line")
    println("Infinity is $infinity")

    var ledCode = 10.toChar()

    println("The ledCode is $ledCode")
}

private fun demoBoolean(){
    /**
     * we work with boolean variables
     */

    var isTrue: Boolean = false
    var isBig = 1_000_000
    var isSmall  =  200

    println("it is not true Oh ${!isTrue}")

    /**
     * Compare the values
     */

    if (isBig > isSmall){
        println("Is isbig is = $isBig")
    } else{
        println("Is big is = $isSmall")
    }
}