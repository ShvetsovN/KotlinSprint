package org.example.lesson_1.lesson_6

fun main() {

    var counter65 = 3

    println("Решите уравнение и докажите что вы не бот.")
    while (counter65 > 0) {
        val secretNumber = (1..9).random()
        println("Введите два числа что их сумма была равна: $secretNumber. Количество попыток: $counter65")

        println("Введите первое число: ")
        val userInputOne = readln().toInt()

        println("Введите второе число: ")
        val userInputTwo = readln().toInt()

        if ((userInputOne + userInputTwo) == secretNumber) {
            println("Добро пожаловать!")
            return
        } else println("Попробуйте еще раз, у вас осталось ${--counter65} попыток")
    }

    println("Доступ запрещен")

}