package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = ""
) {
    fun printInfo() {
        println(
            """-- ДАННЫЕ О ПОЛЬЗОВАТЕЛЕ --
            |ID: $id
            |Логин: $login
            |Пароль: $password
            |Почта: $email
            |О себе: $bio
        """.trimMargin()
        )
    }

    fun writeBio() {
        println("Напишите о себе:")
        bio = readln()
    }

    fun changePassword() {
        println("Введите старый пароль:")

        if (readln() == password) {
            println("Введите новый пароль:")
            password = readln()
            println("Пароль изменен")
        } else println("Неправильный пароль")
    }
}

fun main() {
    val userObj = User2(2, "Alex", "1111", "alex111@mail.ru")
    userObj.writeBio()
    userObj.changePassword()
    userObj.printInfo()
}