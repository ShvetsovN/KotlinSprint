package org.example.lesson_1.lesson_2

const val BUFF = 0.20f

fun main(){

    val cristalOre = 7
    val ironOre = 11

    println("Количество бонусных материалов кристалической руды - ${(cristalOre * BUFF).toInt()}")
    println("Количество бонусных материалов железной руды - ${(ironOre * BUFF).toInt()}")

}