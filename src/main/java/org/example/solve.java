package org.example;
/*
Given a string s, find the length of the longest
substring
 without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

 */


import java.util.HashMap;

public class solve {
    public static void main(String[] args){
        String a = "abcadbcbb";
        System.out.println(substringLength(a));
    }

    public static int substringLength(String a){
        int left = 0, right = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        if (a.length()==1) return 1;
        int max = Integer.MIN_VALUE;
        while (right < a.length()){
            if (!map.containsKey(a.charAt(right))){
                map.put(a.charAt(right),1);
                max = Math.max(map.size(),max);
            } else {
                while (left<=right){
                    map.remove(a.charAt(left));
                    if (!map.containsKey(a.charAt(right))){
                        map.put(a.charAt(right),1);
                        break;
                    }
                    left++;
                }
            }
            right++;
        }
        return max;
    }
}
