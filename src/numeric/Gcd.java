package numeric;

/**
  * This class implements the Gcd class and its computeGCD() method.
  *
  * @author James Osborne
  * @version 1.0  
  * File: Gcd.java
  * Created: 20 Sept 2016
  * ©Copyright James Osborne. All rights reserved.
  * Summary of Modifications:
  *     20 Sept 2016 - JAO - Moved y == 0 check inside of computeGCD()
  * 
  * Description: This class provides the static method used to calculate GCD
  * from any two integers.
  */
public class Gcd {
    //For my GCD solution, I chose to use Euclid's algorithm. The idea behind
    //this algorithm is that any divisor common to x and y can divide
    //the remainder of x and y. So if modulus returns 0, y must have been
    //the GCD. If not, then we swap y to the front (also allowing either x or y
    //to be the larger of the two), and pass in the remainder of x and y to
    //a recursive call of the function.
    
    /**
      * Computes GCD from two integers.
      *
      * @param x The name of the first integer to be considered in the GCD.
      * @param y The name of the second integer to be considered in the GCD.
      * @return An integer holding the GCD of x and y.
      */
    public static int computeGCD(int x, int y) {
        //This check prevents division by zero and handles all situations
        //regarding one of the arguments being zero.
        if (y == 0) {
            return x;
        }
        
        if ((x % y) == 0) {
            return y;
        }
        else {
            return computeGCD(y, x % y);
        }		
    }
}