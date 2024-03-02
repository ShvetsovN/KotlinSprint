package org.example.lesson_1.lesson_7

import kotlin.random.Random

fun main(){

    do {
        val autorizationCode = Random.nextInt(1000,9999)
        println("Ваш код авторизации $autorizationCode")
        println("Введите полученный ранее код: ")
        val isCodeConfirmation: Boolean
        if(readln().toInt() == autorizationCode) {
            isCodeConfirmation = false
            println("Добро пожаловать!")
        }
        else {
            isCodeConfirmation = true
            println("Попробуйте еще раз")
        }
    } while (isCodeConfirmation)

}