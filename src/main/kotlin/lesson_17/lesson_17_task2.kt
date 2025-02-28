package org.example.lesson_17

class Ship(name: String, var avgSpeed: Int, var port: String) {
    var name = name
        set(value) {
            println("Нельзя менять имя корабля!")
        }
}

fun main() {
    val ship = Ship("Адмирал Задов", 20, "Панама")
    ship.name = "Лариса"
    println(ship.name)
}