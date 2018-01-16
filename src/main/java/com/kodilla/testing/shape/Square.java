package com.kodilla.testing.shape;

public class Square implements Shape {
    private double edgeLength;

    public Square(double edgeLength){
        this.edgeLength = edgeLength;
    }

    public String getShapeName(){
        return "Square";
    }

    public double getField(){
        double field = (edgeLength*edgeLength);
        return field;
    }
}

