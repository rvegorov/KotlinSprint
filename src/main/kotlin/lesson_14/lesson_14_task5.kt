package org.example.lesson_14

class Chat(
    val name: String,
    val messageList: MutableList<Message> = mutableListOf(),
    var lastMessageId: Int = 0,
) {
    fun addMessage(text: String) {
        messageList.add(Message(++lastMessageId, text, null))
    }

    fun addTreadMessage(parentMessageId: Int, text: String) {
        messageList.add(ChildMessage(++lastMessageId, text, parentMessageId))
    }

    fun printChat() {
        println("-- ${this.name.uppercase()} --")

        val childMessages = messageList.filter { it is ChildMessage }
        val parentMessages = messageList.filter { it !is ChildMessage }

        val childMessagesMap = childMessages.groupBy { it.parentId }
        parentMessages.forEach {
            println(it.text)
            childMessagesMap[it.id]?.forEach {
                println(" ↳\t${it.text}")
            }
        }
    }
}

open class Message(val id: Int, val text: String, val parentId: Int?)

class ChildMessage(id: Int, text: String, parentId: Int) : Message(id, text, parentId)

fun main() {
    val chat = Chat("Чуваки")
    chat.addMessage("Подскажите, когда выйдет патч")
    chat.addTreadMessage(1, "хз")
    chat.addMessage("Чуваки, я заболел((")
    chat.addTreadMessage(3, "Поправляйся!")
    chat.addTreadMessage(1, "Завтра")
    chat.addTreadMessage(3, "Говорили же тебе надеть шапку")
    chat.printChat()
}