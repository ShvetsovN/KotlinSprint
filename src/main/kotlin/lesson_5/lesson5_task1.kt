package org.example.lesson_1.lesson_5

fun main() {

    println("Здравствуйте! Введите 2 числа так, чтобы их сумма была больше 10: ")
    println(if ((readln().toInt() + readln().toInt()) >= 10) "Добро пожаловать!" else "Доступ закрыт!")

}
