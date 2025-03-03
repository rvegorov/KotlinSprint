package org.example.lesson_18

abstract class Dice {
    abstract val edgesNumber: Int
    fun roll() {
        println((1..edgesNumber).random())
    }
}

class Dice4() : Dice() {
    override val edgesNumber = 4
}

class Dice6() : Dice() {
    override val edgesNumber = 6
}

class Dice8() : Dice() {
    override val edgesNumber = 8
}

fun main() {
    val dice4 = Dice4()
    val dice6 = Dice6()
    val dice8 = Dice8()
    val diceList: List<Dice> = listOf(dice4, dice6, dice8)

    diceList.forEach { it.roll() }
}