package app

class Fruit(val name: String, val quantity: Int): Comparable<Fruit>{

    /**
     * Comparable
     * ● Sebelumnya kita sudah tahu bahwa operator perbandingan == dan != akan menggunakan metode
     *   equals sebagai implementasinya.
     * ● Bagaimana dengan operator perbandingan lainnya? Seperti > >= < <= ?
     * ● Operator perbandingan tersebut bisa kita lakukan, jika object kita mewariskan interface generic Comparable
     */

    override fun compareTo(other: Fruit): Int {
        return quantity.compareTo(other.quantity) // compareTo() method extends // equals object
    } // method implement

}

fun main() {

    val apel = Fruit("Apel", 5000)
    val mangga = Fruit("Mangga", 7000)

    println(apel > mangga)
    println(apel < mangga)
    println(apel >= mangga)
    println(apel <= mangga)

}