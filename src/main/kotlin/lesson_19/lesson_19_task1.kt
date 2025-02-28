package org.example.lesson_19

enum class Fishes(val rusName: String) {
    GUPPY("гуппи"),
    GOLDFISH("золотая рыбка"),
    ANGELFISH("скалярия"),
    SIAMESE_FIGHTING_FISH("петушок"),
}

fun main() {
    println("Вы можете выбрать рыбку из списка: ")
    Fishes.entries.forEach { println(it.rusName) }
}