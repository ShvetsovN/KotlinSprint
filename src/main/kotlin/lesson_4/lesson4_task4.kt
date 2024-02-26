package org.example.lesson_1.lesson_4

fun main(){

    var trainingDay = 4
    val handExercises = trainingDay%2 != 0
    val legExercises = trainingDay%2 == 0
    val backExercises = trainingDay%2 == 0
    val absExercises = trainingDay%2 != 0

    println("""
        Сегодня $trainingDay день упражнений, а значит мы делаем - 
        Упражнения для рук:    $handExercises
        Упражнения для ног:    $legExercises
        Упражнения для спины:  $backExercises
        Упражнения для пресса: $absExercises  
    """.trimIndent())

}