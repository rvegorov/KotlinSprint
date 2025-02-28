package org.example.lesson_18


class Screen {

    fun draw(x: Int, y: Int, figure: Circle): String {
        return "В координатах [$x:$y] нарисован круг"
    }


    fun draw(x: Float, y: Float, figure: Circle): String {
        return "В координатах [$x:$y] нарисован круг"
    }

    fun draw(x: Int, y: Int, figure: Square): String {
        return "В координатах [$x:$y] нарисован квадрат"
    }

    fun draw(x: Float, y: Float, figure: Square): String {
        return "В координатах [$x:$y] нарисован квадрат"
    }

    fun draw(x: Int, y: Int, figure: Point): String {
        return "В координатах [$x:$y] нарисована точка"
    }

    fun draw(x: Float, y: Float, figure: Point): String {
        return "В координатах [$x:$y] нарисована точка"
    }
}

class Circle

class Square

class Point

fun main() {
    val screen = Screen()
    println(screen.draw(40, 40, Square()))
    println(screen.draw(41.5f, 41.5f, Circle()))
    println(screen.draw(20, 20, Point()))
}