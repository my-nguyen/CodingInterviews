fun rotateOverDiagonals(matrix: Array<IntArray>, k: Int): Array<IntArray> {
    for (i in 0 until k % 4)
        rotate(matrix)
    return matrix
}

fun rotate(matrix: Array<IntArray>) {
    val n = matrix.size

    // save the elements on the 2 diagonals
    val diagonal = IntArray(n)
    for (i in 0 until n)
        diagonal[i] = matrix[i][i]
    val antidiagonal = IntArray(n)
    for (i in 0 until n)
        antidiagonal[i] = matrix[i][n - 1 - i]

    // do the rotation by first transposing then reflecting
    transpose(matrix)
    reflect(matrix)

    // restore the 2 diagonals
    for (i in 0 until n)
        matrix[i][n - 1 - i] = antidiagonal[i]
    for (i in 0 until n)
        matrix[i][i] = diagonal[i]
}

fun transpose(matrix: Array<IntArray>) {
    val n = matrix.size
    for (i in 0 until n) {
        for (j in i until n) {
            val tmp = matrix[i][j]
            matrix[i][j] = matrix[j][i]
            matrix[j][i] = tmp
        }
    }
}

fun reflect(matrix: Array<IntArray>) {
    val n = matrix.size
    for (i in 0 until n) {
        for (j in 0 until n / 2) {
            val tmp = matrix[i][j]
            matrix[i][j] = matrix[i][n - 1 - j]
            matrix[i][n - 1 - j] = tmp
        }
    }
}

fun main(args: Array<String>) {
    val matrices = arrayOf(
        arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
        ),
        arrayOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(6, 7, 8, 9, 10),
            intArrayOf(11, 12, 13, 14, 15),
            intArrayOf(16, 17, 18, 19, 20),
            intArrayOf(21, 22, 23, 24, 25)
        )
    )
    val ks = arrayOf(1, 1)
    for (i in matrices.indices) {
        println("ORIGINAL:")
        for (row in matrices[i])
            println(row.contentToString())
        rotateOverDiagonals(matrices[i], ks[i])
        println("ROTATED:")
        for (row in matrices[i])
            println(row.contentToString())
    }
}