fun sumOfReversed(array: IntArray): Long {
    var sum = 0L
    for (number in array) {
        sum += reverse(number)
    }
    return sum
}

private fun reverse(number: Int): Int {
    var copy = number
    var reversed = 0
    var multiplies = 1
    var containsTrailingZeroes = true
    while (copy != 0) {
        val remainder = copy % 10
        reversed = reversed * 10 + remainder
        if (remainder != 0)
            containsTrailingZeroes = false
        else if (containsTrailingZeroes)
            multiplies *= 10
        copy /= 10
    }
    reversed *= multiplies
    return reversed
}

fun main(args: Array<String>) {
    val numbers = arrayOf(intArrayOf(7, 234, 58100), intArrayOf(0, 100, 220))
    for (i in numbers.indices) {
        println(sumOfReversed(numbers[i]))
    }
}