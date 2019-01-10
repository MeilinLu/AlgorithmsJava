/*
66. Plus One
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:
Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

Example 2:
Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
*/

class Solution {
    public int[] plusOne(int[] digits) {
        
        // Solution 1:
        
        if (digits == null || digits.length == 0)  return digits;
        int carry = 1;
        
        for (int i = digits.length - 1; i >= 0; i--) {
            // +carry, because only add one this digit, not for all digit       
            int value = digits[i] + carry;  
            // when value=9+1=10, then the digit should be 0,
            digits[i] = value % 10;         
            // and carry is 1 for next round
            carry = value / 10;            
        }
        
        // OR for loop:
        
        for (int i = digits.length -1; i >= 0; i--) {
    		int value = digits[i] + carry;
    		if (value < 10) {
    			digits[i] = value;
    			carry = 0;
    		} else {
    			digits[i] = 0;
    		}
    	}
        
        
        // solve 99, 999 and etc 
        
        if( carry == 1) {                   
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 1; i < result.length; i++) {
                result[i] = digits[i - 1];
            }
            return result;
        }
        return digits;


    	// Solution 2:

		int n = digits.length;
    	// check each digit from the last element,
        // If it is smaller than 9, just add 1 and return
        // If it is 9, make it 0, and add 1 to next digit in next round.
        for (int i = n - 1; i >= 0; i--){
            if (digits[i] < 9){
                //digits[i]++;
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
	    // If the number contains all 9s，such as 9999 --> 10000
	    // Initialize a new Array with one more space，
        // then the first element is 1, and others are all 0.
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        for (int i = 1; i < n+1; i++){
            newNumber[i] = 0;
        }
        return newNumber;
    }
}