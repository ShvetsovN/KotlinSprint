package org.example.lesson_1.lesson_10

fun main() {

    var counter = 0

    println("Добро пожаловать в игру \"Кости\"")

    do {
        val computerDiceRoll = rollTheDice()
        val humanDiceRoll = rollTheDice()

        println("Бросает человек! Выпало число: $humanDiceRoll")
        println("Бросают машины! Выпало число: $computerDiceRoll")

        when {
            humanDiceRoll > computerDiceRoll -> {
                println("Победило человечество")
                counter++
            }

            humanDiceRoll < computerDiceRoll -> println("Победила машина")
            else -> println("Ничья")
        }

        println("Хотите бросить кости еще раз? Введите Да или Нет: ")

    } while (holdARound(counter))

}

fun rollTheDice() = (1..6).random()

fun holdARound(counter: Int): Boolean {
    var isContinue = true
    val userInput = readln()
    if (userInput.equals("да", true)) {
        rollTheDice()
    } else {
        isContinue = false
        println("Игра окончена, человечество победило $counter раз. Поздравляем!")
    }
    return isContinue
}