package app

class Contravariant<in T> {

    // contravariant bisa di subtitusi dari subtype ke supertype (dalam set data)
    // keyword in menandakan boleh di subtitusi dari supertype ke subtype

    fun setData(param: T) {
        println("Hello Data $param")
    }

    // tidak boleh di perbolehkan
    //fun getData(): T {
    //   return data
    //}

}


fun main() {
    val contravariant = Contravariant<Any>()
    val contravariantString: Contravariant<String> = contravariant
    val contravariantInteger: Contravariant<Int> = contravariant

    contravariantString.setData("budhi")
    contravariantInteger.setData(10)

    //contravariantString.getData() // error karna tidak boleh subtitusi (dalam set data)

}