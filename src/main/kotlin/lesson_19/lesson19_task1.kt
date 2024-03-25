package org.example.lesson_1.lesson_19

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun main(){

    for (i in Fish.entries) println("Вы можете добавить в свой аквариум: $i")

}
