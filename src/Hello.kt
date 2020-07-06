fun main(){
    val somePlane = Aircraft()
    somePlane.planeNumber = "001"
    somePlane.maxRange = 20000
    somePlane.tankCapacity = 10000
    print(somePlane.fuelPerKm)
}

class Aircraft {
    var planeNumber = "1"
    var maxRange = 10000
        set(value) {
            if (maxRange > 0)
            field = value
        }

    var tankCapacity = 5000
        set(value) {
            if (tankCapacity > 0)
            field = value
        }

    var fuelPerKm = 4
        get() {
            return maxRange/tankCapacity
        }




}