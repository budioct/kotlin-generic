package app

class StarProjection

fun displayLength(array: Array<*>) {

    /**
     * Star Projection (mirip dengan generic wildcard java)
     * ● Kadang ada kasus kita tidak peduli dengan generic parameter type pada object
     * ● Misal kita hanya ingin mengambil panjang data Array<T>, dan kita tidak peduli dengan isi data T nya
     * ● Jika kita mengalami kasus seperti ini, kita bisa menggunakan Star Projection
     * ● Star projection bisa dibuat dengan mengganti generic parameter type dengan karakter * (star, bintang)
     */

    println("Length Array is ${array.size}")
//    array.forEach { any -> println("value: $any ") }
//    for (any in array) { println("value: $any ") }
    for ((index, any) in array.withIndex()) { println("index: $index,  value: $any") }
    println()
}

fun main() {
    val arrayInt = arrayOf(1, 2, 3, 4, 5)
    val arrayString = arrayOf("budhi", "oct", 22)

    displayLength(arrayInt)
    displayLength(arrayString)
}
