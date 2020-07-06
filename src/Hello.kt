fun main(){
Boeing747(25, "001", 20000, 10000)
}

open class Aircraft (var planeNumber: String, var maxRange: Int, var tankCapacity: Int){
    var fuelPerKm = 4
        get() {
            return maxRange/tankCapacity
        }
}

class Boeing747(var passengers:Int, planeNumber:String, maxRange:Int, tankCapacity:Int) : Aircraft(planeNumber, maxRange, tankCapacity)