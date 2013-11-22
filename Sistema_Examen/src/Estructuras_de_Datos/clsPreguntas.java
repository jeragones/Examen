/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructuras_de_Datos;

import java.util.ArrayList;

/**
 * Clase para almacenar las clases cargadas dinamicamente (las estructuras de las preguntas)
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public class clsPreguntas {
    
    private ArrayList<Class> preguntas = new ArrayList();

    public void addPregunta(Class pregunta) {
        preguntas.add(0, pregunta);
    }
    
    public ArrayList<Class> getPreguntas() {
        return preguntas;
    }
}
