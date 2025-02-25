package org.example.lesson_13

class Contact3(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printContact() {
        println("-Имя: $name\n-Номер: $phoneNumber\n-Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contactList = listOf(
        Contact3("Василий", 8908444444),
        Contact3("Мария", 8908444445),
        Contact3("Андрей", 8908444446, "null"),
        Contact3("Остап", 88005553535, "Рога и Копыта"),
        Contact3("Сергей", 88003331000, "МММ")
    )
    val companyNames = contactList.mapNotNull { it.company }
    companyNames.forEach { println(it) }
}