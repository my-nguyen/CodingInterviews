class Facebook_2_2_1 {
    data class Node(val value: Int, var next: Node?=null, var random: Node?=null)

    fun copy(list: Node?): Node? {
        if (list == null)
            return null

        var current: Node? = list
        var j = 0
        // map from Node to index
        val map = mutableMapOf<Node, Int>()
        val result = mutableListOf<Node>()

        while (current != null) { // 100, 50, 55, 31
            map[current] = j // 100->0, 50->1, 55->2, 31->3
            println("mapping ${current.value} to $j")
            // create a clone of the original node
            val node = Node(current.value) // 100, 50, 55, 31
            result.add(node)

            current = current.next
            j++
        }

        current = list
        for (i in result.indices) {
            // make the next pointer connection
            if (i < result.lastIndex) {
                result[i].next = result[i + 1] // 0->1->2->3
            }

            // take care of the random pointer
            val key = current!!.random // 55, null, 100, 31
            if (map.containsKey(key)) {
                val index = map[key]!! // 2, 0, 3
                result[i].random = result[index] // 100->2, null, 55->0, 31->3
            }
            current = current.next
        }

        return result[0]
    }

    companion object {
        fun build(array: List<Pair<Int, Int?>>?): Node? {
            if (array == null)
                return null

            val list = mutableListOf<Node>()
            for (pair in array) {
                list.add(Node(pair.first))
            }
            for (i in array.indices) {
                val random = array[i].second
                if (random != null && random < list.size) {
                    list[i].random = list[random]
                    // println("i: $i, node: ${list[i].value}, random: $random, r-node: ${list[random].value}")
                }
            }
            return list[0]
        }

        fun print(node: Node?) {
            var current = node
            while (current != null) {
                print("${current.value}, ")
                current = current.next
            }
            println()
        }

        fun print(list: List<Pair<Int, Int?>>?) {
            if (list == null)
                return

            for (pair in list) {
                print("$pair, ")
            }
        }

        @JvmStatic
        fun main(args: Array<String>) {
            val list1 = listOf(Pair(100, 2), Pair(50, null), Pair(55, 0), Pair(31, 3))
            /*val list2 = null
            val list3 = listOf(Pair(100, null), Pair(50, null))
            val list4 = listOf(Pair(100, 0), Pair(50, 1), Pair(55, 2))
            val list5 = listOf(Pair(100, 10), Pair(50, 1))*/
            val list = listOf(list1/*, list2, list3, list4, list5*/)
            for (sublist in list) {
                print("list: ")
                print(sublist)
                val node = build(sublist)
                val copied = Facebook_2_2_1().copy(node)
                /*print("copied: ")
                print(copied)*/
            }
        }
    }
}


