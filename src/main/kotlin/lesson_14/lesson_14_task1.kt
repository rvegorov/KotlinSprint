package org.example.lesson_14

open class Liner(
    val speed: Int = 25,
    val capacity: Int = 1500,
    val passengers: Int = 2000
)

class CargoShip(
    speed: Int = 22,
    capacity: Int = 5000,
    passengers: Int = 30
) : Liner(speed, capacity, passengers)

class IcebreakerShip(
    speed: Int = 15,
    capacity: Int = 1500,
    passengers: Int = 50,
    val canBreakIce: Boolean = true
) : Liner(speed, capacity, passengers)


fun main() {
    val liner = Liner()
    val tanker = CargoShip(capacity = 6000)
    val icebreaker = IcebreakerShip()
}