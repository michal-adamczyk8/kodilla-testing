package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public ArrayList<Shape> addFigure(Shape shape){
        shapes.add(shape);
        return shapes;
    }

    public ArrayList<Shape> removeFigure(Shape shape){
        shapes.remove(shape);
        return shapes;
    }

    public Shape getFigure(int n){
        return shapes.get(n);
    }

    public int getShapesQuantitiy(){
        return  shapes.size();
        }

}
