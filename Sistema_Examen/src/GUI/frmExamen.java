/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import Estructuras_de_Datos.clsExamen;

/**
 *
 * @author jdbr
 */
public class frmExamen extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmExamen
     */
    public frmExamen(clsExamen exa) {
        initComponents();
        jLabelNombreExamen.setText(exa.getsNombre());
        jLabelFecha.setText(exa.getdFecha());
        jLabelProfesor.setText(exa.getsProfesor());
        jLabelPuntos.setText("Total "+exa.getiTotalPuntos()+" Puntos");
        jTextAreaDescripcion.setLineWrap(true);
        jTextAreaDescripcion.setText(exa.getsDescripcion());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombreExamen = new javax.swing.JLabel();
        jLabelProfesor = new javax.swing.JLabel();
        jLabelEstudiante = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabelFecha = new javax.swing.JLabel();
        jLabelPuntos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();

        setClosable(true);

        jLabelNombreExamen.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelNombreExamen.setText("Nombre Examen");

        jLabelProfesor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelProfesor.setText("Profesor: ");

        jLabelEstudiante.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelEstudiante.setText("Estudiante: ");

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabelFecha.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelFecha.setText("Fecha:");

        jLabelPuntos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelPuntos.setText("Total de Puntos:");

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescripcion);
        jTextAreaDescripcion.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombreExamen)
                            .addComponent(jLabelProfesor)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelEstudiante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFecha)
                            .addComponent(jLabelPuntos))
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreExamen)
                    .addComponent(jLabelFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProfesor)
                    .addComponent(jLabelPuntos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstudiante)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelEstudiante;
    private javax.swing.JLabel jLabelFecha;
    public javax.swing.JLabel jLabelNombreExamen;
    private javax.swing.JLabel jLabelProfesor;
    private javax.swing.JLabel jLabelPuntos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
