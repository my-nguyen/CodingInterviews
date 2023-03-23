When you open the dialer of your phone and start typing a number, you will probably get search results from the saved
contacts for the number you entered. Your task is to implement a similar feature.

Saved contacts are numbered from 0 to N-1. They are represented by two arrays A, B of N strings each. Name of K-th
contact is A[K] and phone number is B[K].

Write a function: `public String solution(String[] A, String[] B, String P);`  
which, given two arrays A and B and a string P of length M representing a partial phone number, returns the contact name
whose phone number contains P as a substring, that is a contiguous segment (for example, "436800143" contains as
a substring "6800" but not "3614").

If there is more than one contact matching the search criteria, your function should return the alphabetically smallest
contact name.

If no match is found, your function should return "NO CONTACT".

Examples:
1. Given A = ["pim", "pom"], B = ["999999999", "777888999"] and P = "88999", your function should return "pom", because
   only pom's phone number contains "88999".
2. Given A = ["sander", "amy", "ann", "michael"], B = ["123456789", "234567890", "789123456", "123123123"] and P = "1",
   your function should return "ann". Note that sander, ann and michael's phone numbers contain "1" but "ann" is
   alphabetically smaller than "michael" and "sander"
3. Given A = ["adam", "eva", "leo"], B = ["121212121", "111111111", "444555666"] and P = "112", your function should
   return "NO CONTACT" because no phone number contains "112".

Assume that:
* N is an integer within the range [1..100];
* each name has length at least 1 and at most 9;
* each name consists only of lowercase English letters;
* each phone number has length 9;
* each phone number consists only of digits;
* M is an integer within the range [1..9];
* the partial phone number consists only of digits.

In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.