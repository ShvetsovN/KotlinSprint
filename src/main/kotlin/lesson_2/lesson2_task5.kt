package org.example.lesson_1.lesson_2

import kotlin.math.pow

fun main() {

    val initialDeposit = 70000
    val percentForYear = 16.7
    val depositPeriodYears = 20

    val finalContribution = initialDeposit * (1 + percentForYear / 100).pow(depositPeriodYears)

    println("%.3f".format(finalContribution))

}