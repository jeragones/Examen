/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras_de_Datos;

import Preguntas.Pregunta;
import java.util.ArrayList;

/**
 *
 * @author GeOrge
 */
public class clsPregunta implements Pregunta {
    
    String sPregunta;
    Object oRespuesta;
    int iValor;
    ArrayList<String> alOpciones = new ArrayList<String>();

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

    @Override
    public double getNota() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
