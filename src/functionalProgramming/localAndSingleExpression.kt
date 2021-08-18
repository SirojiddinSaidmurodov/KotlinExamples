package functionalProgramming

/*If your function contains a single expression you can declare it
* as a single expression function:
* fun functions_name(args) = expression */
fun square(x: Int) = x * x

/*We can declare functions inside other functions, they called local functions
* and they available only inside that functions*/
fun power(base: Int, exponent: Int): Int {
    fun isValid(base: Int, exponent: Int): Boolean {
        return base >= 0 && exponent >= 0
    }
    if (isValid(base, exponent)) {
        var result = 1
        for (i in 1..exponent) {
            result *= base
        }
        return result
    }
    return 0
}

fun main() {
    println(square(25))
    println(power(5, 3))
    println(power(5, 0))
    println(power(0, 0))
}