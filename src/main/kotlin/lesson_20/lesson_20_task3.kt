package org.example.lesson_20

class Player2(
    val name: String,
    var hasKey: Boolean = false
)

fun main() {
    val checkKey: (Player2) -> String = { player: Player2 ->
        if (player.hasKey) "Игрок открыл дверь" else "Дверь заперта"
    }

    val player2 = Player2("Petr")

    println(checkKey(player2))
    player2.hasKey = true
    println(checkKey(player2))
}