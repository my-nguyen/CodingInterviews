A histogram is a bar graph which groups ranges of outcomes into bars of equal widths (known as bins/intervals) along
the x-axis. Imagine a grid containing a histogram which is represented by an integer array of bar heights `histogram`.
In this case, all bars have a width of `1`, and consecutive bars are right next to each other without any gap between
the bars. Given the histogram, your task is to find the largest square that can cover the most area within the bars
of the histogram.

###Example
* For `histogram = [1, 2, 3, 2, 1]`, the output should be `histogramSquareArea(histogram) = 4`
  There are multiple 2x2 squares that can fit in this histogram, but larger squares would not be able to fit.
* For `histogram = [4, 3, 4]`, the output should be `histogramSquareArea(histogram) = 9`

###Input/Output
* [execution time limit] 3 seconds (kt)
* [input] array.integer histogram
  An array of bar heights for the histogram. All bars have a width of 1.
  Guaranteed constraints:
  `1 <= histogram.length <= 10^6`
  `1 <= histogram[i] <= 10^6`
* [output] integer64
  Return the area of the largest square that covers the most area within the bars of the histogram.