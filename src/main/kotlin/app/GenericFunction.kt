package app

import data.Function

fun main() {

    val function = Function("Budhi")

    function.sayHello<String>("Asep")
    function.sayHello("Udin")

    function.sayHello<Int>(100)
    function.sayHello(100)

}