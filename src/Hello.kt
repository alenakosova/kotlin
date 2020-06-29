import java.util.*
fun main() {
    println("Введите сумму вклада:")
    var depositSum: Int = Integer.valueOf(readLine())

    println("Введите количество месяцев для вклада:")
    val onMonths: Int = Integer.valueOf(readLine())

    println("Введите ежемесячный процент по вкладу:")
    val depositPercent = Integer.valueOf(readLine())

    val currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1
    (currentMonth .. Integer.valueOf(onMonths) + currentMonth).forEach { month ->
        val newSum = depositSum + (depositSum * depositPercent/100)
        println("${getMonth(month)}: $depositSum станет $newSum")
        depositSum = newSum
    }
}

fun getMonth(month: Int): String {
    val expression = if (month > 13){
        month%12 - 1
    }
    else{
        month%12
    }

    return when(expression) {
        0 -> "Январь"
        1 -> "Февраль"
        2 -> "Март"
        3 -> "Апрель"
        4 -> "Май"
        5 -> "Июнь"
        6 -> "Июль"
        7 -> "Август"
        8 -> "Сентябрь"
        9 -> "Октябрь"
        10 -> "Ноябрь"
        11 -> "Декабрь"
        else -> "Не удалось рассчитать ммесяц"
    }
}





