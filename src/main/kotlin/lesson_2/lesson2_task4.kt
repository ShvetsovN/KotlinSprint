package org.example.lesson_1.lesson_2

fun main(){

    val buffInPercent= 20
    val cristalOre = 7
    val ironOre = 11

    println("Количество бонусных материалов кристалической руды - ${(cristalOre * (buffInPercent/100f)).toInt()}")
    println("Количество бонусных материалов железной руды - ${(ironOre * (buffInPercent/100f)).toInt()}")

}