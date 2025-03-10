package org.example.lesson_4

fun main() {

    val isSunny: Boolean = true
    val isAwningOpen: Boolean = true
    val humidity: Int = 20
    val season: String = "зима"

    val conditionsAreGood: Boolean =
        (isSunny == GOOD_IS_SUNNY && isAwningOpen == GOOD_IS_AWNING_OPEN && humidity == GOOD_HUMIDITY && season != BAD_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsAreGood")
}

const val GOOD_IS_SUNNY = true
const val GOOD_IS_AWNING_OPEN = true
const val GOOD_HUMIDITY = 20
const val BAD_SEASON = "зима"