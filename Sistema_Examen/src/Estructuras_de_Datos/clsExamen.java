/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras_de_Datos;

import java.util.ArrayList;

/**
 *
 * @author GeOrge
 */
public class clsExamen {
    
    private String sNombre;
    private String sDescripcion;
    private ArrayList<clsSeccion> alSecciones = new ArrayList();

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsDescripcion() {
        return sDescripcion;
    }

    public void setsDescripcion(String sDescripcion) {
        this.sDescripcion = sDescripcion;
    }

    public ArrayList<clsSeccion> getAlSecciones() {
        return alSecciones;
    }

    public void addSeccion(clsSeccion seccion){
        this.alSecciones.add(seccion);
    }
    
    
    
}
