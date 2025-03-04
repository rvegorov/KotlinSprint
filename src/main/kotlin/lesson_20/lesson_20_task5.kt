package org.example.lesson_20

class Robot(val name: String) {
    val phraseList = listOf(
        "ПАМАГИТЕ!",
        "Приветствую!",
        "Дайте подумать...",
        "До встречи...",
        "######!101",
    )
    private var modifier: (String) -> String = { it } // без private не компилируется (Platform declaration clash)

    fun say() {
        println(modifier(phraseList.random()))
    }

    fun setModifier(newModifier: (String) -> String) {
        modifier = newModifier
    }
}

fun main() {
    val robot = Robot("M1")
    robot.say()
    robot.setModifier { it.reversed() }
    robot.say()
}