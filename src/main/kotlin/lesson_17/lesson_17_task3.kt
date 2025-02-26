package org.example.lesson_17

class Folder(
    name: String,
    fileCount: Int = 0,
    var isSecret: Boolean = false,
) {
    var name: String = name
        get() = if (isSecret) "скрытая папка"
        else field

    var fileCount: Int = fileCount
        get() = if (isSecret) 0
        else field
}

fun main() {
    val folder = Folder("Фото", 10, true)
    println(folder.name)
    println(folder.fileCount)
}