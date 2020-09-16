
/*import java.util.*;
import java.lang.*;*/

package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    //  First test
    public static void firstTest() {
        System.out.println("\nFirst unit test!");

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if( result.equals("theForumUser") ) {
            System.out.println("Ok\n");
        } else {
            System.out.println("Error\n");
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        //firstTest();


        //  Second test

        //  Testing sum
        Calculator addCalculator = new Calculator(4, 6);

        int addMethod = addCalculator.add(4, 6);

        int addGetters = addCalculator.getA() + addCalculator.getB();

        if( addMethod == addGetters ) {
            System.out.println("Test add - OK!");
        } else {
            System.out.println("Test add - ERROR!");
        }


        //  Testing minus
        Calculator subtractCalculator = new Calculator(9, 7);

        int subtractMethod = subtractCalculator.subtract(9, 7);

        int subtractGetters = subtractCalculator.getA() - subtractCalculator.getB();

        if ( subtractMethod == subtractGetters ) {
            System.out.println("Test subtract - OK!");
        } else {
            System.out.println("Test subtract - ERROR!");
        }



    }
}
