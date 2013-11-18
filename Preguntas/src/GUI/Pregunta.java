package GUI;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GeOrge
 */
public interface Pregunta {
    public void insertarInfo();
    public void eliminarInfo();
    public boolean evaluarPregunta(); 	
    public void desplegarPregunta();
    public int getValor();
}
