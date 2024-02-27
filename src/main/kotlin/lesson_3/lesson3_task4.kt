package org.example.lesson_1.lesson_3

fun main(){
    var startingPosition = "E2"
    var finalPosition = "E4"
    var moveNumber = 1

    var result = "Ход черных: $startingPosition - $finalPosition; ${moveNumber++}"
    println(result)

    startingPosition = "D2"
    finalPosition = "D3"

    result = "Ход белых: $startingPosition - $finalPosition; ${moveNumber++}"
    println(result)
}