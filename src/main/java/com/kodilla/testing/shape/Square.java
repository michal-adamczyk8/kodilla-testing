package com.kodilla.testing.shape;

public class Square implements Shape {
    private double edgeLength;

    public Square(double edgeLength){
        this.edgeLength = edgeLength;
    }

    public void getShapeName(){
        System.out.println("something");
    }

    public void getField(){
        System.out.println(100);
    }
}

