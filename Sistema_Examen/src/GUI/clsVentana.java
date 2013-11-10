/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Estructuras_de_Datos.clsSeccion;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author GeOrge
 */
public class clsVentana {
    
    public boolean activarBoton(String[] asValores) {
        for(int i=0; i < asValores.length; i++) {
            if(asValores[i].isEmpty())
                return false;
        }
        return true;
    }
    
    public DefaultListModel setItems(Object[] alLista) {
        DefaultListModel dlmModelo = new DefaultListModel();
        
        for(int i=0; i < alLista.length; i++)
            dlmModelo.addElement(((clsSeccion)alLista[i]).getsNombre());
        
        return dlmModelo;
    }
}
