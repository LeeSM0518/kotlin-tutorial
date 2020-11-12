package chapter03

import java.util.*

fun main(args: Array<String>) {
    val name = "마드라갈"
    var healthPoints = 89

    val healthStatus =
        when (healthPoints) {
            100 -> "최상의 상태"
            in 90..99 -> "약간의 찰과상"
            in 75..89 -> "경미한 상처"
            in 15..74 -> "많이 다침"
            else -> "최악의 상태"
        }

    println("$name $healthStatus")

    println("결과: ${if (1 + 1 == 2) "정답" else "오답"}")

    println(readLine()?.toInt() in 1..3)
//    println((1..3).toList())
    println(readLine()?.toInt() in 3 downTo 1)
    println(readLine()?.toInt() in 1 until 3)
    println(readLine()?.toInt() in 1 until 3)
    println(readLine()?.toInt() in 1..3)
    println(readLine()?.toInt() !in 1..3)
    println('x' in 'a'..'z')
}