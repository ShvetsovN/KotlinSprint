package org.example.lesson_1.lesson_18

fun main() {

    val boxCubic184 = BoxCubic184(5)
    val boxRectangular184 = BoxRectangular184(5, 2, 4)
    println(boxCubic184.calculateArea())
    println(boxRectangular184.calculateArea())

}

class BoxCubic184(
    private val length: Int,
) : Parcel() {
    override fun calculateArea(): Int {
        println("Коробка кубическая. Площадь: ")
        return (6 * length * length)
    }
}

class BoxRectangular184(
    private val length: Int,
    private val width: Int,
    private val height: Int,
) : Parcel() {
    override fun calculateArea(
    ): Int {
        println("Коробка параллелепипед. Площадь: ")
        return (2 * length * width + length * height + width * height)
    }
}

abstract class Parcel {
    abstract fun calculateArea(): Int
}
