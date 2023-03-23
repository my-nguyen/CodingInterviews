fun maxTickets(tickets: Array<Int>): Int {
    tickets.sort()
    var i = 0
    var j = 1
    var maxLength = 0
    while (j < tickets.size) {
        while (j < tickets.size && tickets[j] - tickets[j - 1] in 0..1) // 2,3,4,13
            j++

        maxLength = maxOf(maxLength, j - i)
        i = j
        j++
    }
    return maxLength
}

fun main(args: Array<String>) {
    val data = arrayOf(arrayOf(4,13,2,3), arrayOf(8,5,4,8,4))
    for (tickets in data) {
        print("tickets: ${tickets.contentToString()}, ")
        val max = maxTickets(tickets)
        println("max tickets: $max")
    }
}
