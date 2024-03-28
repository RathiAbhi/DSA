package org.example;

// longest substring without repeating characters, O(n) time and O(1) space

import java.util.HashMap;

// sliding window, storing left to the next of the last occurrence of a character at right
public class LongestSubstringWithoutRepeating {
    public static void main(String[] args){
        String s = "abcabcbb";
        System.out.println(longestSubstringWithoutRepeatingCharacter(s));
    }

    public static int longestSubstringWithoutRepeatingCharacter(String s){
        if (s.length()==0){
            return 0;
        } else if (s.length()==1){
            return 1;
        }

        int len = 0, left=0, right=0;
        HashMap<Character,Integer> map = new HashMap<>();

        while(right<s.length()){
            if (!map.containsKey(s.charAt(right))){
                map.put(s.charAt(right), right);
            } else {
                left = Math.max(left, map.get(s.charAt(right))+1);
                map.put(s.charAt(right),right);
            }
            len = Math.max(len, (right-left+1));
            right++;
        }

        return len;
    }
}
