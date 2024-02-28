package org.example.lesson_1.lesson_4

const val WEIGHT_MIN = 35
const val WEIGHT_MAX = 100
const val PERMISSION_VOLUME = 100

fun main() {

    val cargoWeightOne = 20
    val cargoVolumeOne = 80

    val cargoWeightTwo = 50
    val cargoVolumeTwo = 100

    println(
        "Груз с весом $cargoWeightOne и объемом $cargoVolumeOne соответствует " +
                "категории 'Average':${
                    (cargoWeightOne >= WEIGHT_MIN) && (cargoWeightOne <= WEIGHT_MAX)
                            && (cargoVolumeOne <= PERMISSION_VOLUME)
                }"
    )

    println(
        "Груз с весом $cargoWeightTwo и объемом $cargoVolumeTwo соответствует " +
                "категории 'Average':${
                    (cargoWeightTwo >= WEIGHT_MIN) && (cargoWeightTwo <= WEIGHT_MAX)
                            && (cargoVolumeTwo <= PERMISSION_VOLUME)
                }"
    )

}