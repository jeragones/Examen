/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Excepciones;

import java.io.IOException;

/**
 * Excepcion para validar cuando una lista esta fuera de rango.
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public class ListaFueraDeRangoException extends ArrayIndexOutOfBoundsException{
    public ListaFueraDeRangoException(String mensaje){
        super(mensaje);
    }
    
}
