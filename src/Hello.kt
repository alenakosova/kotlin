fun main() {
    println("Введите номер рабочего места")
    val place = readLine()

    val employees = mapOf(
        1 to "Иван Иванович",
        2 to "Екатерина Павловна",
        3 to "Дмитрий Лукаш"
    )
    if (employees.size < Integer.valueOf(place) || place == "0"){
        println("Не существует рабочего места №$place")
    }
    employees.forEach{ emp->
        if (emp.key.toString() == place){
            println("Рабочее место №" + emp.key + " занимает " + emp.value)
        }}
}



