package org.example.lesson_1.lesson_11

fun main() {

    val essense1 = Essense(
        nickname = "Мистер Пиклз",
        avatar = "Пикуль"
    )

    val someRoom1 = SomeRoom(
        cover = "Красивая картинка",
        name = "Комната общения",
    )

    someRoom1.userAdd(someRoom1, essense1)
    someRoom1.updateStatus(essense1)
    someRoom1.infoUsers(essense1)

}

class Essense(
    val nickname: String,
    var status: String = "пользователь заглушен",
    val avatar: String,
) {
}

class SomeRoom(
    val cover: String,
    val name: String,
    val listOfUsers: HashSet<String> = hashSetOf(),
) {

    fun userAdd(room: SomeRoom, user: Essense) {
        println("Добро пожаловать ${user.nickname}! ")
        listOfUsers.add(user.nickname)
        println(
            "В комнате \"${room.cover}\", c названием \"${room.name}\" теперь ${room.listOfUsers}!"
        )
    }

    fun updateStatus(user: Essense) {
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

    fun infoUsers(user: Essense) {
        println("После 2х секундного нажатия на аватарку выводиться сообщение: \n" +
                "Имя пользователя: ${user.nickname}, статус: ${user.status}, аватар: ${user.avatar}")
    }
}