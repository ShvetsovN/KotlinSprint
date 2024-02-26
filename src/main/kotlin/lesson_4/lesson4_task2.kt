package org.example.lesson_1.lesson_4

fun main() {

    val weightMin = 35
    val weightMax = 100
    val permissibleVolume = 100

    val cargoWeightOne = 20
    val cargoVolumeOne = 80

    val cargoWeightTwo = 50
    val cargoVolumeTwo = 100

    println(
        "Груз с весом $cargoWeightOne и объемом $cargoVolumeOne соответствует " +
                "категории 'Average':${
                    (cargoWeightOne >= weightMin) && (cargoWeightOne <= weightMax)
                            && (cargoVolumeOne <= permissibleVolume)
                }"
    )

    println(
        "Груз с весом $cargoWeightTwo и объемом $cargoVolumeTwo соответствует " +
                "категории 'Average':${
                    (cargoWeightTwo >= weightMin) && (cargoWeightTwo <= weightMax)
                            && (cargoVolumeTwo <= permissibleVolume)
                }"
    )

}