package org.example.lesson_1.lesson_20

fun main() {
    val player202 = Player202("Герберт Великолепный", 16, 20);
    val healthToMaxLambda: (Player202) -> String = {
        println("${it.name} ранен. Текущее здоровье равно: ${it.currentHp}")
        it.currentHp = it.maxHp
        "${it.name} собрал баночку лечения и восстановил здоровье до максимума. Текущее здоровье равно: ${it.currentHp}"
    }
    println(healthToMaxLambda(player202))

}

class Player202(
    val name: String,
    var currentHp: Int,
    val maxHp: Int,
)
