fun main(){
    val somePlane = Aircraft("001", 20000, 10000)
    print(somePlane.fuelPerKm)
}

class Aircraft (var planeNumber: String, var maxRange: Int, var tankCapacity: Int){
    var fuelPerKm = 4
        get() {
            return maxRange/tankCapacity
        }
}