package org.example.lesson_8

fun main() {
    println("Введите количество ингредиентов:")
    val arraySize = readln().toInt()

    val recipeArray = arrayOfNulls<String>(arraySize)
    println("Введите ингредиенты по одному:")
    for (i in recipeArray) {
        recipeArray[recipeArray.indexOf(i)] = readln()
    }

    println("Ваш рецепт:")
    println(recipeArray.joinToString(","))
}