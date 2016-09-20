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
public class Gcd {
    //For my GCD solution, I chose to use Euclid's algorithm. The idea behind
    //this algorithm is that any divisor common to x and y can divide
    //the remainder of x and y. So if modulus returns 0, y must have been
    //the GCD. If not, then we swap y to the front (also allowing either x or y
    //to be the larger of the two), and pass in the remainder of x and y to
    //a recursive call of the function.
    public static int computeGCD(int x, int y) {
        
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
