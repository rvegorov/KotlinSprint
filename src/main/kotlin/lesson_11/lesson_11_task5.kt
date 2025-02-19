package org.example.lesson_11

class Member(
    val userId: Int,
    val userName: String
) {}

class Message(
    val authorId: Int,
    val message: String
) {}


class Forum(
    val forumName: String,
    var lastUserId: Int = 0,
    var userList: MutableList<Member> = arrayListOf(),
    var messageList: MutableList<Message> = arrayListOf()
) {
    fun createNewUser(userName: String): Member {
        val newUserId = ++lastUserId
        val newUser = Member(newUserId, userName)
        userList.add(newUser)
        return newUser
    }

    fun createNewMessage(authorId: Int, message: String) {
        if (userList.any { it.userId == authorId }) {
            messageList.add(Message(authorId, message))
        }
    }

    fun printThread() {
        println("-- $forumName --")
        messageList.forEach { message: Message ->
            val author = userList.filter { it.userId == message.authorId }[0].userName
            println(("$author: ${message.message}"))
        }
    }
}

fun main() {
    val thread = Forum("Помогите")
    val chelovekId = thread.createNewUser("chelovek").userId
    val znatokId = thread.createNewUser("Znatok").userId
    thread.createNewMessage(chelovekId, "Привет всем! Как открыть карту в Казахстане?")
    thread.createNewMessage(znatokId, "Тя че в гугле забанили, нуб?")
    thread.createNewMessage(chelovekId, "Чё грубить то сразу?")
    thread.createNewMessage(znatokId, "сорян")
    thread.printThread()
}