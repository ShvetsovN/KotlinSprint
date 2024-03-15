package org.example.lesson_1.lesson_15

fun main() {

    val crucianCarp = CrucianCarp()
    crucianCarp.floats()
    val gull = Gull()
    gull.flies()
    val duck = Duck()
    duck.floats()
    duck.flies()

}

class Duck() : Floats, Flies {

    override fun flies() {
        println("Я утка значит я могу летать")
    }

    override fun floats() {
        println("Я утка значит я могу плавать")
    }

}


class Gull() : Flies {

    override fun flies() {
        println("Я чайка и я могу летать")
    }

}

class CrucianCarp : Floats {

    override fun floats() {
        println("Я карп значит я могу плавать")
    }

}

interface Flies {

    fun flies()

}

interface Floats {

    fun floats()

}