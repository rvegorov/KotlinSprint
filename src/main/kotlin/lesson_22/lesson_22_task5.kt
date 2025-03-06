package org.example.lesson_22

data class GalacticGuide(
    val name: String,
    val description: String,
    val date: String,
    val distanceToEarth: Double,
)

fun main() {
    val alphaCentauri = GalacticGuide(
        "Альфа Центавра",
        "не самые далекие звезды",
        "01.01.2000",
        4.36
    )

    println(alphaCentauri.component1())
    println(alphaCentauri.component2())
    println(alphaCentauri.component3())
    println(alphaCentauri.component4())
}