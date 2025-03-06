package org.example.lesson_22

data class Car(val maker: String, val model: String, val year: Int)

fun main() {
    val drandulette = Car("Volkswagen", "Golf", 1990)

    val (maker, model, year) = drandulette

    println(maker)
    println(model)
    println(year)
}