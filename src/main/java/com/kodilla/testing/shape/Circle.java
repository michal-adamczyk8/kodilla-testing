package com.kodilla.testing.shape;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void getShapeName(){
        System.out.println("something");
    }

    public void getField(){
        System.out.println(100);
    }
}
