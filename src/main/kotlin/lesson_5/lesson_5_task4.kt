package org.example.lesson_5

fun main() {
    val login = "Zaphod"
    val password = "PanGalactic"

    println("Введите своё имя:")
    val userLogin = readln()

    if (userLogin != login) {
        println("Пассажира с таким именем нет. Зарегистрируйтесь")
    } else {
        println("Введите пароль:")
        val userPassword = readln()

        if (userPassword == password) {
            println("Добро пожаловать, $login!")
        } else {
            println("Неверный пароль")
        }
    }
}