import java.util.*
fun main() {
    val table = Array(4) { Array(3) { Array(3) {""}} }
    table[0][0][0] = "Страна"
    table[0][1][1] = "Столица"
    table[0][2][2] = "Валюта"

    table[1][0][0] = "Россия"
    table[2][0][0] = "Испания"
    table[3][0][0] = "США"

    table[1][1][1] = "Москва"
    table[2][1][1] = "Мадрид"
    table[3][1][1] = "Вашингтон"

    table[1][2][2] = "Рубль"
    table[2][2][2] = "Евро"
    table[3][2][2] = "Доллар"

    for(row in table){
        for(cell in row) {
            for (cell2 in cell) {
                print("$cell2\t")
            }
        }
        println()
    }
}




