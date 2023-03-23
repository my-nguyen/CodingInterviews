fun justifyNewspaperText(paragraphs: List<List<String>>, aligns: List<String>, width: Int): List<String> {
    return justifyNewspaperTextPolished(paragraphs, aligns, width)
}

fun justifyNewspaperTextPolished(paragraphs: List<List<String>>, aligns: List<String>, width: Int): List<String> {
    val result = mutableListOf<String>()
    val stars = "*".repeat(width + 2)
    // first add a line of stars at the top
    result.add(stars)
    for ((i, paragraph) in paragraphs.withIndex()) {
        // always include the first word from paragraph
        val sb = StringBuilder(paragraph[0])
        for (j in 1..paragraph.lastIndex) {
            if (sb.length + 1 + paragraph[j].length <= width) {
                // if the StringBuilder can accommodate one space and the next word from the paragraph, then add them both
                sb.append(" ")
                sb.append(paragraph[j])
            } else {
                // otherwise, build a line from the StringBuilder using the current alignment
                val line = makeLine(sb, aligns[i], width)
                // save the line in result
                result.add(line)

                // reset the StringBuilder
                sb.clear()
                // save the next word from the paragraph in the StringBuilder, for the next loop
                sb.append(paragraph[j])
            }
        }

        // don't forget the last unprocessed StringBuilder: build a line from it
        val line = makeLine(sb, aligns[i], width)
        result.add(line)
    }
    // add a line of stars at the bottom
    result.add(stars)
    return result
}

fun justifyNewspaperTextRaw(paragraphs: List<List<String>>, aligns: List<String>, width: Int): List<String> {
    val result = mutableListOf<String>()
    val stars = "*".repeat(width + 2)
    result.add(stars)
    for ((i, paragraph) in paragraphs.withIndex()) {
        val word = StringBuilder()
        word.append(paragraph[0])
        for (j in 1..paragraph.lastIndex) {
            if (word.length + 1 + paragraph[j].length <= width) {
                word.append(" ")
                word.append(paragraph[j])
            } else {
                val line = makeLine(word, aligns[i], width)
                result.add(line)

                word.clear()
                word.append(paragraph[j])
            }
        }

        val line = makeLine(word, aligns[i], width)
        result.add(line)
    }
    result.add(stars)
    return result
}

private fun makeLine(word: StringBuilder, align: String, width: Int): String {
    val diff = width - word.length
    val spaces = " ".repeat(diff)
    val line = StringBuilder()
    line.append("*")
    if (align == "LEFT") {
        line.append(word)
        line.append(spaces)
    } else {
        line.append(spaces)
        line.append(word)
    }
    line.append("*")
    return line.toString()
}

fun main(args: Array<String>) {
    val paragraphs = listOf(
        listOf("hello", "world"),
        listOf("How", "areYou", "doing"),
        listOf("Please look", "and align", "to right")
    )
    val aligns = listOf("LEFT", "RIGHT", "RIGHT")
    val width = 16
    val text = justifyNewspaperText(paragraphs, aligns, width)
    for (line in text)
        println(line)
}