package org.example.lesson_11

class User(
    val id: Int, val login: String, val password: String, val email: String
)

fun main() {
    val admin = User(0, "admin", "ytuhjk56", "admin@mail.ru")
    val moder = User(1, "Vasya666", "qwerty", "ryfugii@gmail.com")
    println("[${admin.id},${admin.login},${admin.password},${admin.email}]")
    println("[${moder.id},${moder.login},${moder.password},${moder.email}]")
}