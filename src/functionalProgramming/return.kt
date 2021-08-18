package functionalProgramming

/*functions can return some resulting value
* For declaring returning value type, use : after parentheses of arguments and type name.
* Example: sum functions for adding one number to other*/
fun sum(x: Int, y: Int): Int {
    return x + y
}

/*If function shouldn't return anything, you can use Unit type.
If you are not declaring return type, the return type is Unit.
You can use return for leaving function*/

fun main() {
    println("Sum of 123 and 753 is ${sum(123, 753)}")
}