package chapter05

fun main() {
    val numLetters = "Mississippi".count()
    println(numLetters)

    val numLetters2 = "Mississippi".count({ letter -> letter == 's' })
    println(numLetters2)

    println({
        val currentYear = 2019
        "Welcome! $currentYear"
    }())

    var greetingFunction: () -> String = {
        val currentYear = 2019
        "Welcome! $currentYear"
    }

    println(greetingFunction())

    val greetingFunction2: (String) -> String = { playerName ->
        val currentYear = 2019
        "Welcome! $playerName! $currentYear"
    }

    println(greetingFunction2("이상민"))

    val greetingFunction3: (String) -> String = {
        val currentYear = 2019
        "Welcome! $it! $currentYear"
    }

    println(greetingFunction3("이상민"))

    val count = "Mississippi".count({ it == 's' })
    println(count)

    val greetingFunction4: (String, Int) -> String = { playerName, numBuildings ->
        val currentYear = 2019
        println("$numBuildings 채의 건물이 추가됨")
        "Welcome! $playerName! $currentYear"
    }
    println(greetingFunction4("이상민", 2))

    val greetingFunction5: () -> String = {
        val currentYear = 2019
        "Welcome! $currentYear"
    }

    val greetingFunction6 = {
        val currentYear = 2019
        "Welcome! $currentYear"
    }

    println(greetingFunction5())
    println(greetingFunction6())

    val greetingFunction7 = { playerName: String, numBuilding: Int ->
        val currentYear = 2019
        println("$numBuilding 채의 건물이 추가됨")
        "Welcome! $playerName $currentYear"
    }
    println(greetingFunction7("이상민", 2))

    val greetingFunction8 = { playerName: String, numBuildings: Int ->
        val currentYear = 2019
        println("$numBuildings 채의 건물이 추가됨")
        "Welcome! $playerName $currentYear"
    }

    runSimulation("이상민", greetingFunction8)

    val count1 = "Mississippi".count({ it == 's' })
    val count2 = "Mississippi".count { it == 's' }

    println("$count1, $count2")

    runSimulation("김선달") { playerName, numBuildings ->
        val currentYear = 2019
        println("$numBuildings 채의 건물이 추가됨")
        "Welcome! $playerName! $currentYear"
    }

    runSimulation2("김선달") { playerName, numBuildings ->
        val currentYear = 2019
        println("$numBuildings 채의 건물이 추가됨")
        "Welcome! $playerName! $currentYear"
    }

    println(factorial(3))

    runSimulation3("이상민", ::printConstructionCost) { playerName, numBuildings ->
        val currentYear = 2019
        println("$numBuildings 채의 건물이 추가됨")
        "Welcome! $playerName! $currentYear"
    }

    runSimulation4()
    runSimulation4()
}

fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("cost : ${cost * numBuildings}")
}

fun factorial(n: Int): Int {
    return if (n == 1) 1 else n * factorial(n - 1)
}

fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last() // 1, 2, 3 중 하나를 무작위로 선택한다.
    println(greetingFunction(playerName, numBuildings))
}

inline fun runSimulation2(playerName: String,
                          greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last() // 1, 2, 3 중 하나를 무작위로 선택한다.
    println(greetingFunction(playerName, numBuildings))
}

inline fun runSimulation3(playerName: String,
                          costPrinter: (Int) -> Unit,
                          greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last() // 1, 2, 3 중 하나를 무작위로 선택한다.
    costPrinter(numBuildings)
    println(greetingFunction(playerName, numBuildings))
}

fun runSimulation4() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("김선달"))
}

val structureType = "병원"
var numBuildings = 5

fun configureGreetingFunction(): (String) -> String {
    return { playerName: String ->
        val currentYear = 2019
        numBuildings += 1
        println("$numBuildings 채의 $structureType 이 추가됨")
        "Welcome! $playerName! $currentYear"
    }
}