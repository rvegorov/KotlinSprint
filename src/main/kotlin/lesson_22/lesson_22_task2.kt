package org.example.lesson_22

class RegularBook2(val title: String, val author: String)

data class DataBook2(val title: String, val author: String)

fun main() {
    val book1 = RegularBook2("Ревизор", "Н. Гоголь")
    val book2 = DataBook2("Ревизор", "Н. Гоголь")

    println(book1)
    println(book2)

    // разница возникает, из-за переопределенного метода toString(), который выполняется внутри println()
    // по-умолчанию toString() для обычного класса (Any) возвращает класс объекта и хэш-код,
    // в data классе toString() переопределен и возвращает класс и свойства объекта с их значениями
}