/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructuras_de_Datos.Preguntas;

import Preguntas.Pregunta;
import java.util.ArrayList;
import javax.swing.JInternalFrame;

/**
 *
 * @author GeOrge
 */
public class SeleccionUnica extends JInternalFrame implements Pregunta {

    String sRespuesta;
    ArrayList<String> alOpciones = new ArrayList<String>();

    public SeleccionUnica(String pregunta, int valor, String respuesta) {
        
        sRespuesta = respuesta;
    }
    
    public void addOpcion(String opcion) {
        alOpciones.add(opcion);
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
    public boolean evaluarPregunta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desplegarPregunta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getValor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
