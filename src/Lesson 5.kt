
fun greetPerson(greeting:String, name:String) = println("$greeting, $name")

fun sayHi(greeting:String ="Konbanwa", name: String ="Mark") = println("$greeting, $name")

fun greetAlot(greeting:String, vararg itemstoGreet:String){
    itemstoGreet.forEach{ itemstoGreet ->
        println("$greeting, $itemstoGreet")
    }
}

fun main(){

    //The parameters can be passed in different orders if they are defined using '='
    greetPerson("hi", "Agatha")
    greetPerson(name="Ella", greeting = "Ohayou")

    //Allows to pass an incomplete parameter since the parameters on the function are already defined
    sayHi(greeting = "Sumimasen")

    val peopleName = arrayOf("Arya", "Sansa", "Jon")
    greetAlot("Hi", *peopleName)
}