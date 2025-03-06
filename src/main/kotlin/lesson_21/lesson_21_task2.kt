package org.example.lesson_21

fun main() {
    val intList = (1..8).toList()

    println(intList.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    return this.filter { it % 2 == 0 }.sum()
}