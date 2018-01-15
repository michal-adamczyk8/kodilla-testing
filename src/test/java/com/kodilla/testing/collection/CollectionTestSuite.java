package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    private static int testcounter = 0;

    @Before
    public void beforeEachTest() {
        testcounter++;
        System.out.println("Preparing to execute test #: " + testcounter);
        }

    @After
    public void afterEachTest(){
        System.out.println("Test #: " + testcounter + " has just finished. It's all working");
        System.out.println("");
    }


    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        //When
        int sizeOfTheList = exterminator.exterminate(emptyList).size();
        //Then
        Assert.assertEquals(0, sizeOfTheList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> newList = Arrays.asList(2,3,4,5,6,7,8,9,10,45,67,134,56,11345);
        //When
        List<Integer> evenNumbers = exterminator.exterminate(newList);
        //Then
        List<Integer> finalList = Arrays.asList(2,4,6,8,10,134,56);
        Assert.assertEquals(finalList, evenNumbers);
    }
}
