package org.example.lesson_18

abstract class Dice {
    abstract fun roll()
}

class Dice4() : Dice() {
    override fun roll() {
        println((1..4).random())
    }
}

class Dice6() : Dice() {
    override fun roll() {
        println((1..6).random())
    }
}

class Dice8() : Dice() {
    override fun roll() {
        println((1..8).random())
    }
}

fun main() {
    val dice4 = Dice4()
    val dice6 = Dice6()
    val dice8 = Dice8()
    val diceList: List<Dice> = listOf(dice4, dice6, dice8)

    diceList.forEach { it.roll() }
}