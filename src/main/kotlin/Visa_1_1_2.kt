fun countPairs(numbers: Array<Int>, k: Int): Int {
    val set = numbers.toSet()
    val list = set.toList().sorted()
    var count = 0
    for (number in list) {
        if (set.contains(number+k))
            count++
    }
    return count
}

fun main(args: Array<String>) {
    val numbers = arrayOf(arrayOf(1,1,1,2), arrayOf(1,2), arrayOf(1,1,2,2,3,3), arrayOf(1,2,3,4,5,6), arrayOf(1,2,5,6,9,10))
    val k = arrayOf(1, 0, 1, 2, 2)
    for (i in numbers.indices) {
        print("numbers: ${numbers[i].contentToString()}, k: ${k[i]}, ")
        val pairs = countPairs(numbers[i], k[i])
        println("distinct pairs: $pairs")
    }
}