package org.example.lesson_15

abstract class WeatherStationStats(val value: Float)

class Temperature(value: Float) : WeatherStationStats(value)

class PrecipitationAmount(value: Float) : WeatherStationStats(value)

class WeatherServer() {
    fun sendStat(stat: WeatherStationStats) {
        if (stat is Temperature) println("${stat.value} ℃")
        if (stat is PrecipitationAmount) println("${stat.value} мм")
    }
}

fun main() {
    val todayTemp = Temperature(10f)
    val todayPrecip = PrecipitationAmount(5.2f)
    val server = WeatherServer()
    server.sendStat(todayTemp)
    server.sendStat(todayPrecip)
}