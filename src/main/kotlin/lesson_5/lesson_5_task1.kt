package org.example.lesson_5

fun main() {
    val a = 1
    val b = 9

    println("Проверка на бота. Сколько будет $a + $b?")
    val userAnswer = readln().toInt()

    if (userAnswer == a + b) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}