package app

class Covariant<out T>(val data: T) {

    // covariant bisa di subtitusi dari supertype ke subtype (dalam get data)
    // keyword out menandakan boleh di subtitusi dari subtype ke supertype

    fun data(): T{
        return data
    }

    // tidak boleh di perbolehkan
     // fun setData(param: T){
     //   data = param
    // }
}

fun main() {
    val covariantString = Covariant<String>("budhi")
    val covariantInteger = Covariant<Int>(10)
    val covariantAny1 : Covariant<Any>  = covariantString
    val covariantAny2 : Covariant<Any>  = covariantInteger

    println(covariantAny1.data())
    println(covariantAny2.data())

    // covariantAny.setData(100) // error karna tidak boleh subtitusi (dalam set data)
}