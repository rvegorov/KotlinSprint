package org.example.lesson_21

fun main() {
    val s = "hello, Вася"
    println(s.vowelCount())
}

fun String.vowelCount(): Int {
    val vowels = "aeiouаеёиоуыэюя"
    return this.filter { vowels.contains(it, true) }.length
}
