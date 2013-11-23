/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Preguntas;

import Preguntas.Pregunta;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author GeOrge
 */
public class Complete extends javax.swing.JInternalFrame implements Pregunta {

    JTextField pregunta1;
    JTextField pregunta2;
    JTextField rvRespuesta;
    JLabel respuesta;
    int iValor;
    int iTipo;
    String[] asPregunta = new String[2];
    String sRespuesta;
    
    /**
     * Creates new form Complete
     */
    public Complete() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInsertar = new javax.swing.JPanel();
        pnlPregunta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbEstructura = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        spnValor = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        txtRespuesta = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        pnlEvaluar = new javax.swing.JPanel();
        btnResponder = new javax.swing.JButton();
        pnlResponder = new javax.swing.JPanel();

        setClosable(true);
        setTitle("Complete -");

        pnlPregunta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pregunta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N
        pnlPregunta.setPreferredSize(new java.awt.Dimension(290, 95));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setText("Estructura:");

        cmbEstructura.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        cmbEstructura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Respuesta - Pregunta", "Pregunta - Respuesta - Pregunta", "Pregunta - Respuesta" }));
        cmbEstructura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbEstructuraMouseClicked(evt);
            }
        });
        cmbEstructura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstructuraActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setText("Puntos:");

        spnValor.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        javax.swing.GroupLayout pnlPreguntaLayout = new javax.swing.GroupLayout(pnlPregunta);
        pnlPregunta.setLayout(pnlPreguntaLayout);
        pnlPreguntaLayout.setHorizontalGroup(
            pnlPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPreguntaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPreguntaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbEstructura, 0, 188, Short.MAX_VALUE))
                    .addGroup(pnlPreguntaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(spnValor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPreguntaLayout.setVerticalGroup(
            pnlPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPreguntaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbEstructura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(pnlPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spnValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Respuesta Correcta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(290, 95));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtRespuesta, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInsertarLayout = new javax.swing.GroupLayout(pnlInsertar);
        pnlInsertar.setLayout(pnlInsertarLayout);
        pnlInsertarLayout.setHorizontalGroup(
            pnlInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertarLayout.createSequentialGroup()
                .addGroup(pnlInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInsertarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pnlPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInsertarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInsertarLayout.createSequentialGroup()
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlInsertarLayout.setVerticalGroup(
            pnlInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnlPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnGuardar)
                .addGap(10, 10, 10))
        );

        btnResponder.setBackground(new java.awt.Color(255, 255, 255));
        btnResponder.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnResponder.setText("Responder");
        btnResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponderActionPerformed(evt);
            }
        });

        pnlResponder.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pregunta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N

        javax.swing.GroupLayout pnlResponderLayout = new javax.swing.GroupLayout(pnlResponder);
        pnlResponder.setLayout(pnlResponderLayout);
        pnlResponderLayout.setHorizontalGroup(
            pnlResponderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlResponderLayout.setVerticalGroup(
            pnlResponderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlEvaluarLayout = new javax.swing.GroupLayout(pnlEvaluar);
        pnlEvaluar.setLayout(pnlEvaluarLayout);
        pnlEvaluarLayout.setHorizontalGroup(
            pnlEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEvaluarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEvaluarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnResponder))
                    .addComponent(pnlResponder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlEvaluarLayout.setVerticalGroup(
            pnlEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEvaluarLayout.createSequentialGroup()
                .addComponent(pnlResponder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnResponder)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlEvaluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlEvaluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void cmbEstructuraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbEstructuraMouseClicked

    }//GEN-LAST:event_cmbEstructuraMouseClicked

    private void cmbEstructuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstructuraActionPerformed
        if(respuesta != null) 
            pnlPregunta.remove(respuesta);
        if(pregunta1 != null)
            pnlPregunta.remove(pregunta1);
        if(pregunta2 != null)
            pnlPregunta.remove(pregunta2);
        
        switch(cmbEstructura.getSelectedIndex()) {
            case 0:
                respuesta =  label("_____", 20, 73, 30);
                pregunta1 = texto("Oración de la pregunta", new Dimension(215, 27), 55, 70);
                break;
            case 1:
                respuesta =  label("____", 129, 73, 30);
                pregunta1 = texto("Primera parte de la oración que compone la pregunta", new Dimension(110, 27), 18, 70);
                pregunta2 = texto("Segunda parte de la oración que compone la pregunta", new Dimension(110, 27), 160, 70);
                pnlPregunta.add(pregunta2);
                break;
            case 2:
                respuesta =  label("_____", 232, 73, 30);
                pregunta1 = texto("Oración de la pregunta", new Dimension(214, 27), 18, 70);
                break;
        }
        pnlPregunta.add(respuesta);
        pnlPregunta.add(pregunta1);
        pnlPregunta.repaint();
    }//GEN-LAST:event_cmbEstructuraActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        iTipo = cmbEstructura.getSelectedIndex();
        if((Integer)spnValor.getValue() < 0)
            iValor = 0;
        else
            iValor = (Integer)spnValor.getValue();
        if(iTipo == 1)
            asPregunta[1] = pregunta2.getText();
        asPregunta[0] = pregunta1.getText();
        sRespuesta = txtRespuesta.getText();
        
        
        
        
        
        
         
        
        
//        JLabel lblPregunta = null;
//        JLabel lblPregunta2;
//        switch(iTipo) {
//            case 0:
//                rvRespuesta = texto("Escriba la palabra faltante de la oración", new Dimension(70, 27), 10, 33);
//                lblPregunta = label(asPregunta[0], rvRespuesta.getSize().width + 20, 35, 30);
//                break;
//            case 1:
//                lblPregunta = label(asPregunta[0], 10, 35, 100);
//                rvRespuesta = texto("Escriba la palabra faltante de la oración", new Dimension(70, 27), lblPregunta.getSize().width + 20, 33);
//                lblPregunta2 = label(asPregunta[1], lblPregunta.getSize().width + rvRespuesta.getSize().width + 30, 35, 100);
//                pnlResponder.add(lblPregunta2);
//                break;
//            case 2:
//                lblPregunta = label(asPregunta[0], 0, 35, 200);
//                rvRespuesta = texto("Escriba la palabra faltante de la oración", new Dimension(70, 27), lblPregunta.getSize().width + 20, 33);
//                break;
//        }
//        pnlResponder.add(lblPregunta);
//        pnlResponder.add(rvRespuesta);
//        pnlResponder.repaint();
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponderActionPerformed
        
    }//GEN-LAST:event_btnResponderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnResponder;
    private javax.swing.JComboBox cmbEstructura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnlEvaluar;
    private javax.swing.JPanel pnlInsertar;
    private javax.swing.JPanel pnlPregunta;
    private javax.swing.JPanel pnlResponder;
    private javax.swing.JSpinner spnValor;
    private javax.swing.JTextField txtRespuesta;
    // End of variables declaration//GEN-END:variables

    @Override
    public void insertarInfo() {
        pnlEvaluar.setVisible(false);
        this.show();
    }

    @Override
    public void eliminarInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void evaluarPregunta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desplegarPregunta() {
//        rvRespuesta = texto("Escriba la palabra faltante de la oración", new Dimension(80, 25), 0, 20);
//        JLabel lblPregunta = null;
//        JLabel lblPregunta2;
//        JLabel lblRespesta = null;
//        switch(iTipo) {
//            case 0:
//                lblPregunta = label(pregunta1.getText(), 0, 20);
//                lblRespesta = label("respuesta", 0, 40);
//                break;
//            case 1:
//                lblPregunta = label(pregunta1.getText(), 0, 20);
//                lblPregunta2 = label(pregunta2.getText(), 0, 20);
//                lblRespesta = label("respuesta", 0, 40);
//                pnlEvaluar.add(lblPregunta2);
//                break;
//            case 2:
//                lblPregunta = label(pregunta1.getText(), 0, 20);
//                lblRespesta = label("respuesta", 0, 40);
//                break;
//        }
//        pnlEvaluar.add(lblPregunta);
//        pnlEvaluar.add(rvRespuesta);
//        pnlEvaluar.add(lblRespesta);
        
        
        
        pnlInsertar.setVisible(false);
        this.show();
    }

    @Override
    public double getScore() {
        return iValor;
    }
    
    private JTextField texto(String mensaje, Dimension dtamano, int x, int y) {
        JTextField text = new JTextField();
        text.setToolTipText(mensaje);
        text.setSize(dtamano);
        text.setLocation(x, y);
        return text;
    }
    
    private JLabel label(String texto, int x, int y, int limite) {
        JLabel label;
        if(texto.length() > limite) {
            String cadena1 = texto.substring(0, limite-1);
            String cadena2 = texto.substring(limite);
            texto = "<html>" + cadena1 + "<br>" + cadena2 + "</html>";
        }
        label = new JLabel(texto);
        
        label.setToolTipText("Respuesta que completa la oración");
        label.setSize(new Dimension(texto.length() * 7, 25));
        label.setLocation(x, y);
        return label;
    }
}
