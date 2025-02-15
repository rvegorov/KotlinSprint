package org.example.lesson_8

fun main() {
    val dailyViews = intArrayOf(85, 100, 98, 110, 92, 66, 60)

    var totalViews = 0
    for (views in dailyViews) {
        totalViews += views
    }
    println(totalViews)
}