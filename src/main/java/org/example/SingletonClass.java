package org.example;

public class SingletonClass {
    private static final SingletonClass instance = new SingletonClass();
    private SingletonClass(){}
    public static SingletonClass getInstance(){
        return instance;
    }
}


/* singleton pattern ensures that only one instance of a class exists
   and provides a global access point to it */