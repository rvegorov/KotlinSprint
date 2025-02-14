package org.example.lesson_7

fun main() {
    println("Введите целое число больше 0:")
    val maxNumber = readln().toInt()

    val progression = 0..maxNumber step 2

    for (i in progression) {
        print("$i ")
    }
}