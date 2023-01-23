package Introduction

/**
 * the list implementaton
 */

fun main(){

    // calling the method
    mylist()
    // calling the second method
    mutableList()
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

    // creating a sublist from an immuatable list
    var mySublist = mylist.subList(1,4)
    println(mySublist)
}

/**
 * creating a mutable list
 */

private fun mutableList(){
    //code implementation
    var myList = mutableListOf<Any>(2, "one", 9, 2, "sure", 9, 1.88)
    // properties of the mutable items
    myList[3] = "Okello"
    myList.reverse()
    myList.removeAt(4)
    myList.remove("Okello")
    myList.first()
    myList.last()
    println(myList)
    println("${myList.size}")
}