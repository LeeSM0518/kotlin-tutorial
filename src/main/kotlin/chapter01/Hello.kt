package chapter01

fun main() {
//    val user = User("id", "password")
//    println("user: $user")
//    val first = Singleton
//    first.str = "hello"
//    var second = Singleton
//    println(second.str)
    println("hello".plusString(" world"))
    println(5.add10())
}

//data class User(
//    var email: String = "defaultEmail",
//    var password: String = "password"
//)

//object Singleton {
//    init {
//        println("this ($this) is a singleton")
//    }
//
//    var str: String? = null
//}

fun String.plusString(str: String): String {
    return this + str
}

fun Int.add10(): Int {
    return this + 10
}