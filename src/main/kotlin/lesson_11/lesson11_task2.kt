package org.example.lesson_1.lesson_11

fun main() {

    val user1 = User2(
        id = 1,
        login = "Отто",
        password = "Фон",
        email = "Бисмарк@мейл.не",
    )

    user1.displayUserData(user1)
    user1.countAndWriteBio()
    user1.displayUserData(user1)
    user1.changePassword()
    user1.displayUserData(user1)

}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "существо",
) {

    fun displayUserData(user: User2) {
        println("ID: $id, Login: $login, Password: $password, Email: $email, Bio: $bio")
    }

    fun countAndWriteBio() {
        println("Введите новые данные для поля bio:")
        bio = readln()
    }

    fun changePassword() {
        println("Введите пароль: ")
        val enteringPassword = readln()

        if (enteringPassword.equals(password, true)) {
            println("Введите новый пароль: ")
            password = readln()

            println("Ваш пароль изменен")

        } else println("Вы ввели неверный пароль")
    }
}