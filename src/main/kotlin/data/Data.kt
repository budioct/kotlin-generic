package data

class Data<T>(val data: T)

// generic extendsion function
fun Data<String>.print() {

    val string = this.data
    println("String value is $string")
}

fun main(){

    /**
     * Generic Extension Function
     * ● Generic juga bisa digunakan pada extension function
     * ● Dengan begitu kita bisa memilih jenis generic parameter type apa yang bisa menggunakan extension function tersebut
     */

    val data1: Data<Int> = Data(1)
    val data2: Data<String> = Data("Budhi")

    // data1.print() // Error karena Type generic tidak sesaui extendsion function
    data2.print() // bisa

}

