package org.example.lesson_1.lesson_14

fun main() {

    val circle1431 = Circle("Белый", 6.0)
    val circle1432 = Circle("Черный", 3.0)

    val rectangle1431 = Rectangle("Черный", 2.0, 4.0)
    val rectangle1432 = Rectangle("Белый", 3.0, 2.0)

    val listOfFigure = listOf(circle1431, circle1432, rectangle1431, rectangle1432)

    val blackPerimeterSum = listOfFigure.filter { it.color == "Черный" }.sumOf { it.calculatePerimeter() }
    val whiteAreaSum = listOfFigure.filter { it.color == "Белый" }.sumOf { it.calculatePerimeter() }

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