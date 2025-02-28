package org.example.lesson_18

abstract class Tamagotchi(name: String) {
    abstract fun eat()
}

class Fox(val name: String) : Tamagotchi(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog(val name: String) : Tamagotchi(name) {
    override fun eat() {
        println("$name -> ест кость")
    }
}

class Cat(val name: String) : Tamagotchi(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}

fun main() {
    val fox = Fox("Лисичка")
    val dog = Dog("Пёсик")
    val cat = Cat("Кошочка")
    val tamagotchiList: List<Tamagotchi> = listOf(fox, dog, cat)
    tamagotchiList.forEach { it.eat() }
}