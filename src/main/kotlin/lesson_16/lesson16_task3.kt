package org.example.lesson_1.lesson_16

fun main(){

    val user163 = User163()
    println(user163.checkPassword("Огурчик"))

}

class User163 {
    val login = "Мистер Пиклз"
    private val password = "Пикуль"

    fun checkPassword(pass: String) = pass.equals(password, true)
}