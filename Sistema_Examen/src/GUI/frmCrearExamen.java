/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import Estructuras_de_Datos.clsExamen;
import Estructuras_de_Datos.clsExamenes;
import Estructuras_de_Datos.clsPreguntas;
import Estructuras_de_Datos.clsSeccion;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

/**
 *
 * @author GeOrge
 */
public class frmCrearExamen extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmCrearExamen
     */
    
    JDesktopPane dskPanel;
    JLabel lblBarraEstado;
    clsExamenes insExamenes;
    clsExamen insExamen;
    clsPreguntas insPregunta;
    boolean bBandera;
    ArrayList<clsSeccion> secciones = new ArrayList<>();
    
    public frmCrearExamen(Object[] args) {
        initComponents();
        dskPanel = (JDesktopPane)args[0];
        lblBarraEstado = (JLabel)args[1];
        insExamenes = (clsExamenes)args[2];
        insPregunta = (clsPreguntas)args[3];
        insExamen = new clsExamen();
        bBandera = true;
    }
    
    public frmCrearExamen(clsExamen examen, Object[] args) {
        initComponents();
        txtNombre.setText(examen.getsNombre());
        txtProfesor.setText(examen.getsProfesor());
        txtDescripcion.setText(examen.getsDescripcion());
        insExamen = examen;
        secciones = examen.getAlSecciones();
        dskPanel = (JDesktopPane)args[0];
        lblBarraEstado = (JLabel)args[1];
        insPregunta = (clsPreguntas)args[2];
        bBandera = false;
        
//        if(secciones != null) {
            DefaultListModel model = new DefaultListModel();
            for(int i=0; i < secciones.size(); i++)
                model.addElement(secciones.get(i).getsNombre());
            lstSecciones.setModel(model);
            btnGuardar.setEnabled(true);
//        }
        
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
        mnuAgregar = new javax.swing.JMenuItem();
        mnuModificar = new javax.swing.JMenuItem();
        mnuEliminar = new javax.swing.JMenuItem();
        pnlDescScrollCrear = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtNombre = new javax.swing.JTextField();
        lblDescripcionCrear = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        pnlListaCrear = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSecciones = new javax.swing.JList();
        lblNombre1 = new javax.swing.JLabel();
        txtProfesor = new javax.swing.JTextField();
        lblNombre2 = new javax.swing.JLabel();
        cmbExamen = new javax.swing.JComboBox();

        mnuAgregar.setText("Agregar");
        mnuAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAgregarActionPerformed(evt);
            }
        });
        popMenu.add(mnuAgregar);

        mnuModificar.setText("Modificar");
        mnuModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuModificarActionPerformed(evt);
            }
        });
        popMenu.add(mnuModificar);
        mnuModificar.getAccessibleContext().setAccessibleParent(popMenu);

        mnuEliminar.setText("Eliminar");
        mnuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEliminarActionPerformed(evt);
            }
        });
        popMenu.add(mnuEliminar);

        setClosable(true);
        setTitle("Nuevo Examen");
        setToolTipText("");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(3);
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyReleased(evt);
            }
        });
        pnlDescScrollCrear.setViewportView(txtDescripcion);

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        lblDescripcionCrear.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblDescripcionCrear.setText("Descripción:");

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblNombre.setText("Nombre:");

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        pnlListaCrear.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Secciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 102, 255)));
        pnlListaCrear.setMaximumSize(new java.awt.Dimension(270, 184));
        pnlListaCrear.setMinimumSize(new java.awt.Dimension(270, 184));
        pnlListaCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlListaCrearMouseEntered(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lstSecciones.setComponentPopupMenu(popMenu);
        lstSecciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lstSeccionesMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(lstSecciones);

        javax.swing.GroupLayout pnlListaCrearLayout = new javax.swing.GroupLayout(pnlListaCrear);
        pnlListaCrear.setLayout(pnlListaCrearLayout);
        pnlListaCrearLayout.setHorizontalGroup(
            pnlListaCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaCrearLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(10, 10, 10))
            .addGroup(pnlListaCrearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlListaCrearLayout.setVerticalGroup(
            pnlListaCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaCrearLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(btnAgregar)
                .addGap(10, 10, 10))
        );

        lblNombre1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblNombre1.setText("Profesor:");

        txtProfesor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProfesorKeyReleased(evt);
            }
        });

        lblNombre2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblNombre2.setText("Parcial:");

        cmbExamen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "I", "II", "III", "IV" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProfesor))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlDescScrollCrear)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescripcionCrear)
                            .addComponent(pnlListaCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre2)
                                .addGap(14, 14, 14)
                                .addComponent(cmbExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombre)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre1)
                    .addComponent(txtProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre2)
                    .addComponent(cmbExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(lblDescripcionCrear)
                .addGap(5, 5, 5)
                .addComponent(pnlDescScrollCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlListaCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnGuardar)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        insExamen.setsNombre(txtNombre.getText());
        insExamen.setsProfesor(txtProfesor.getText());
        insExamen.setiNumeroExamen(cmbExamen.getSelectedIndex());
        insExamen.setsDescripcion(txtDescripcion.getText());
        
//        for(int i=0; i < secciones.size(); i++)
//            insExamen.addSeccion(secciones.get(i));

//        insExamen.addSeccion(null);
        if(bBandera)
            insExamenes.addExamen(insExamen);
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        JInternalFrame insFrame = new frmCrearSeccion(new Object[]{dskPanel, lblBarraEstado, lstSecciones, insExamen, insPregunta});
        dskPanel.add(insFrame);
        insFrame.show();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void mnuAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgregarActionPerformed
        JInternalFrame insFrame = new frmCrearSeccion(new Object[]{dskPanel, lblBarraEstado, /*lstSecciones, insExamen,*/ insPregunta});
        dskPanel.add(insFrame);
        insFrame.show();
    }//GEN-LAST:event_mnuAgregarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        this.setLocation(550, 20);
        txtDescripcion.setLineWrap(true);
    }//GEN-LAST:event_formComponentShown

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        clsVentana insVentana = new clsVentana();
        if(insVentana.activarBoton(new String[]{txtNombre.getText(), txtProfesor.getText(), txtDescripcion.getText()}))
            btnGuardar.setEnabled(true);
        else
            btnGuardar.setEnabled(false);
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtProfesorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProfesorKeyReleased
        clsVentana insVentana = new clsVentana();
        if(insVentana.activarBoton(new String[]{txtNombre.getText(), txtProfesor.getText(), txtDescripcion.getText()}))
            btnGuardar.setEnabled(true);
        else
            btnGuardar.setEnabled(false);
    }//GEN-LAST:event_txtProfesorKeyReleased

    private void txtDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyReleased
        clsVentana insVentana = new clsVentana();
        if(insVentana.activarBoton(new String[]{txtNombre.getText(), txtProfesor.getText(), txtDescripcion.getText()}))
            btnGuardar.setEnabled(true);
        else
            btnGuardar.setEnabled(false);
    }//GEN-LAST:event_txtDescripcionKeyReleased

    private void lstSeccionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstSeccionesMouseEntered
        lblBarraEstado.setText("Click derecho para agregar una sección");
    }//GEN-LAST:event_lstSeccionesMouseEntered

    private void pnlListaCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlListaCrearMouseEntered
        lblBarraEstado.setText("");
    }//GEN-LAST:event_pnlListaCrearMouseEntered

    private void mnuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEliminarActionPerformed
        DefaultListModel model = (DefaultListModel) lstSecciones.getModel();
        int selectedIndex = lstSecciones.getSelectedIndex();
        if (selectedIndex >= 0 && selectedIndex < model.getSize()) 
            model.remove(selectedIndex);
        insExamen.getAlSecciones().remove(selectedIndex);
    }//GEN-LAST:event_mnuEliminarActionPerformed

    private void mnuModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuModificarActionPerformed
        JInternalFrame frame = new frmCrearSeccion(insExamen.getAlSecciones().get(lstSecciones.getSelectedIndex()), new Object[]{dskPanel, lblBarraEstado, insPregunta});
        dskPanel.add(frame);
        frame.show();
    }//GEN-LAST:event_mnuModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox cmbExamen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescripcionCrear;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JList lstSecciones;
    private javax.swing.JMenuItem mnuAgregar;
    private javax.swing.JMenuItem mnuEliminar;
    private javax.swing.JMenuItem mnuModificar;
    private javax.swing.JScrollPane pnlDescScrollCrear;
    private javax.swing.JPanel pnlListaCrear;
    private javax.swing.JPopupMenu popMenu;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProfesor;
    // End of variables declaration//GEN-END:variables
}
