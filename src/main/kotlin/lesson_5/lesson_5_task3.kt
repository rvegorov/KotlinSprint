package org.example.lesson_5

fun main() {
    val a = 1
    val b = 32

    println("Угадайте два числа от $MIN_NUMBER до $MAX_NUMBER")
    println("Введите первое число:")
    val firstNum = readln().toInt()
    println("Введите второе число:")
    val secondNum = readln().toInt()

    val firstNumIsValid = (firstNum == a || firstNum == b)
    val secondNumIsValid = (secondNum == a || secondNum == b)

    if (firstNumIsValid && secondNumIsValid) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (firstNumIsValid || secondNumIsValid) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
    println("Правильные числа: $a и $b")
}

const val MIN_NUMBER = 0
const val MAX_NUMBER = 42