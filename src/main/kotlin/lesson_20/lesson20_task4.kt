package org.example.lesson_1.lesson_20

fun main(){
    val listOfString204 = listOf("1", "в", "2", "зимнюю", "3", "я", "4", "лесу", "5")
    val newListOfString204 = listOfString204.mapIndexed { index, element ->
        if (index % 2 == 0) println("Нажат элемент: $element, c индексом: $index")
    }
}