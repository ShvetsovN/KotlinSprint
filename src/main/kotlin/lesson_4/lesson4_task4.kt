package org.example.lesson_1.lesson_4

fun main(){

    var trainingDay = 1
    val isEven = trainingDay%2 == 0

    println("""
        Сегодня $trainingDay день упражнений, а значит мы делаем - 
        Упражнения для рук:    ${!isEven}
        Упражнения для ног:    $isEven
        Упражнения для спины:  $isEven
        Упражнения для пресса: ${!isEven}  
    """.trimIndent())

}