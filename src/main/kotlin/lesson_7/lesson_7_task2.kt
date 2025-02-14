package org.example.lesson_7

fun main() {

    do {
        val code = (1000..9999).random()
        println("-- Ваш код: $code --")
        println("Введите код авторизации:")
        val userAnswer = readln().toInt()
    } while (userAnswer != code)
    println("Добро пожаловать!")

}