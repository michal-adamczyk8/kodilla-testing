//package com.kodilla.testing.shape;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//public class ShapeCollectorTestSuite {
//    @Test
//    public void testShapeAdder(){
//        //Given
//        Square square1 = new Square(4);
//        ShapeCollector example = new ShapeCollector(square1);
//
//        //When
//        example.shapeAdder(square1);
//        int quantity = example.getShapesQuantitiy();
//
//        //Then
//        Assert.assertEquals(1, quantity);
//    }
//
//    @Test
//    public void testShapeRemoval(){
//
//        //Given
//        Square square = new Square(4);
//        ShapeCollector example = new ShapeCollector();
//        example.shapeAdder(square);
//
//        //When
//        example.shapeRemoval(square);
//        int quantity = example.getShapesQuantitiy();
//
//        //Then
//        Assert.assertEquals(0, quantity);
//    }
//
//    @Test
//    public void testShapeGetter(){
//
//        //Given
//        Square square = new Square(1);
//        Circle circle = new Circle(2);
//        Triangle triangle = new Triangle(4,5);
//        ShapeCollector example = new ShapeCollector();
//        example.shapeAdder(square);
//        example.shapeAdder(circle);
//        example.shapeAdder(triangle);
//
//        //When
//        Shape receivedShape = example.shapeGetter(1);
//
//        //Then
//        Assert.assertEquals(receivedShape, circle);
//    }
//}
//
