package app

class Container<T>(var data: T)

// fun copy(from: Container<Any>, to: Container<Any>) // jika kita membuat function Type Projection seprti ini akan Error: Type mismatch. di compiler
fun copy(from: Container<out Any>, to: Container<Any>){
    to.data = from.data
}



fun main() {
    val data1 = Container("Data 1")
    val data2 : Container<Any> = Container("Data 2") // supaya bisa di terima oleh param to.. kita harus ekplisit set reference container

    copy(data1, data2) // copu(from, to)

    println("Data 1: ${data1.data}") // Data 1
    println("Data 2: ${data2.data}") // Data 1
}