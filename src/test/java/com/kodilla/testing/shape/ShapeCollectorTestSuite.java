package com.kodilla.testing.shape;
import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void testShapeAdder(){
        //Given
        Square square = new Square(4);
        ShapeCollector example = new ShapeCollector();

        //When
        example.addFigure(square);
        Shape finalFigure = example.getFigure(0);

        //Then
        Assert.assertEquals(square, finalFigure);
    }

    @Test
    public void testShapeRemoval(){

        //Given
        Square square = new Square(4);
        ShapeCollector example = new ShapeCollector();
        example.addFigure(square);

        //When
        example.removeFigure(square);
        int quantity = example.getShapesQuantitiy();

        //Then
        Assert.assertEquals(0, quantity);
    }

    @Test
    public void testShapeGetter(){

        //Given
        Square square = new Square(1);
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(4,5);
        ShapeCollector example = new ShapeCollector();
        example.addFigure(square);
        example.addFigure(circle);
        example.addFigure(triangle);

        //When
        Shape receivedShape = example.getFigure(1);

        //Then
        Assert.assertEquals(receivedShape, circle);
    }
}

