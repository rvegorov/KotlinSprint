package org.example.lesson_15

interface Flying {
    fun fly()
}

interface Swimming {
    fun swim()
}

class Crucian : Swimming {
    override fun swim() {
        println("Карась плывет")
    }
}

class Gull : Flying, Swimming {
    override fun fly() {
        println("Чайка летит")
    }

    override fun swim() {
        println("Чайка плывет")
    }
}

class Duck : Flying, Swimming {
    override fun fly() {
        println("Утка летит")
    }

    override fun swim() {
        println("Утка плывет")
    }
}

fun main() {
    Crucian().swim()
    Duck().fly()
    Duck().swim()
    Gull().fly()
    Gull().swim()
}