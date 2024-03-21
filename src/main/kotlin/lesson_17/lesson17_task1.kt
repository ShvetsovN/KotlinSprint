package org.example.lesson_1.lesson_17

fun main(){

    val quiz = QuizElement("Каков", "Ответ")
    println(quiz.question)
    println(quiz.answer)
    quiz.answer = "Да"
    println(quiz.answer)

}

class QuizElement(
    _question: String,
    _answer: String,
) {
    val question: String = _question
        get() = field

    var answer: String = _answer
        get() = field
        set(value) {
            field = value
        }

}
