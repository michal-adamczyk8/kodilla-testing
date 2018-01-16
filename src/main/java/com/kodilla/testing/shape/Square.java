package com.kodilla.testing.shape;

public class Square implements Shape {
    private double edgeLength;

    public Square(double edgeLength){
        this.edgeLength = edgeLength;
    }

    public void getShapeName(){
        System.out.println("Square");
    }

    public void getField(){
        double field = (edgeLength*edgeLength);
        System.out.println(field);
    }
}

