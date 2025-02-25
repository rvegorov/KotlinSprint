package org.example.lesson_15

interface Moves {
    fun move()
}

interface TransportsPassengers {
    val currentPassengers: Int
    val maxPassengers: Int
    fun boardPassengers(numberOfPassengers: Int)
    fun unboardPassengers(numberOfPassengers: Int)
}

interface TransportsCargo {
    val currentCargo: Float
    val maxCargo: Float
    fun loadCargo(amount: Float)
    fun unloadCargo(amount: Float)
}

class Truck(override var currentCargo: Float = 0f) : Moves, TransportsCargo {
    override val maxCargo: Float = 5f

    override fun move() {
        println("Грузовик перевозит $currentCargo т груза")
    }

    override fun loadCargo(amount: Float) {
        currentCargo += amount
        println("Загружено $amount т груза")
    }

    override fun unloadCargo(amount: Float) {
        currentCargo -= amount
        println("Разгружено $amount т груза")
    }
}

class Bus(override var currentPassengers: Int = 0) : Moves, TransportsPassengers {
    override val maxPassengers: Int = 40

    override fun move() {
        println("Автобус везет $currentPassengers пассажиров")
    }

    override fun boardPassengers(numberOfPassengers: Int) {
        currentPassengers += numberOfPassengers
        println("В автобус погрузились $numberOfPassengers пассажиров")
    }

    override fun unboardPassengers(numberOfPassengers: Int) {
        currentPassengers -= numberOfPassengers
        println("Из автобуса вышло $numberOfPassengers пассажиров")
    }
}

fun main() {
    val newBus = Bus()
    newBus.boardPassengers(6)
    newBus.move()
    newBus.unboardPassengers(6)

    val newTruck = Truck(1f)
    newTruck.loadCargo(2f)
    newTruck.move()
    newTruck.unloadCargo(2f)
    newTruck.move()
}