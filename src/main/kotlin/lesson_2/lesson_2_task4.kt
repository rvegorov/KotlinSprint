package org.example.lesson_2

fun main() {
    val minedCrystal = 7
    val minedIron = 11
    val buffBonusPercent = 20

    val bonusCrystal = (minedCrystal * buffBonusPercent / 100).toInt()
    val bonusIron = (minedIron * buffBonusPercent / 100).toInt()

    println(bonusCrystal)
    println(bonusIron)
}
