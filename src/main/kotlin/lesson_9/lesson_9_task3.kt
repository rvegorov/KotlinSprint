package org.example.lesson_9

fun main() {
    val amountList = listOf(2, 50, 15)

    println("Сколько порций вам надо?")
    val count = readln().toInt()

    val newAmountList = amountList.map { n ->
        n * count
    }
    println(
        "На $count порций вам понадобится: Яиц – ${newAmountList[0]} шт.," +
                " молока – ${newAmountList[1]} мл, сливочного масла – ${newAmountList[2]} г"
    )
}