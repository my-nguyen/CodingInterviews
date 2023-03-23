//
class Lab126_1aii {
    fun countGroups(related: Array<String>): Int {
        val n = related.size
        val matrix = Array(n) { IntArray(n) }
        for ((i, s) in related.withIndex()) {
            for ((j, c) in s.withIndex()) {
                matrix[i][j] = c.toString().toInt()
            }
        }

        val groups = mutableListOf<MutableSet<Int>>()
        for (i in matrix.indices) {
            var group = find(groups, i)
            if (group == null) {
                group = mutableSetOf(i)
                groups.add(group)
            }
            for (j in matrix[i].indices) {
                if (matrix[i][j] == 1) {
                    group.add(j)
                }
            }
        }
        return groups.size
    }

    private fun find(groups: List<MutableSet<Int>>, index: Int): MutableSet<Int>? {
        for (group in groups) {
            if (group.contains(index)) {
                return group
            }
        }
        return null
    }
}

fun main() {
    val relations = arrayOf(
        arrayOf("1100", "1110", "0110", "0001"),
        arrayOf("10000", "01000", "00100", "00010", "00001"),
        arrayOf("11100", "11100", "11100", "00011", "00011"),
        arrayOf("10100", "01010", "10100", "01010", "00001"),
        arrayOf("110", "110", "001")
    )
    for (related in relations) {
        val count = Lab126_1aii().countGroups(related)
        println("count: $count")
    }
}