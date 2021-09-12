package oop

//by default classes in Kotlin are final, if you want to allow inheritance? mark them with <open> modifier
open class Bird(var name: String) {
    fun fly() {
        println("$name is flying!")
    }
}

// You can inherit class in two ways:
//first is calling primary constructor of parental class just after class declaration
class Duck(name: String) : Bird(name)

/*second one is calling parental class constructor using super*/
class Flamingo : Bird {
    constructor(name: String) : super(name) {

    }
}
