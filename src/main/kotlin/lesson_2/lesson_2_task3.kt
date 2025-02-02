package org.example.lesson_2


fun main() {
    val departHour: Byte = 9
    val departMinute: Byte = 39
    val travelMinutes: Short = 457

    val departDayMinutes = MINUTES_IN_HOUR * departHour + departMinute
    val arriveDayMinutes = departDayMinutes + travelMinutes
    val arriveHour = arriveDayMinutes / MINUTES_IN_HOUR
    val arriveMinute = arriveDayMinutes % MINUTES_IN_HOUR

    println(String.format("%02d:%02d", arriveHour, arriveMinute))
}

const val MINUTES_IN_HOUR: Byte = 60