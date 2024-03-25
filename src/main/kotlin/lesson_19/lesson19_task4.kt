package org.example.lesson_1.lesson_19

fun main() {

    val tank194 = Tank194()
    tank194.makeAShot()
    tank194.equipArms(Patron.BLUE)
    tank194.makeAShot()
    tank194.equipArms(Patron.RED)
    tank194.makeAShot()

}

enum class Patron(private val dmg: Int) {
    EMPTY(0),
    BLUE(5),
    GREEN(10),
    RED(20);

    fun getPatronType(): String {
        return when (this) {
            BLUE -> "Синие патроны наносят $dmg единиц урона."
            GREEN -> "Зеленые патроны наносят $dmg единиц урона."
            RED -> "Красные патроны наносят $dmg единиц урона."
            else -> "Патроны отсутствуют."
        }
    }
}

class Tank194 {
    private var patron: Patron = Patron.EMPTY
    fun equipArms(currentPatron: Patron) {
        patron = currentPatron
        println("Танк заряжен ${currentPatron.name} патронами.\n")
    }

    fun makeAShot() {
        if (patron == Patron.EMPTY) println("Танк не может стрелять. ${patron.getPatronType()}\n")
        else {
            println("Танк стреляет. ${patron.getPatronType()}")
            patron = Patron.EMPTY
            println(patron.getPatronType())
        }
    }
}

