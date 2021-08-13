package basics

fun main() {
//  defining array
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4)
//  accessing items of array
    val n = numbers[2]
    println(n)

//  you can generate arrays using special expressions, first number = number of elements in array (5)
//  second param is an expression { 3 }? in this case this is just number 3
    val threes = Array(5) { 3 }

//  but you can use any expression
    var a = 1
    val genArray = Array(5) { a++ * 2 }

//  you can loop through arrays
    for (num in genArray) print("$num\t")
    println()

//  accessing array of indexes of an array:
    for (i in threes.indices) print("${threes[i]}\t")
    println()

//  checkin whether item is in the array
    println("6 in the gen_array: ${6 in genArray}")

//  specifying data types of basic typed arrays:
//  BooleanArray, ByteArray, ShortArray, IntArray, LongArray, CharArray, FloatArray и DoubleArray
    val boolArray: BooleanArray = booleanArrayOf(true, false, false, true)
    var b = 1
    val isEvenArray = BooleanArray(5) { b++ % 2 == 0 }
    for (i in isEvenArray) print("$i\t"); println()

//  Multidimensional arrays:
    val emptyTable: Array<Array<Int>> = Array(3) { Array(5) { 0 } }
    val table = Array(3) { Array(3) { 0 } }
    table[0] = arrayOf(1, 2, 3)
    table[1] = arrayOf(4, 5, 6)
    table[2] = arrayOf(7, 8, 9)

//  looping through array of arrays
    for (row in table) {
        for (cell in row) {
            print("$cell\t")
        }
        println()
    }

}