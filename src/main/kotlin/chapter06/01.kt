package chapter06

fun main() {
//    var signatureDrink = "맥주"
//    signatureDrink = null

//    var beverage = readLine()
//    beverage = null
//
//    println(beverage)

//    var beverage = readLine()?.capitalize()
//
//    println(beverage)

    var beverage = readLine()?.let {
        if (it.isNotBlank()) {
            it.capitalize()
        } else {
            "맥주"
        }
    }

    println(beverage)
}