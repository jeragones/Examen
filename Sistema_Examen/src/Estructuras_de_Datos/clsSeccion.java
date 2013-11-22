/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras_de_Datos;

import Preguntas.Pregunta;
import java.util.ArrayList;

/**
 * Clase Seccion, la cual cuenta con toda la informacion correspondiente a una seccion de un examen.
 * @author Daniel Berrocal
 * @author Jorge Rojas
 * @param sNombre Nombre de la seccion.
 * @param sDescripcion Descripcion general o indicaciones de la seccion.
 * @param tipo Tipo de preguntas que contiene la seccion.
 * @param alPreguntas Lista de preguntas de la seccion.
 */
public class clsSeccion {
    
    private String sNombre;
    private String sDescripcion;
    private String tipo;
    private static ArrayList<Pregunta> alPreguntas = new ArrayList<>();

    public clsSeccion(String sNombre, String sDescripcion) {
        this.sNombre = sNombre;
        this.sDescripcion = sDescripcion;
    }

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
    
    public int getPreguntas() {
        return alPreguntas.size();
    }
}
