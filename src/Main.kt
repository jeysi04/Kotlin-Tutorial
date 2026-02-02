

//A top level variables that can be use inside the function main
val name3: String = "Sarah"
var greeting: String = "Good morning!"

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
}