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
public class clsSeccion {
    
    String sNombre;
    String sDescripcion;
    ArrayList<Pregunta> alPreguntas = new ArrayList<Pregunta>();

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public void setsDescripcion(String sDescripcion) {
        this.sDescripcion = sDescripcion;
    }
    
    public void setAlPreguntas(ArrayList<Pregunta> alPreguntas) {
        this.alPreguntas = alPreguntas;
    }

    public String getsNombre() {
        return sNombre;
    }

    public String getsDescripcion() {
        return sDescripcion;
    }

    public ArrayList<Pregunta> getAlPreguntas() {
        return alPreguntas;
    }
}
