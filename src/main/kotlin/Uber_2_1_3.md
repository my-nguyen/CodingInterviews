You are moderating a newspaper page, and you have to aklign the text on the page properly. The text is provided to you
in the following format:
* `paragraphs` is an array of paragraphs, where each paragraph is represented as an array of words;
* `aligns` is an array representing the alignment of each paragraph from `paragraphs` - each element is either `"LEFT"`
  or `"RIGHT"`
* `width` represents the maximum number of characters each line of the output can include.

Your task is to produce a newspaper page according to the following specifications:
* For each paragraph `paragraphs[i]`, include all the words `paragraphs[i][j` in order, separated by spaces;
* Include as many words as possibel per each page line (the length of the line must be less than or equal to `width`),
  and put the next word on a new line if it would exceed the limit;
* In the case of excess whitespace, words from `paragraphs[i]` should be aligned according to `aligns[i]` -
  if `aligns[i] == "LEFT"`, the line should have trailing spaces, if `aligns[i] == "RIGHT"`, it should have leading spaces;
* Include a border of `*` characters around all the edges of the result - these characters don't count toward the width,
  they are just added to make output more pretty.

It is guaranteed that it is possible to justify the given paragraphs to the newspaper. Return the resulting newspaper
page as an array of strings.

###Example
For `paragraphs = [["hello", "world"], ["How", "areYou", "doing"], ["Please look", "and align", "to right]],
aligns = ["LEFT", "RIGHT", "RIGHT"], and width = 16`, the output should be
<pre>
justifyNewspaperText(paragraphs, aligns, width) = ["******************",
                                                   "*hello world     *",
                                                   "*How areYou doing*",
                                                   "*     Please look*",
                                                   "*       and align*",
                                                   "*        to right*",
                                                   "******************"]
</pre>

Let's consider all paragraphs:
* `paragraphs[0] = [["hello", "world"]`, both words fit on one line with a combined length of `11`. Since `width = 16`,
  there are `16 - 11 = 5` excess spaces we'll need to add to this line. Because `aligns[0] == "LEFT"`, we align the text
  to the left by adding the spaces onto the end of the line. So the result for this paragraph is the line "hello world     ".
* `paragraphs[1] = ["How, "areYou", "doing"]`, all three words fit on one line with a length of `16`. There are no
  excess spaces, so the result is "How areYou doing".
* `paragraphs[2] = ["Please look", "and align", "to right"]]` the words `"Please look"` and `"and align"` are too long
  to combine (the result would have a length of `21 > 16`), so we'll start a new line with `"and align"`; furthermore,
  the words `"and align"` and `"to right"` would have a combined length of `18 > 16` which is also too long, so
  `"to right"` will also be on a new line. Since `aligns[2] = "RIGHT"`, all excess spaces are added to the beginning
  of each line. Thus, the result of this paragraph is
<pre>
"     Please look"
"       and align"
"        to right"
</pre>

To create the border, we'll add and asterisk (`*` character) to the beginning and end of each line, and we'll also add
a string of `width + 2` asterisk before the first paragraph and after the last paragraph.

###Input/Output
* [execution time limit] 3 seconds (kt)
* [input] array.array.string paragraphs  
  An array of arrays of strings representing text for the newspaper page.  
  Guaranteed constraints:  
  `1 <= paragraphs.length <= 50`.  
  `1 <= paragraphs[i].length <= 10`.  
  `1 <= paragraphs[i][j].length <= width`.
* [input] array.string aligns  
  An array of strings representing how the paragraphs should be aliigned. It is guaranteed that each array element
  equals either `"LEFT"` or `"RIGHT"`.  
  Guaranteed constraints:  
  `aligns.length = lines.length`
* [input] integer width  
  An integer representing the width of the newspaper page.  
  Guaranteed constraints:  
  `5 <= width <= 100`
* [output] array.string
  Return the resulting newspaper page as an array of strings, in which the `ith` string represents the `ith` line
  of the newspaper page.