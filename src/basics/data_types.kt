package basics

fun main() {
//  Integers
    val a: Byte = 35    // -128 .. 127
    val b: Short = 10854    // -32 768 .. 32 767
    val c: Int = 1486175    // -2 147 483 648 .. 2 147 483 647
    val d: Long = 1548646513254  // –9 223 372 036 854 775 808 .. 9 223 372 036 854 775 807
//  Add U to any integer type to make unsigned integer type, i.e.:
    val e: UByte = 254u

//  Floating point numbers
    val f: Double = 1.5
    val g: Float = 1.5F
//  Scientific record
    val h: Double = 2e-4

//  Boolean
    val t: Boolean = true

//  Symbols
    val symbol: Char = 'A'

//  String
    val str: String = "Text sample"
//  String templates
    val bigStr: String = "Now we have string constant: $str; and float constant: $h"

//  Type inference, you can assign variable without writing it's type
    val i = 25

//  Although Kotlin has static typing, you can use special type Any to assign any types
    var smth: Any
    smth = 25
    smth = "25"

}