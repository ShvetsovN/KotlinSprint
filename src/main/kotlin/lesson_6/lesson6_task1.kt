package org.example.lesson_1.lesson_6

fun main() {

    var isAuthorization = true

    println("Задайте логин: ")
    val userName = readln()

    println("Отлично, теперь пароль: ")
    val userPassword = readln()

    println("Регистрация пройдена, введите еще раз логин и пароль для подтверждения: ")

    while (isAuthorization) {
        println("Введите логин для авторизации: ")
        val userRegistrationName = readln()
        println("Введите пароль для авторизации: ")
        val userRegistrationPassword = readln()
        when {
            userRegistrationPassword == userPassword &&
                    userRegistrationName == userName -> isAuthorization = false

            else -> {
                println("Вы ввели не верные данные")
                isAuthorization = true
            }
        }
    }
    println("Авторизация прошла успешно")
}
