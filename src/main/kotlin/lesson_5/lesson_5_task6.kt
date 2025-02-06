package org.example.lesson_5

fun main() {
    println("Введите вес в килограммах:")
    val weight = readln().toFloat()
    println("Введите рост в сантиметрах:")
    val height = readln().toFloat() / 100

    val bodyMassIndex = weight / (height * height)
    val bodyMassCategory = when {
        (bodyMassIndex < LOW_WEIGHT_LEVEL) -> "Недостаточная масса тела"
        (bodyMassIndex >= LOW_WEIGHT_LEVEL && bodyMassIndex < NORMAL_WEIGHT_LEVEL) -> " Нормальная масса тела"
        (bodyMassIndex >= NORMAL_WEIGHT_LEVEL && bodyMassIndex < EXCESS_WEIGHT_LEVEL) -> "Избыточная масса тела"
        else -> "Ожирение"
    }
    println("Ваш ИМТ равен ${"%.2f".format(bodyMassIndex)}")
    println("Это категория \"$bodyMassCategory\"")
}

const val LOW_WEIGHT_LEVEL = 18.5F
const val NORMAL_WEIGHT_LEVEL = 25F
const val EXCESS_WEIGHT_LEVEL = 30

