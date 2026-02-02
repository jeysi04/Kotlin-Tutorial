

//Lesson 3: Collections and Iterations


fun main() {
    //Using arrays
    val interestingListOfThings = arrayOf("Kotlin", "Programming", "Manga")
    println("The number of things on the list is $interestingListOfThings.size.")
    println("The first thing on the list is ${interestingListOfThings.get(0)}.")
    println("The first thing on the list is ${interestingListOfThings[0]}.")
    println("The last thing on the list is ${interestingListOfThings.last()}.")


    //for loop for printing everything on the array
    for (interestingListOfThings in interestingListOfThings) {
        println(interestingListOfThings)
    }
}