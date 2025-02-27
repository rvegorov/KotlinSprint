package org.example.lesson_16

class Circle(private val radius: Double) {
    private val pi: Double = 3.14

    fun calculateCircumference(): Double {
        return 2 * pi * radius
    }

    fun calculateArea(): Double {
        return pi * radius * radius
    }
}
