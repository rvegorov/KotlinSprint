package org.example.lesson_4

fun main() {
    var weight = 20
    var volume = 80
    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average':" +
                (weight > AVERAGE_MIN_WEIGHT && weight <= AVERAGE_MAX_WEIGHT && volume < AVERAGE_MAX_VOLUME)
    )

    weight = 50
    volume = 100
    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average':" +
                (weight > AVERAGE_MIN_WEIGHT && weight <= AVERAGE_MAX_WEIGHT && volume < AVERAGE_MAX_VOLUME)
    )
}

const val AVERAGE_MIN_WEIGHT = 35
const val AVERAGE_MAX_WEIGHT = 100
const val AVERAGE_MAX_VOLUME = 100