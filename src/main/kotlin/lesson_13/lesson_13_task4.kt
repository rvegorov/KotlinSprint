package org.example.lesson_13

class Contact4(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printContact() {
        println("-Имя: $name\n-Номер: $phoneNumber\n-Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contactList: MutableList<Contact4> = mutableListOf()
    for (i in 1..3) {
        addContact(contactList)
    }
    contactList.forEach {
        println("--------")
        it.printContact()
    }
}

fun addContact(contactList: MutableList<Contact4>) {
    println("-- Новый контакт --")
    println("Введите имя:")
    val contactName = readln()
    println("Введите номер:")
    val contactNumber = readln().toLongOrNull()
    println("Введите компанию:")
    val contactCompany = readln()
    if (contactNumber == null) {
        println("Без номера контакт не может быть добавлен")
        return
    }
    contactList.add(Contact4(contactName, contactNumber, contactCompany.ifEmpty { null }))
}