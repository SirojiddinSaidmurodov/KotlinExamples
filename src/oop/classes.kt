package oop

//  Class declaration consist properties and functions. If the property declared as
// val,the field will be immutable, which means that you can assign the value only once
class Person {
    var name: String = "Undefined"
    var age: Int = 18

    fun sayHello() {
        println("Hello! My name is $name")
    }
}

fun main() {
//  declaring objects:
    val man: Person = Person()
    man.name = "Sirojiddin"
    man.sayHello()
}


