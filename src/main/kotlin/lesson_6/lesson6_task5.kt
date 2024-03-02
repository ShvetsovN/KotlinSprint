package org.example.lesson_1.lesson_6

import kotlin.random.Random

fun main() {

    var counter65 = 3

    println("Решите уравнение и докажите что вы не бот: ")

    while (counter65 > 0) {
        val secretNumber = Random.nextInt(0, 100)
        println("Введите 2 числа чтобы сумма была равна: $secretNumber")
        println("Введите 1 число: ")
        val numberOne65 = readln().toInt()
        println("Введите 2 число: ")
        val numberTwo65 = readln().toInt()

        when {
            numberOne65 + numberTwo65 == secretNumber -> {
                counter65 = 0
                println("Добро пожаловать!")
            }

            else -> {
                if(counter65 == 3 || counter65 == 2) {
                    counter65--
                    println("Попробуйте еще раз. Осталось $counter65 попыток")
                } else if (counter65 == 1) {
                    counter65 = 0
                    println("Осталось $counter65 попыток. Доступ запрещен")
                }
            }
        }
    }
}
