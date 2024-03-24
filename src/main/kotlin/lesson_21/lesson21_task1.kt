package org.example.lesson_1.lesson_21

fun main() {

    val hello = "Hello"
    val vowelCount = hello.vowelCount()

    println(vowelCount)

}

fun String.vowelCount(): Int {
    val currentNumberOfVowels = this.filter { it.lowercase() in "qeyuioa" }
    return currentNumberOfVowels.length
}

