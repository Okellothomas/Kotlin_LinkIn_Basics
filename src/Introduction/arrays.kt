package Introduction

/**
 * We do array implementation here
 */

fun main(){
    // we will call our methods here

    myArray()
}

/**
 * Array initialization and declaration
 */

private fun myArray(){
    // arrays as variables

    var myArray = arrayOf("One", 2,3,4, "Sure",10)

    for (array in myArray){
        println(array)
    }
}