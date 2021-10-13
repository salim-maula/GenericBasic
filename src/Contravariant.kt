
/*Contravariant artinya kita bisa melakukan subtitusi supertype dengan Subtype
tidak semua jenis class generic yang mendukung contravariant, hanya kelas generic yg
menggunakan generic parameter function*/


class Contravariant<in T> {

    fun sayHello(name : T){
        return println("HEllo $name")
    }
}

fun main() {
    val data1 : Contravariant<Any> = Contravariant()
    val data2 : Contravariant<Char> = data1

    data1.sayHello(4.3)
}