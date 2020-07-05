fun main() {
    println("Введите год:")
    println(checkLeapYear(Integer.valueOf(readLine())))
}

fun checkLeapYear(year: Int): String {
    return if (year%4 == 0){
        "Год $year високостый"
    } else {
        "Год $year не високостный"
    }
}


