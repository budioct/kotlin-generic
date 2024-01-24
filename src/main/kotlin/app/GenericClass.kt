package app

import data.MyData

fun main() {

    val myData = MyData<String>("budhi")
    println(myData.getData())
    myData.printData()

    val myData1 = MyData<Int>(10)
    println(myData1.getData())
    myData1.printData()

}