package org.example.lesson_1.lesson_21

fun main() {

    val hello = "Hello"
    val vowelCount = hello.vowelCount()

    println(vowelCount)

}

fun String.vowelCount(): Int {
    val setOfVowels = setOf('q','e','y','u','i','o','a')
    return count { it.lowercaseChar() in setOfVowels }
}