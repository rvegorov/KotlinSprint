package org.example.lesson_19

enum class Categories() {
    CLOTHES {
        override fun getTextName(): String {
            return "Одежда"
        }
    },
    STATIONERY {
        override fun getTextName(): String {
            return "Канцелярские товары"
        }
    },
    OTHER {
        override fun getTextName(): String {
            return "Разное"
        }
    };

    abstract fun getTextName(): String
}

class Item(
    val name: String,
    val id: Int,
    val category: Categories
) {

    fun printInfo() {
        println("$id: $name (${category.getTextName()})")
    }
}

fun main() {
    val shirt = Item("Рубашка", 1, Categories.CLOTHES)
    val pen = Item("Ручка", 2, Categories.STATIONERY)
    val glasses = Item("Очки", 33, Categories.OTHER)

    shirt.printInfo()
    pen.printInfo()
    glasses.printInfo()
}