fun main() {
    Boeing747("001", 20000, 10000, 25)
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

    protected abstract fun printReference()
}

class Boeing747(planeNumber: String, maxRange: Int, tankCapacity: Int, countPassengers: Int) :
    Aircraft(planeNumber, maxRange, tankCapacity), Passenger {
    override val passengers: Int = countPassengers

    override fun printReference() {
        println("Номер самолета: $planeNumber")
        println("Максимальная дальность полета: $maxRange")
        println("Вместимость бака: $tankCapacity")
    }
}

interface Passenger {
    val passengers: Int
}

