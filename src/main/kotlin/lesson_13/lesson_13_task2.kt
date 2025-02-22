package org.example.lesson_13

class Contact2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printContact() {
        println("-Имя: $name\n-Номер: $phoneNumber\n-Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val client = Contact2("Остап", 88005553535)
    client.printContact()
}