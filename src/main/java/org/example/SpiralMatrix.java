package org.example;

import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> list = new ArrayList<>();
        int rb = 0;
        int re = matrix.length-1;
        int cb = 0;
        int ce = matrix[0].length-1;

        while (rb<=re && cb<=ce){
            for (int j=cb; j<=ce; j++){
                list.add(matrix[rb][j]);
            }
            rb++;
            for (int i=rb; i<=re; i++){
                list.add(matrix[i][ce]);
            }
            ce--;
            if (rb<=re){
                for (int k=ce; k>=cb; k--){
                    list.add(matrix[re][k]);
                }
            }
            re--;
            if (cb<=ce){
                for (int l=re; l>=rb; l--){
                    list.add(matrix[l][cb]);
                }
            }
            cb++;
        }
        return list;
    }
}
