
class Function(val nama : String) {

    fun <T> sayHello(param : T){
        println("Hello $param, My name is $nama")
    }

}

fun main() {
    val function = Function("Heri")

    function.sayHello("jhon")
    function.sayHello<Int>(1)

}
