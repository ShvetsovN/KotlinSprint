package org.example.lesson_1.lesson_18

fun main(){

    val box184 = Box184()
    println(box184.calculateArea(5))
    println(box184.calculateArea(5,6,2))

}

class Box184 {

    fun calculateArea(
        length: Int,
    ): Int {
        println("Коробка кубическая. Площадь: ")
        return (6 * length * length)
    }

    fun calculateArea(
        length: Int,
        width: Int,
        height: Int,
    ): Int {
        println("Коробка параллелепипед. Площадь: ")
        return (2 * length * width + length * height + width * height)
    }
}