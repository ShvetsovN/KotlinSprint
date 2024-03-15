package org.example.lesson_1.lesson_14

const val WHITE_COLOR = "Белый"
const val BLACK_COLOR = "Черный"

fun main() {

    val circle1431 = Circle(WHITE_COLOR, 6.0)
    val circle1432 = Circle(BLACK_COLOR, 3.0)

    val rectangle1431 = Rectangle(BLACK_COLOR, 2.0, 4.0)
    val rectangle1432 = Rectangle(WHITE_COLOR, 3.0, 2.0)

    val listOfFigure = listOf(circle1431, circle1432, rectangle1431, rectangle1432)

    val blackPerimeterSum = listOfFigure.filter { it.color == BLACK_COLOR }.sumOf { it.calculatePerimeter() }
    val whiteAreaSum = listOfFigure.filter { it.color == WHITE_COLOR }.sumOf { it.calculatePerimeter() }

    println("Сумма периметров всех черных фигур: $blackPerimeterSum")
    println("Сумма площадей всех белых фигур: $whiteAreaSum")
}


abstract class Figure(
    val color: String,
) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {

    override fun calculateArea() = Math.PI * Math.pow(radius, 2.0)

    override fun calculatePerimeter() = 2.0 * Math.PI * radius

}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {

    override fun calculateArea() = width * height

    override fun calculatePerimeter() = 2 * (width + height)

}