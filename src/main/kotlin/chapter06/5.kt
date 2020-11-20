package chapter06

fun main() {
    var beverage = readLine()
    if (beverage != null) {
        beverage = beverage.capitalize()
    } else {
        println("null")
    }
    println(beverage)
}