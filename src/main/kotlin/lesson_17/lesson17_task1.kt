package org.example.lesson_1.lesson_17

class QuizElement(
    question: String,
    answer: String,
) {
    private val _question: String = "Каков вопрос?"
        val question: String
        get() = _question

    private var _answer: String = "Таков ответ"
        var answer: String
        get() = _answer
        set(value) {
            _answer = value
        }

}