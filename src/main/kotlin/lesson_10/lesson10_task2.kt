package org.example.lesson_1.lesson_10

fun main() {

    println("Добро пожаловать!")
    println("Введите логин: ")

    val userLogin = readln()

    println("Введите пароль: ")

    val userPass = readln()

    validateLoginAndPassword(userLogin, userPass)

}

fun validateLoginAndPassword(userLogin: String, userPass: String) {
    if (userLogin.length < 4 || userPass.length < 4) println("Логин или пароль недостаточно длинные")
    else println("Добро пожаловать!")
}