package org.example.lesson_11

class Ingredient(
    val name: String,
    val unit: String
)

class Recipe(
    val name: String,
    val recipe: Map<Ingredient, Int>
)

class Category(
    val name: String,
    val image: String,
    val recipes: List<Recipe>
)