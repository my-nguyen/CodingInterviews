You are given an array of strings a.
Your task is to construct an array of strings of the same length, where the i<sup>th</sup> element is equal to the first character of a[i], concatenated with the last character of a[i + 1].

If there is no a[i + 1], cycle back to the beginning of the array.
In other words, for the final element, concatenate the first character of a[a.length - 1] with the last character of a[0].

Return the resulting array of 2-character strings.

**Example**
* For a = ["cat", "dog", "ferret", "scorpion"], the output should be concatEdgeLetters(a) = ["cg", "dt", "fn", "st"].
* For a = ["I", "have", "a", "nice", "surprise"], the output should be concatEdgeLetters(a) = ["Ie", "ha", "ae", "ne", "sI"].
* For a = ["singularity"], the output should be concatEdgeLetters(a) = ["sy"].

**Input/Output**
* **[execution time limit] 3 seconds (java)**
* **[input] array.string a**  
    An array of strings consisting of alphanumeric characters

    *Guarantee constraints:*  
    1 <= a.length <= 100  
    1 <= a[i].length <= 100

* **[output] array.string**  
    Return the resulting array of 2-character strings
  

