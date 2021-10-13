
/*
Covariant artinya kita melakukan substitusi subtype(child) dengan supertype(parent)
Tidak semua jenis class generic yg mendukung covariant, hanya class generic yang menggunakan
generic parameter type sebagai return type function
untuk kata kuncinya kita akan mengunakan out
*/

class Covariant<out T>(val data : T) {

    fun data() : T{
        return data
    }
}

fun main() {
    val data1 : Covariant<String> = Covariant("salim")
    val data2 : Covariant<Any> = data1
}