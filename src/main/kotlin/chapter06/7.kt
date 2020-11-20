package chapter06

fun main() {
    var swordsJuggling: Int? = null
    val isJugglingProficient = (1..3).shuffled().last() == 3
    if (isJugglingProficient) {
        swordsJuggling = 2
    }

    swordsJuggling = swordsJuggling!!.plus(1)

    println("$swordsJuggling 개로 저글링")
}