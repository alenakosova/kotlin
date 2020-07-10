import java.util.*
import kotlin.system.exitProcess

fun main() {
    val boeing747 = Boeing747("001", 20000, 10000, 25)
    val boeing000 = Boeing000("000", 10000, 5000, 5)
    val boeing111 = Boeing111("111", 5000, 2000, 1, 150)
    val airplanes: ArrayList<Aircraft> = arrayListOf(boeing747, boeing000, boeing111)

    menu(airplanes)
}

fun menu(airplanes: ArrayList<Aircraft>) {
    println("Введите пункт меню, для возврата в меню нажмите х")
    println("1. Посмотреть список самолетов")
    println("2. Показать информацию по самолету из списка")
    println("3. Удалить самолет из списка")

    when (readLine()) {
        "1" -> showAirplanesList(airplanes)
        "2" -> getAirplaneInfo(airplanes)
        "3" -> deleteAirplane(airplanes)
        else -> menu(airplanes)
    }
    println("Продолжить работу с программой? y/n")
    var result = readLine()
    while (!result.equals("y") || !result.equals("n")) {
        println("Введите y для продолжения или n для выхода")
        result = readLine()
        when (result) {
            "y" -> menu(airplanes)
            "n" -> exitProcess(0)
        }
    }
}

fun showAirplanesList(airplanes: ArrayList<Aircraft>) {
    airplanes.forEach { airplane -> println(airplane.javaClass.canonicalName) }
    menu(airplanes)
}

fun getAirplaneInfo(airplanes: ArrayList<Aircraft>) {
    println("Выберите самолет из списка:")
    val airplane = getAirplaneFromList(airplanes)
    println("Информация по самолету: " + airplane.javaClass.canonicalName)
    airplane.printReference()
    println("Выйти в меню - х(eng)")
    println("Посмотреть информацию по другому самолету - c(eng)")
    when (readLine()) {
        "x" -> menu(airplanes)
        "c" -> getAirplaneInfo(airplanes)
        else -> menu(airplanes)
    }
}

fun getAirplaneFromList(airplanes: ArrayList<Aircraft>): Aircraft {
    airplanes.forEach { airplane ->
        println(
            airplanes.indexOf(airplane).toString() + "."
                    + airplane.javaClass.canonicalName
        )
    }
    val result = readLine()
    if (Integer.valueOf(result) > airplanes.size) {
        println("Введеное число должно соответствовать одному из пунктов меню")
        getAirplaneInfo(airplanes)
    }
    return airplanes[Integer.valueOf(result)]
}


fun deleteAirplane(airplanes: ArrayList<Aircraft>): List<Aircraft> {
    println("Выберите самолет из списка для удаления:")
    val airplane = getAirplaneFromList(airplanes)
    airplanes.remove(airplane)
    println("Самолет " + airplane.javaClass.canonicalName + " был удален")
    airplanes.forEach { airplan ->
        println(
            airplanes.indexOf(airplan).toString() + "."
                    + airplan.javaClass.canonicalName
        )
    }
    return airplanes
}


abstract class Aircraft(
    protected var planeNumber: String,
    protected var maxRange: Int,
    protected var tankCapacity: Int
) {
    protected var fuelPerKm = 4
        get() {
            return maxRange / tankCapacity
        }

    abstract fun printReference()
}

class Boeing747(planeNumber: String, maxRange: Int, tankCapacity: Int, countPassengers: Int) :
    Aircraft(planeNumber, maxRange, tankCapacity), Passenger {
    override val passengers: Int = countPassengers

    override fun printReference() {
        println("Номер самолета: $planeNumber")
        println("Максимальная дальность полета: $maxRange")
        println("Вместимость бака: $tankCapacity")
        println("Количество пассажиров: $passengers")
    }
}

class Boeing000(planeNumber: String, maxRange: Int, tankCapacity: Int, countPassengers: Int) :
    Aircraft(planeNumber, maxRange, tankCapacity), Passenger {
    override val passengers: Int = countPassengers

    override fun printReference() {
        println("Номер самолета: $planeNumber")
        println("Максимальная дальность полета: $maxRange")
        println("Вместимость бака: $tankCapacity")
        println("Количество пассажирова: $passengers")
    }
}

class Boeing111(planeNumber: String, maxRange: Int, tankCapacity: Int, countPassengers: Int, carrying: Int) :
    Aircraft(planeNumber, maxRange, tankCapacity), Passenger, Carrying {
    override val passengers: Int = countPassengers
    override val carryingCapacity: Int = carrying

    override fun printReference() {
        println("Номер самолета: $planeNumber")
        println("Максимальная дальность полета: $maxRange")
        println("Вместимость бака: $tankCapacity")
        println("Количество пассажиров: $passengers")
        println("Грузоподъемность: $carryingCapacity")
    }
}

interface Passenger {
    val passengers: Int
}

interface Carrying {
    val carryingCapacity: Int
}
