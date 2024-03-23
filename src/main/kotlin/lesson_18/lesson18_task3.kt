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
    name: String,
) {
    abstract fun eat(food: String)
    abstract fun play()
    abstract fun sleep()
}

class Fox(
    private val name: String,
) : Animal(name) {
    override fun eat(food: String) {
        println("$name ест $food")
    }

    override fun play() {
        println("$name - играет")
    }

    override fun sleep() {
        println("$name - спит")
    }
}

class Dog(
    private val name: String,
) : Animal(name) {
    override fun eat(food: String) {
        println("$name ест $food")
    }

    override fun play() {
        println("$name - играет")
    }

    override fun sleep() {
        println("$name - спит")
    }
}

class Cat(
    private val name: String,
) : Animal(name) {
    override fun eat(food: String) {
        println("$name ест $food")
    }

    override fun play() {
        println("$name - играет")
    }

    override fun sleep() {
        println("$name - спит")
    }
}
