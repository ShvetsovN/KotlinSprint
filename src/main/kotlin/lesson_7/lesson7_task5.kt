package org.example.lesson_1.lesson_7

fun main() {

    var numberOfPasswordSymbols: Int
    val requiredCharacters = ('a'..'z') + ('A'..'Z') +
                (0..9)
    val optionalCharacters = ('!'..'/') + (':'..'@') + ('['..'`')
    var generatedNewPassword = ""

    println("Добро пожаловать! Введите какой длинны пароль вы бы хотели (не меньше 6): ")

    do {
        numberOfPasswordSymbols = readln().toInt()
    } while (numberOfPasswordSymbols < 6)

    for (i in 0 until numberOfPasswordSymbols) {
        if (i in 0..5) generatedNewPassword += requiredCharacters.random()
        if (i in 6..numberOfPasswordSymbols) generatedNewPassword += optionalCharacters.random()
    }

    println("Вот ваш новый пароль: $generatedNewPassword")

}