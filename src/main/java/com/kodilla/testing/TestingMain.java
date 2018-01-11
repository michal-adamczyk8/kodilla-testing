package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
        public static void main (String[] args) {

                SimpleUser simpleUser = new SimpleUser("theForumUser");
                String result = simpleUser.getUsername();

                if (result.equals("theForumUser")) {
                        System.out.println("test OK");
                }
                else {
                        System.out.println("Coś poszło nie tak!");
                }

                Calculator calculator = new Calculator(5,674);
                int result1 = calculator.add();

                if (result1 == 674+5){
                        System.out.println("Drugi test poszedł bez zarzutów!");
                }
                else {
                        System.out.println("Błąd");
                }
        }
}
