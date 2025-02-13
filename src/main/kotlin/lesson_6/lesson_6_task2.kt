package org.example.lesson_6

fun main() {
    println("Введите количество секунд:")
    val timer = readln().toLong()
    Thread.sleep(timer * 1000)
    println("Прошло $timer секунд")
}