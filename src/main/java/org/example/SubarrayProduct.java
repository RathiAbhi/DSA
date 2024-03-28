package org.example;

// find the number of contiguous subarrays which have the product less than k

// approach : sliding window, if product < k -- add element otherwise remove
public class SubarrayProduct {
    public static void main(String[] args){
        int[] nums = {10,5,2,6};
        int k = 100;
        System.out.println(subArrayProductLessThanK(nums,k));
    }

    public static int subArrayProductLessThanK(int[] nums, int k){
        int left = 0, right = 0;
        int product = 1;
        int ans = 0;
        while (right<nums.length){
            product = product * nums[right];
            right++;
            while (left<right && product>=k){
                product = product/nums[left];
                left++;
            }

            if (product<k){
                ans = ans + right - left;
            }
        }
        return ans;
    }
}
