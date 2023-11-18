import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Ввод первого массива
    println("Введите элементы первого массива через пробел:")
    val input1 = scanner.nextLine()
    val array1 = input1.split(" ").map { it.toInt() }.toIntArray()

    // Ввод второго массива
    println("Введите элементы второго массива через пробел:")
    val input2 = scanner.nextLine()
    val array2 = input2.split(" ").map { it.toInt() }.toIntArray()

    // Создание множеств для хранения уникальных значений первого и второго массива
    val set1 = array1.toSet()
    val set2 = array2.toSet()

    // Создание списка для хранения пересечения массивов
    val intersection = mutableListOf<Int>()

    // Перебор каждого элемента из пересечения множеств
    for (element in set1.intersect(set2)) {
        // Определение количества вхождений элемента в первом и втором массиве
        val count1 = array1.count { it == element }
        val count2 = array2.count { it == element }

        // Добавление элемента в итоговый список столько раз, сколько он встречается в пересечении массивов
        repeat(minOf(count1, count2)) {
            intersection.add(element)
        }
    }

    // Вывод пересечения массивов
    println("Пересечение массивов: $intersection")
}
