package org.example.lesson_12

class DailyWeather5(
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

    val dayCollection: MutableList<DailyWeather5> = mutableListOf()
    for (i in 1..30) {
        dayCollection.add(
            DailyWeather5(
                (MIN_DAY_TEMP..MAX_DAY_TEMP).random(),
                (MIN_NIGHT_TEMP..MAX_NIGHT_TEMP).random(),
                listOf(false, true).random()
            )
        )
    }
    val avgDayTemp = dayCollection.map { it.dayTemp }.average()
    val avgNightTemp = dayCollection.map { it.nightTemp }.average()
    val wetDays = dayCollection.filter { it.precipitation }.size

    println("-- Сводка о погоде за ${dayCollection.size} дней: --")
    println("Средняя дневная температура: ${" % .2f".format(avgDayTemp)}")
    println("Средняя ночная температура: ${" % .2f".format(avgNightTemp)}")
    println("Дней с осадками: $wetDays")

}

const val MIN_DAY_TEMP = 265
const val MAX_DAY_TEMP = 288
const val MIN_NIGHT_TEMP = 255
const val MAX_NIGHT_TEMP = 280
