package org.example;

public class MultiThread extends Thread{
    @Override
    public void run(){
        System.out.println("code executed by thread: "+ Thread.currentThread().getName());
    }

    public static void main(String[] args){
        System.out.println("Going inside main: "+ Thread.currentThread().getName());
        MultiThread myThread = new MultiThread();
        myThread.start();
        System.out.println("Finishing the main: "+ Thread.currentThread().getName());
    }
}
