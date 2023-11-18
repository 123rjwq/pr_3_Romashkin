// Импорт класса Scanner из пакета java.util для считывания ввода пользователя
import java.util.Scanner

fun main() {
    // Создание объекта Scanner для чтения ввода пользователя
    val scanner = Scanner(System.`in`)

    // Задание размера массива (количество строк и столбцов)
    val arraySize = 5

    // Создание двумерного массива с заданным размером
    val array = Array(arraySize) { IntArray(arraySize) }

    // Вывод приглашения для ввода элементов массива
    println("Введите элементы массива:")

    // Заполнение массива значениями, введенными пользователем
    for (i in 0 until arraySize) {
        for (j in 0 until arraySize) {
            array[i][j] = scanner.nextInt()
        }
    }

    // Инициализация флага, указывающего на симметричность массива
    var isSymmetric = true

    // Проверка симметричности массива относительно главной диагонали
    for (i in 0 until arraySize) {
        for (j in 0 until arraySize) {
            if (array[i][j] != array[j][i]) {
                isSymmetric = false
                break
            }
        }
        if (!isSymmetric) {
            break
        }
    }

    // Вывод массива на экран
    println("Массив:")
    for (row in array) {
        println(row.contentToString())
    }

    // Вывод результата проверки симметричности массива
    if (isSymmetric) {
        println("Массив является симметричным относительно главной диагонали")
    } else {
        println("Массив не является симметричным относительно главной диагонали")
    }
}
