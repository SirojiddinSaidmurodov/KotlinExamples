package basics

fun main() {
    val a = 5
    if (a == 5) {
        println("a is equal to 5")
    }

//  if your code block is just one line, you can leave brackets
    if (a > 4)
        println("a is greater than 4")
    else
        println("a is less or equal to 4")

//  else if
    if (a > 4)
        println("a is greater than 4")
    else if (a == 4)
        println("a is equal to 4")
    else
        println("a is less than 4")

//  ternary operator
    val b = 6
    val c = if (a > b) a else b // analog in Java: int c = (a > b) ? a : b

//  Switch case
    when (a) {
        3 -> println("a=3")
        4 -> println("a=4")
        5 -> println("a=5")
    }
    when (b) {
        3, 4, 5 -> println("b == 3 or 4 or 5")
        6, 7 -> println("b == 6 or 7")
        in 8..15 -> println("8 < b < 15")
        !in 15..20 -> println("b is not in interval 15 - 20")
        else -> println("default action")
    }
//  when can return value
    val rate = when (a) {
        in 100..999 -> 10
        in 1000..9999 -> 15
        else -> 20
    }


}