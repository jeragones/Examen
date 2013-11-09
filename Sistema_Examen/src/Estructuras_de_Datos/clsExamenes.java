/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructuras_de_Datos;

import java.util.ArrayList;

/**
 *
 * @author jdbr
 */
public class clsExamenes {
    private ArrayList<clsExamen> Examenes = new ArrayList();
 
    public void agregarExamen(clsExamen examen){
        Examenes.add(examen);
    }
    
    public ArrayList getExamenes(){
        return Examenes;
    }
    
    
}
