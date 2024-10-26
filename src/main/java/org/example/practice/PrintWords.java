package org.example.practice;

public class PrintWords {
    public static void main(String[] args){
        int buzzCounter = 0;
        int fizzCounter = 0;
        int fizzBuzzCounter = 0;

        for (int i=1; i<=25; i++){
            if (i%3==0 & i%5==0){
                System.out.println("FizzBuzz");
                fizzBuzzCounter++;
            } else if (i%5==0){
                System.out.println("Fizz");
                fizzCounter++;
            } else if (i%3==0){
                System.out.println("Buzz");
                buzzCounter++;
            } else {
                System.out.println(i);
            }
        }

        System.out.println("Buzz: "+buzzCounter);
        System.out.println("Fizz: "+fizzCounter);
        System.out.println("FizzBuzz: "+fizzBuzzCounter);
    }
}
