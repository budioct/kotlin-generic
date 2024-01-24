package data

class MyData<T>(val firstName: T) {

    fun getData(): T{
        return firstName
    }

    fun printData(){
        println("Data is $firstName")
    }


}