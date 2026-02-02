
//Lesson 2: Basic functions

//fun getGreeting(): String {
//     return "Hello, kotlin"
//}

fun getGreeting(): String = "Hello, kotlin"

fun addNum(one: Int, two: Int): Int {
    var sum: Int
    sum = one + two
    return sum
}

// We are using unit as we are not returning anything
fun sayHello(): Unit {
    println(getGreeting())
}

fun greetingName(name: String): String {
    return "Hello, ${name}"
}

fun main() {

    //printing a function
    println(getGreeting())

    //passing a parameter
    var num1: Int = 2
    var num2: Int = 3
    println(addNum(num1, num2))
    println("The sum is ${addNum(num1, num2)}")

    val girlName: String = "Ella"
    println(greetingName(girlName))

    //using a Unit
    sayHello()
}