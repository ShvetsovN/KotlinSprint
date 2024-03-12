package org.example.lesson_1.lesson_11

fun main() {

    val user1 = User(
        nickname = "Мистер Пиклз",
        avatar = "Пикуль"
    )

    val someRoom1 = SomeRoom(
        cover = "Красивая картинка",
        name = "Комната общения",
    )

    someRoom1.userAdd(someRoom1, user1)
    someRoom1.updateStatus(user1)
    someRoom1.infoUsers(user1)

}

class User(
    val nickname: String,
    var status: String = "пользователь заглушен",
    val avatar: String,
)

class SomeRoom(
    val cover: String,
    val name: String,
    val listOfUsers: MutableList<String> = mutableListOf(),
) {

    fun userAdd(room: SomeRoom, user: User) {
        println("Добро пожаловать ${user.nickname}! ")
        listOfUsers.add(user.nickname)
        println(
            "В комнате \"${room.cover}\", c названием \"${room.name}\" теперь ${room.listOfUsers}!"
        )
    }

    fun updateStatus(user: User) {
        println("Ваш статус: ${user.status}")
        println(
            """Выберите желаемый статус: 
            |1 - разговаривает
            |2 - микрофон выключен
            |иное - оставить без изменений
        """.trimMargin()
        )
        when (readln().toInt()) {
            1 -> {
                user.status = "разговаривает"
                println("Ваш статус обновлен на: ${user.status}")
            }

            2 -> {
                user.status = "микрофон выключен"
                println("Ваш статус обновлен на: ${user.status}")
            }

            else -> {
                println("Пользователь не стал менять статус: ${user.status}")
            }
        }
    }

    fun infoUsers(user: User) {
        println("После 2х секундного нажатия на аватарку выводиться сообщение: \n" +
                "Имя пользователя: ${user.nickname}, статус: ${user.status}, аватар: ${user.avatar}")
    }
}