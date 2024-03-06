package org.example.lesson_1.lesson_10

fun main() {

    println("Добро пожаловать! Введите длину желаемого пароля: ")

    val passwordLength = readln().toInt()
    createAPassword(passwordLength)

}

fun createAPassword(passwordLength: Int): String {
    val numberForPass = 0..9
    val symbolsForPass: CharRange = ' '..'/'
    var generatePassword = ""

    for (i in 0 until (passwordLength / 2)) {
        generatePassword += numberForPass.random()
        generatePassword += symbolsForPass.random()
    }
    if (passwordLength % 2 != 0) generatePassword += numberForPass.random()

    println("Новый пароль сгенерирован: $generatePassword")

    return generatePassword
}