// Функция getDigits принимает целое число n и возвращает множество (Set) его цифр.
fun getDigits(n: Int): Set<Int> {
    val digits = HashSet<Int>()
    var number = n
    while (number != 0) {
        val digit = number % 10 // Получаем последнюю цифру числа
        digits.add(digit) // Добавляем цифру в множество
        number /= 10 // Удаляем последнюю цифру числа
    }
    return digits
}

fun main() {
    println("Введите количество строк: ")
    val rowCount = readln().toInt()
    println("Введите количество столбцов: ")
    val columnCount = readln().toInt()
    var i = 0
    var j = 0
    val arr = Array(rowCount) { IntArray(columnCount) } // Создаем двумерный массив
    println("Введите трехзначные числа: ")
    for (row in arr) {
        i++
        for (cell in row) {
            j++
            val number = (100..999).random() // Вводим трехзначное число
            arr[i - 1][j - 1] = number // Добавляем число в массив
        }
        j = 0
    }
    println("Массив: ")
    for (row in arr) {
        println(row.contentToString()) // Выводим массив
    }
    val digitSet = HashSet<Int>()
    for (row in arr) {
        for (element in row) {
            val digits = getDigits(element) // Получаем множество цифр числа
            digitSet.addAll(digits) // Добавляем все цифры в общее множество
        }
    }
    val count = digitSet.size // Вычисляем количество различных цифр
    println("Количество различных цифр: $count") // Выводим количество различных цифр
}
