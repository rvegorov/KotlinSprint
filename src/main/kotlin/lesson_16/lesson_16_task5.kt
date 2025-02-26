package org.example.lesson_16

class Player(val name: String) {
    private val maxHealth = 100
    private var health = maxHealth
    private var alive = true
    var hitStrength: Int = 10

    fun getDamage(damage: Int) {
        if (!alive) return
        health -= damage
        println("-$damage HP")
        if (health <= 0) die()
    }

    fun heal(healAmount: Int) {
        if (!alive) return
        health += healAmount
        println("+$healAmount HP")
        if (health > maxHealth) health = maxHealth
    }

    private fun die() {
        alive = false
        hitStrength = 0
        health = 0
        println("Игрок $name умер")
    }
}

fun main() {
    val player = Player("NAGIBATOR")
    player.getDamage(24)
    player.getDamage(23)
    player.heal(100)
    player.getDamage(75)
    player.heal(25)
    player.getDamage(51)
}
