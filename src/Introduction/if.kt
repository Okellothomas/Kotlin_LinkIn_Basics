package Introduction

fun main(){
    /**
     * We call the myIf()
     */

    myIf()
}

/**
 * We write our if else statmente and call our function in the main function
 */

private fun myIf(){
    // the tenary operator
    val num1: Int = 300
    val num2 = 400
    var myTenary: String =  if (num1 > num2) "Num one is greater $num1" else "Num 2 is greater $num2"

    println(myTenary)

    // Just an if and else statement
    var normalIfEse: Any = if (num1 > num2){
        4
    }else{
        "I love you so much "
    }

    println("This a normal if oh! $normalIfEse")

    // nested if else

    var nestIfelse: Any = if (num1 > num2){
        89
    } else if (num1 === 993){
        "I love ya all"
    } else{
        "Call me papa"
    }

    println("nested if else is here to stay! $nestIfelse")
}