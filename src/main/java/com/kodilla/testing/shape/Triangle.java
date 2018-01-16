package com.kodilla.testing.shape;

public class Triangle implements Shape  {
    private double edgeLength;
    private double heigth;

    public Triangle(double edgeLength, double heigth){
        this.edgeLength = edgeLength;
        this.heigth = heigth;
    }

    public void getShapeName(){
        System.out.println("Triangle");
    }

    public void getField(){
        double field = (1/2*edgeLength*heigth);
        System.out.println(field);
    }
}
