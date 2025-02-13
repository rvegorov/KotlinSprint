package org.example.lesson_6

fun main() {
    var attempts = 5
    println("Угадайте число за $attempts попыток")

    val number = 9

    while (attempts > 0) {
        println("Введите число:")
        val userNumber = readln().toInt()
        if (userNumber == number) {
            println("Это была великолепная игра!")
            return
        } else {
            println("Неверно! Осталось попыток: ${--attempts}")
        }
    }
    println("Было загадано число $number")
}
