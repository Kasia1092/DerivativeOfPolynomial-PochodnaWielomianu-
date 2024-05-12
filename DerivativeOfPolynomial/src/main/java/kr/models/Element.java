/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kr.models;
  
/**
 * The class that contains and operates on values and powers of polynomial.
 * @author      kr
 * @version     1.0
 */
public class Element {
    
    /**
     * The integer that contains the value of the element of polynomial.
    */
    private int value;
    /**
     * The integer that contains the power of the element of polynomial.
    */
    private int power;   
    
    /**
     * Class constructor that sets the value and the power field.
     * @param value the value of an element of a polynomial 
     * @param power the power of an element of a polynomial 
     * @version     1.0
    */
    public Element(int value, int power) {
        this.value = value;
        this.power = power;
    }
    
    /**
     * The method that returns the value of the element of polynomial.
     * @return the value of the element of polynomial
     * @version     1.0
    */
    public int getValue() {
        return value;
    }

    /**
     * The method that returns the power of the element of polynomial.
     * @return the power of the element of polynomial
     * @version     1.0
    */
    public int getPower() {
        return power;
    } 
    
     /**
     * The method that sets the value of the element of polynomial.
     * @param value the value of an element of a polynomial 
     * @version     1.0
    */
    public void setValue(int value) {
        this.value = value;
    }

}