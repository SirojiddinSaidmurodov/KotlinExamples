package basics

fun main() {
//  Console output
    print("line of text")
    println("line of text ending with a new line")
    print("New line")
    println()
    print("Another new line")
    println()

//  Console input
    print("type your name: ")
    val name = readLine()
    println("Hello $name!")
}