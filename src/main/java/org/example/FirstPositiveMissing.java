package org.example;

// find the first positive missing from an unsorted array, in O(n) time & O(1) space

// intuition - any number that is missing would be in the range of 1 to length(arr)+1
// so we ignore negative, 0 and numbers greater than the length of array

// approach - use the input array, move the number (other than 0, negative and greater than length)
// to the appropriate index, like if arr[i] is 2, move (swap) it to index 1 (arr[i]-1)
public class FirstPositiveMissing {
    public static void main (String[] args){
        int[] nums = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums){
        int n = nums.length;
        for (int i=0; i<n; i++){
            while (nums[i]>=1 && nums[i]<=n && nums[i]!=nums[nums[i]-1]){
                swap(nums, i, nums[i]-1);
            }
        }

        for (int i=0; i<n; i++){
            if (nums[i]!=i+1){
                return i+1;
            }
        }

        return n+1;
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
