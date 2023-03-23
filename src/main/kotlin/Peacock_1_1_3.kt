class Peacock_1_1_3 {
    fun solution(A: IntArray, K: Int, L: Int): Int {
        if (K+L > A.size)
            return -1
        if (K+L == A.size)
            return A.sum()

        val big = maxOf(K, L)
        val small = minOf(K, L)
        var bigSum = 0
        for (i in 0 until big)
            bigSum += A[i]
        var bigMax = bigSum
        var bigStart = 0
        for (i in big until A.size) {
            bigSum += A[i] - A[i-big]
            if (bigSum > bigMax) {
                bigMax = bigSum
                bigStart = i-big+1
            }
        }

        val smallSum = if (bigStart < small) {
            getSum(A, bigStart+big, A.size, small)
        } else {
            val sumA = getSum(A, 0, bigStart, small)
            if (A.size-bigStart-big >= small) {
                val sumB = getSum(A, bigStart+big, A.size, small)
                maxOf(sumA, sumB)
            } else
                sumA
        }

        return bigSum + smallSum
    }

    private fun getSum(A: IntArray, start: Int, end: Int, size: Int): Int {
        var sum = 0
        for (i in start until start+size)
            sum += A[i]

        var max = sum
        for (i in start+size until end) {
            sum += A[i] - A[i-size]
            if (sum > max)
                max = sum
        }

        return max
    }
}