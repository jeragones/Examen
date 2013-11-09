/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author GeOrge
 */
public class clsBoton extends JButton{
    
    public clsBoton(String sTexto, int[] aiTamano, int[] aiPosicion) {
        Dimension dimension = new Dimension(aiTamano[0],aiTamano[1]);
        Font font = new Font("Dialog", 12, 12);
        this.setPreferredSize(dimension);
        this.setText(sTexto);
        this.setLocation(aiPosicion[0], aiPosicion[1]);
        this.setBackground(new Color(26367));
        this.setFont(font);
    }
}
