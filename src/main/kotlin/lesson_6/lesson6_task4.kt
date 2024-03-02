package org.example.lesson_1.lesson_6

import kotlin.random.Random

fun main() {

    println("Добро пожаловать в игру \"Угадай число!\". Попробуйте угадать число от 1 до 9")
    val secretNumber = Random.nextInt(1, 9)
    var counter2 = 5

    do {
        println("Введите ваше число: ")
        val userChoice = readln().toInt()
        when{
           userChoice == secretNumber -> {
               counter2 = 0
               println("Это была великолепная игра!")
           }
            userChoice != secretNumber -> {
                counter2--
                println("Неверно, осталось $counter2 попыток")
            }
        }
    } while (counter2 > 0)

    println("Было загадано число $secretNumber")

}