package org.example.lesson_10

fun main() {

    println("Введите желаемую длину пароля:")
    val passwordLength = readln().toInt()
    println(generatePassword(passwordLength))
}

fun generatePassword(length: Int): String {
    val characters = "!\"#\$%&'()*+,-./ "
    val numbers = 0..9
    var password = ""
    for (i in 1..length) {
        if (i % 2 != 0) password += numbers.random()
        else password += characters.random()
    }
    return password
}