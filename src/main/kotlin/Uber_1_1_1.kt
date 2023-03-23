fun concatEdgeLetters(array: Array<String>): Array<String> {
    val result = Array(array.size) { "" }
    for (i in array.indices) {
        val j = (i + 1) % array.size
        val first = array[i][0]
        val last = array[j].last()
        result[i] = "$first$last"
    }
    return result
}

fun main(args: Array<String>) {
    val strings = arrayOf(
        arrayOf("cat", "dog", "ferret", "scorpion"),
        arrayOf("I", "have", "a", "nice", "surprise"),
        arrayOf("singularity")
    )
    for (i in strings.indices) {
        val edgeLetters = concatEdgeLetters(strings[i])
        println(edgeLetters.contentToString())
    }
}
