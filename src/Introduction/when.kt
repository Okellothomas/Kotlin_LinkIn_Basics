package Introduction

fun main(){

    // we call the myWhen() method
    mywhen()
}

/**
 * We write when statements here.
 */

private fun mywhen(){
    // simple when statement
    val age:Int =  30

    var myAge: Any = when(age){
        in 1..10 -> println("Your still a toodler since your age is $age")
        in 11..20 -> println("You are now a young man nigga and your age is $age")
        in 21..30 -> println("You are an adult nigga and your age is $age")
        else -> {
            "You age is unknown brother $age"
        }
    }

    // implementing nexted string for when statement

    var myName: String = "Okello"

    var myLastName: Any = when(myName){
        "Phone" -> println("Your last should be $myName")
        "okello" -> println("Your last name should be $myName")
        "Okello" -> println("Sure this should be your last name $myName")
        else -> {
            println("I surely do not know your last name")
        }
    }

    // when statment when using the normal numbers

    val scores: Int = 400

    var myScores = when(scores){
        in 100..200 -> println("C")
        in 201..300 -> println("B")
        in 301..400 -> println("A")
        else -> {
            println("You have failed my nigga")
        }
    }


}