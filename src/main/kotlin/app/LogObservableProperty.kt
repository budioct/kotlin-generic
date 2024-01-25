package app

import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

class LogObservableProperty<T>(data: T) : ObservableProperty<T>(data) {

    // ObservableProperty mengecek sebelum dan setelah perubahan
    // method ini akan di jalankan ketika object yang delegasi dengan class ini
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("Before change value from $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("After change value from $oldValue to $newValue")
    }

}

class Car(brand: String, year: Int){

    // ketika kita panggil Car class ini akan selalu akses class LogObservableProperty
    // class car override method tanpa harus deklarasi ulang method di body nya. karna kemampuan delegasi oleh class LogObservableProperty
    var brand : String by LogObservableProperty<String>(brand) // delegasi
    var year : Int by LogObservableProperty<Int>(year) // delegasi
}

fun main() {

    /**
     * ObservableProperty Class
     * ● Generic interface delegate yang sebelumnya kita gunakan (ReadOnlyProperty dan
     *   ReadWriteProperty) kita perlu mengatur value datanya secara manual
     * ● Kadang kita hanya butuh melakukan sesuatu sebelum dan setelah data nya diubah
     * ● Untuk kasus seperti ini, kita bisa menggunakan generic class ObservableProperty
     */

    val car = Car("Toyota", 2018)
    car.brand = "Honda"
    car.year = 2022

    println(car.brand)
    println(car.year)
}