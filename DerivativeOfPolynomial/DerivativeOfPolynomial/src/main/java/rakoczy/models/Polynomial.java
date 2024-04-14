/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rakoczy.models;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Polynomial class is the class that operates on ArrayList which contains the elements of a polynomial.
 * @author      Katarzyna Rakoczy 
 * @version     2.0
 */
public class Polynomial implements ListOfPolynomial {

    /**
    * Creation of an ArrayList that will be contain the elements of a polynomial.
    */
    private ArrayList<Element>polynomial = new ArrayList<>();

    /**
    * The method used to returns the ArrayList with the elements of Polynomial.
    * @return the ArrayList that contains objects of Element class with elements of polynomials
    * @version     1.0
     */ 
    @Override
    public ArrayList<Element> getList() {
        sortList();        
        ArrayList<Element>list = polynomial;        
        return list;
    }
    
    
    /**
    * The method used to returns integer that is the value of a polynomial from ArrayList.
    * @param index index of ArrayList that contains the object of Element class 
    * @return integer with the value of element
    * @version     1.0
    */ 
    @Override
    public int listValuesResults(int index) {
        int value;        
        value = polynomial.get(index).getValue();       
        return value;
    }
    
    /**
    * The method used to returns integer that is the power of a polynomial from ArrayList.
    * @param index index of ArrayList that contains the object of Element class 
    * @return integer with the value of the power of the element
    * @version     1.0
    */ 
    @Override
    public int listPowerResults(int index) {
        int power;        
        power = polynomial.get(index).getPower();        
        return power;
    }
    
    /**
    * The method used to returns integer that is the size of an ArrayList 
    * @return integer that is the size of an ArrayList
    * @version     1.0
    */
    @Override
    public int getListSize() {
        int size;
        size = polynomial.size();
        return size;
    }    
    
    /**
    * The method used to add a new object of Element class with the values of element of polynomial 
    * to the ArrayList with the elements of the polynomial.
    * @param value the value od the element of polynomial
    * @param power the power od the element of polynomial
    * @version     1.0
    */ 
    public void addToArray(int value, int power) {
        polynomial.add(new Element(value,power));        
    }    
   
    /**
    * The method used to sort the ArrayList with elements of the polynomial by 
    * the values of their powers from the lowest to the highest.
    * @version     1.0
    */ 
    private void sortList() {        
        if(polynomial.size()>1) {
            polynomial.sort(Comparator.comparingInt(Element::getPower));
        }
    }    
    
     /**
    * The method used to set the ArrayList with the polynomial list.
    * @param polynomialList the ArrayList that contains objects of Element class with elements of polynomials
    * @version     2.0
    */ 
    public void setPolynomial(ArrayList<Element> polynomialList) {
        this.polynomial = polynomialList;
    }
    
}
