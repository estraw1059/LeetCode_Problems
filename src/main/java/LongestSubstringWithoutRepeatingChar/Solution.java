package LongestSubstringWithoutRepeatingChar;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    //Solution.java to: https://leetcode.com/problems/longest-substring-without-repeating-characters
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int left = 0;
        int longest = 0;
        for(int right = 0; right < s.length(); right++) {
            if (set.contains(s.charAt(right))) {
                while(s.charAt(left) != s.charAt(right)) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
                set.add(s.charAt(right));
            } else {
                set.add(s.charAt(right));
                longest = Math.max(longest, right-left+1);
            }
        }
        return longest;
    }
}
