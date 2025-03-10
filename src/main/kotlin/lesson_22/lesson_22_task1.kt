package org.example.lesson_22

class RegularBook(val title: String, val author: String)

data class DataBook(val title: String, val author: String)

fun main() {
    val book1 = RegularBook("Ревизор", "Н. Гоголь")
    val book2 = RegularBook("Ревизор", "Н. Гоголь")
    val dataBook1 = DataBook("Туман", "С. Кинг")
    val dataBook2 = DataBook("Туман", "С. Кинг")

    println(book1 == book2)
    println(dataBook1 == dataBook2)

    // для обычных классов сравниваются ссылки на объекты, а для data данные всех свойств класса
    // для обычного объекта "==" вернет true, только если он будет сравниваться с самим собой
    // объекты data будут равны, если их свойства равны
}