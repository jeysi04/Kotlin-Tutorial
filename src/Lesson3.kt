

//Lesson 3: Collections and Iterations


fun main() {
    //Using arrays
    val interestingListOfThings = arrayOf("Kotlin", "Programming", "Manga")
    println("The number of things on the list is $interestingListOfThings.size.")
    println("The first thing on the list is ${interestingListOfThings.get(0)}.")
    println("The first thing on the list is ${interestingListOfThings[0]}.")
    println("The last thing on the list is ${interestingListOfThings.last()}.")


    //for loop for printing everything on the array (typically used in java)
    for (interestingListOfThings in interestingListOfThings) {
        println(interestingListOfThings)
    }

    //prints all things in list
    interestingListOfThings.forEach {
        println(it)
    }

    // another way in kotlin to print all things in list
    interestingListOfThings.forEach { interestingListOfThings ->
        println(interestingListOfThings)
    }

    //printing the list with their index
    interestingListOfThings.forEachIndexed {
        index, interestingListOfThings ->
        println("$interestingListOfThings is at index $index.")
    }

    //ListOf Function
    val interestingThingsListOf = listOf("I", "Am", "Using", "ListOf")

    //prints the list
    interestingThingsListOf.forEach { interestingThingsListOf ->
        println(interestingThingsListOf)
    }

    //prints with index
    interestingThingsListOf.forEachIndexed { index, interestingThingsListOf ->
        println("$interestingThingsListOf is at index $index.")
    }


    //mapOf
    //uses interestingThingsListOf
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")

    //to iterate
    map.forEach { key, value ->
        println("$key -> $value")
    }

    //the list above are immutable; we cannot add things on the list
    //If we want to add things, we will need to use mutableListOf

    //for example:
    val mutableList = mutableListOf("I", "Am", "Mutable")

    //add
    mutableList.add("!")

    mutableList.forEach { mutableList -> println(mutableList) }

    //Using map as an example:
    val mapa = mutableMapOf(1 to "A", 2 to "B", 3 to "C")

    mapa.forEach {key, value ->
        println("$key -> $value")
    }

    mapa.put(4, "D")

    mapa.forEach {key, value ->
        println("$key -> $value")
    }
}