class Peacock_1_1_2 {
    fun solution(A: Array<String>, B: Array<String>, P: String): String {
        val names = mutableListOf<String>()
        for (i in B.indices) {
            if (B[i].contains(P))
                names.add(A[i])
        }
        return if (names.isEmpty())
            "NO CONTACT"
        else
            names.sorted()[0]
    }
}