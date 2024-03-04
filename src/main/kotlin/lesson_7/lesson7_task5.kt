package org.example.lesson_1.lesson_7

fun main() {

    var numberOfPasswordSymbols: Int
    val charArray = 33..134

    println("Добро пожаловать! Введите какой длинны пароль вы бы хотели (не меньше 6): ")

    do {
        numberOfPasswordSymbols = readln().toInt()
    } while (numberOfPasswordSymbols < 6)

    var generatedNewPassword = ""

    for (i in 0..numberOfPasswordSymbols) generatedNewPassword += "${charArray.random().toChar()}"

    println("Вот ваш новый пароль: $generatedNewPassword")

}