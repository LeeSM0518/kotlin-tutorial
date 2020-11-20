package chapter06

fun main() {
    var beverage = readLine()
    beverage?.let {
        beverage     = it.capitalize()
    } ?: println("null!")

    println(beverage)
}