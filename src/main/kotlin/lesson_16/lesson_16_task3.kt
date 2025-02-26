package org.example.lesson_16

class User(
    val name: String,
    private val password: String,
) {
    fun validatePassword(checkPassword: String): Boolean {
        return checkPassword == password
    }
}

fun main() {
    val user = User("Resu", "1111")
    println(user.validatePassword("2222"))
}