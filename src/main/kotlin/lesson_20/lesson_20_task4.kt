package org.example.lesson_20

fun main() {
    val elementsList = listOf("StartButton", "HelpLink", "StopButton", "UserAvatar", "AppIcon", "CloseButton")

    val lambdasList = elementsList.map {
        { println("Нажат элемент $it") }
    }

    lambdasList.forEach { it.invoke() }
}