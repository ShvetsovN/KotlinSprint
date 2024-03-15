package org.example.lesson_1.lesson_17

class QuizElement(
    private val question: String,
    private var answer: String,
) {
    fun getQuestion() : String = question

    fun getAnswer() : String = answer
    fun setAnswer(newAnswer : String) {
        answer = newAnswer
    }
}