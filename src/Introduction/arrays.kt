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

    // call the third method
    myArrayConstructor()
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

/**
 * Implementing using the array constructor
 */

private fun myArrayConstructor(){
    // code implementation
    val fives = Array(5, ::fiver)
    fives.forEach { println(it) }

    // array properties, size, indices and lastIndex

    println("the sized of he array is ${fives.size} elements")
    println("the indices of the array ${fives.indices}")
    println("the last index of the array ${fives.lastIndex}")
}


fun fiver(index:Int): Int{
    return index * 5
}