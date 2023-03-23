fun histogramSquareArea(histogram: IntArray): Long {
    return 0
}

fun main(args: Array<String>) {
    val histograms = arrayOf(intArrayOf(1, 2, 3, 2, 1), intArrayOf(4, 3, 4))
    for (histogram in histograms) {
        print("histogram: ${histogram.contentToString()}, ")
        val square = histogramSquareArea(histogram)
        println("square area: $square")
    }
}