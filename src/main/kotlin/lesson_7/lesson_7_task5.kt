package org.example.lesson_7

fun main() {
    println("Задайте длину пароля (минимум 6):")
    var length = readln().toInt()
    if (length < MIN_LENGTH) {
        length = MIN_LENGTH
    }

    val smallLetters = ('a'..'z')
    val capitalLetters = ('A'..'Z')
    val numbers = (0..9)
    val allChars = smallLetters + capitalLetters + numbers

    var password = ""
    for (i in 1..length) {
        val randomChar = allChars.random()
        password += randomChar
    }
    println(password)
}

const val MIN_LENGTH = 6


