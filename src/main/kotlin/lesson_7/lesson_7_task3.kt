package org.example.lesson_7

fun main() {
    println("Введите целое число больше 0:")
    val maxNumber = readln().toInt()

    for (i in 0..maxNumber step 2) {
        print("$i ")
    }
}