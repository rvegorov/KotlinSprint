package org.example.lesson_7

fun main() {
    println("Введите целое число больше 0:")
    for (i in 0..readln().toInt() step 2) {
        print("$i ")
    }
}