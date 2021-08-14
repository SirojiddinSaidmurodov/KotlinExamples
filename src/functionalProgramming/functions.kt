package functionalProgramming

/* function's syntax:

fun function_name(arguments): return_type {
    instructions
}

calling function:
function_name(args)
*/

// function without arguments
fun hello() {
    println("Hello, world!")
}

// function with an argument
fun helloSomeone(name: String) {
    println("Hello, $name!")
}

//defining function with default parameter values
fun showUser(name: String, age: Int = 18, job: String = "unemployed") {
    println("Name: $name, age: $age, job: $job")
}

//arguments passed into functions equal to the val variables, and can't be modified, and it will cause compilation error.
//fun double(n: Int) {
//    n *= 2
//    println(n)
//}
//but you can still modify parameters of objects:)

fun main() {
    println("calling hello function...")
    hello()
    println()

    println("calling helloSomeone with arguments \"Sirojiddin\" and \"Kotlin\"")
    helloSomeone("Sirojiddin")
    helloSomeone("Kotlin")
    println()

    println("showUser")
    showUser("Alice", 25, "Driver")
    showUser("Bob", 15)
    showUser("Carol")
//  by default arguments passed in order of their position in function definition,
//  but we can pass them using parameter name
    showUser(job = "Sales assistant", name = "Dave")
    println()
}
