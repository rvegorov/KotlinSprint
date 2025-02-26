package org.example.lesson_14

open class Liner2(
    val speed: Int = 25,
    val capacity: Int = 1500,
    val passengers: Int = 2000,
    val shipClassName: String = "Лайнер"
) {
    open fun load() {
        println("Команда: выдвинуть горизонтальный трап со шкафута для погрузки")
    }

    fun printInfo() {
        println(
            """-- Характеристики судна: -- 
            |Скорость: $speed узлов
            |Грузоподъемность: $capacity тонн
            |Мест для пассажиров: $passengers
        """.trimMargin()
        )
    }
}

class CargoShip2(
    speed: Int = 22,
    capacity: Int = 5000,
    passengers: Int = 30,
    shipClassName: String = "Грузовой"
) : Liner2(speed, capacity, passengers) {
    override fun load() {
        println("Команда: активировать погрузочный трап для погрузки")
    }
}

class IcebreakerShip2(
    speed: Int = 15,
    capacity: Int = 1500,
    passengers: Int = 50,
    shipClassName: String = "Ледокол",
    val canBreakIce: Boolean = true,
) : Liner2(speed, capacity, passengers) {
    override fun load() {
        println("Команда: открыть ворота со стороны кормы")
    }
}


fun main() {
    val liner = Liner2()
    val tanker = CargoShip2(capacity = 6000)
    val icebreaker = IcebreakerShip2()

    liner.printInfo()
    tanker.printInfo()
    icebreaker.printInfo()
}