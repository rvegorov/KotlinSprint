package org.example.lesson_5

fun main() {
    println("Введите расстояние поездки в км:")
    val distance = readln().toFloat()
    println("Введите расход топлива в литрах на 100 км:")
    val consumption = readln().toFloat()
    println("Введите цену в рублях за литр:")
    val fuelPrice = readln().toFloat()

    val totalFuel = distance * consumption / 100
    val totalCost = totalFuel * fuelPrice

    println("Необходимо топлива: ${"%.2f".format(totalFuel)} л, общая стоимость поездки: ${"%.2f".format(totalCost)} рублей")
}
