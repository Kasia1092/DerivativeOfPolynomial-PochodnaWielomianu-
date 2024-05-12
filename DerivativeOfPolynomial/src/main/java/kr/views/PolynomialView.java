/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kr.views;

import java.util.ArrayList;

/**
 * The class that prints messages on terminal.
 * @author      kr 
 * @version     2.0
 */
@SuppressWarnings("unused")
public class PolynomialView {

    /**
    * The method that prints the title of the program.
    * @version     1.0
    */ 
    public void begining() {
        System.out.println("********************************\nPOLYNOMIAL DERIATIVE CALCULATOR\n********************************");
    }
    
    /**
    * The method that prints the options for main menu.
    * @version     2.0
    */ 
     public void addNextElement() {
        System.out.println( "\n******Do you want to add new elements to the polynomial?");
        ArrayList<String> menu = new ArrayList<>();
        menu.add(String.format("* Type '1' to add next element."));
        menu.add(String.format("* Type '2' to see results."));
        menu.add(String.format("* Type '3' to quit."));
        menu.forEach(menuElement->System.out.println(menuElement));
    }
    
    /**
    * The method that prints the options for menu after catching error.
    * @version     2.0
    */ 
    public void addElements() {        
        System.out.println( "\n******Do you want to add new elements to the polynomial or close the program?");
        ArrayList<String> menu = new ArrayList<>();
        menu.add(String.format("* Type '1' to add next element."));
        menu.add(String.format("* Type '2' to quit."));
        menu.forEach(menuElement->System.out.println(menuElement));
    }

    /**
    * The method that prints a question about a value of a polynomial.
    * @version     1.0
    */ 
    public void setValue() {
        System.out.println("Set the value of next element of the polynomial:");
    }
    
    /**
    * The method that prints a question about a power of a polynomial.
    * @version     1.0
    */ 
    public void setPower() {
        System.out.println("Set the power of next element of the polynomial:");
    }
    
    /**
    * The method that prints a message about wrong added number. 
    * @version     1.0
    */ 
    public void wrongNumber() {
        System.out.println("\nYou added a wrong number! Try again!");
    }
    
    /**
    * The method that prints a plus sign. 
    * @version     1.0
    */ 
    public void plusSign() {
        System.out.print("+");
    }

    /**
    * The method that prints a information about choosen polynomial. 
    * @version     1.0
    */ 
    public void resultPolynomial() {
        System.out.println("The chosen elements of polynomial: ");        
    }
    
    /**
    * The method that prints a information about the derative of chosen polynomial. 
    * @version     1.0
    */ 
    public void resultDeriative() {           
        System.out.println("\nThe derivative of chosen polynomial: ");
    }
    
    /**
    * The method that prints an element of polynomial
    * @param value integer that contains the value of element 
    * @param power integer that contains the power of element 
    * @version     1.0
    */ 
    public void writeResults(int value, int power) {           
        System.out.print(value + "x^" + power);
    }
   
 
}

