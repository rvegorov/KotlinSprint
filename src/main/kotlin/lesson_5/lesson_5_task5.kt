package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val correctList = listOf(
        Random.nextInt(MIN_NUM, MAX_NUM + 1),
        Random.nextInt(MIN_NUM, MAX_NUM + 1),
        Random.nextInt(MIN_NUM, MAX_NUM + 1),
    )

    println("Введите три числа, по одному на строку:")
    val userList = listOf(readln().toInt(), readln().toInt(), readln().toInt())

    val intersectionSize = userList.intersect(correctList.toSet()).size

    when (intersectionSize) {
        3 -> println("Вы угадали три числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и выиграли крупный приз!")
        1 -> println("Вы угадали одно число и выиграли утешительный приз")
        else -> println("Вы не угадали ни одного числа")
    }
    println("Правильные числа: " + correctList.joinToString(", "))
}

const val MIN_NUM = 0
const val MAX_NUM = 42