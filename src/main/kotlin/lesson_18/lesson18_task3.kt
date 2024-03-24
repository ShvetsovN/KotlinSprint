package org.example.lesson_1.lesson_18

fun main() {

    val fox: Animal = Fox("Лисыч")
    val dog: Animal = Dog("Собакен")
    val cat: Animal = Cat("Котофей")

    fox.eat("ягоды")
    dog.eat("кости")
    cat.eat("рыбу")
    println()

    fox.play()
    dog.play()
    cat.play()
    println()

    fox.sleep()
    dog.sleep()
    cat.sleep()

}

abstract class Animal(
    private val name: String,
) {
    fun eat(food: String) {
        println("$name ест $food")
    }
    fun play() {
        println("$name - играет")
    }
    fun sleep() {
        println("$name - спит")
    }
}

class Fox(
    private val name: String,
) : Animal(name)

class Dog(
    private val name: String,
) : Animal(name)

class Cat(
    private val name: String,
) : Animal(name)

