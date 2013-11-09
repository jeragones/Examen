/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author GeOrge
 */
public class clsPanel extends JPanel{
    
    public clsPanel(int[] aiTamano, int[] aiPosicion) {
        Dimension dimension = new Dimension(aiTamano[0],aiTamano[1]);
        this.setPreferredSize(dimension);
        this.setLocation(aiPosicion[0], aiPosicion[1]);
    }
    
    public void setBorde(String sTitulo) {
        TitledBorder titledBorder = BorderFactory.createTitledBorder(sTitulo);
        titledBorder.setTitleColor(new Color(26367));
        this.setBorder(titledBorder);
    }
}
