package org.example.lesson_1.lesson_16

fun main(){

    val circle1621 = Circle(3.0)
    println("Площадь круга ${circle1621.area()}, длина окружности ${circle1621.perimeter()}")

}

class Circle(
    private val radius: Double,
) {

    private val pi = 3.14

    fun area() = pi * radius * radius
    fun perimeter () = 2 * pi * radius

}