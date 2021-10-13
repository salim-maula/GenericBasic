
class Building2<T, U>(val data : T, val secondData : U ){
    fun printData(){
        println("Data is $data $secondData")
    }
}

fun main() {

    val dataString = Building2<String, Int>("Pertamina",4)

    val dataInt : Building2<Int, String> = Building2(10, "PLN")

    val dataBoolean = Building2(true, 4.2)

    dataString.printData()

    dataInt.printData()

    dataBoolean.printData()

}