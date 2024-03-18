package org.example.lesson_1.lesson_16

fun main() {

    val circle1621 = Circle(3.0)
    println("Площадь круга ${circle1621.area()}, длина окружности ${circle1621.perimeter()}")

}

const val PI = 3.14

class Circle(
    private val radius: Double,
) {
    fun area() = PI * radius * radius
    fun perimeter() = 2 * PI * radius
}