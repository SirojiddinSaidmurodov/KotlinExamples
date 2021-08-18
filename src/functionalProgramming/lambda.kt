package functionalProgramming

fun main() {
//  Lambda functions ("lambdas") are a simple way to create functions ad-hoc.
    val hello: () -> Unit = { println("Hello, world") }
    hello()

//  You can use special operator run, for running lambdas or just ad parentheses
//  Note that if there is lambdas defined one after another, you must put semicolon
    run { println("Second hello") };
    { println("Second hello") }()

//  passing arguments
    val printer = { message: String -> println(message) }
    printer("Hello from printer")

    val sum = { a: Int, b: Int ->
        val result = a + b
        println("Sum of $a and $b is $result")
    }

//  the last command in lambda is returning operator
    val sumOfNums = { x: Int, y: Int ->
        val result = x + y
        println("$x + $y = $result")
        result
    }
    println(sumOfNums(4, 15))

//  lambdas as parameters, you can omit parameter types of lambda
    doOperation(10, 15, { a, b -> a + b })

//  If function argument is the last in the arguments list of function, you can write your lambda outside of parentheses
    doOperation(10, 20) { a, b -> a + b }
}
