class Peacock_1_1_1 {
    fun solution(message: String, K: Int): String { // "Codility We test coders"
        val words = message.split(" ")       // ["Codility", "We", "test", "coders"]
        val sb = StringBuilder(words[0])    // "Codility We"
        var i = 1
        while (i < words.size) {
            if (sb.length + 1 + words[i].length <= K) { // 11 + 1 + 4 = 16
                sb.append(" ").append(words[i])
                i++
            } else
                break
        }
        return sb.toString()
    }
}