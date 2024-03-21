package org.example.lesson_1.lesson_17

fun main() {
    val folder1731 = Folder173("Первая", 15, false)

    folder1731.name
    folder1731.isSecret = true
    folder1731.name

}

class Folder173(
    _name: String,
    _numberOfFolders: Int,
    _isSecret: Boolean,
) {

    val name: String = _name
        get() = if (isSecret == false) println("Имя папки: ${field}, количество файлов - $numberOfFolders").toString()
        else println("Скрытая папка, количество файлов - 0").toString()

    var numberOfFolders: Int = _numberOfFolders
        get() = field
        set(value) {
            field = value
        }

    var isSecret = _isSecret
        get() = field
        set(value) {
            field = value
        }
}