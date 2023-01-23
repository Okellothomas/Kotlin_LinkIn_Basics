package Introduction

fun main(){

    // call the challange function
    ifFunction()

    // call myImplement
    whenImplement()
}

/**
 * Implement the if function
 */

private fun ifFunction(){
    // code implementation.
    var cardPoints = 7_000

    //TODO: replace this if with a when
    // bonus point for using ranges

    var cardLevel: String =  if (cardPoints >=0 && cardPoints <1000){
        "pearl"
    } else if(cardPoints >= 1000 && cardPoints < 5_000){
        "silver"
    } else if(cardPoints >= 5_000 && cardPoints <10_000){
        "gold"
    } else {
        "Platinum"
    }

    println(cardLevel)
    
    val plural  = if (cardPoints >1 || cardPoints ==0) "s" else
        println("you have $cardPoints  and are at the $cardLevel ")

    println(plural)
}

// using when

private fun whenImplement(){
    // code implementation
    var cardPoints = 7_000

    var myImplement: Any = when(cardPoints){
        in 0..999 -> "parl"
        in 1000 .. 4900 -> "Silver"
        in 5000 .. 10000 -> "Platinum"
        else -> {
            "gold"
        }
    }

    println(myImplement)

    var myCase  =  when(cardPoints){
        0, 1 -> "S"
        else ->{
            println("you have $cardPoints  and are at the $myImplement ")
        }
    }

    println(myCase)
}

