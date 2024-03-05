package org.example.lesson_1.lesson_5

const val WINNING_NUMBER_ONE_53 = 13
const val WINNING_NUMBER_TWO_53 = 6

const val NUMBER_MIN_53 = 0
const val NUMBER_MAX_53 = 42

fun main() {

    println("Добро пожаловать в лотерею удачи! Необходимо ввести 2 числа от 0 до 42. Введите первое число: ")
    var numberOne = readln().toInt()
    if (numberOne < NUMBER_MIN_53) {
        println("Ай ай, просили же от 0 до 42, теперь первое число будет 0")
        numberOne = NUMBER_MIN_53
    } else if (numberOne > NUMBER_MAX_53) {
        println("Ай ай, просили же от 0 до 42, теперь первое число будет 42")
        numberOne = NUMBER_MAX_53
    }
    println("Вы ввели число: $numberOne")

    println("Введите второе число: ")
    var numberTwo = readln().toInt()
    if (numberTwo < NUMBER_MIN_53) {
        println("Ай ай, просили же от 0 до 42, теперь второе число будет 0")
        numberTwo = NUMBER_MIN_53
    } else if (numberTwo > NUMBER_MAX_53) {
        println("Ай ай, просили же от 0 до 42, теперь втрое число будет 42")
        numberTwo = NUMBER_MAX_53
    }
    println("Вы ввели число: $numberTwo")

    val result = when {
        numberOne == WINNING_NUMBER_ONE_53 && numberTwo == WINNING_NUMBER_TWO_53 ||
                numberOne == WINNING_NUMBER_TWO_53 && numberTwo == WINNING_NUMBER_ONE_53 -> "Вы выиграли главный приз!"

        numberOne == WINNING_NUMBER_ONE_53 || numberTwo == WINNING_NUMBER_TWO_53 ||
                numberOne == WINNING_NUMBER_TWO_53 || numberTwo == WINNING_NUMBER_ONE_53 -> "Вы выиграли утешительный приз! \n" +
                "Выиграшные числа это $WINNING_NUMBER_ONE_53 и $WINNING_NUMBER_TWO_53"

        else -> "Неудача! \nВыиграшные числа это $WINNING_NUMBER_ONE_53 и $WINNING_NUMBER_TWO_53"
    }

    println(result)

}