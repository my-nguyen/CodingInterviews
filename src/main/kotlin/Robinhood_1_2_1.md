##Part 1 - (Tests 1&2)

Recreate the layout strategy for the “Featured In” section on the equity detail page in
[Robinhood](https://d2ue93q3u507c2.cloudfront.net/interview-question-resources/AMZN-featured-collections.png)

Our API returns us an array of “Featured In” collections for a given equity. These collections are ordered according to
relevance so we want to maintain the ordering as best we can within the visible area from top-left to bottom-right.

[Example](https://d2ue93q3u507c2.cloudfront.net/interview-question-resources/part_1.jpg)

[Edge case example](https://d2ue93q3u507c2.cloudfront.net/interview-question-resources/part_1_edge.jpg)

##Part 2 - (Tests 3-6)

If we get an array of collections that does not fit in the visible area, we overflow using a greedy layout strategy that
prioritizes the shortest row available. This ensures that the items at the beginning of our API response are shown first
while keeping the row widths balanced.

[Example](https://d2ue93q3u507c2.cloudfront.net/interview-question-resources/part_2.jpg)

[execution time limit] 3 seconds (kt)

[input] array.string featuredCollections

API response of featured collections for an equity. This array is ordered by relevance.

[input] integer screenWidthCharacters

Number of characters that can fit in the screen's viewport without overflowing.

[input] integer numberOfRows

The number of rows that to be displayed.

[input] string separator

The string to use between each Collection Pill to format the final solution

[output] array.string

Represents the layout of Collection Pills.

The length of this array should be equal to the numberOfRows passed in.

Each string in this array consists of the collections in the row joined using the inputted separator.

Do not include separator strings at the beginning or end of a row.

If a row is empty, return an empty string.