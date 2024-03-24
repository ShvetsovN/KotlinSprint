package org.example.lesson_1.lesson_20

fun main(){

    val player203 = Player203("Эрик Невезучий", false)
    val openTheDoor: (Player203) -> String = {
        if (it.isThereAKey == false) "Дверь заперта"
        else "Дверь открыта"
    }
    println(openTheDoor(player203))

}

class Player203(
    val name: String,
    val isThereAKey: Boolean,
)
