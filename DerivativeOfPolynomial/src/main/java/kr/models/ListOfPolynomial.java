/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package kr.models;

import java.util.ArrayList;

/**
 * ListOfPolynomial interface is the interface for the class that operates on the 
 * arrays that contains polynomials.
 * @author      kr
 * @version     1.0
 */
public interface ListOfPolynomial {
  
  /**
  * The method used to returns the ArrayList with the elements of Polynomial.
  * @return the ArrayList that contains objects of Element class with elements of polymonials
  * @version     1.0
  */ 
  public ArrayList<Element> getList();
 
  /**
  * The method used to returns integer that is the value of a polynomial from ArrayList.
  * @param index index of ArrayList that contains the object of Element class 
  * @return integer with the value of element
  * @version     1.0
  */ 
  public int listValuesResults(int index);
  
  /**
  * The method used to returns integer that is the power of a polynomial from ArrayList.
  * @param index index of ArrayList that contains the object of Element class 
  * @return integer with the value of the power of the element
  * @version     1.0
  */ 
  public int listPowerResults(int index);
  
   /**
  * The method used to returns integer that is the size of an ArrayList 
  * @return integer that is the size of an ArrayList
  * @version     1.0
  */
  public int getListSize();  
  
  
}
