/* 

242. Valid Anagram
Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

Note:
You may assume the string contains only lowercase alphabets.

Simalar Question: Q383.

*/

class Solution {
    public boolean isAnagram(String s, String t) {
    	if (s == null || t == null || s.length() != t.length()) return false;
    	int[] counter = new int[26];
    	for (int i = 0; i < s.length(); i++) {
    		counter[s.charAt(i) - 'a']++;
    	}
    	for (int i = 0; i < t.length(); i++) {
    		if (counter[t.charAt(i) - 'a'] > 0) {
    			counter[t.charAt(i) - 'a']--;
    		} else {
    			return false;
    		}
    	}
    	return true;
    }
}
