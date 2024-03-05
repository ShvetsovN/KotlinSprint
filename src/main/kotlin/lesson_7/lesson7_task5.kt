package org.example.lesson_1.lesson_7

fun main() {

    var numberOfPasswordSymbols: Int
    val lowercaseLetterForPass = 'a'..'z'
    val uppercaseLetterForPass = 'A'..'Z'
    val numbersForPass = 0..9
    val requiredCharacters = ('a'..'z') + ('A'..'Z') +
            (0..9)
    var generatedNewPassword = ""

    println("Добро пожаловать! Введите какой длинны пароль вы бы хотели (не меньше 6): ")

    do {
        numberOfPasswordSymbols = readln().toInt()
    } while (numberOfPasswordSymbols < 6)

    generatedNewPassword += lowercaseLetterForPass.random()
    generatedNewPassword += uppercaseLetterForPass.random()
    generatedNewPassword += numbersForPass.random()

    for (i in 4..numberOfPasswordSymbols) {
        generatedNewPassword += requiredCharacters.random()
    }
    val nextGeneratedPassword = generatedNewPassword.toList().shuffled()

    println("Вот ваш новый пароль: ${nextGeneratedPassword.joinToString("")}")

}