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
public class clsExamen {
    
    private String sNombre;
    private String sDescripcion;
    private String sProfesor;
    private int iNumeroExamen;
    private ArrayList<clsSeccion> alSecciones = new ArrayList();

    public String getsNombre() {
        return sNombre;
    }

    public String getsProfesor() {
        return sProfesor;
    }
    
    public String getsDescripcion() {
        return sDescripcion;
    }
    
    public ArrayList<clsSeccion> getAlSecciones() {
        return alSecciones;
    }
    
    public int getiNumeroExamen() {
        return iNumeroExamen;
    }
    
    public double[] getNota() {
        int iPuntos = 0;
        int iPreguntas = 0;
        
        for(int i=0; i < alSecciones.size(); i++) {
            ArrayList<Pregunta> alPreguntas = alSecciones.get(i).getAlPreguntas();
            for(int j=0; j < alPreguntas.size(); j++) {
                iPreguntas++;
                iPuntos += alPreguntas.get(j).getScore();
            }
        }
        return new double[]{iPreguntas, iPuntos};
    }
    
    public void setsProfesor(String sProfesor) {
        this.sProfesor = sProfesor;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public void setsDescripcion(String sDescripcion) {
        this.sDescripcion = sDescripcion;
    }

    public void addSeccion(clsSeccion seccion){
        this.alSecciones.add(seccion);
    }

    public void setiNumeroExamen(int iNumeroExamen) {
        this.iNumeroExamen = iNumeroExamen;
    }
}
