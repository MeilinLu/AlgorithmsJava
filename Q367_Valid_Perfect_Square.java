
/*
367. Valid Perfect Square
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:
Input: 16
Output: true

Example 2:
Input: 14
Output: false
*/

class Solution {
    public boolean isPerfectSquare(int num) {
        
        // Solution 1:
        
        long r = num;
        while (r*r > num){
            r = (r + num/r) / 2;
        }
        return r*r == num;
        
        // Solution 2: 
        if (num == 1) return true;
        for(int i = 1; i < num; i++){
            if(i*i == num) {  
                return true;
            }
            
        }
        return false;
    }
}