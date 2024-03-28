package org.example;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {8,9,10,11,1,2,3,4,5,6,7};
        out.println(findIndex(arr,1));
        //System.out.println("Hello world!");
    }

    public static int findIndex(int[] arr, int k){
        int start = 0, end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid]==k){
                return mid;
            }

            if (arr[end]>arr[mid]){
                // this section is sorted, other is not
                if (arr[mid]<k && arr[end]>k){
                    start = mid;
                } else {
                    end = mid;
                }
                mid = start + (end-start)/2;
            } else {
                if (arr[start]<k && arr[mid]>k){
                    end = mid;
                } else {
                    start = mid;
                }
                mid = start + (end-start)/2;
            }
        }
        return -1;
    }
}