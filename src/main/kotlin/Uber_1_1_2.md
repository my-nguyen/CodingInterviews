Let's define the *reverse* of an integer x as the number obtained by reversing the order of the digits of x and then
moving any leading zeroes to the end of the resulting number.

Given an array of integers arr, your task is to calculate the sum of *reverse* numbers of the elements of arr.

**Example**
* For arr = [7, 234, 58100], the output should be sumOfReversed(arr) = 18939.
    * The *reverse* of 7 is 7.
    * The *reverse* of 234 is 432.
    * The *reverse* of 58100 is 18500.
    * So the answer is 7 + 432 + 18500 = 18939.
* For arr = [0, 100, 220], the output should be sumOfReversed(arr) = 320.
    * The *reverse* of 0 is 0.
    * The *reverse* of 100 is 100.
    * The *reverse* of 220 is 220.
    * So the answer is 0 + 100 + 220 = 320.

**Input/Output**
* **[execution time limit] 3 seconds (java)**
* **[input] array.inter arr**  
    An array of non-negative integers.  
    *Guaranteed constraints:*  
    0 <= arr.length <= 10<sup>5</sup>  
    1 <= arr[i] <= 10<sup>9</sup>
* **[output] integer64**  
    The sum of the *reverse* numbers of the elements of arr.