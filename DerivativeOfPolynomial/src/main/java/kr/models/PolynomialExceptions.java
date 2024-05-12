/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kr.models;

/**
 * PolynomialExceptions class contains customized exceptions used in the program.
 * @author      kr
 * @version     3.0
 */
public class PolynomialExceptions extends Exception {   
    
    /** 
    * Class constructor.
    */
    public PolynomialExceptions() {}
    
     /** 
    * Class constructor with message of the error creation.
    * @param message string with the message the error
    * @version     1.0
    */
    public PolynomialExceptions(String message) {
        super(message);
}
    /**
    * @throws PolynomialExceptions If an argument is not even number 
    * @param arg integer with the value of a number to check
    * @return bool that show if the number is even
    * @version     3.0
    */
    public boolean isEven(int arg) throws PolynomialExceptions {
        if ((arg%2)!=0 && arg>0)
            throw new PolynomialExceptions("!!! Add the right number of parameters! Change your polynomial! ");
        else 
            return true;
    }
    
     /**
    * @throws PolynomialExceptions If an argument is not a whole number 
    * @param arg integer with the value of a number to check
    * @return bool that show if the number is whole
    * @version     3.0
    */
    public boolean isWholeNumber(int arg) throws PolynomialExceptions {
        if (arg<0)
            throw new PolynomialExceptions("!!! The powers can't be lower than zero! Change your polynomial! ");
        else 
            return true;
    }
    
    
}
