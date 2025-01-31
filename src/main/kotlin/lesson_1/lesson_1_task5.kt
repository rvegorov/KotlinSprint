package org.example.lesson_1

fun main() {
    val seconds: Short = 6480

    val minutes: Int = seconds/60
    val secondsLeft: Int = seconds%60
    val hours: Int = minutes/60
    val minutesLeft: Int = minutes%60

    println("${hours.toString().padStart(2, '0')}:" +
            "${minutesLeft.toString().padStart(2, '0')}:" +
            "${secondsLeft.toString().padStart(2, '0')}")

}