/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import javax.swing.JTextField;

/**
 *
 * @author GeOrge
 */
public class clsTexto extends JTextField {
    
    public clsTexto(int[] aiTamano, int[] aiPosicion) {
        Dimension dimension = new Dimension(aiTamano[0],aiTamano[1]);
        this.setPreferredSize(dimension);
        this.setLocation(aiPosicion[0], aiPosicion[1]);
    }
}
