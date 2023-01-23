package Introduction

/**
 * We continue to write the control revision code.
 */

fun main(){
    // the main function goes heres

    // we call the functions here
    myFor()

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