package org.example.lesson_1

fun main() {
    val seconds: Short = 6480

    val minutes: Int = seconds / SECONDS_IN_MINUTE
    val secondsLeft: Int = seconds % SECONDS_IN_MINUTE
    val hours: Int = minutes / MINUTES_IN_HOUR
    val minutesLeft: Int = minutes % MINUTES_IN_HOUR

    println(String.format("%02d:%02d:%02d", hours, minutesLeft, secondsLeft))

}

const val MINUTES_IN_HOUR = 60
const val SECONDS_IN_MINUTE = 60