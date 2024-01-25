package data

class Function(val name: String) {

    /**
     * scope function
     * fun <T> namaMethod(param: T){} // scope hanya generic method saja
     *
     * scope class
     *  class Function<T>(val name: String){
     *   fun <T> namaMethod(param: T){} // otomatis generic method akan override dari generic class
     *  }
     */

    fun <T> sayHello(name: T){
        println("Hello $name, my name is ${this.name}")
    }

}