package org.example.lesson_4

fun main() {
    println("Корабль повреждён:")
    val isDamaged = readln().toBoolean()
    println("Число экипажа:")
    val crewCount = readln().toInt()
    println("Число провизии:")
    val provisionCount = readln().toInt()
    println("Погода благоприятная:")
    val isGoodWeather = readln().toBoolean()

    val shipIsReady =
        (!isDamaged && (crewCount >= MIN_CREW) && (crewCount <= MAX_CREW) && (provisionCount > MIN_PROVISION)) ||
                (isDamaged && (crewCount == IS_DAMAGED_CREW) && isGoodWeather && (provisionCount >= MIN_PROVISION))

    println("Корабль готов: $shipIsReady")
}

const val MIN_CREW = 55
const val MAX_CREW = 70
const val IS_DAMAGED_CREW = 70
const val MIN_PROVISION = 50