/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Preguntas;

/**
 *
 * @author GeOrge
 */
public interface Pregunta {
    public void insertarInfo();
    public void eliminarInfo();
    public void evaluarPregunta(); 	
    public void desplegarPregunta();
    public double getNota();  
}