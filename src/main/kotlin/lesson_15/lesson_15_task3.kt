package org.example.lesson_15

abstract class User {
    abstract val id: Int
    abstract val name: String
    abstract fun readMessage()
    abstract fun writeMessage()
}

open class BasicUser(
    override val id: Int,
    override val name: String
) : User() {

    override fun readMessage() {
        println("$name прочитал сообщение")
    }

    override fun writeMessage() {
        println("$name написал сообщение")
    }
}

class AdminUser(id: Int, name: String) : BasicUser(id, name) {
    fun deleteMessage() {
        println("$name удалил сообщение")
    }

    fun deleteUser() {
        println("$name удалил пользователя")
    }
}

fun main() {
    val admin1 = AdminUser(0, "Doctor")
    val user1 = BasicUser(1, "Vector")
    user1.readMessage()
    user1.writeMessage()
    admin1.readMessage()
    admin1.deleteMessage()
    admin1.deleteUser()
    admin1.writeMessage()
}