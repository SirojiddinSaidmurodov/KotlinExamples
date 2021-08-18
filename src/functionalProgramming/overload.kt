package functionalProgramming

//function overloading

fun multiply(a: Int, b: Int): Int = a * b
fun multiply(a: Double, b: Double): Double = a * b
fun multiply(a: Double, vararg b: Double): Double {
    var result = a
    for (i in b) {
        result *= i
    }
    return result
}

fun main() {
    println(multiply(2, 5))
    println(multiply(3.5, 2.5))
    println(multiply(3.5, 2.5, 4.5, 5.0))
}