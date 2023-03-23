fun reduceTheNumber(number: String, k: Int): String {
    return reduceTheNumberPolished(number, k)
}

fun reduceTheNumberPolished(number: String, k: Int): String {
    var string = number
    while (string.length > k) {
        val groups = mutableListOf<String>()
        // break the string up into groups of k characters each
        for (i in 0..string.lastIndex step k) {
            val group = string.substring(i, minOf(i + k, string.length))
            groups.add(group)
        }

        val sb = StringBuilder()
        // iterate thru each group
        for (group in groups) {
            var sum = 0
            // take the sum of all digits in the group
            for (c in group) {
                val digit = c.toString().toInt()
                sum += digit
            }
            // add the group sum into a StringBuilder
            sb.append(sum)
        }
        // assign the StringBuilder back into string
        string = sb.toString()
    }
    return string
}

fun reduceTheNumberRaw(number: String, k: Int): String {
    var string = number
    while (string.length > k) {
        val list = mutableListOf<String>()
        for (i in 0..string.lastIndex step k) {
            val sub = string.substring(i, minOf(i + k, string.length))
            list.add(sub)
        }
        // println("list: $list")
        val sb = StringBuilder()
        for (sub in list) {
            var sum = 0
            for (c in sub) {
                val digit = c.toString().toInt()
                sum += digit
            }
            sb.append(sum)
        }
        // println("sb: ${sb.toString()}")
        string = sb.toString()
    }
    return string
}

fun main(args: Array<String>) {
    val numbers = arrayOf("1111122222", "1111122222")
    val sizes = arrayOf(3, 5)
    for (i in numbers.indices) {
        print("number: ${numbers[i]}, k: ${sizes[i]}, ")
        val reduced = reduceTheNumber(numbers[i], sizes[i])
        println("number reduced: $reduced")
    }
}