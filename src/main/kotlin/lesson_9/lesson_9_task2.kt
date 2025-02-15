package org.example.lesson_9

fun main() {
    val ingredientList = mutableListOf("курица", "морковь", "лаваш")

    println("В рецепте есть базовые ингредиенты:")
    ingredientList.forEach { ingredient ->
        println(ingredient)
    }

    println("Желаете добавить еще? да/нет:")

    if (readln().equals("да", true)) {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredient = readln()
        ingredientList.add(newIngredient)
        println("Теперь в рецепте есть следующие ингредиенты:")
        ingredientList.forEach { ingredient ->
            println(ingredient)
        }
    }
}