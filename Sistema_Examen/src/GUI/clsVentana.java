/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JInternalFrame;

/**
 *
 * @author GeOrge
 */
public class clsVentana extends JInternalFrame {
    
    public clsVentana(String sTitulo, int[] aiTamano, int[] aiPosicion) {        
        this.setTitle(sTitulo);
        this.setLocation(aiPosicion[0], aiPosicion[1]);
        this.setSize(aiTamano[0],aiTamano[1]);
        this.setResizable(false);
        this.setClosable(true);
    }
}
