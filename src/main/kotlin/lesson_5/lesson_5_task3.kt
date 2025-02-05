package org.example.lesson_5

fun main() {
    val firstNum = 1
    val secondNum = 32

    println("Угадайте два числа от $MIN_NUMBER до $MAX_NUMBER")
    println("Введите первое число:")
    val firstAnswer = readln().toInt()
    println("Введите второе число:")
    val secondAnswer = readln().toInt()

    val firstNumIsValid = (firstAnswer == firstNum || firstAnswer == secondNum)
    val secondNumIsValid = (secondAnswer == firstNum || secondAnswer == secondNum)

    if (firstNumIsValid && secondNumIsValid) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (firstNumIsValid || secondNumIsValid) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
    println("Правильные числа: $firstNum и $secondNum")
}

const val MIN_NUMBER = 0
const val MAX_NUMBER = 42