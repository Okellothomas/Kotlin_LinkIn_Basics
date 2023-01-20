package Introduction

fun main(){

    // call the function
    myControls()
    // call myWhile function
    myWhile()
    // call the doWhile method
    doWhile()
}

/**
 * we create our function controls
 */

private fun myControls(){
    // we implement the for loop



    for(i in 1..5){
        println("I love kenya")
    }

    val students = listOf<String>("Jane", "Thomas", "Okello", "Olal")

    for (student in students){
        println("your current student is $student")
    }

    for ((index, student) in students.withIndex()){
        println("your current ${index+1} is $student")
    }
}

private fun myWhile(){
    // we implement the while loop here

    var one: Int = 1

    while (one <= 30){
        println(one)
        one++
    }
}

/**
 * The do while implementation
 */

private fun doWhile(){
    var age = 10

    do {
        println("I love you all")
        age--
    }while (age > 0)
}