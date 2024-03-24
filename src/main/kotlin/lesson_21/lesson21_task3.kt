package org.example.lesson_1.lesson_21

fun main(){
    val player213 = Player213("Ольх", 2, 12)
    println(player213.isHealthy())
}

fun Player213.isHealthy() = currentHp == maxHp

class Player213(
    val name: String,
    var currentHp: Int,
    val maxHp: Int,
)