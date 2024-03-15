package org.example.lesson_1.lesson_17

fun main() {
    val folder1731 = Folder173("Первая", 15, false)

    folder1731.getName()
    folder1731.setIsSecret(true)
    folder1731.getName()

}

class Folder173(
    private var name: String,
    private var numberOfFolders: Int,
    private var isSecret: Boolean,
) {
    fun getName(): String {
        if (isSecret == false) {
            return println("Имя папки: ${name}, количество файлов - ${getNumberOfFolders()}").toString()
        } else {
            return println("Скрытая папка, количество файлов - 0").toString()
        }
    }

    fun setName(newName: String) {
        name = newName
    }

    fun getNumberOfFolders(): Int = numberOfFolders
    fun setNumberOfFolders(newNumber: Int) {
        numberOfFolders = newNumber
    }

    fun getIsSecret(): Boolean = isSecret
    fun setIsSecret(newFlag: Boolean) {
        isSecret = newFlag
    }
}