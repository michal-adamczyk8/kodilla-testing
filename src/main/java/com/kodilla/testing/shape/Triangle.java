package com.kodilla.testing.shape;

public class Triangle implements Shape  {
    private double edgeLength;
    private double heigth;

    public Triangle(double edgeLength, double heigth){
        this.edgeLength = edgeLength;
        this.heigth = heigth;
    }

    public String getShapeName(){
        return "Triangle";
    }

    public double getField(){
        double field = (1/2*edgeLength*heigth);
        return field;
    }
}
