/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Preguntas;

import javax.swing.JInternalFrame;

/**
 *
 * @author GeOrge
 */

public class FalsoVerdadero extends JInternalFrame implements Pregunta{

    String sPregunta;
    boolean bRespuesta;
    int iValor;
    
    /**
     * Creates new form DobleAlternativa
     */
    public FalsoVerdadero() {
        initComponents();
        btnGrupo.add(rdbVerdadero);
        btnGrupo.add(rdbFalso);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupo = new javax.swing.ButtonGroup();
        pnlInsertar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtPregunta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        spnValor = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        cmbRespuesta = new javax.swing.JComboBox();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pnlEvaluar = new javax.swing.JPanel();
        lblPregunta = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        pnlOpciones = new javax.swing.JPanel();
        rdbVerdadero = new javax.swing.JRadioButton();
        rdbFalso = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Falso o Verdadero - ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pregunta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setText("Puntos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(spnValor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spnValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Respuesta Correcta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N

        cmbRespuesta.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        cmbRespuesta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Verdadero", "Falso" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(cmbRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(cmbRespuesta)
                .addGap(10, 10, 10))
        );

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInsertarLayout = new javax.swing.GroupLayout(pnlInsertar);
        pnlInsertar.setLayout(pnlInsertarLayout);
        pnlInsertarLayout.setHorizontalGroup(
            pnlInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInsertarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        pnlInsertarLayout.setVerticalGroup(
            pnlInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInsertarLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addGap(10, 10, 10))
        );

        lblPregunta.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblPregunta.setText("Pregunta");

        btnSiguiente.setBackground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        pnlOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N

        rdbVerdadero.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        rdbVerdadero.setText("Verdadero");

        rdbFalso.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        rdbFalso.setText("Falso");

        javax.swing.GroupLayout pnlOpcionesLayout = new javax.swing.GroupLayout(pnlOpciones);
        pnlOpciones.setLayout(pnlOpcionesLayout);
        pnlOpcionesLayout.setHorizontalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbFalso)
                    .addComponent(rdbVerdadero))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlOpcionesLayout.setVerticalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(rdbVerdadero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbFalso)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlEvaluarLayout = new javax.swing.GroupLayout(pnlEvaluar);
        pnlEvaluar.setLayout(pnlEvaluarLayout);
        pnlEvaluarLayout.setHorizontalGroup(
            pnlEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEvaluarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEvaluarLayout.createSequentialGroup()
                        .addComponent(lblPregunta)
                        .addGap(235, 235, 235))
                    .addGroup(pnlEvaluarLayout.createSequentialGroup()
                        .addComponent(pnlOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEvaluarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSiguiente)
                .addGap(10, 10, 10))
        );
        pnlEvaluarLayout.setVerticalGroup(
            pnlEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEvaluarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblPregunta)
                .addGap(10, 10, 10)
                .addComponent(pnlOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnSiguiente)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEvaluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEvaluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        sPregunta = txtPregunta.getText();
        iValor = (Integer)spnValor.getValue();
        if(cmbRespuesta.getSelectedIndex() == 0)
            bRespuesta = true;
        else 
            bRespuesta = false;
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        eliminarInfo();
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup btnGrupo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox cmbRespuesta;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JPanel pnlEvaluar;
    private javax.swing.JPanel pnlInsertar;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JRadioButton rdbFalso;
    private javax.swing.JRadioButton rdbVerdadero;
    private javax.swing.JSpinner spnValor;
    private javax.swing.JTextField txtPregunta;
    // End of variables declaration//GEN-END:variables

    @Override
    public void insertarInfo() {
        pnlEvaluar.setVisible(false);
        this.show();
    }

    @Override
    public void eliminarInfo() {
        sPregunta = "";
        iValor = 0;
    }

    @Override
    public boolean evaluarPregunta() {
        if((rdbVerdadero.isSelected() && bRespuesta) ||
           (rdbFalso.isSelected() && !bRespuesta))
            return true;
        else {
            iValor = 0;
            return false;
        }
    }

    @Override
    public void desplegarPregunta() {
        lblPregunta.setText(sPregunta);
        pnlInsertar.setVisible(false);
        this.show();
    }

    @Override
    public int getValor() {
        return iValor;
    }
}
