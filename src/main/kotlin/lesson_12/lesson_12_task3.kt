package org.example.lesson_12

class DailyWeather3(
    dayTempK: Int,
    nightTempK: Int,
    precipitation: Boolean,
) {

    var dayTemp: Int = dayTempK - 273
    var nightTemp: Int = nightTempK - 273
    var precipitation: Boolean = precipitation
    fun printWeather() {
        println("Дневная немпература: $dayTemp ℃")
        println("Ночная немпература: $nightTemp ℃")
        println("Будут осадки: $precipitation")
    }
}

fun main() {
    val friday = DailyWeather3(270, 265, true)
    friday.printWeather()
}