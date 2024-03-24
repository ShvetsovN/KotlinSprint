package org.example.lesson_1.lesson_21

import java.io.File

fun main(){

    val newText = "some message for file"
    val newFile = "File.txt"

    val file = File(newFile)

    file.writeToLowerCase(newText)
    file.writeToStartOfFile(newText)

}

fun File.writeToLowerCase(text: String){
    val newText = text.lowercase()
    this.writeText(newText)
}

fun File.writeToStartOfFile(text: String){
    val fileContents = this.readText()
    val newText = "$text\n$fileContents"
    this.writeText(newText)
}
