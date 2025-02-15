package org.example.lesson_9

fun main() {
    println("Напишите список из 5 ингредиентов через запятую с пробелом:")
    val userList = readln().split(", ")
    val sortedList = userList.sorted()

    println("Ваш список:")
    sortedList.forEach { ingredient ->
        println(ingredient)
    }
}