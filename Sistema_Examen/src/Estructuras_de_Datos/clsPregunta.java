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
public abstract class clsPregunta implements Pregunta {
    
    String sPregunta;
    int iValor;

    public clsPregunta(String pregunta, int valor) {
        sPregunta = pregunta;
        iValor = valor;
    }

    public void setsPregunta(String sPregunta) {
        this.sPregunta = sPregunta;
    }

    public void setiValor(int iValor) {
        this.iValor = iValor;
    }

    public String getsPregunta() {
        return sPregunta;
    }

    @Override
    public int getValor() {
        return iValor;
    }
    
    @Override
    public abstract void insertarInfo();

    @Override
    public abstract void eliminarInfo();

    @Override
    public abstract void evaluarPregunta();

    @Override
    public abstract void desplegarPregunta();
}
