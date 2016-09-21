package numeric;

/**
  * This class implements the Factorial class and its computeFactorial() method.
  *
  * @author James Osborne
  * @version 1.0  
  * File: Factorial.java
  * Created: 20 Sept 2016
  * ©Copyright James Osborne. All rights reserved.
  * Summary of Modifications:
  *     20 Sept 2016 - JAO - Switched from if-else error structure to
  *     an error structure which throws exceptions instead.
  * 
  * Description: This class provides the static method used to calculate
  * factorial from any valid non-negative integer.
  */
public class Factorial {
    /**
      * Computes factorial from any valid non-negative integer.
      *
      * @param x The name of the integer the method is calculating factorial of.
      * @return A double holding the factorial of x.
      * @throws OverflowException If x is greater than 170.
      * @throws NegativeFactorialException If x is negative.
      */
    public static double computeFactorial(int x) {
        //Throws an Overflow error in this case for the factorial
        //of any number greater than 170 is too large for a double to store.
        if (x > 170) {
            throw new OverflowException("Input must be 170 or less");
        }
        
        //Throws exception if given a negative integer
        //for the factorial of a negative does not exist.
        if (x < 0) {
            throw new NegativeFactorialException("Input must be non-negative");
        }
         
        double result = 1.0;

        //Ending condition of i > 1 prevents unnecessaary multiplicationn by 1.
        for (int i = x; i > 1; --i) {
            result *= i;
        }

        return result;
    }
}