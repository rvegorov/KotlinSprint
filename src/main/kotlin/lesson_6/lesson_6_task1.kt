package org.example.lesson_6

fun main() {
    println("РЕГИСТРАЦИЯ")
    println("Придумайте логин:")
    val name = readln()
    println("Придумайте пароль:")
    val password = readln()

    println("АВТОРИЗАЦИЯ")
    do {
        println("Введите логин:")
        val enteredName = readln()
        println("Введите пароль:")
        val enteredPassword = readln()
    } while (enteredName != name || enteredPassword != password)

    println("Авторизация прошла успешно")
}