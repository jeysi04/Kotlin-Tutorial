

//A top level variables that can be use inside the function main
val name3: String = "Sarah"
var greeting: String? = "HI"

fun main() {

    //to define a variable, we van use:

    //It cannot be reassigned
    val name: String = "Nate"
    println(name)

    //If we want to reassign, we can use:
    var name2: String = "Rose"
    name2 = "Lea"
    println(name2)

    //Printing a top level variable (outside main function)
    println(name3)
    println(greeting)

    //changing an outside variable var
    greeting = "Good afternoon!"
    println(greeting)

    //Nullable string
    var age: Int? = null
    age = 16
    println(age)

    //We cannot set a variable to null when you are not declaring it
    // greeting = "null" this is not allowed
    // However, greeting = "Hello" is allowed

    //Using if statement
    greeting = "Hi, if!"
    if(greeting != null){
        println(greeting)
    }
    else {
        println("Hi")
    }

    //When statement is similar to switch statement
    when(greeting){
        null -> println("Hi")
        else -> println("This is else in when statement!")
    }

    var saymyname: String? = "Sammy"

    //assigning using if and else
    greeting = "Assign using if and else"
    saymyname = if(greeting != null) greeting else "Hi"
    println(saymyname)

    //assigning using when
    greeting = "Assign using when"
    saymyname = when(greeting){
        null -> "Hi"
        else -> greeting
    }
    println(saymyname)
}