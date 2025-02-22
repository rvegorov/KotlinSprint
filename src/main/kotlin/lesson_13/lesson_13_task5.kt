package org.example.lesson_13

class Contact5(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printContact() {
        println("-Имя: $name\n-Номер: $phoneNumber\n-Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contactList: MutableList<Contact5> = mutableListOf()
    for (i in 1..3) {
        newContact(contactList)
    }
    contactList.forEach {
        println("--------")
        it.printContact()
    }
}

fun newContact(contactList: MutableList<Contact5>) {
    println("-- Новый контакт --")
    println("Введите имя:")
    val contactName = readln()
    println("Введите номер:")
    val contactNumberString = readln()
    val contactNumber: Long
    try {
        contactNumber = contactNumberString.toLong()
    } catch (e: Exception) {
        println("ОШИБКА: " + e.javaClass.simpleName)
        return
    }
    println("Введите компанию:")
    var contactCompany = readln()
    contactList.add(Contact5(contactName, contactNumber, contactCompany.ifEmpty { null }))
}