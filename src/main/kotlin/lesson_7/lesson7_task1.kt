package org.example.lesson_1.lesson_7

fun main() {

    var generatedPassword = ""
    val charArray = 'a'..'z'
    val numberArray = 0..9

    for (i in 0..2) generatedPassword += "${numberArray.random()}" +
            "${charArray.random()}"

    println(generatedPassword)

}