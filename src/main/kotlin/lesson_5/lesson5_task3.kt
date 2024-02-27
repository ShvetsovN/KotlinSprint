package org.example.lesson_1.lesson_5

const val WINNING_NUMBER_ONE = 13
const val WINNING_NUMBER_TWO = 6

fun main() {

    println("Добро пожаловать в лотерею удачи! Необходимо ввести 2 числа от 0 до 42. Введите первое число: ")
    var numberOne = readln().toInt()
    if (numberOne < 0) {
        println("Ай ай, просили же от 0 до 42, теперь первое число будет 0")
        numberOne = 0
    } else if (numberOne > 42) {
        println("Ай ай, просили же от 0 до 42, теперь первое число будет 42")
        numberOne = 42
    }
    println("Вы ввели число: $numberOne")

    println("Введите второе число: ")
    var numberTwo = readln().toInt()
    if (numberTwo < 0) {
        println("Ай ай, просили же от 0 до 42, теперь второе число будет 0")
        numberTwo = 0
    } else if (numberTwo > 42) {
        println("Ай ай, просили же от 0 до 42, теперь втрое число будет 42")
        numberTwo = 42
    }
    println("Вы ввели число: $numberTwo")

    val result = when {
        (numberOne == WINNING_NUMBER_ONE && numberTwo == WINNING_NUMBER_TWO)
                || (numberOne == WINNING_NUMBER_TWO && numberTwo == WINNING_NUMBER_ONE) -> "Вы выиграли главный приз!"

        (numberOne == WINNING_NUMBER_ONE || numberTwo == WINNING_NUMBER_TWO)
                || (numberOne == WINNING_NUMBER_TWO || numberTwo == WINNING_NUMBER_ONE) -> "Вы выиграли утешительный приз! \nВыиграшные числа это 13 и 6"

        else -> "Неудача! \nВыиграшные числа это 13 и 6"
    }

    println(result)

}