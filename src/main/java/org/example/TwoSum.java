package org.example;

import java.util.*;
public class TwoSum {
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(twoSum(nums,target));
    }

    public static List<Integer> twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int rem = target - nums[i];
            if (map.containsKey(rem)){
                List<Integer> res = new ArrayList<>();
                res.add(map.get(rem));
                res.add(i);
                return res;
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
