package org.example.lesson_1.lesson_6

fun main() {

    println("Задайте логин: ")
    val userName = readln()

    println("Отлично, теперь пароль: ")
    val userPassword = readln()

    println("Регистрация пройдена, введите еще раз логин и пароль для подтверждения: ")

    do {
        println("Введите логин для авторизации: ")
        val userRegistrationName = readln()
        println("Введите пароль для авторизации: ")
        val userRegistrationPassword = readln()

        when {
            userRegistrationPassword != userPassword ||
                    userRegistrationName != userName -> println("Вы ввели не верные данные")

            else -> println("Авторизация прошла успешно")
        }

    } while (userRegistrationPassword != userPassword && userRegistrationName != userName)

}