package org.example.lesson_19

enum class Ammo(val damage: Int, val niceName: String) {
    BLUE(5, "Синие"),
    GREEN(10, "Зелёные"),
    RED(20, "Красные");
}

class Tank() {
    var currentAmmo: Ammo? = null

    fun loadAmmo(ammo: Ammo) {
        currentAmmo = ammo
        println("Заряжены паторны: ${ammo.niceName}")
    }

    fun fire() {
        if (currentAmmo == null) {
            println("ЩЁЛК! Орудие не заряжено!")
        } else {
            println("БAМ! Урон " + currentAmmo!!.damage)
        }
    }
}

fun main() {
    val tank = Tank()
    tank.fire()
    tank.loadAmmo(Ammo.RED)
    tank.fire()
    tank.loadAmmo(Ammo.BLUE)
    tank.loadAmmo(Ammo.GREEN)
    tank.fire()
    tank.fire()
}