package org.example.lesson_9

fun main() {
    val ingredientList: List<String> = listOf("свекла", "капуста", "картофель", "мясо", "лук", "морковь")

    println("В рецепте есть следующие ингредиенты:")

    ingredientList.forEach { ingredient ->
        println(ingredient)
    }
}