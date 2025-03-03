package org.example.lesson_18

class Order(
    val id: Int
) {
    fun printInfo(items: String) {
        println("Заказан один товар: $items")
    }

    fun printInfo(items: List<String>) {
        println("Заказаны следующие товары: ${items.joinToString(", ")}")
    }
}

fun main() {
    val order1 = Order(1)
    val order2 = Order(2)
    order1.printInfo("Пицца")
    order2.printInfo(listOf("Бургер", "Круассан"))
}