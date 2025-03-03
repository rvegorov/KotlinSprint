package org.example.lesson_19

class Spacecraft(val name: String) {
    fun takeoff() {
        println("взлетаем!")
        // TODO надо добавить логику
    }

    fun land() {
        TODO()
    }

    fun shootAsteroid() {
        println("пиу-пиу")
    }
}

fun main() {
    val spaceship = Spacecraft("Корабль")
    spaceship.land()
    spaceship.takeoff()
    spaceship.shootAsteroid()
}