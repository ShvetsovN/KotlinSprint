package org.example.lesson_1.lesson_11

fun main() {

    val essense1 = Essense(
        id = 1,
        nickname = "Мистер Пиклз",
        avatar = "Пикуль"
    )

    val someRoom1 = SomeRoom(
        cover = "Красивая картинка",
        name = "Комната общения",
    )

    println("Добро пожаловать ${essense1.nickname}! Желаете посетить комнату?")
    if (readln().equals("да", true)) {
        someRoom1.userAdd(someRoom1, essense1)
    }

    println("Желаете обновить ваш статус ${essense1.nickname}?")
    if (readln().equals("да", true)) essense1.updateStatus()

    println("Хотите узнать информацию о юзере? Нажмите на аватар на 2 секунды")
    if (readln().toInt() == 2) someRoom1.infoUsers(essense1)

}

class Essense(
    val id: Int,
    val nickname: String,
    var status: String = "пользователь заглушен",
    val avatar: String,
) {

    fun updateStatus() {
        println("Ваш статус: $status")
        println(
            """Выберите желаемый статус: 
            |1 - разговаривает
            |2 - микрофон выключен
            |иное - оставить без изменений
        """.trimMargin()
        )
        when (readln().toInt()) {
            1 -> {
                status = "разговаривает"
                println("Ваш статус обновлен на: $status")
            }

            2 -> {
                status = "микрофон выключен"
                println("Ваш статус обновлен на: $status")
            }

            else -> {
                println("Пользователь не стал менять статус: $status")
            }
        }

    }

}

class SomeRoom(
    val cover: String,
    val name: String,
    val listOfUsers: HashSet<String> = hashSetOf(),
    var statusRoom: String = "пуста",
) {

    fun userAdd(room: SomeRoom, user: Essense) {
        println("Добро пожаловать ${user.nickname}! ")
        listOfUsers.add(user.nickname)
        statusRoom = "Есть посетители"
        println(
            "В комнате \"${room.cover}\", c названием \"${room.name}\" теперь ${room.listOfUsers}! Статус комнаты изменен" +
                    "на \"$statusRoom\""
        )
    }

    fun infoUsers(user: Essense) {
        println("Если долго нажимать на аватарку то...")
        println("ID: ${user.id}, имя пользователя: ${user.nickname}, статус: ${user.status}, аватар: ${user.avatar}")
    }
}