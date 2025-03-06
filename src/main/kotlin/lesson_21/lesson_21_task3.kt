package org.example.lesson_21

class Player(
    val name: String,
    var currentHealth: Int = 100,
    val maxHealth: Int = 100
)

fun main() {
    val oleg = Player("Oleg", 20)
    println(oleg.isHealthy())
}

fun Player.isHealthy(): Boolean {
    return currentHealth == maxHealth
}