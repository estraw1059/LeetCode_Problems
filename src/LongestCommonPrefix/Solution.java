package LongestCommonPrefix;

//Leet Code Problem: https://leetcode.com/problems/longest-common-prefix/description/
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int longestPrefix = 0;
        while(true) {
            if (longestPrefix == strs[0].length()) {
                return strs[0];
            }
            String prefix = strs[0].substring(0, longestPrefix+1);
            for(int i = 1; i < strs.length; i++) {
                if (longestPrefix >= strs[i].length()) {
                    return strs[i].substring(0, longestPrefix);
                }
                if (!prefix.equals(strs[i].substring(0, longestPrefix+1))) {
                    return strs[0].substring(0, longestPrefix);
                }
            }
            longestPrefix++;
        }
    }
}