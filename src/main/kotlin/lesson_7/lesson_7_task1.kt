package org.example.lesson_7

fun main() {
    val numbers: IntRange = 0..9
    val letters: CharRange = 'a'..'z'

    var password = ""
    for (i in 6 downTo 1) {
        if (i % 2 == 0) {
            password += letters.random()
        } else {
            password += numbers.random()
        }
    }
    println(password)
}