/*
14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
Input: ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Note:
All given inputs are in lowercase letters a-z.
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        // Solution 1: Compare one by one
        if(strs == null || strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i=0;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){   // for (String s : strs ) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
        
        // Solution 2: Sorted ==> compare first and last 
        if (strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        String word1 = strs[0];
        String word2 = strs[strs.length - 1];
        while (word2.indexOf(word1) != 0) {
            word1 = word1.substring(0, word1.length() - 1);
        }
        return word1;       
    }
}