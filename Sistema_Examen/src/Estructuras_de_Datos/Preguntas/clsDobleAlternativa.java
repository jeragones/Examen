/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructuras_de_Datos.Preguntas;

import Estructuras_de_Datos.clsPregunta;

/**
 *
 * @author GeOrge
 */
public class clsDobleAlternativa extends clsPregunta {

    boolean bRespuesta;
    
    public clsDobleAlternativa(String pregunta, int valor, boolean respuesta) {
        super(pregunta, valor);
        bRespuesta = respuesta;
    }
    
    @Override
    public void insertarInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void evaluarPregunta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desplegarPregunta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
