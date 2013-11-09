/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import javax.swing.JLabel;

/**
 *
 * @author GeOrge
 */
public class clsEtiqueta extends JLabel {
    
    public clsEtiqueta(String stexto, int[] aiTamano, int[] aiPosicion) {
        Dimension dimension = new Dimension(aiTamano[0],aiTamano[1]);
        this.setPreferredSize(dimension);
        this.setText(stexto);
        this.setLocation(aiPosicion[0], aiPosicion[1]);
    }
}
