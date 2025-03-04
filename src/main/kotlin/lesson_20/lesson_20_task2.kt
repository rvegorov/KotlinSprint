package org.example.lesson_20

class Player(
    val name: String,
    var currentHealth: Int = 100,
    val maxHealth: Int = 100
)

fun main() {
    val healingPotion: (Player) -> Unit = { player: Player ->
        println("Восстановлено ${player.maxHealth - player.currentHealth} здоровья")
        player.currentHealth = player.maxHealth
    }

    val paladin = Player("Paladin", 20)
    healingPotion(paladin)
}