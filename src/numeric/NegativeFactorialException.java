package numeric;

/**
  * This class implements the NegativeFactorialException exception type
  * used by Factorial.computeFactorial()
  *
  * @author James Osborne
  * @version 1.0  
  * File: NegativeFactorialException.java
  * Created: 20 Sept 2016
  * ©Copyright James Osborne. All rights reserved.
  * Summary of Modifications;
  *     20 Sept 2016 - JAO - Created constructor which takes in a String
  *     for a custom error message.
  * 
  * Description: This class provides a way of warning the user in the case they
  * have provided a non-negative number for Factorial.computeFactorial()
  */
public class NegativeFactorialException extends RuntimeException {
    public NegativeFactorialException(String error) {
        super(error);
    }
}
