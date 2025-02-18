package org.example.lesson_8

fun main() {
    val ingredients = arrayOf("свекла", "капуста", "картофель", "мясо", "лук", "морковь")
    println("Ингредиенты:")
    for (i in ingredients) println("  $i")

    println("Какой ингредиент вы хотите заменить?")
    val search = readln()

    val index = ingredients.indexOf(search.lowercase())
    if (index < 0) {
        println("Такого ингредиента в рецепте нет")
    } else {
        println("Какой ингредиент добавить?")
        ingredients[index] = readln()

        println("Готово! Вы сохранили следующий список:")
        for (i in ingredients) println("  $i")
    }
}