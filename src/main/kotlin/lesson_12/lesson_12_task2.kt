package org.example.lesson_12

class DailyWeather(
    var dayTemp: Int,
    var nightTemp: Int,
    var precipitation: Boolean,
) {

    fun printWeather() {
        println("Дневная немпература: $dayTemp ℃")
        println("Ночная немпература: $nightTemp ℃")
        println("Будут осадки: $precipitation")
    }
}

fun main() {
    val friday = DailyWeather(-3, -8, true)
    friday.printWeather()
}