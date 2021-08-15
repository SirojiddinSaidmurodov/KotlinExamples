package functionalProgramming

// Vararg allows you to pass any number of arguments
fun printAll(vararg messages: String) {
    for (m in messages) println(m)
}

fun showUser(name: String, vararg interests: String, job: String = "unemployed") {
    print("Name: $name, interests: ")
    for (i in interests) print("$i, ")
    println("job: $job")
}

fun main() {
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")
    printAll("This", "is", "another function call...")

//  if you have functions with mixed arguments pass arguments using parameter name
    showUser("Alice", "football", "cars", "politics", job = "manager")

//  * - spread operator can be used for passing iterable as vararg argument
    val messages = arrayOf("Hello", "This is messages", "Stored in array and passed to printAll")
    printAll(*messages)
}
