/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rakoczy.models;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * The class that performs the calculations on arrays with elements of polynomial and derivatives of polynomial.
 * It creates the deriative and adds the values of arrays with the same powers.
 * @author      Katarzyna Rakoczy 
 * @version     3.0
 */
public class Calculations {
        
    /**
    * The method that adds values of the array of the polynomial that have the same power.
    * @param elements array with elements of polynomial
    * @version     3.0
    */
    public void samePowerCheck(ArrayList<Element> elements) {
    for (int i = elements.size() - 1; i > 0; i--) {
        for (int j = i - 1; j >= 0; j--) {
            if (elements.get(i).getPower() == elements.get(j).getPower()) {
                elements.get(j).setValue(elements.get(j).getValue() + elements.get(i).getValue());
                elements.remove(i);
                break; // Break to avoid ConcurrentModificationException
            }
        }
    }
}
    /**
    * The method that calculates elements from the array of deriative using the elements from the array of polynomial
    * and triggers method that adds the element with the same powers.
    * @param polynomial array with elements of polynomial
    * @param derivative array with elements of derative of polynomial
    * @version     2.0
    */    
     public void derivativeCalculation(ArrayList<Element> polynomial, ArrayList<Element> derivative) {
        derivative.addAll(
                polynomial.stream()
                        .filter(element -> element.getPower() != 0)
                        .map(element -> new Element(element.getValue() * element.getPower(), element.getPower() - 1))
                        .collect(Collectors.toList())
        );

        samePowerCheck(derivative);
    }
}
