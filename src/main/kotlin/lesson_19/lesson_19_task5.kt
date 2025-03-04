package org.example.lesson_19

enum class Gender(val shortName: String, val longName: String) {
    FEMALE("ж", "женщина"),
    MALE("м", "мужчина"),
}

class Person(val Name: String, val gender: Gender)

fun main() {
    val genderList = Gender.entries
    val genderListString = genderList.joinToString(", ") { "${it.shortName} (${it.longName})" }
    println("Вводите имя с большой буквы, а пол одной буквой: $genderListString")

    val personList: MutableList<Person> = mutableListOf()
    while (personList.size < NUMBER_OF_PEOPLE) {
        println("-- Введите данные ${personList.size + 1}/$NUMBER_OF_PEOPLE: --")
        print("Имя: ")
        val name: String = readln()
        print("Пол: ")
        val genderString = readln().lowercase()
        val gender = genderList.firstOrNull { it.shortName == genderString }
        if (gender != null && name.isNotEmpty()) {
            println("-- запись добавлена --")
            personList.add(Person(name, gender))
        } else {
            println("-- ошибка формата, повторите ввод: --")
        }
    }
    println("СПИСОК:")
    personList.map { println("${it.Name}, ${(it.gender.longName)}") }
}

const val NUMBER_OF_PEOPLE = 5
