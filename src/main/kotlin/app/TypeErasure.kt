package app

class TypeErasure<T>(param: T) {

    private val data: T = param
    fun getData(): T = data
}

fun main() {

    /**
     * Type Erasure
     * ● Type erasure adalah proses pengecekan generic pada saat compile time, dan menghiraukan
     *   pengecekan pada saat runtime
     * ● Type erasure menjadikan informasi generic yang kita buat akan hilang ketika kode program kita
     *   telah di compile menjadi binary file
     * ● Compiler akan mengubah generic parameter type menjadi tipe Any (atau Object di Java)
     */

    val data = TypeErasure("budhi")
    val name = data.getData() // di casting paksa

    /**
     * Problem Type Erasure
     * ● Karena informasi generic hilang ketika sudah menjadi binary file
     * ● Oleh karena itu, konversi tipe data generic akan berbahaya jika dilakukan secara tidak bijak
     */
    val dataInt = data as TypeErasure<Int>
    val number = data.getData() // Error runtime // Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Number (java.lang.String and java.lang.Number are in module java.base of loader 'bootstrap')

    println(data)
    println(name)

}