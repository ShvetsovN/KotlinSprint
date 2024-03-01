package org.example.lesson_1.lesson_5

import kotlin.random.Random

const val NUMBER_MIN = 0
const val NUMBER_MAX = 42
const val AMOUNT_OF_NUMBER = 3

fun main() {

    val winningNumber = List(3) {Random.nextInt(NUMBER_MIN, NUMBER_MAX)}.toMutableList()
    val userNumber = mutableListOf<Int>()
    val winningNumberText = "Загаданные числа это - ${winningNumber[0]}, ${winningNumber[1]}, ${winningNumber[2]}"

    for(i in 1 .. 3) {
        println("Добро пожаловать в лотерею удачи! Необходимо ввести $AMOUNT_OF_NUMBER числа от $NUMBER_MIN до $NUMBER_MAX. Введите $i число: ")
        userNumber.add(readln().toInt())
    }

    val result = userNumber.intersect(winningNumber.toSet()).toList()

    when(result.size){
        3 -> println("Вы угадали три числа! Вы выиграли Джекпот! $winningNumberText")
        2 -> println("Вы угадали два числа! Вы выиграли крупный приз! $winningNumberText")
        1 -> println("Вы угадали одно три числа! Вы выиграли утишительный приз! $winningNumberText")
        else -> println("Вы не угадали ни одного числа! $winningNumberText")
    }

}