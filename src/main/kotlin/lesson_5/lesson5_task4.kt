package org.example.lesson_1.lesson_5

const val USER_NAME = "Zaphod"
const val USER_PASSWORD = "PanGalactic"

fun main() {

    println("Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля \"Heart of Gold\".")
    println("[вздыхает...] Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа.")
    val userName = readln()
    if (userName == USER_NAME) {
        println("[вздыхает ещё глубже...] Да, вперед, пожалуйста, вводите теперь пароль...")
        val userPassword = readln()
        if (userPassword == USER_PASSWORD) {println(
            "Ваши данные проверены, и о, чудо, они верны... " +
                    "Пользователь \"Zaphod\", вам разрешено входить на борт корабля \"Heart of Gold\""
        )} else println("Какая досада, хотя этого следовало ожидать...Попробуйте пройти регистрацию")
    } else println("Пожалуйста пройдите регистрацию")

}