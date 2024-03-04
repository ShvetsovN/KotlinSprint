package org.example.lesson_1.lesson_7

fun main() {

    val digitRange = 1000..9999

    do {
        val autorizationCode = digitRange.random()

        println("Ваш код авторизации $autorizationCode")

        println("Введите полученный ранее код: ")

        val isCodeConfirmation: Boolean

        if (readln().toInt() == autorizationCode) {
            isCodeConfirmation = false
            println("Добро пожаловать!")
        } else {
            isCodeConfirmation = true
            println("Попробуйте еще раз")
        }
    } while (isCodeConfirmation)

}