package org.example.lesson_10

fun main() {
    var userWins = 0
    do {
        userWins += if (round()) 1 else 0
        println("Хотите бросить кости еще раз? Введите Да или Нет")// val userAnswer =
    } while (readln() == "да")
    println("Победы человека $userWins")
}

private fun rollDice(): Int = (MIN_DICE..MAX_DICE).random()
private fun round(): Boolean {
    val humanRoll = rollDice()
    println("Игрок бросает кости: $humanRoll")
    val computerRoll = rollDice()
    println("Компьютер бросает кости: $computerRoll")

    if (humanRoll > computerRoll) {
        println("Победило человечество")
        return true
    } else if (humanRoll < computerRoll)
        println("Победила машина")
    else
        println("Победила дружба")
    return false
}

private const val MIN_DICE = 1
private const val MAX_DICE = 6
