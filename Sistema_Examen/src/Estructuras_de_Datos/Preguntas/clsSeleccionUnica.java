/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructuras_de_Datos.Preguntas;

import Estructuras_de_Datos.clsPregunta;
import java.util.ArrayList;

/**
 *
 * @author GeOrge
 */
public class clsSeleccionUnica extends clsPregunta {

    String sRespuesta;
    ArrayList<String> alOpciones = new ArrayList<String>();

    public clsSeleccionUnica(String pregunta, int valor, String respuesta) {
        super(pregunta, valor);
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
    public void evaluarPregunta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desplegarPregunta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
