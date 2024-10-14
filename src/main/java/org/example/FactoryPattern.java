package org.example;

public class FactoryPattern {

    interface Shape {
        void draw();
    }

    class Circle implements Shape{

        @Override
        public void draw() {
            System.out.println("Drawing circle");
        }
    }

    class ShapeFactory{
        public Shape getShape(String shapeType){
            if (shapeType.equals("Circle")){
                return new Circle();
            }
            return null;
        }

    }
}
