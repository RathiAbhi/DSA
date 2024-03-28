package org.example;

public class KokoBananas {
    public static void main(String[] args){
        int[] piles = {30,11,23,4,20};
        int h = 5;
        System.out.println(minEatingSpeed(piles,h));
    }

    public static int minEatingSpeed(int[] piles, int h){
        int left = 1, right = 1;
        for (int pile:piles){
            right = Math.max(pile,right);
        }

        while(left<right){
            int mid = (left+right)/2;
            double hourSpent = 0;

            for (int pile:piles){
                hourSpent = hourSpent + Math.ceil((double) pile/mid);
            }

            if (hourSpent<=h){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}
