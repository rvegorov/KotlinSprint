package org.example.lesson_21

import java.io.File

fun File.addWord(word: String) {
    this.writeText("${word.lowercase()}\n${this.readText()}")
}