package org.example.lesson_17

class User(
    login: String,
    password: String
) {
    var login: String = login
        set(value) {
            field = value
            println("Вы успешно сменили логин на $value")
        }
    var password: String = password
        get() {
            return field.map { '*' }.joinToString("")
        }
        set(value) {
            println("Вы не можете изменить пароль")
        }
}

fun main() {
    val user = User("admin", "123")
    user.login = "ADMIN"
    println(user.password)
    user.password = "qwerty"
}