/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeric;

/**
 *
 * @author JamisonSwell
 */
public class Factorial {
    //I used an iterative solution. I set the condition for the loop to i > 1
    //to avoid unnecessary multiplication by 1. This solution also works
    //for calculating the factorial of 0 to be 1.0.
    public static double computeFactorial(int x) {
        //The factorial of any number larger than 170 is too big
        //for a double to hold. If displayed, println() would say
        //these numbers are equal to infinity.
        if (x > 170) {
            throw new OverflowException("Input must be 170 or less");
        }
        
        //Checks if number is negative, for we are not supposed
	//to calculate factorial of negative numbers.
        if (x < 0) {
            throw new NegativeFactorialException("Input must be non-negative");
        }
         
        double result = 1.0;

        for (int i = x; i > 1; --i) {
            result *= i;
        }

        return result;
    }
}