package org.example.lesson_4

fun main() {
    val todayOccupied = 13
    val tomorrowOccupied = 9
    val todayAvailability: Boolean = (todayOccupied < TABLES_TOTAL)
    val tomorrowAvailability: Boolean = (tomorrowOccupied < TABLES_TOTAL)
    println(
        "Доступность столиков на сегодня: $todayAvailability \n" +
         "Доступность столиков на завтра: $tomorrowAvailability"
    )
}

const val TABLES_TOTAL: Byte = 13