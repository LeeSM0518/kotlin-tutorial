package chapter04

fun main() {
    val name = "마드라갈"
    var healthPoints = 89
    var isBlessed = true
    val isImmortal = false

    // 아우라
    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)

    // 플레이어의 상태 출력
    printPlayerStatus(
        isBlessed = isBlessed,
        auraColor = auraColor,
        healthStatus = healthStatus,
        name = name
    )
    castFireball()
}

fun printPlayerStatus(auraColor: String, isBlessed: Boolean, name: String, healthStatus: String) {
    println(
        "(Aura: $auraColor) " +
                "(Blessed: ${if (isBlessed) "YES" else "NO"})"
    )
    println("$name $healthStatus")
}

fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean) =
    if (isBlessed && healthPoints > 50 || isImmortal) "GREEN" else "NONE"


private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) =
    when (healthPoints) {
        100 -> "최상의 상태"
        in 90..99 -> "약간의 찰과상"
        in 75..89 -> if (isBlessed) {
            "깅미한 상처가 있지만 빨리 치유"
        } else {
            "경미한 상처"
        }
        in 15..74 -> "많이 다침"
        else -> "최악의 상태"
    }


private fun castFireball(numFireballs: Int = 2) =
    println("한 덩어리의 파이어볼이 나타난다. (x$numFireballs)")
