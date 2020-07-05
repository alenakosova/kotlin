fun main() {
    getEmployeeInfo("Лаптев Николай", 55, "Не женат", "Таксист")
}

fun getEmployeeInfo(name:String, position:String) {
    println("ФИО сотрудника: $name")
    println("Должность: $position")
}
fun getEmployeeInfo(name:String, age:Int, position: String){
    getEmployeeInfo(name, position)
    println("Возраст: $age")
}

fun getEmployeeInfo(name:String, family:String, position: String){
    getEmployeeInfo(name, position)
    println("Семейное положение: $family")
}

fun getEmployeeInfo(name:String, age:Int, family:String, position: String){
    getEmployeeInfo(name, age, position)
    println("Семейное положение: $family")
}
