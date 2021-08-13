package basics

fun main() {
//  you can create not only numeric ranges
    val numeric = 1..15
//  but symbolic too
    val symbolic = 'a'..'z'
//  to create decrementing sequence use downTo
    val dec_num = 15 downTo 1
//  you can specify step of sequence
    val stepped = 1..15 step 3
//  if you don't want to include upper limit of range use until
    val lim = 1 until 15 step 3

//  checkin whether number inside of range or not
    if (5 in 1..6) println("included")
    if (5 !in 1..6) println("not included")

//  looping through sequence
    for (i in symbolic) print(i); println()
    for (i in stepped) print("$i "); println()

}