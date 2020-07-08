fun main() {
    println(Auto("SomeBrand", "Черный", 123))
}

data class Auto(val brand: String, var color: String, var number: Int) {
    override fun toString(): String {
        return " Марка: $brand\n Цвет: $color\n Номер: $number"
    }
}
