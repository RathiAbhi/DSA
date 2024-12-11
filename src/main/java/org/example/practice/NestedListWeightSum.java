package org.example.practice;

import java.util.Arrays;

public class NestedListWeightSum {
    public static void main(String[] args){
        int[][] nestedList = {{1},{3},{5}};
        String nestedArrayString = Arrays.deepToString(nestedList);
        System.out.println(nestedArrayString);
        System.out.println(nestedSum(nestedList));
    }

    public static int nestedSum(int[][] nestedList){
        return 0;
    }
}
