interface Sampler {
    fun add(item: String)
    fun remove(item: String)
    fun sample(): String
}

class MySampler() : Sampler {
    private val map = mutableMapOf<String, Int>()
    private val list = mutableListOf<String>()

    override fun add(item: String) { // "amazon", "hello", "world"
        // avoid adding duplicate items
        if (map.containsKey(item))
            return

        list.add(item)             // ["amazon", "hello", "world"]
        map[item] = list.lastIndex // "amazon"->0, "hello"->1, "world"->2
    }

    override fun remove(item: String) { // "hello"
        // avoid removing non-existing items
        if (!map.containsKey(item))
            return

        // swap item with last item
        val index = map[item]!!      // index=1
        val tmp = list[index]        // tmp="hello"
        list[index] = list.last()    // list[1] = "world"
        list[list.lastIndex] = tmp   // list[2] = "hello" -> list = ["amazon", "world", "hello"]

        // update map entry post-swap
        map[list[index]] = index     // map["world"] = 1

        list.removeLast()            // list = ["amazon", "world"]
        map.remove(item)             // "amazon"->0, "world"->1
    }

    override fun sample(): String {
        return list.random()
        // int index = Random().nextInt(list.size()-1) // Java
        // val index = (0..list.lastIndex).random()    // kotlin
        // return list[index]
    }
}

fun main() {
    val sampler = MySampler()
    sampler.add("amazon")
    sampler.add("hello")
    sampler.add("world")

    sampler.remove("hello")

    println(sampler.sample())
    println(sampler.sample())
}