package oop

//  In Kotlin classes can have a primary constructor and some secondary ones
// By default primary constructor accepts no arguments? but we can redeclare it.
// Primary constructor:
//class Company constructor(name: String) {
//
//}
// If primary constructor doesn't have annotations you can omit word constructor
//class Company(name: String){
//
//}

//We can access accepted variables in initializer for creating objects.
class Pet(_name: String) {
    val name: String

    init {
        name = _name
    }
}
//In this case we could omit init and just use this construction:
/*
* class Pet(_name:String) {
*   val name: String = _name
* }
*/

//Primary constructor also can be used for declaring anf defining fields of class:
class Cat(val name: String, var age: Int)

//We can declare additional constructors, but they should call existing one using this:
class Company(_name: String) {
    val name = _name
    var employees: Int = 1
    var owner: String = "No owner"

    constructor(_name: String, _employees: Int) : this(_name) {
        employees = _employees
    }

    constructor(_name: String, _employees: Int, _owner: String) : this(_name, _employees) {
        owner = _owner
    }
}

fun main() {
    val rex = Pet("rex")
    println(rex.name)

    val transTech = Company("TransTech")
    val google = Company("Google", 10000)
}