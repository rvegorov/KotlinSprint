package org.example.lesson_2

fun main() {
    val workerNumber: Byte = 51
    val workerSalary: Float = 30000f
    val traineeNumber: Byte = 30
    val traineeSalary: Float = 20000f

    val totalWorkerSalary = workerSalary * workerNumber
    val totalSalary = totalWorkerSalary + traineeSalary * traineeNumber
    val meanSalary = totalSalary / (workerNumber + traineeNumber)

    println(totalWorkerSalary.toInt())
    println(totalSalary.toInt())
    println(meanSalary.toInt())
}