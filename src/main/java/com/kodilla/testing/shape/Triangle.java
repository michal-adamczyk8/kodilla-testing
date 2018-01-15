package com.kodilla.testing.shape;

public class Triangle implements Shape  {
    private double edgeLength;
    private double heigth;

    public Triangle(double edgeLength, double heigth){
        this.edgeLength = edgeLength;
        this.heigth = heigth;
    }

    public void getShapeName(){
        System.out.println("something");
    }

    public void getField(){
        System.out.println(100);
    }
}
