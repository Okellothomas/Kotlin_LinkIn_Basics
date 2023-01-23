package Introduction

/**
 * The null pointer implementation
 */

// declearing a data type class

data class Person(var firstName:String, var secondName:String)
fun main(){

    // declear a null variable of class person
    //val person1:Person = null // Null can not be a value of a non-null type Person
    val person1: Person? = null // we employ the ? for null objects
    println(person1)

    // we declare a nullalbe variable

    var greetings:String? = "Okello is here"
    if (greetings != null){
        println("Length of greating is ${greetings.length}")
    }

    // telling kotline not to worry about the null pointer we employ !!

    println("${greetings!!.length}")

    // employing the elvis operator ?:

    var mylength =  greetings?.length ?: 0

    println(mylength)
}