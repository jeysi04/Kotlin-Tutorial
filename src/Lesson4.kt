
//Used in collection/listOf
fun sayHello(greeting:String, itemsToGreet:List<String>) {
    itemsToGreet.forEach { itemsToGreet ->
        println("$greeting, $itemsToGreet")
    }
}

//vararg represents a variable number of arguments
// tells the compiler hat were gonna take a variable number of string arguments after the initial greeting
fun sayHi(greeting:String, vararg itemsToGreet:String) {
    itemsToGreet.forEach { itemsToGreet ->
        println("$greeting, $itemsToGreet")
    }
}

fun sayName(greeting:String, name:String) = println("$greeting, $name")

//for passing none/only one argument
fun sayName2(greeting:String = "Hello", name:String = "Nate") = println("$greeting, $name")

fun main() {

    val items = listOf("I", "am", "Jaycee")

    //passing greeting and items
    sayHello("Good Morning", items)
    sayHi("Hi", "Kotlin", "Programming")

    //uses arrayOf with vararg
    val itemsArray = arrayOf("I", "am", "JayceeArray")
    sayHi("Good Morning", *itemsArray)

    //say the name
    sayName(greeting ="Hello", "Jaycee")
    //changing the order, you must label both
    sayName(name = "Hello", greeting = "Jaycee")

    //passes only one argument
    sayName2()
    sayName2(name = "Agatha")


    // Limitations for varargs
    val itemsA = arrayOf("I", "am", "JayceeA")
    sayHi(greeting = "Hi", *itemsA)
}