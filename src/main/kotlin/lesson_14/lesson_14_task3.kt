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
        Circle(2.0, "black"),
        Circle(10.5, "white"),
        Rectangle(10.0, 10.0, "black"),
        Rectangle(5.7, 10.2, "white")
    )
    var perimeterOfBlacks = 0.0
    figuresList.forEach { if (it.color == "black") perimeterOfBlacks += it.calcPerimeter() }

    var areaOfWhites = 0.0
    figuresList.forEach { if (it.color == "white") areaOfWhites += it.calcArea() }

    println("Периметр всех чёрных фигур: $perimeterOfBlacks")
    println("Площадь всех белых фигур: $areaOfWhites")
}