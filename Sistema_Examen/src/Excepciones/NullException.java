/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Excepciones;

/**
 * Excepcion para validar cuando una valor es nulo.
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public class NullException extends Exception {
    public NullException(String mensaje){
        super(mensaje);
    }
    
}
