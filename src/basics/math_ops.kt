package basics

fun main() {
    val x = 60
    val y = 7
    val sum = x + y
    println("Sum of $x and $y = $sum")

    val subtraction = x - y
    println("$x minus $y is $subtraction")

    val multiplication = x * y
    println("$x times $y is $multiplication")

    val z: Double = 7.0
    val divisionFloat = x / z
    println("$x divided by $z is $divisionFloat")

    val division = x / y //when both operands are integer
    println("$x integer divided by $y is $division")

    val remainder = x % y
    println("Remainder of dividing $x by $y is $remainder")

}