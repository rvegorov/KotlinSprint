package org.example.lesson_2

fun main() {
    val grade1: Byte = 3
    val grade2: Byte = 4
    val grade3: Byte = 3
    val grade4: Byte = 5
    val studentCount = 4.0f

    val meanGrade: Float = (grade1 + grade2 + grade3 + grade4) / studentCount
    println(String.format("%.2f", meanGrade))
}