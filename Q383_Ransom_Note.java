/*

383. Ransom Note

Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true

Similar Question: Q242
*/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Solution 1: 
        boolean res = true;
        byte[] bytes = new byte[magazine.length()]; 
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            boolean found = false;
            for (int j = 0; j < magazine.length(); j++) {
                if (bytes[j] == 0 && magazine.charAt(j) == c) {
                    bytes[j]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                res = false;
                break;
            }
        }
        return res;
        
        // Solution 2:
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i)-'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++){
            if (--arr[ransomNote.charAt(i)-'a'] < 0){
                return false;
            }
        }
        return true;
        
        // Solution 3:
        int[] counter = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            counter[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (counter[ransomNote.charAt(i) - 'a'] <= 0) {
                return false;
            }
            counter[ransomNote.charAt(i) - 'a']--;
        }
        return true;
    }   
}