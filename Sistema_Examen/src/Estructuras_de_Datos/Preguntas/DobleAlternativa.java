/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructuras_de_Datos.Preguntas;

import Preguntas.Pregunta;
import javax.swing.JInternalFrame;

/**
 *
 * @author GeOrge
 */
public class DobleAlternativa extends JInternalFrame implements Pregunta {

    String sPregunta;
    int iValor;
    boolean bRespuesta;
    
    public DobleAlternativa(String pregunta, int valor, boolean respuesta) {
        
        bRespuesta = respuesta;
    }
    
    @Override
    public void insertarInfo() {
        
    }

    @Override
    public void eliminarInfo() {
        
    }

    @Override
    public boolean evaluarPregunta() {
        return true;
    }

    @Override
    public void desplegarPregunta() {
        
    }

    @Override
    public int getValor() {
        return 0;
    }
}
