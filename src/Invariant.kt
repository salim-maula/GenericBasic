
/*
secara default, saat kita membuat generic parameter type,
sifat parameter tersebut adalah invariant
invariant = tidak boleh subtitusi subtype(child) atau supertype(parent)
*/

class Invariant<T> (val data : T)

fun main() {
    val data1 : Invariant<Any> = Invariant("salim")
    //val data2 : Invariant<String> = data1
}