/*
389. Find the Difference
Given two strings s and t which consist of only lowercase letters.
String t is generated by random shuffling string s and then add one more letter at a random position.
Find the letter that was added in t.
*/

class Solution {

    public char findTheDifference(String s, String t) {
    	
    	int res = 0;
    	
    	for (int i = 0; i < t.length(); i++) {
    		res += (int)t.charAt(i);
    	}

    	for (int i = 0; i < s.length(); i++) {
    		res -= (int)s.charAt(i);
    	}

    	return (char) res;

    	// return (char) Math.abs(res); // if we don't know s or t which is longer
    	
    }

}