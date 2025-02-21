package org.example.lesson_10

fun main() {
    val humanRoll = rollDice()
    println("Игрок бросает кости: $humanRoll")
    val computerRoll = rollDice()
    println("Компьютер бросает кости: $computerRoll")

    if (humanRoll > computerRoll) println("Победило человечество")
    else if (humanRoll < computerRoll) println("Победила машина")
    else println("Победила дружба")
}

private fun rollDice(): Int = (MIN_DICE..MAX_DICE).random()

private const val MIN_DICE = 1
private const val MAX_DICE = 6