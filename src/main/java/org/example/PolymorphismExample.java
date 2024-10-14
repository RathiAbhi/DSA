package org.example;

    class Animal{
        public void sound(){
            System.out.println("Some sound");
        }
    }

    class Dog extends Animal{
        public void sound(){
            System.out.println("Bark");
        }
    }

    class TestPolymorphism{
        public static void main(String[] args){
            Animal a = new Dog();
            a.sound();
        }
    }

