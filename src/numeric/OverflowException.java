package numeric;

/**
  * This class implements the OverflowException exception type
  * used by Factorial.computeFactorial()
  *
  * @author James Osborne
  * @version 1.0  
  * File: OverflowException.java
  * Created: 20 Sept 2016
  * ©Copyright James Osborne. All rights reserved.
  * Summary of Modifications;
  *     20 Sept 2016 - JAO - Created constructor which takes in a String
  *     for a custom error message.
  * 
  * Description: This class provides a way of warning the user in the case they
  * have provided data too large for a data type to store.
  */
public class OverflowException extends RuntimeException {
    public OverflowException(String err) {
        super(err);
    }
}
