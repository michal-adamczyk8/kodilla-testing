package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    public ArrayList<Shape> shapes = new ArrayList<Shape>();
    private Shape shape;

    public ShapeCollector(Shape shape, int i){
        this.shape=shape;
        this.i=i;
    }

    public void shapeAdder(Shape shape){

    }

    public void shapeRemoval(Shape shape){

    }

    int i;
    public void shapeGetter(int i){

    }

    public int getShapesQuantitiy(){
        return 100;
    }
}
