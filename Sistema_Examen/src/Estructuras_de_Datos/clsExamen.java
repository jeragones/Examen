/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras_de_Datos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author GeOrge
 */
public class clsExamen {
    
    private String sNombre;
    private String sDescripcion;
    private String sProfesor;
    private String sFecha;
    private int iTotalPuntos;
    private int iNumeroExamen;
    private ArrayList<clsSeccion> alSecciones = new ArrayList();

    public String getsNombre() {
        return sNombre;
    }

    public String getsProfesor() {
        return sProfesor;
    }

    public String getdFecha() {
        return sFecha;
    }
    
    public int getiTotalPuntos() {
        return iTotalPuntos;
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
    
    public void setsProfesor(String sProfesor) {
        this.sProfesor = sProfesor;
    }

    public void setdFecha(String dfecha) {
        this.sFecha = dfecha;
    }

    public void setiTotalPuntos(int iTotalPuntos) {
        this.iTotalPuntos = iTotalPuntos;
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
