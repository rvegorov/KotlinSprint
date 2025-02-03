package org.example.lesson_3

fun main() {
    val getData = "D2-D4;0"
    val dataList = getData.split('-', ';')

    val moveFrom = dataList[0]
    val moveTo = dataList[1]
    val moveNumber = dataList[2].toInt()

    println(moveFrom)
    println(moveTo)
    println(moveNumber)
}