import kotlin.collections.ArrayList
import kotlin.system.exitProcess

fun main() {
    getMenu(arrayListOf(""))
}

fun getMenu(cities: ArrayList<String>){
    text()
    when (readLine()) {
        "1" -> addCity(cities)
        "2" -> getCities(cities)
        "3" -> getDistinctCities(cities)
        "4" -> exit(cities)
        else -> {println("Введите значение 1, 2, 3 или 4")
            getMenu(cities)
        }
    }
}

fun text(){
    println("Выберите действие:")
    println("1. Добавить название города")
    println("2. Посмотреть в консоли список всех добавленных городов")
    println("3. Посмотреть список добавленных городов без повторений")
    println("4. Выход из программы")
}

fun addCity(cities: ArrayList<String>) {
    println("Для выхода в меню нажмите x")
    println("Введите название города:")
    var city = readLine()!!
    while (city != "x") {
        cities.add(city)
        city = readLine()!!
    }
    getMenu(cities)
}

fun getCities(cities: ArrayList<String>){
    cities.forEach {city ->  println(city)}
    getMenu(cities)
}

fun getDistinctCities(cities: ArrayList<String>){
    val distinctCities = cities.toHashSet()
    distinctCities.forEach {city ->  println(city)}
    getMenu(cities)
}

fun exit(cities: ArrayList<String>){
    println("Уверены что хоите выйти?")
    println("Y/N")
    val exit = readLine()
    if (exit.equals("Y") or exit.equals("y")){
        exitProcess(0)
    } else {
        getMenu(cities)
    }
}



