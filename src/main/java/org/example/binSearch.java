package org.example;

public class binSearch {

    public static void main(String[] args){
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(firstAndLast(arr, target));
    }

    public static int[] firstAndLast(int[] arr, int target){
        int start = 0, end = arr.length-1;
        int[] res = new int[2];
        while (start < end){
            int mid = start + (end-start)/2;
            if (arr[mid]<target){

            } else if (arr[mid]>target) {

            } else {

            }
        }

        return res;
    }
}
