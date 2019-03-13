/*
342. Power of Four
Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example 1:
Input: 16
Output: true

Example 2:
Input: 5
Output: false
*/
class Solution {

    public boolean isPowerOfFour(int num) { 

    	// Solution 1:

    	if (num <= 0) return false;

    	if (num == 1) return true;

    	while (num >= 2) {

    		if (num % 4 != 0) return false;

    		num /= 4;
    	} 

    	return true;



    	// OR: same idea:

        while (num > 0){

            if (num == 1) return true;
            
            if (num % 4 != 0) {

                return false;

            } else {

                num = num / 4;

            }

        }
        return false;


        // Solution 2: Math.log

        if (num == 1) return true;

        int power = (int) (Math.log(num) / Math.log(4)); //*******

        if (num == Math.pow(4, power)){

            return true;

        } else {

            return false;

        }

    }

}