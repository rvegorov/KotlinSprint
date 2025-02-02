package org.example.lesson_3

fun main() {
    val userName: String = "Кот Матроскин"
    var greeting: String = "Добрый день, $userName!"
    println(greeting)
    greeting = "Добрый вечер, $userName!"
    println(greeting)
}