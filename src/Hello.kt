fun main(args: Array<String>){
    println("Введите первое число:")
    val a = readLine()
    checkNotNull(a)

    println("Введите второе число:")
    val b = readLine()
    checkNotNull(b)

    val c:Boolean = a > b
    print(c)
}

