import org.junit.Test
import kotlin.test.assertEquals

internal class Robinhood1biHomeTest {

    @Test
    fun testRhCollectionPillLayout() {
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
        val expected = listOf(
            listOf(
                "E-Commerce / 100 Most Popular",
                "Retail / Consumer Products",
                "Internet / Entertainment",
                "Media / Apparel"
            ),
            listOf(
                "E-Commerce / Retail / Internet",
                "100 Most Popular Stocks",
                "Consumer Products / Media",
                "Entertainment / Apparel"
            )
        )
        for (i in features.indices) {
            val actual = Robinhood_1_2_1_Home().rhCollectionPillLayout(features[i], width, rows, separator)
            for (j in actual[i].indices)
                assertEquals<String>(expected[i][j], actual[i])
        }
    }
}