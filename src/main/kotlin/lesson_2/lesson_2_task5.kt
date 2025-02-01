package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val deposit = 70000
    val yearRate: Double = 0.167
    val years = 20

    val futureDeposit = deposit * (1 + yearRate).pow(years)
    println(String.format("%.3f", futureDeposit))
}