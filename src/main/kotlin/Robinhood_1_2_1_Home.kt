class Robinhood_1_2_1_Home {
    fun rhCollectionPillLayout(features: MutableList<String>, width: Int, rows: Int, separator: String): MutableList<String> {
        return byFeatures(features, width, rows, separator)
    }

    private fun byFeatures(features: MutableList<String>, width: Int, rows: Int, separator: String): MutableList<String> {
        val lines = Array(rows) { StringBuilder() }
        val used = BooleanArray(features.size) { false }

        for (i in features.indices) {
            if (used[i])
                continue

            for (j in 0 until rows) {
                if (lines[j].isEmpty()) {
                    lines[j].append(features[i])
                    used[i] = true
                    break
                } else if (width - lines[j].length >= separator.length + features[i].length) {
                    lines[j].append(separator).append(features[i])
                    used[i] = true
                    break
                }
            }
        }

        val result = mutableListOf<String>()
        for (j in lines.indices) {
            result.add(lines[j].toString())
        }
        return result
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val features = listOf(
                mutableListOf(
                    "E-Commerce", "100 Most Popular", "Retail", "Consumer Products",
                    "Internet", "Entertainment", "Media", "Apparel"
                ),
                mutableListOf(
                    "E-Commerce", "100 Most Popular Stocks", "Retail", "Consumer Products",
                    "Internet", "Entertainment", "Media", "Apparel"
                ),
            )
            val width = 30
            val rows = 4
            val separator = " / "
            for (i in features.indices) {
                val layout = Robinhood_1_2_1_Home().rhCollectionPillLayout(features[i], width, rows, separator)
                for (line in layout)
                    println(line)
            }
        }
    }
}
