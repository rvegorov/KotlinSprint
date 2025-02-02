package org.example.lesson_1

fun main() {
    val year: String = "1961"
    var hour: String = "09"
    var minute: String = "07"

    println(year)
    println(hour)
    println(minute)

    hour = "10"
    minute = "55"

    // "Подсказка для вывода: какой метод печати в консоль не делает перенос в конце строки?"
    // ок, вывожу через print()
    print(hour)
    print(":")
    print(minute)

}