/*
326. Power of Three
Given an integer, write a function to determine if it is a power of three.

Example 1:
Input: 27
Output: true

Example 2:
Input: 0
Output: false

Example 3:
Input: 9
Output: true

Example 4:
Input: 45
Output: false
*/

class Solution {
    public boolean isPowerOfThree(int n) {
    	
    	// Solution 1:

    	if (n <= 0) return false;
    	// 3 ^ 0 = 1
    	if (n = 1) return true;

    	while (n > 1) {

    		if (n % 3 != 0) return false;

    		n /= 3;
    	}
    	return true;



    	// Solution 2: simplified code

    	while(n > 1) {
            if(n % 3 != 0) return false;
            n /= 3;
        }
        return n<=0 ? false : true;
        


    }
}