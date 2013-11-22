/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;
import Estructuras_de_Datos.*;
import Excepciones.ListaFueraDeRangoException;
import javax.swing.DefaultListModel;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

/**
 * Interfaz que le permite al usuario estudiante elegir cual examen desea contestar.
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public class frmListaExamen extends javax.swing.JInternalFrame {

    private clsExamenes insExamenes;
    private JDesktopPane dskPanel;
    private JLabel lblBarraEstado;
    private clsPreguntas insPregunta;
    private boolean bBandera;
    private frmPrincipal principal;
    
    /**
     * Creates new form frmListaExamen
     */
    public frmListaExamen(Object args[]) {
        initComponents();
        dskPanel = (JDesktopPane)args[0];
        insExamenes = (clsExamenes)args[1];
        lblBarraEstado = (JLabel)args[2];
        insPregunta = (clsPreguntas)args[3];
        bBandera = (boolean)args[4];
        principal = (frmPrincipal)args[5];
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstExamenes = new javax.swing.JList();
        btnInicio = new javax.swing.JButton();

        setClosable(true);
        setTitle("Lista de Examenes");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jScrollPane1.setViewportView(lstExamenes);

        btnInicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInicio)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInicio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        this.setLocation(500, 50);

        DefaultListModel modelo = new DefaultListModel();
        try{
            for (clsExamen exa : insExamenes.getExamenes()){
                modelo.addElement(exa.getsNombre());            
            }
        }
        catch(ListaFueraDeRangoException e){
            new ListaFueraDeRangoException("Lista Fuera de Rango");
        }
        finally{
        lstExamenes.setModel(modelo);
        }
    }//GEN-LAST:event_formComponentShown

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        JInternalFrame frame = null;
        clsExamen insExamen = insExamenes.getExamenes().get(lstExamenes.getSelectedIndex());
        if(bBandera){
            frame = new frmExamen(new Object[]{insExamen, dskPanel, principal});
            frame.setTitle(insExamen.getiNumeroExamen()+"° Examen de "+insExamen.getsNombre());
        } else {
            frame = new frmCrearExamen(insExamen, new Object[]{dskPanel, lblBarraEstado, insPregunta});
            frame.setTitle("Modificar Examen");
        }
        dskPanel.add(frame);
        frame.show();
// TODO add your handling code here:
//        clsExamen insExamen = examenes.getExamenes().get(lstExamenes.getSelectedIndex());
//        JInternalFrame frame = new frmExamen(new Object[]{insExamen, dskPanel});
//        frame.setVisible(true);
//        
//        frame.setTitle(examenes.getExamenes().get(lstExamenes.getSelectedIndex()).getiNumeroExamen()+"° Examen");
// 
//        dskPanel.add(frame);
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstExamenes;
    // End of variables declaration//GEN-END:variables
}
