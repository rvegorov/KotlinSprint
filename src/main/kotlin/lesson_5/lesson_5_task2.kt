package org.example.lesson_5

fun main() {
    println("Введите год своего рождения:")
    val userYear = readln().toInt()
    val currentYear = 2025
    if (currentYear - userYear >= AGE_OF_MAJORITY){
        println("Показать экран со скрытым контентом")
    }
    else {
        println("Показать начальный экран")
    }
}

const val AGE_OF_MAJORITY = 18