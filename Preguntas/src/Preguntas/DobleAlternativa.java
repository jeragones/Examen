/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Preguntas;

import Preguntas.Pregunta;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author GeOrge
 */
public class DobleAlternativa extends javax.swing.JInternalFrame implements Pregunta {

    private String sEnunciado;
    private String sRespuesta;
    private String sTexto;
    private int iValor;
    private ArrayList<String[]> lsPalabras = new ArrayList<String[]>();
    
    /**
     * Creates new form DobleAlternativa
     */
    public DobleAlternativa() {
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

        popMenu = new javax.swing.JPopupMenu();
        mnuEliminar = new javax.swing.JMenuItem();
        pnlInsertar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtEnunciado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cmbPalabras = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtPalabra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstRespuestas = new javax.swing.JList();
        btnAgregar = new javax.swing.JButton();
        spnValor = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        pnlEvaluar = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblEnunciado = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pnlScroll = new javax.swing.JScrollPane();
        txtRespuesta = new javax.swing.JTextArea();
        btnContestar = new javax.swing.JButton();

        mnuEliminar.setText("jMenuItem1");
        mnuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEliminarActionPerformed(evt);
            }
        });
        popMenu.add(mnuEliminar);

        setClosable(true);
        setTitle("Doble Alternativa - ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enunciado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N

        txtEnunciado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEnunciadoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEnunciado)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Respuestas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setText("por");

        lstRespuestas.setComponentPopupMenu(popMenu);
        jScrollPane1.setViewportView(lstRespuestas);

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        spnValor.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        spnValor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                spnValorMouseReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setText("Puntos:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPalabras, 0, 117, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(spnValor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(txtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(spnValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

        javax.swing.GroupLayout pnlInsertarLayout = new javax.swing.GroupLayout(pnlInsertar);
        pnlInsertar.setLayout(pnlInsertarLayout);
        pnlInsertarLayout.setHorizontalGroup(
            pnlInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInsertarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        pnlInsertarLayout.setVerticalGroup(
            pnlInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnGuardar)
                .addGap(10, 10, 10))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enunciado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N

        lblEnunciado.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblEnunciado.setText("enunciado");
        lblEnunciado.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEnunciado, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblEnunciado, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enunciado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N

        pnlScroll.setMaximumSize(new java.awt.Dimension(166, 96));
        pnlScroll.setMinimumSize(new java.awt.Dimension(166, 96));
        pnlScroll.setName(""); // NOI18N
        pnlScroll.setPreferredSize(new java.awt.Dimension(166, 96));

        txtRespuesta.setColumns(20);
        txtRespuesta.setLineWrap(true);
        txtRespuesta.setRows(1);
        txtRespuesta.setMaximumSize(new java.awt.Dimension(200, 96));
        txtRespuesta.setMinimumSize(new java.awt.Dimension(200, 96));
        txtRespuesta.setName(""); // NOI18N
        pnlScroll.setViewportView(txtRespuesta);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnlScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        btnContestar.setBackground(new java.awt.Color(255, 255, 255));
        btnContestar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnContestar.setText("Contestar");
        btnContestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContestarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEvaluarLayout = new javax.swing.GroupLayout(pnlEvaluar);
        pnlEvaluar.setLayout(pnlEvaluarLayout);
        pnlEvaluarLayout.setHorizontalGroup(
            pnlEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEvaluarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEvaluarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnContestar)))
                .addContainerGap())
        );
        pnlEvaluarLayout.setVerticalGroup(
            pnlEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEvaluarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnContestar)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEvaluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        sEnunciado = txtEnunciado.getText();
        if((Integer)spnValor.getValue() < 0)
            iValor = 0;
        else
            iValor = (Integer)spnValor.getValue();
        String[] asPalabras = txtEnunciado.getText().split(" ");
        for(int i=0; i < asPalabras.length; i++) {
            for(int j=0; j < lsPalabras.size(); j++) {
                if(asPalabras[i].equalsIgnoreCase(lsPalabras.get(j)[0]))
                    asPalabras[i] = lsPalabras.get(j)[1];
            }
            if(i == 0)
                sRespuesta = asPalabras[i];
            else
                sRespuesta += " "+asPalabras[i];
        }
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnContestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContestarActionPerformed
        sTexto = txtRespuesta.getText();
        this.dispose();
    }//GEN-LAST:event_btnContestarActionPerformed

    private void txtEnunciadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnunciadoKeyReleased
        cmbPalabras.removeAllItems();
        String[] asPalabras = txtEnunciado.getText().split(" ");
        for(int i=0; i < asPalabras.length; i++)
            cmbPalabras.addItem(asPalabras[i]);
    }//GEN-LAST:event_txtEnunciadoKeyReleased

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(!txtPalabra.getText().equals("") && 
           !((String)cmbPalabras.getSelectedItem()).equals("")) {
            DefaultListModel modelo = new DefaultListModel();
            for(int i=0; i < lstRespuestas.getModel().getSize(); i++)
                modelo.addElement(lstRespuestas.getModel().getElementAt(i));
            modelo.addElement((String)cmbPalabras.getSelectedItem() + " / " + txtPalabra.getText());
            lstRespuestas.setModel(modelo);
            lsPalabras.add(new String[]{(String)cmbPalabras.getSelectedItem(), txtPalabra.getText()});
            txtPalabra.setText("");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void spnValorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spnValorMouseReleased
        if((Integer)spnValor.getValue() < 0)
            spnValor.setValue(0);
    }//GEN-LAST:event_spnValorMouseReleased

    private void mnuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEliminarActionPerformed
        DefaultListModel model = (DefaultListModel) lstRespuestas.getModel();
        int selectedIndex = lstRespuestas.getSelectedIndex();
        if (selectedIndex >= 0 && selectedIndex < model.getSize()) 
            model.remove(selectedIndex);
        lsPalabras.remove(selectedIndex);
    }//GEN-LAST:event_mnuEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnContestar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox cmbPalabras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnunciado;
    private javax.swing.JList lstRespuestas;
    private javax.swing.JMenuItem mnuEliminar;
    private javax.swing.JPanel pnlEvaluar;
    private javax.swing.JPanel pnlInsertar;
    private javax.swing.JScrollPane pnlScroll;
    private javax.swing.JPopupMenu popMenu;
    private javax.swing.JSpinner spnValor;
    private javax.swing.JTextField txtEnunciado;
    private javax.swing.JTextField txtPalabra;
    private javax.swing.JTextArea txtRespuesta;
    // End of variables declaration//GEN-END:variables

    @Override
    public void insertarInfo() {
        pnlInsertar.setVisible(true);
        pnlEvaluar.setVisible(false);
        this.show();
    }

    @Override
    public void eliminarInfo() {
        
    }

    @Override
    public void evaluarPregunta() {

        if(sRespuesta.equalsIgnoreCase(sTexto))
            this.iValor=iValor;
        else
            this.iValor=0;

        
    }

    @Override
    public void desplegarPregunta() {
        pnlInsertar.setVisible(false);
        pnlEvaluar.setVisible(true);
        this.show();
    }

    @Override
    public double getScore() {
        return iValor;
    }
}
