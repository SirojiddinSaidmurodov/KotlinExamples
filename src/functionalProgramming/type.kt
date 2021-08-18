package functionalProgramming

/*Functions in Kotlin are objects, and like all objects they have they own type:
* (types_of_arguments) -> return_type */
fun helloFun() = println("Hello, functions!")
fun numsSum(a: Int, b: Int): Int = a + b

fun main() {
    val message: () -> Unit
    message = ::helloFun
    message()

    val sum: (Int, Int) -> Int
    sum = ::numsSum
    val res = sum(5, 4)
    println(res)
}