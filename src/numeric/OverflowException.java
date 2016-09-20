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
public class OverflowException extends RuntimeException {
    public OverflowException(String err) {
        super(err);
    }
}
