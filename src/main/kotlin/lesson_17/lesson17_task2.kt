package org.example.lesson_1.lesson_17

fun main(){

    val ship1721 = Ship172("Утюг", 15, "Инсмут")
    println(ship1721.getName())

    ship1721.setName("Топор")
    println(ship1721.getName())

}

class Ship172(
    private val name: String,
    private var averageSpeed: Int,
    private var homePort: String,
) {

    fun getName(): String = name
    fun setName(newName : String) {
        println("Изменить имя корабле невозможно")
    }

    fun getAverageSpeed(): Int = averageSpeed
    fun setAverageSpeed(newSpeed: Int) {
        averageSpeed = newSpeed
    }

    fun getHomePort() : String = homePort
    fun setHomePort(newPort: String) {
        homePort = newPort
    }
}