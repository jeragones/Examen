/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import GUI.ingresar;
import javax.swing.UIManager;

/**
 *
 * @author GeOrge
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel( "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | 
                 InstantiationException | 
                 IllegalAccessException | 
                 javax.swing.UnsupportedLookAndFeelException ex) { }
        new ingresar().show();
    }
}
