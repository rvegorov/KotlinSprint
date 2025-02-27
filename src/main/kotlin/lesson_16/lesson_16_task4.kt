package org.example.lesson_16

class Order(val id: Int) {
    private var status = "создан"

    private fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun changeStatusManager(newStatus: String) {
        changeStatus(newStatus)
        println("Новый статус заказа №$id: $newStatus")
    }
}

fun main() {
    val order = Order(135)
    order.changeStatusManager("готовится")
}

