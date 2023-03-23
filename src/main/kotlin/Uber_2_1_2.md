You are given a non-negative integer `number` represented as a string of digits, and a positive integer `k`. Your task
is to perform the following algorithm:
1. If the length of the `number` is less than or equal to `k`, end the algorithm. Otherwise proceed to the next steps.
2. Split the `number` into groups of `k` digits in each. The last group may contain less than `k` digits.
3. Add up the digits in each group, and concatenate these results in the same order.
4. Replace the `number` with the result of step 3 and go back to step 1.

Return the resulting string `number` after the algorithm ends.

**It is guaranteed that the algorithm will end at step 1 at some point.**

###Example
* For `number = "1111122222` and `k = 3`, the output should be 'reduceTheNumber(number, k) = "132"'
  * The `number` has length `10 > k`, so we proceed to the next steps;
  * We split `number` into groups of size `k = 3: [111, 112, 222, 2]`. Note that the last group is not full and has only
  one digit.
  * We add up the digits in each group, and concatenate the results. Thus, the new value of `number` becomes `"3462"`;
  * We start again with step 1: `number` has length `4 > k`, so we proceed to the next steps;
  * We split `number` into groups of size `k = 3: [346, 2]`;
  * We add up the digits in each group, and concatenate the results, the new number is `"132"`;
  * The length of the new number is `3 = k`, so the algorithm ends with `"132"` as a result.

* For `number = "1111122222` and `k = 5`, the output should be 'reduceTheNumber(number, k) = "510"'
    * We successfully proceed step 1 and split the number into groups of `k = 5` digits on step 2: `[11111, 22222]`;
    * We add up the digits in each group, and concatenate the results, and the number becomes `"510"`;
    * The new `number` has length `3 < k`, so we finish the algorithm and return the string `"510"`.

###Input/Output
* [execution time limit] 3 seconds (kt)
* [input] string number
  A string of digits representing the initial number. It is guaranteed that the given string contains only digits and
  doesn't contain leading zeros (unless the number is 0).  
  Guaranteed constraints:  
  `1 <= number.length <= 1000`
* [input] integer k
  The size of the groups `number` should be split into.
  Guaranteed constraints:  
  3 <= k <= 1000
* [output] string
  The string on which the algorithm ends.