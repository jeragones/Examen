/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Secciones;

import Preguntas.pregunta;

/**
 *
 * @author GeOrge
 */
public interface seccion {
    public void insertarInfo();
    public void eliminarInfo();
    public void agregarPregunta(pregunta p); 	
    public void eliminarPregunta(pregunta p);
}
