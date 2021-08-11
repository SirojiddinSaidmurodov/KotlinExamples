package basics

fun main() {
//  logical expressions
    val a = true
    val b = false
    print("$a and $a = ")
    println(a and a)
    print("$a and $b = ")
    println(a and b)
    print("$b and $a = ")
    println(b and a)
    print("$b and $b = ")
    println(b and b)

    println()

    print("$a or $a = ")
    println(a or a)
    print("$a or $b = ")
    println(a or b)
    print("$b or $a = ")
    println(b or a)
    print("$b or $b = ")
    println(b or b)

    println()

    print("$a xor $a = ")
    println(a xor a)
    print("$a xor $b = ")
    println(a xor b)
    print("$b xor $a = ")
    println(b xor a)
    print("$b xor $b = ")
    println(b xor b)

    println()

    println(!a)
    println(a.not())


}