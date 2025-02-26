package org.example.lesson_14

abstract class Figure(val color: String) {
    abstract fun calcArea(): Double

    abstract fun calcPerimeter(): Double
}

class Circle(
    val radius: Double,
    color: String,
) : Figure(color) {

    override fun calcArea(): Double {
        return (Math.PI * radius * radius)
    }

    override fun calcPerimeter(): Double {
        return (2 * Math.PI * radius)
    }
}

class Rectangle(
    val width: Double,
    val height: Double,
    color: String,
) : Figure(color) {

    override fun calcArea(): Double {
        return width * height
    }

    override fun calcPerimeter(): Double {
        return 2 * (width + height)
    }
}

fun main() {
    val figuresList: List<Figure> = listOf(
        Circle(2.0, BLACK),
        Circle(10.5, WHITE),
        Rectangle(10.0, 10.0, BLACK),
        Rectangle(5.7, 10.2, WHITE)
    )

    val perimeterOfBlacks = figuresList.filter { it.color == BLACK }.sumOf { it.calcPerimeter() }
    val areaOfWhites = figuresList.filter { it.color == WHITE }.sumOf { it.calcArea() }

    println("Периметр всех чёрных фигур: $perimeterOfBlacks")
    println("Площадь всех белых фигур: $areaOfWhites")
}

const val BLACK = "black"
const val WHITE = "white"