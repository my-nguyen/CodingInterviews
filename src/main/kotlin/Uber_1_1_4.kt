fun maxArithmeticLength(a: IntArray, b: IntArray): Int {
    // combine and sort the 2 arrays
    // combine the 2 arrays, put the combination into a set to eliminate duplicates, convert it back to a list and sort the list
    val combined = (a + b).toSet().toMutableList().sorted()

    // remove all elements from b that come before the very first element of a
    val index = combined.indexOf(a[0])
    val trimmed = combined.subList(index, combined.size)
    val trimSet = trimmed.toSet()

    var maxLength = -1
    for (i in 1..trimmed.lastIndex) {
        val diff = trimmed[i] - trimmed[0]
        val progression = mutableSetOf<Int>()
        progression.add(trimmed[0])
        var next = trimmed[0] + diff
        while (trimSet.contains(next)) {
            progression.add(next)
            next += diff
        }
        if (progression.size < a.size)
            continue

        var containsAllOfA = true
        val progressSet = progression.toSet()
        for (number in a) {
            if (!progressSet.contains(number)) {
                containsAllOfA = false
                break
            }
        }
        if (containsAllOfA) {
            maxLength = maxOf(maxLength, progression.size)
            println("progression: $progression")
        }
    }
    return maxLength
}

fun main(args: Array<String>) {
    val arraysA = arrayOf(
        intArrayOf(1, 7, 9, 13, 15, 20),
        intArrayOf(5, 7, 11, 15),
        intArrayOf(0, 4, 8, 16), intArrayOf(5, 7, 13, 14), intArrayOf(5, 7, 13)
    )
    val arraysB = arrayOf(
        intArrayOf(9, 11, 13, 17, 19),
        intArrayOf(1, 3, 9, 13, 17, 20),
        intArrayOf(0, 2, 6, 12, 14, 20), intArrayOf(9, 11, 15), intArrayOf(9, 11, 15)
    )
    for (i in arraysA.indices) {
        print("A: ${arraysA[i].contentToString()}, B: ${arraysB[i].contentToString()}, ")
        val length = maxArithmeticLength(arraysA[i], arraysB[i])
        println("max arithmetic length: $length")
    }
}