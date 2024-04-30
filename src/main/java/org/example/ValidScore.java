package org.example;

import java.util.Stack;
import java.util.concurrent.locks.StampedLock;

public class ValidScore {

    public static void main(String[] args){
        String a = "[{()}]";
        System.out.println(validScore(a));
    }

    public static int validScore(String a){
        int score = 0;
        Stack<Character> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();

        for (int i=0; i<a.length(); i++){
            if (stack.empty()){
                stack.push(a.charAt(i));
                stack1.push(i);
            } else {
                char b = stack.peek();
                if (a.charAt(i)==')' && b=='('){
                    if (i-stack1.peek()>1){
                        score = score * 2;
                    } else {
                        score = score + 1;
                    }
                    stack1.pop();
                    stack.pop();
                } else if (a.charAt(i)=='}' && b=='{'){
                    if (i-stack1.peek()>1){
                        score = score * 2;
                    } else {
                        score = score + 1;
                    }
                    stack1.pop();
                    stack.pop();
                } else if (a.charAt(i)==']' && b=='[') {
                    if (i-stack1.peek()>1){
                        score = score * 2;
                    } else {
                        score = score + 1;
                    }
                    stack1.pop();
                    stack.pop();
                } else {
                    stack.push(a.charAt(i));
                    stack1.push(i);
                }
            }
        }

        if (stack.size()!=0){
            return 0;
        }

        return score;
    }
}
