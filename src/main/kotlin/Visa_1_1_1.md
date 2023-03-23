#Picking Tickets

Consider an array of n ticket prices, tickets. A number, m, is defined as the size of some subsequence, s, of tickets
where each element covers an unbroken range of integers. That is to say, if you were to sort the elements in s,
the absolute difference between any elements j and j+1 would be either 0 or 1. Determine the maximum length
of a subsequence chosen from the tickets array.

###Example
tickets = [8,5,4,8,4]  
Valid subsequences, sorted, are {4,4,5} and {8,8}. These subsequences have m values of 3 and 2, respectively. Return 3.

###Function Description
Complete the function *maxTickets* in the editor below.

maxTickets has the following parameter(s);
* int tickets[n]: an array of integers

###Returns
int: an integer that denotes the maximum possible value of m

###Constraints
* 1 <= n<= 10^5
* 1 <= tickets[i] <= 10^9

##Input Format for Custom Testing
The first line contains an integer, n, that denotes the number of elements in tickets.

Each line i of the n subsequent lines (where 0 <= i <= n) contains an integer that describes tickets[i].

##Sample Case 0
###Sample Input 0
STDIN   Function
-----   ------------------
4    -> tickets[] size = 4
4    -> tickets = [4, 13, 2, 3]
13
2
3

###Sample Output 0
3

###Examplanation
There are two subsequences of tickets that contain consecutive integers when sorted: {2,3,4} and {13}. These subsequences
have m values of 3 and 1, respectively. Return the maximum value of m, which is 3.
