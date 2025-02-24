package org.example.lesson_14

abstract class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val landable: Boolean,
)

class Planet(
    name: String,
    hasAtmosphere: Boolean = true,
    landable: Boolean = true,
    val satelliteList: List<Sattelite> = emptyList()
) : CelestialBody(name, hasAtmosphere, landable)

class Sattelite(
    name: String,
    hasAtmosphere: Boolean = false,
    landable: Boolean = false,
) : CelestialBody(name, hasAtmosphere, landable)

fun main() {
    val planet = Planet(
        "Марс",
        false,
        true,
        listOf(Sattelite("Фобос"), Sattelite("Деймос"))
    )

    println(planet.name)
    planet.satelliteList.forEach { println(it.name) }
}
