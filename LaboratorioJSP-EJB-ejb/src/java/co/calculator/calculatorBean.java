/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.calculator;

import javax.ejb.Stateless;

/**
 *
 * @author Usuario
 */
@Stateless
public class calculatorBean implements calculatorBeanLocal {

    @Override
    public Double operar(double a, double b, char operador) {
        switch(operador){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return (b!=0)? a/b : null;
            default:
                return null;
                
        }
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
