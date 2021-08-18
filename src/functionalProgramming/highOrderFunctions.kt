package functionalProgramming

/*Functions that accepts or returns another functions called
* high order functions*/

//functions as parameter:
fun action(a: Int, b: Int, operation: (Int, Int) -> Int) = println("result of $operation is ${operation(a, b)}")
fun numSum(a: Int, b: Int) = a + b
fun subtract(a: Int, b: Int) = a - b
fun multiplyNums(a: Int, b: Int) = a * b

//returning functions as result
fun selectAction(key: String): (Int, Int) -> Int {
    return when (key) {
        "+" -> ::numSum
        "-" -> ::subtract
        "*" -> ::multiplyNums
        else -> ::empty
    }
}

fun empty(a: Int, b: Int) = 0

fun main() {
    action(10, 5, ::numSum)
    action(10, 5, ::subtract)
    action(10, 5, ::multiplyNums)

    println(selectAction("+")(10, 5))
    println(selectAction("-")(10, 5))
    println(selectAction("*")(10, 5))
}