package org.example;

import java.util.*;


public class Interview {

    public static void main(String[] args){
        char matrix[][]= {{'D','U'},{'U','U'}};
        System.out.println(logic(matrix));
    }

    public static int logic(char[][] matrix){
        int max = matrix.length * matrix[0].length;
        int count = 0;
        int i=0, j=0;
        while (i<matrix.length && j<matrix[0].length && i>=0 && j>=0){
                count++;
                if (matrix[i][j] == 'D'){
                    i = i+1;
                } else if (matrix[i][j] == 'U'){
                    i = i-1;
                } else if (matrix[i][j] == 'L'){
                    j = j-1;
                } else if (matrix[i][j] =='R'){
                    j = j+1;
                }

                if (count>max){
                    return 0;
                }
        }

        return count;
    }
}