Given a positive integer number n, your task is to calculate the difference between the product of its digits and
the sum of its digits.

**Note**: The order matters; the answer should be of the form `product - sum` (and not `sum - product`)

###Example
* For `n = 123456`, the output should be `digitsManipulation(n) = 699`
  * The product of the digits is equal to `1 * 2 * 3 * 4 * 5 * 6 = 720`
  * The sum of the digits is equal to `1 + 2 + 3 + 4 + 5 + 6 = 21`  
  So the final answer is `720 - 21 = 699`

* For `n = 1010`, the output should be `digitsManipulation(n) = -2`
  * The product of the digits is equal to `1 * 0 * 1 * 0 = 0`
  * The sum of the digits is equal to `1 + 0 + 1 + 0 = 2`  
    So the final answer is `0 - 2 = -2`

###Input/Output
* [execution time limit] 3 seconds (kt)
* [input] integer n  
  A positive integer  
  Guaranteed constraints:  
  `1 <= n <= 10^9`
* [output] integer  
  The difference between the product of n's digits and the sum of n's digits.