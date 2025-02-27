package org.example.lesson_17

class PackageTracker(
    val id: Int,
) {
    var counter = 0
        private set
    var location: String = "создано"
        private set(value) {
            field = value
            counter++
        }

    fun changeLocation(newLocation: String) {
        location = newLocation
    }
}

fun main() {
    val tracker = PackageTracker(123)
    println(tracker.location)
    tracker.changeLocation("СЦ Москва")
    println("${tracker.counter}: ${tracker.location}")
}