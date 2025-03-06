package org.example.lesson_21

fun main() {
    val levelMap: Map<String, Int> = mapOf(
        "Алхимия" to 14,
        "Ремесло" to 13,
        "Пьянство" to 4,
        "Верховая езда" to 10,
        "Ученость" to 15,
        "Незаметность" to 25,
        "Выживание" to 15,
        "Воровство" to 25,
    )
    println(levelMap.maxCategory())
}

fun Map<String, Int>.maxCategory(): String {
    return this.maxByOrNull { it.value }?.key ?: "путой список"
}