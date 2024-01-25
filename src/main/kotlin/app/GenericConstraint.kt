package app

interface CanSayHello{
    fun sayHello(name: String)
}

open class Employee

class Manager : Employee()

class VicePresident : Employee(), CanSayHello{
    override fun sayHello(name: String) {
        println("Hello $name, i am vice president")
    }

}

//class Company<T : Employee>(val employee: T) // constraint // <T : Employee> // class companey hanya bisa menerima class turunan employee, selain itu di tolak
class Company<T>(val employee: T) where T : Employee, T : CanSayHello // lebih dari satu constraint dengan keyword where T : namaclass, T : namainterface

fun main() {
    //val company = Company(Employee()) // otomatis error karna tidak bisa akses interface CanSayHello
    //val manager = Company(Manager()) // // otomatis error karna tidak bisa akses interface CanSayHello
    val vicePresident = Company(VicePresident())
    // val str = Company("string") // error Type mismatch.

}