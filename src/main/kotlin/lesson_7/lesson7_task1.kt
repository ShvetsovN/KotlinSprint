package org.example.lesson_1.lesson_7

import kotlin.random.Random

fun main() {

    var generatedPassword = ""

    for (i in 0..2) generatedPassword += "${Random.nextInt(0, 9)}" +
            "${Random.nextInt(97, 122).toChar()}"

    println(generatedPassword)

}