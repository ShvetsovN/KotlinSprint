package org.example.lesson_1.lesson_11

fun main() {

    val user1 = User111(
        id = 1,
        login = "Петр",
        password = "1234",
        email = "petr@redkaja.da",
    )
    val user2 = User111(
        id = 2,
        login = "Павел",
        password = "4321",
        email = "pavel@toge.da",
    )

    println("ID: ${user1.id}, Login: ${user1.login}, Password: ${user1.password}, Email: ${user1.email}")
    println("ID: ${user2.id}, Login: ${user2.login}, Password: ${user2.password}, Email: ${user2.email}")

}

class User111(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {}