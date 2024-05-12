/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kr.controllers;

import kr.views.PolynomialView;
import kr.models.Polynomial;
import kr.models.Derivative;
import kr.models.Calculations;
import kr.models.PolynomialExceptions;
import java.util.Scanner;

/**
 * PolynomialController class is the class that controls the data flow. It acts 
 * on classes from models and views packages and initializes their functions.
 * @author      kr 
 * @version     1.0
 */
@SuppressWarnings("unused")
public class PolynomialController {
    
    /**
    * Creation of an object of class PolynomialView.
    */
    PolynomialView view = new PolynomialView();
    /**
    * Creation of an object of class Polynomial.
    */
    Polynomial polynomialModel = new Polynomial();
    /**
    * Creation of an object of class Derivative.
    */
    Derivative deriviativeModel = new Derivative();
    /**
    * Creation of an object of class Calculations.
    */
    Calculations calculations = new Calculations();
    /**
    * Creation of an object of class PolynomialExceptions.
    */
    PolynomialExceptions exceptions = new PolynomialExceptions();
    /**
    * Creation of an object of Scanner.
    */    
    Scanner scanner = new Scanner(System.in);
    
    /**
    * An integer to store value of element in polynomial
    */    
    private int value;
    /**
    * An integer to store power of element in polynomial
    */    
    private int power;
    
    /**
    * This method triggers first method from view which writes out the title of the program 
    * and the transmits the array with arguments to the metod which read and process them.   
    * @param args an array with arguments from that contains values and powers of polynomial 
    * @version     1.0
    */  
    public void Run(String[] args) { 
        view.begining();        
        readArguments(args);      
    }    
    
    /**
    * This method contains check of the correctness of the number of entered elements and triggers
    * method that use this parameters and the method that creates menu. 
    * @param args an array with arguments from that contains values and powers of polynomial 
    * @version     1.0
    */  
    private void readArguments(String[] args) {        
        int size = args.length;                
        try {
            boolean result = exceptions.isEven(size);            
            setElementFromParameters(args);
            nextElementDecision();
        }
        catch(PolynomialExceptions e) {
            System.err.println(e.getMessage());  
            newElementsDecision();
        }  
    }  
    
    /**
    * This method allows to add new element to polynomial. It reads the value and power of an element of polynomial and gives this 
    * parameters to the method that adds them to array.
    * @version     1.0
    */  
    private void setNewElement() {
        
        view.setValue();
        value=scanner.nextInt();        
        view.setPower();
        power=scanner.nextInt();      
        polynomialModel.addToArray(value,power);    
    }
    
    /**
    * This method gets the value and power of an elements of polynomial from array of strings and 
    * allows to change them from string to integer. It gives that parameters to the method that 
    * adds them to array.
    * parameters to the method that adds them to array.
    * @param args an array with arguments from that contains values and powers of polynomial
    * @version     1.0
    */  
    private void setElementFromParameters(String[] args) {     
         int size = args.length;
         for (int i=0;i<size;i++) {             
                if((i%2)==0) {
                    value=Integer.parseInt(args[i]);
                    power=Integer.parseInt(args[i+1]);                     
                      try {
                        boolean result =exceptions.isWholeNumber(power);            
                            polynomialModel.addToArray(value,power);
                      }
                      catch(PolynomialExceptions e) {
                        System.err.println(e.getMessage());  
                      }                     
                }              
        }               
    }   
    
    /**
    * This method connects methods from views and models packages to write the final form of polynomial.
    * @version     1.0
    */  
    private void polynomialResults() {
        view.resultPolynomial();
        
        int size = polynomialModel.getListSize();   
        for(int i=0;i<size;i++) {            
            int elementValue = polynomialModel.listValuesResults(i);
            int elementPower = polynomialModel.listPowerResults(i);            
            
                if(i>0 && i<size) {
                    if(elementValue>=0) {
                    view.plusSign();                  
                    }                   
                }            
                view.writeResults(elementValue, elementPower); 
        }
    }     
   
    
    /**
    * This method connects methods from views and models packages to write the final form of derivative.
    * @version     1.0
    */  
    private void derivativeResults() {
        view.resultDeriative();
        int size = deriviativeModel.getListSize();        
        for(int i=0;i<size;i++) {
            int elementValue = deriviativeModel.listValuesResults(i);
            int elementPower = deriviativeModel.listPowerResults(i);
            
             if(i>0 && i<size) {
                if(elementValue>=0){
                view.plusSign();              
                }
            }            
            view.writeResults(elementValue, elementPower);
        }
    }
    
     /**
    * This method creates the menu for the user. It writes the options using methods from view 
    * and scanns user decision. It triggers next methods that contains the right behevior for user choice.
    * @version     1.0
    */  
    private void nextElementDecision() {
        
        view.addNextElement();
        int decision = scanner.nextInt();        
         switch(decision) {
            case 1:
                setNewElement();
                nextElementDecision();
                break;
            case 2:
                calculations.derivativeCalculation(polynomialModel.getList(),deriviativeModel.getList());
                polynomialResults();
                derivativeResults();
                break;
            case 3:
                break;
            default:
                view.wrongNumber();
                nextElementDecision();
        }               
    }  
    
    
    /**
    * This method creates the menu for the user if the arguments of program were incorrect. It writes the options using methods from view 
    * and scanns user decision. It triggers next methods that contains the right behevior for user choice.
    * @version     1.0
    */
    private void newElementsDecision() { 
            view.addElements();
            int decision = scanner.nextInt();            
             switch(decision) {
            case 1:
                setNewElement();
                nextElementDecision();
                break;
            case 2:
                break;
            default:
                view.wrongNumber();
                newElementsDecision();
            }
    }  
}