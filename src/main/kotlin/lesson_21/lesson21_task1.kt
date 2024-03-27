package org.example.lesson_1.lesson_21

fun main() {

    val hello = "Hello"
    val setOfElement = setOf('q','e','y','u','i','o','a')
    val vowelCount = hello.vowelCount{it in setOfElement}

    println(vowelCount)

}

fun String.vowelCount(predicate: (Char) -> Boolean): Int {
    var count = 0
    for(element in this) if (predicate(element)) ++ count
    return count
}