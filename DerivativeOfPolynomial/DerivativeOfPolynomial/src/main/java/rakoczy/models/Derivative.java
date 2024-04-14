/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rakoczy.models;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Deriative class is the class that operates on ArrayList which contains the elements of derivative of a polynomial.
 * @author      Katarzyna Rakoczy 
 * @version     2.0
 */
public class Derivative implements ListOfPolynomial {
    
    /**
    * Creation of an ArrayList that will be contain the elements of the derivative of a polynomial.
    */
    private ArrayList<Element>derivative = new ArrayList<>();
    
     /**
    * The method used to returns the ArrayList with the elements of Derivative.
    * @return the ArrayList that contains objects of Element class with elements of derivative
    * @version     1.0
    */ 
    @Override
    public ArrayList<Element> getList() {
        sortList();        
        ArrayList<Element>list = derivative;        
        return list;
    }
    
     /**
    * The method used to returns integer that is the value of a derivative from ArrayList.
    * @param index index of ArrayList that contains the object of Element class 
    * @return integer with the value of element
    * @version     1.0
    */ 
    @Override
    public int listValuesResults(int index) {
        int value;        
        value = derivative.get(index).getValue();        
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
        power = derivative.get(index).getPower();        
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
        size = derivative.size();
        return size;
    }
        
    /**
    * The method used to sort the ArrayList with elements of the derivative by the values of their powers from the lowest to the highest.
    * @version     1.0
    */ 
    private void sortList() {        
        if(derivative.size()>1) {
            derivative.sort(Comparator.comparingInt(Element::getPower));
        }
    }
    
    
     /**
    * The method used to set the ArrayList with the polynomial list.
    * @param derivativeList the ArrayList that contains objects of Element class with elements of derivative
    * @version     2.0
    */ 
     public void setDerivative(ArrayList<Element> derivativeList) {
        this.derivative = derivativeList;
    }
}
