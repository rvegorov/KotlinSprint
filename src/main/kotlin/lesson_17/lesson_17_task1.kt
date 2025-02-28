package org.example.lesson_17

class QuizElement(
    question: String,
    answer: String,
) {
    val question: String = question
        get() = field

    var answer: String = answer
        get() = field
        set(text: String) {
            field = text
        }
}
