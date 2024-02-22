package lesson_1

fun main(){
    val hours = 6480/60/60
    val minutes = 6480/60%60
    val seconds = 6480%60
    print("%02d".format(hours) + ':' + "%02d".format(minutes) + ':' + "%02d".format(seconds))
}