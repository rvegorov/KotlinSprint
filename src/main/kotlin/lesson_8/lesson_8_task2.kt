package org.example.lesson_8

fun main() {
    val ingredients = arrayOf("свекла", "капуста", "картофель", "мясо", "лук", "морковь")
    println("Введите искомый ингредиент:")
    val search = readln()

    for (ingredient in ingredients) {
        if (ingredient == search.lowercase()) {
            println("Ингредиент \"$search\" в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}