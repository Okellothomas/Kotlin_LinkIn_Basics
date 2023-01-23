package Introduction

/**
 * code implemetation
 */

fun main(){
    // calling my functions here
    mySets()
}

private fun mySets(){
    // code implemenation
    var mySet = setOf<Any>("9", 3, 3, 3, 3, 3, 29, "sure", "Okello", "i Love you all")
    println(mySet)
    val size = mySet.size
    val contain = mySet.contains("9")
    println(size)
    println(contain)

    // create a mutable set
    var myMutable = mutableSetOf<Any>("99", 99, "99", 99, "99", "99")
    println(myMutable)
    // check for equality of sets
    var mySecond = mutableSetOf<Any>(99, "99", "99", "99", "99", 99)

    val myEqual = myMutable.first() == mySecond.first()
    var setEqual = myMutable == mySecond

    println(myEqual)
    println(setEqual)

    // the hashSetOf

    // create a mutable set
    var myHash = hashSetOf<Any>("99", 99, "99", 99, "99", "99")
    println(myMutable)
    // check for equality of sets
    var mySHash = hashSetOf<Any>(99, "99", "99", "99", "99", 99)

    val myEqual1 = myHash.first() == mySHash.first()
    var setEqual2 = myHash == mySHash

    println(myEqual1)
    println(setEqual2)

    // one can add elements to a set
    var addition  =  myHash.add("99")
    var deletion = myHash.remove("99")

    println(addition)
    println(deletion)

    // convert a set to a list

    var convert = myMutable.toMutableList()

    convert[0] = "okello"

    println("**************************************")
    println(convert)




}