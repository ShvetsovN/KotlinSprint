package org.example.lesson_1.lesson_5

const val WINNING_NUMBER_ONE = 13
const val WINNING_NUMBER_TWO = 6
const val WINNING_NUMBER_THREE = 17

const val NUMBER_MIN = 0
const val NUMBER_MAX = 42

fun main() {

    println("Добро пожаловать в лотерею удачи! Необходимо ввести 2 числа от 0 до 42. Введите первое число: ")
    var numberOne = readln().toInt()
    if (numberOne < NUMBER_MIN) {
        println("Ай ай, просили же от 0 до 42, теперь первое число будет 0")
        numberOne = NUMBER_MIN
    } else if (numberOne > NUMBER_MAX) {
        println("Ай ай, просили же от 0 до 42, теперь первое число будет 42")
        numberOne = NUMBER_MAX
    }
    println("Вы ввели число: $numberOne")

    println("Введите второе число: ")
    var numberTwo = readln().toInt()
    if (numberTwo < NUMBER_MIN) {
        println("Ай ай, просили же от 0 до 42, теперь второе число будет 0")
        numberTwo = NUMBER_MIN
    } else if (numberTwo > NUMBER_MAX) {
        println("Ай ай, просили же от 0 до 42, теперь втрое число будет 42")
        numberTwo = NUMBER_MAX
    }
    println("Вы ввели число: $numberTwo")

    val result = when {
        (numberOne == WINNING_NUMBER_ONE && numberTwo == WINNING_NUMBER_TWO)
                || (numberOne == WINNING_NUMBER_TWO && numberTwo == WINNING_NUMBER_ONE) -> "Вы выиграли главный приз!"

        (numberOne == WINNING_NUMBER_ONE || numberTwo == WINNING_NUMBER_TWO)
                || (numberOne == WINNING_NUMBER_TWO || numberTwo == WINNING_NUMBER_ONE) -> "Вы выиграли утешительный приз! \nВыиграшные числа это $WINNING_NUMBER_ONE и $WINNING_NUMBER_TWO"

        else -> "Неудача! \nВыиграшные числа это $WINNING_NUMBER_ONE и $WINNING_NUMBER_TWO"
    }

    println(result)

}