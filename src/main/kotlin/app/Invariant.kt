package app

class Invariant<T>(val data: T)

fun main() {
    val invariant = Invariant("budhi")

    // val invariantAny : Invariant<Any> = invariant // error compiler // tidak bisa di subtitusi subtype dan supertype
    // invariantAny.data = 100
}