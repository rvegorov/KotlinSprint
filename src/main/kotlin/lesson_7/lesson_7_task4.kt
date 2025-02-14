package org.example.lesson_7

fun main() {
    println("Введите длительность таймера в секундах:")
    val seconds = readln().toInt()
    val timerRange = seconds downTo 1
    println("Таймер запущен")
    for (i in timerRange) {
        println("Осталось: $i с")
        Thread.sleep(1000)
    }
    println("Время вышло")
}