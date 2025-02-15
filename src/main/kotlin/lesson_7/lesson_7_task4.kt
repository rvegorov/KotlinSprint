package org.example.lesson_7

fun main() {
    println("Введите длительность таймера в секундах:")
    val seconds = readln().toInt()

    println("Таймер запущен")
    for (i in seconds downTo 1) {
        println("Осталось: $i с")
        Thread.sleep(1000)
    }
    println("Время вышло")
}