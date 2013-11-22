/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Excepciones;

import java.io.IOException;

/**
 *
 * @author jdbr
 */
public class ListaFueraDeRangoException extends ArrayIndexOutOfBoundsException{
    public ListaFueraDeRangoException(String mensaje){
        super(mensaje);
    }
    
}
