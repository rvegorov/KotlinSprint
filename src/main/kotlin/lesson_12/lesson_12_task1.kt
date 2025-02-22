package org.example.lesson_12

class DayWeather {
    var dayTemp = 10
    var nightTemp = 3
    var precipitation = false
    fun printWeather() {
        println("Дневная немпература: $dayTemp ℃")
        println("Ночная немпература: $nightTemp ℃")
        println("Будут осадки: $precipitation")
    }
}

fun main() {

    val friday = DayWeather()
    friday.dayTemp = -4
    friday.nightTemp = -11
    val saturday = DayWeather()
    saturday.dayTemp = -3
    saturday.nightTemp = -5
    saturday.precipitation = true

    println("-- Погода в пятницу: --")
    friday.printWeather()
    println("-- Погода в субботу: --")
    saturday.printWeather()
}