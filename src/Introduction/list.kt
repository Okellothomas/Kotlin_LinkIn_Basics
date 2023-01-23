package Introduction

/**
 * the list implementaton
 */

fun main(){

    // calling the method
    mylist()
}

/**
 * list method
 */

private fun mylist(){
    //code implementation
    var mylist = listOf<Any>(3,4,"two", 9, 22, 88, 10)
    // obtain the elements of the list
    var myList_one = mylist.get(2)
    var myList_two = mylist[1]

    println(myList_one)
    println(myList_two)
}