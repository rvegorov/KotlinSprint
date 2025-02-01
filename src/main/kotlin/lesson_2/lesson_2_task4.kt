package org.example.lesson_2

fun main() {
    val minedCrystal = 7
    val minedIron = 11
    val buffBonus = 0.2f

    val bonusCrystal = (minedCrystal * buffBonus).toInt()
    val bonusIron = (minedIron * buffBonus).toInt()

    println(bonusCrystal)
    println(bonusIron)
}
