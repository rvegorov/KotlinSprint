package org.example.lesson_10


fun main() {

    println("Введите логин:")
    val userLogin = readln()
    println("Введите пароль")
    val userPassword = readln()

    if (!validateLength(userLogin, MIN_LENGTH) || !validateLength(userPassword, MIN_LENGTH)) {
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Добро пожаловать!")
    }
}

const val MIN_LENGTH = 4

fun validateLength(string: String, length: Int): Boolean {
    return string.length >= length
}