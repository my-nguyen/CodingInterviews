fun digitsManipulations(n: Int): Int {
    var product = 1
    var sum = 0
    var copy = n
    while (copy > 0) {
        val remain = copy % 10
        product *= remain
        sum += remain
        copy /= 10
    }
    return product - sum
}

fun main(args: Array<String>) {
    val numbers = intArrayOf(123456, 1010)
    for (number in numbers) {
        print("number: $number, ")
        val manip = digitsManipulations(number)
        println("digits manipulations: $manip")
    }
}
