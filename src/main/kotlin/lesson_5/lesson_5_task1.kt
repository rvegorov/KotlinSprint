package org.example.lesson_5

fun main() {
    val fistNumber = 1
    val secondNumber = 9

    println("Проверка на бота. Сколько будет $fistNumber + $secondNumber?")
    val userAnswer = readln().toInt()

    if (userAnswer == fistNumber + secondNumber) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}