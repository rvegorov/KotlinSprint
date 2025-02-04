package org.example.lesson_5

fun main() {
    println("Введите вес в килограммах:")
    val weight = readln().toFloat()
    println("Введите рост в сантиметрах:")
    val height = readln().toFloat() / 100

    val bodyMassIndex = weight / (height * height)
    val bodyMassCategory = when {
        (bodyMassIndex < 18.5F) -> "Недостаточная масса тела"
        (bodyMassIndex >= 18.5F && bodyMassIndex < 25) -> " Нормальная масса тела"
        (bodyMassIndex >= 25 && bodyMassIndex < 30) -> "Избыточная масса тела"
        else -> "Ожирение"
    }
    println("Ваш ИМТ равен ${"%.2f".format(bodyMassIndex)}")
    println("Это категория \"$bodyMassCategory\"")
}



