/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Preguntas;

/**
 * Interface que utilizan las preguntas.
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public interface Pregunta {

    /**
     * Metodo para insertar la informacion de la nueva seccion.
     */
    public void insertarInfo();

    /**
     * Metodo para eliminar la informacion de una seccion.
     */
    public void eliminarInfo();

    /**
     * Metodo que evalua si la respuesta del usuario es la respuesta correcta
     */
    public void evaluarPregunta();

    /**
     * Metodo que levanta la interfaz de una pregunta
     */
    public void desplegarPregunta();

    /**
     * Metodo que retorna los puntos obtenidos sobre la pregunta
     * @return Retorna los puntos obtenidos por el usuario.
     */
    public double getScore();
}
