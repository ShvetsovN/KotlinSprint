package org.example.lesson_1.lesson_7

fun main(){

    println("Добро пожаловать! Введите, пожалуйста, число: ")
    val userInput = readln().toInt()

    for(i in 0..userInput){
        if(i%2 == 0) print("$i ")
    }

}