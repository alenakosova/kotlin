fun main() {
    println("Введено ${getEmployeesCount("Вася", "Петя", "Маша", "Оля")} имен сотрудников")
}

fun getEmployeesCount(vararg employees:String) = employees.count()


