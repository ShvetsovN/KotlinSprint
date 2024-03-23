package org.example.lesson_1.lesson_19

fun main() {

    val tank194 = Tank194()
    tank194.Shoot()
    tank194.Weapon(Patron.BLUE)
    tank194.Shoot()
    tank194.Weapon(Patron.RED)
    tank194.Shoot()

}

enum class Patron(val dmg: Int) {
    EMPTY(0) {
        override fun getPatronType(): String {
            return "Патроны отсутсвуют"
        }

    },
    BLUE(5) {
        override fun getPatronType(): String {
            return "Синие патроны наносят $dmg единиц урона"
        }
    },
    GREEN(10) {
        override fun getPatronType(): String {
            return "Зеленые патроны наносят $dmg единиц урона"
        }
    },
    RED(20) {
        override fun getPatronType(): String {
            return "Красные патроны наносят $dmg единиц урона"
        }
    };

    abstract fun getPatronType(): String
}

class Tank194 {
    private var currentPatron: Patron = Patron.EMPTY

    fun Weapon(patron: Patron) {
        currentPatron = patron
        println("Танк заряжен ${currentPatron.name} патронами.")
    }

    fun Shoot() {
        when (currentPatron) {
            Patron.BLUE -> println("Танк стреляет. ${Patron.BLUE.getPatronType()}")
            Patron.GREEN -> println("Танк стреляет. ${Patron.GREEN.getPatronType()}")
            Patron.RED -> println("Танк стреляет. ${Patron.RED.getPatronType()}")
            else -> println(Patron.EMPTY.getPatronType())
        }
    }
}

