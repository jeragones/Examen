/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;

/**
 *
 * @author GeOrge
 */
public class clsLista extends JList{
    
    public clsLista(int[] aiTamano, int[] aiPosicion) {
        Dimension dimension = new Dimension(aiTamano[0],aiTamano[1]);
        this.setLocation(aiPosicion[0], aiPosicion[1]);
        this.setPreferredSize(dimension);
    }
}
