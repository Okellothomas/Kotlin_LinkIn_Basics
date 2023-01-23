package Introduction

/**
 * We continue to write the control revision code.
 */

fun main(){
    // the main function goes heres

    // we call the functions here
    myFor()
    // call the while function
    myWhile()

}

/**
 * The for loop implmenenation
 */

private fun myFor(){
    // printing a range

    for( i in 1..10){
        println("i love kenya")
    }

    val myList = listOf<String>("Okello", "Thomas", "Olal", "Home", "Dala")

    for (list in myList){
        println("my name is $list")
    }

    for (i in 3..10){
        if (6 > 10){
            println("Kenya is corrupt")
        }else {
            println("Ruto tano tena")
        }
    }
}

/**
 * the while loop
 */

private fun myWhile(){
    // implementing the while loop
    var i = 10
    while (i < 20){
        println("School is not fair")
        i++
    }

    // second challange
    var p = 0
    while (p < 10){
        val sum = 30 + 40
        if (sum == 90){
            println(sum)
        } else {
            println("sure crock")
        }
        p++

    }
}