package basics

fun main() {
//   For-loops in Kotlin in similar to for-loops in Python and for-each loops in Java
    for (i in 1..9) {
        for (j in 1..9) {
            print("${i * j}\t")
        }
        println()
    }

//  while-loop
    var i = 10
    while (i > 0) {
        println("${i--}")
    }
//  And of course loops in Kotlin supports continue and break operators
}
