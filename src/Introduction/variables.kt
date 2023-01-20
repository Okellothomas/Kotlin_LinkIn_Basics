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

        /**
         * We run myString function
         */

        myStrings()

        /**
         * Implementing if and when
         */
        ifAndWhen()
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

/**
 * Strings in kotlin
 */


private fun myStrings(){
    val myString = "Okello There"
    val ouString: String = """
       My Name is okello thomas
        sure, i think you should be careful
        coz, someone can harm you
    """
    val myStringLength: Int = ouString.length

    println("{$ouString} is $myStringLength long")
}

private fun ifAndWhen(){
    /**
     * We do the if and when statement
     */

    val age: Int = 300
    val score: Int = 200

    var myIf: String = if (age > score) "Age is true" else "age is one "

    print("It is true $myIf")

    /**
     * Implementing the when statement
     */

    var myWhen = when(age){
        in 1..19 -> "Sure bothers"
        in  20..199 -> "Call me"
        else -> "call home"
    }

    println("Whe is $myWhen")
}