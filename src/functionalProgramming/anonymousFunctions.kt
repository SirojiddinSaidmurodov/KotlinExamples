package functionalProgramming

//anonymous functions differ from normal ones in that they have no name

fun doOperation(x: Int, y: Int, operation: (Int, Int) -> Int) {
    val result = operation(x, y)
    println(result)
}

fun selectOperation(key: String): (Int, Int) -> Int {
    return when (key) {
        "=" -> fun(a: Int, b: Int) = a + b
        "*" -> fun(a: Int, b: Int) = a * b
        "-" -> fun(a: Int, b: Int) = a - b
        else -> fun(_: Int, _: Int) = 0
    }
}

fun main() {
//  anonymous functions as parameter
    doOperation(5, 9, fun(x: Int, y: Int) = x + y)
    doOperation(5, 9, fun(x: Int, y: Int) = x - y)

    val op = fun(x: Int, y: Int) = x * y
    doOperation(5, 9, op)

//  anonymous functions as result
    println(selectOperation("+")(5, 9))
    val multiply = selectOperation("*")
    println(multiply(5, 9))
}