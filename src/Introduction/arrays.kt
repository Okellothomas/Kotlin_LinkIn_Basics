package Introduction

/**
 * We do array implementation here
 */

data class Students(val firstName: String, val lastName: String, val age: Int)

fun main(){
    // we will call our methods here

    myArray()

    // calling myarrayObject
    myArrayType()
}

/**
 * Array initialization and declaration
 */

private fun myArray(){
    // arrays as variables

    var myArray = arrayOf("One", 2,3,4, "Sure",10)

    // reasing values of an array
    myArray[0] = "Okello"
    myArray[1] = "Thomas"
    myArray[2] = "Olal"
    myArray[3] = "kadika"
    for (array in myArray){
        println(array)
    }
}

private fun myArrayType(){
    // array initialization

    var myArray = arrayOf<Students>(Students("Okello", "Thomas", 8), Students("Olal", "Toma", 8),
        Students("Jkuat", "firstyear", 11))

    myArray[1] = Students("Tomas", "Tomas", 290)

    for (student in myArray){
        println(student)
    }
}