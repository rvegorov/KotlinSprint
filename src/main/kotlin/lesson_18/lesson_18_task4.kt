package org.example.lesson_18

open class RectangleBox(
    val width: Double,
    val height: Double,
    val depth: Double,
) {
    fun calcArea(): Double {
        return 2 * (width * height + height * depth + depth * width)
    }
}

class CubeBox(width: Double) : RectangleBox(width, width, width)

fun main() {
    val cube = CubeBox(25.0)
    println(cube.calcArea())

    val rect = RectangleBox(25.0, 32.0, 9.0)
    println(rect.calcArea())
}