package org.example;

import static java.lang.System.*;

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {8,9,10,11,1,2,3,4,5,6,7};
        out.println(findIndex(arr,12));
        //System.out.println("Hello world!");
    }

    public static int findIndex(int[] arr, int k){
        int start = 0, end = arr.length-1;
        while (start<=end){
            int mid = (end+start)/2;
            if (arr[mid]==k){
                return mid;
            }

            if (arr[start]<=arr[mid]){
                if (k>arr[mid] || k<arr[start]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (k<arr[mid] || k>arr[end]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}