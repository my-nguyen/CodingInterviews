#Counting Pairs

Given an integer k and a list of integers, count the number of distinct valid pairs of integers (a, b) in the list
for which a + k = b. Two pairs of integers (a, b) and (c, d) are considered distinct if at least one element of (a, b)
does not also belong to (c, d). Note that the elements in a pair might be the same element in the array. An instance
of this is below where k = 0.

###Example 0
n = 4  
numbers = [1, 1, 1, 2]  
k = 1

This array has three different valid pairs: (1, 1) and (1, 2) and (2, 2). For k = 1, there is only 1 valid pair
which satisfies a + k = b: the pair (a, b) = (1, 2)

n = 2  
numbers = [1, 2]  
k = 0

There are three valid pairs: (1, 1) and (1, 2) and (2, 2). For k = 0, two valid pairs satisfy a + k = b: 1 + 0 = 1
and 2 + 0 = 2.

###Function Description
Complete the function *countPairs* in the editor below

countPairs has the following parameter(s):
* int numbers[n]: array of integers
* int k: target difference

###Returns
* int: number of valid (a, b) pairs in the numbers array that have a difference of k

###Constraints
* 2 <= n <= 2 x 10^5
* 0 <= numbers[i] <= 10^9, where 0 <= i < n
* 0 <= k <= 10^9

##Input Format for Custom Testing
Input from stdin will be processed as follows and passed to the function.

The first line contains an integer n, the size of the array *numbers*  
Each of the next *n* lines contains an integer numbers[i] where 0 <= i < n.  
The next line contains an integer k.

###Sample Input 0
<pre>
STDIN   Function
-----   ------------------
6    -> numbers[] size = 4
1    -> numbers = [1,1,2,2,3,3]
1
2
2
3
3
1    -> k = 1
</pre>

###Sample Output 0
2

###Explanation 0
There are 2 valid pairs in numbers = [1,1,2,2,3,3] for k = 1, a + k = b:
* (1, 2)
* (2, 3)

###Sample Input 1
<pre>
STDIN   Function
-----   ------------------
6    -> numbers[] size = 6
1    -> numbers = [1,2,3,4,5,6]
1
2
3
4
5
6
2    -> k = 2
</pre>

###Sample Output 1
4

###Explanation 1
There are 4 valid pairs in numbers = [1,2,3,4,5,6] for k = 2, a + 2 = b:
* (1, 3)
* (2, 4)
* (3, 5)
* (4, 6)

###Sample Input 2
<pre>
STDIN   Function
-----   ------------------
6    -> numbers[] size = 6
1    -> numbers = [1,2,5,6,9,10]
1
2
5
6
9
10
2    -> k = 2
</pre>

###Sample Output 1
0

###Explanation 1
No valid pairs exist in = [1,2,5,6,9,10] for k = 2, a + 2 = b, so the function returns 0
