fun main(){
Boeing747("001", 20000, 10000, 25)
}

open class Aircraft (var planeNumber: String, var maxRange: Int, var tankCapacity: Int){
    var fuelPerKm = 4
        get() {
            return maxRange/tankCapacity
        }
}

class Boeing747(planeNumber:String, maxRange:Int, tankCapacity:Int, countPassengers:Int) : Aircraft(planeNumber, maxRange, tankCapacity), Passenger{
    override val passengers:Int
    init{
        passengers = countPassengers
    }
}

interface Passenger {
    val passengers:Int
}

