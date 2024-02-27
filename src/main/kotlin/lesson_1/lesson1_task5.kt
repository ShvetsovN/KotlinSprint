package lesson_1

const val SECONDS_IN_MINUTE = 60

fun main() {

    val timeInSpace = 6480

    val hours = timeInSpace / SECONDS_IN_MINUTE / SECONDS_IN_MINUTE
    val minutes = timeInSpace / SECONDS_IN_MINUTE % SECONDS_IN_MINUTE
    val seconds = timeInSpace % SECONDS_IN_MINUTE
    print("%02d".format(hours) + ':' + "%02d".format(minutes) + ':' + "%02d".format(seconds))
}

