/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.calculator;

import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface calculatorBeanLocal {

    Double operar(double a, double b, char operador);
    
}
