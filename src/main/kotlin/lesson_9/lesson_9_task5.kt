package org.example.lesson_9


fun main() {
    val userList: MutableList<String> = mutableListOf()
    println("Введите список ингредиентов по одному в каждой строке:")
    for (i in 1..5) {
        userList.add(readln())
    }
    userList.sort()
    val newList = userList.distinctBy { it.lowercase() }

    val ingredientsString = newList.joinToString(", ").replaceFirstChar { it.uppercase() }
    println(ingredientsString)
}
