package org.example.lesson_6

fun main() {

    var attempts = 3
    while (attempts > 0) {
        val firstNumber = (1..9).random()
        val secondNumber = (1..9).random()
        println("Сколько будет $firstNumber + $secondNumber ?")
        val userAnswer = readln().toInt()
        if (userAnswer == firstNumber + secondNumber) {
            println("Добро пожаловать!")
            return
        } else {
            println("Не правильно. Осталось попыток: ${--attempts}")
        }
    }
    println("Доступ запрещён")

}