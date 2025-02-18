package org.example.lesson_8

fun main() {
    val ingredients = arrayOf("свекла", "капуста", "картофель", "мясо", "лук", "морковь")

    println("Введите искомы ингредиент:")
    val search = readln()

    if (ingredients.indexOf(search.lowercase()) >= 0)
        println("Ингредиент \"$search\" в рецепте есть")
    else
        println("Такого ингредиента в рецепте нет")
}