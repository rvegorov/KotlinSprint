package org.example.lesson_10

fun main() {

    println("Введите логин:")
    val name = readln()
    println("Введите пароль:")
    val password = readln()

    val basket = getBasket(authorizeUser(name, password))
    if (basket != null)
        println(basket)
    else println("Авторизация не пройдена")
}

private fun authorizeUser(name: String, password: String): String? {
    if (name == USER_NAME && password == USER_PASSWORD) return generateToken()
    return null
}

private fun generateToken(): String {
    // не совсем понял, как нужно делать токен, поэтому сделал просто случайную строку
    val characters = ('a'..'z') + ('A'..'Z') + (0..9)
    var token = ""
    for (i in 1..32) {
        token += characters.random()
    }
    return token
}

private fun getBasket(token: String?): String? {
    return if (token != null) USER_BASKET
    else null
}

const val USER_NAME = "vasya666"
const val USER_PASSWORD = "qwerty"
const val USER_BASKET = "Шмапунь:1;Полотенце банное:1;Бритвенные станки 10шт:1;"
