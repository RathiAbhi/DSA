package org.example;

import java.util.*;
public class priorityQueue {

    public static void main(String[] args){
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findLargest(nums,k));
    }

    public static int findLargest(int[] nums, int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int n:nums){
            heap.add(n);

            if (heap.size()>k){
                heap.poll();
            }
        }
        return heap.peek();
    }
}
