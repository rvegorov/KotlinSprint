package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val deposit = 70000
    val yearRate: Double = 16.7
    val years = 20

    val futureDeposit = deposit * (1 + yearRate / 100).pow(years)
    println(String.format("%.3f", futureDeposit))
}