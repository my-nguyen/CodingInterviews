class Robinhood_1_2_1_Live {
    fun rhCollectionPillLayout(
        featuredCollections: MutableList<String>,
        screenWidthCharacters: Int,
        numberOfRows: Int,
        separator: String
    ): MutableList<String> {
        var i = 0
        val result = mutableListOf<String>()
        val remainders = IntArray(numberOfRows) { screenWidthCharacters }
        val sbs = Array(numberOfRows) { StringBuilder() }
        val used = BooleanArray(featuredCollections.size)

        while (i < featuredCollections.size) {
            for (j in 0 until numberOfRows) {
                if (sbs[j].isEmpty()) {
                    if (i < featuredCollections.size && featuredCollections[i].length < remainders[j] && !used[i]) {
                        sbs[j].append(featuredCollections[i])
                        remainders[j] -= featuredCollections[i].length
                        used[i] = true
                        i++
                    }
                }
                if (i < featuredCollections.size && remainders[j] >= featuredCollections[i].length + separator.length && !used[i]) {
                    sbs[j].append(separator)
                    sbs[j].append(featuredCollections[i])
                    remainders[j] -= featuredCollections[i].length + separator.length
                    used[i] = true
                    i++
                }
            }


/*val sb = StringBuilder()
sb.append(featuredCollections[i])





var remainder = screenWidthCharacters - featuredCollections[i].length
for (j in i+1 until featuredCollections.size) {
if (featuredCollections[j].length + separator.length < remainder) {
sb.append(featuredCollections[j])
remainder -= separator.length + featuredCollections[i].length
featuredCollections.remove(j)
}
}

if (i >= featuredCollections.size)
break
sb.append(featuredCollections[i])
i++
if (i >= featuredCollections.size)
break
println("feature: ${featuredCollections[i]}, remainder: $remainder")
while (i < featuredCollections.size && featuredCollections[i].length + separator.length < remainder) {
sb.append(separator)
sb.append(featuredCollections[i])
remainder -= separator.length + featuredCollections[i].length
println("loop remainder: $remainder")
i++
}
result.add(sb.toString())
j++*/
        }
        for (j in sbs.indices)
            result.add(sbs[j].toString())
        return result
    }
}
