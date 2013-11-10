/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.DefaultDesktopManager;
import javax.swing.DefaultListModel;
import javax.swing.DesktopManager;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

/**
 *
 * @author GeOrge
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal(String sUsuario) {
        initComponents();
        if(sUsuario=="")
            mnuSalir.setVisible(true);
        else if (sUsuario=="Estudiante")
            mnuCrear.setVisible(false);
        else
            mnuIniciar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBarraEstado = new javax.swing.JLabel();
        dskPanel = new javax.swing.JDesktopPane();
        frmCrearExamen = new javax.swing.JInternalFrame();
        lblNombreCrear = new javax.swing.JLabel();
        txtNombreCrear = new javax.swing.JTextField();
        lblDescripcionCrear = new javax.swing.JLabel();
        pnlDescScrollCrear = new javax.swing.JScrollPane();
        txtDescripcionCrear = new javax.swing.JTextArea();
        pnlListaCrear = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstListaCrear = new javax.swing.JList();
        btnAgregarCrear = new javax.swing.JButton();
        btnGuardarCrear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        mnbMenu = new javax.swing.JMenuBar();
        mnuInicio = new javax.swing.JMenu();
        mnuUsuario = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuCrear = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuIniciar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Examen");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblBarraEstado.setText("jLabel1");

        dskPanel.setBackground(new java.awt.Color(153, 180, 209));
        dskPanel.setForeground(new java.awt.Color(105, 105, 105));
        dskPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dskPanelMouseEntered(evt);
            }
        });
        dskPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                dskPanelComponentShown(evt);
            }
        });

        frmCrearExamen.setClosable(true);
        frmCrearExamen.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        frmCrearExamen.setTitle("Crear Examen");
        frmCrearExamen.setName(""); // NOI18N
        frmCrearExamen.setVisible(false);
        frmCrearExamen.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                frmCrearExamenComponentShown(evt);
            }
        });

        lblNombreCrear.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblNombreCrear.setText("Nombre:");

        lblDescripcionCrear.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblDescripcionCrear.setText("Descripción:");

        txtDescripcionCrear.setColumns(20);
        txtDescripcionCrear.setRows(3);
        pnlDescScrollCrear.setViewportView(txtDescripcionCrear);

        pnlListaCrear.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Secciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 102, 255)));
        pnlListaCrear.setPreferredSize(new java.awt.Dimension(270, 184));

        jScrollPane2.setViewportView(lstListaCrear);

        btnAgregarCrear.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarCrear.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnAgregarCrear.setText("Agregar");
        btnAgregarCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarCrearMouseEntered(evt);
            }
        });
        btnAgregarCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlListaCrearLayout = new javax.swing.GroupLayout(pnlListaCrear);
        pnlListaCrear.setLayout(pnlListaCrearLayout);
        pnlListaCrearLayout.setHorizontalGroup(
            pnlListaCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaCrearLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlListaCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListaCrearLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregarCrear)))
                .addContainerGap())
        );
        pnlListaCrearLayout.setVerticalGroup(
            pnlListaCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaCrearLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarCrear))
        );

        btnGuardarCrear.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarCrear.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnGuardarCrear.setText("Guardar");
        btnGuardarCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarCrearMouseEntered(evt);
            }
        });
        btnGuardarCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmCrearExamenLayout = new javax.swing.GroupLayout(frmCrearExamen.getContentPane());
        frmCrearExamen.getContentPane().setLayout(frmCrearExamenLayout);
        frmCrearExamenLayout.setHorizontalGroup(
            frmCrearExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmCrearExamenLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(frmCrearExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnGuardarCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreCrear, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcionCrear, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDescScrollCrear, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreCrear, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlListaCrear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        frmCrearExamenLayout.setVerticalGroup(
            frmCrearExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmCrearExamenLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(lblNombreCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescripcionCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDescScrollCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlListaCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarCrear)
                .addContainerGap())
        );

        dskPanel.add(frmCrearExamen);
        frmCrearExamen.setBounds(0, 0, 384, 488);
        frmCrearExamen.getAccessibleContext().setAccessibleParent(dskPanel);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        dskPanel.add(jButton1);
        jButton1.setBounds(620, 490, 140, 50);

        mnbMenu.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                mnbMenuComponentShown(evt);
            }
        });

        mnuInicio.setText("Inicio");

        mnuUsuario.setText("Cambiar Usuario");
        mnuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUsuarioActionPerformed(evt);
            }
        });
        mnuInicio.add(mnuUsuario);

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        mnuInicio.add(mnuSalir);

        mnbMenu.add(mnuInicio);

        jMenu2.setText("Examen");

        mnuCrear.setText("Crear");
        mnuCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCrearActionPerformed(evt);
            }
        });
        jMenu2.add(mnuCrear);

        jMenuItem1.setText("Modificar");
        jMenu2.add(jMenuItem1);

        mnuIniciar.setText("Elegir ");
        mnuIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIniciarActionPerformed(evt);
            }
        });
        jMenu2.add(mnuIniciar);

        mnbMenu.add(jMenu2);

        setJMenuBar(mnbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBarraEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dskPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBarraEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        lblBarraEstado.setText("Presione a ver que pasa");
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dskPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dskPanelMouseEntered
        lblBarraEstado.setText("");
    }//GEN-LAST:event_dskPanelMouseEntered

    private void mnuCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCrearActionPerformed
//        clsVentana ventana = new clsVentana("Crear Examen", new int[]{400, 450}, new int[]{150, 10});
//        clsPanel panel = new clsPanel(new int[]{0, 0}, new int[]{0, 0});
//        
//        clsPanel pnlSeccion = new clsPanel(new int[]{350, 200}, new int[]{20, 20});
//        pnlSeccion.setBorde("Sección");
//        
//        clsLista lstLista = new clsLista(new int[]{290, 120}, new int[]{0, 0});
//        JScrollPane pnlScroll = new JScrollPane(lstLista);
//        clsBoton btnSeccion = new clsBoton("Agregar", new int[]{60, 30}, new int[]{50, 100});
//        
//        pnlSeccion.add(pnlScroll);
//        pnlSeccion.add(btnSeccion);
//        
//        ventana.add(panel);
//        ventana.add(pnlSeccion);
//        
//        dskPanel.add(ventana);
//        
//        ventana.setVisible(true);
        JInternalFrame frame = new frmCrearExamen(new Object[]{dskPanel, lblBarraEstado});
        dskPanel.add(frame);
        frame.show();
    }//GEN-LAST:event_mnuCrearActionPerformed

    private void btnAgregarCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCrearMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCrearMouseEntered

    private void algo(){
        pnlDescScrollCrear.setVisible(false);
        lblNombreCrear.setVisible(false);
        lblDescripcionCrear.setVisible(false);
        txtNombreCrear.setVisible(false);
        lblNombreCrear.setText("Pregunta");
        pnlListaCrear.setLocation(10, 10);
        
        TitledBorder titledBorder = BorderFactory.createTitledBorder("Preguntas");
        titledBorder.setTitleColor(new Color(26367));
        pnlListaCrear.setBorder(titledBorder);
        repaint();
    }
    
    private void btnAgregarCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCrearActionPerformed
        algo();
        algo();
        
        //txtDescripcionCrear.setVisible(false);
        //repaint();
    }//GEN-LAST:event_btnAgregarCrearActionPerformed

    private void btnGuardarCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarCrearMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarCrearMouseEntered

    private void btnGuardarCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarCrearActionPerformed

    private void dskPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_dskPanelComponentShown
        
    }//GEN-LAST:event_dskPanelComponentShown

    private void frmCrearExamenComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_frmCrearExamenComponentShown
        
    }//GEN-LAST:event_frmCrearExamenComponentShown

    private void mnbMenuComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_mnbMenuComponentShown
        //dskPanel.add(frmCrearExamen);
    }//GEN-LAST:event_mnbMenuComponentShown

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIniciarActionPerformed
        // TODO add your handling code here:
        JInternalFrame frame = new frmListaExamen();
        frame.setVisible(true);
        dskPanel.add(frame);
    }//GEN-LAST:event_mnuIniciarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setBounds(0,0,screenSize.width, screenSize.height);
        
        DesktopManager manager = new DefaultDesktopManager() {
            /** This moves the <code>JComponent</code> and repaints the damaged areas. */
            @Override
            public void setBoundsForFrame(JComponent f, int newX, int newY, int newWidth, int newHeight) {
                boolean didResize = (f.getWidth() != newWidth || f.getHeight() != newHeight);
                if (!inBounds((JInternalFrame) f, newX, newY, newWidth, newHeight)) return;
                f.setBounds(newX, newY, newWidth, newHeight);
                if(didResize)
                    f.validate();
            }

            protected boolean inBounds(JInternalFrame f, int newX, int newY, int newWidth, int newHeight) {
                if (newX < 0 || newY < 0) return false;
                if (newX + newWidth > f.getDesktopPane().getWidth()) return false;
                if (newY + newHeight > f.getDesktopPane().getHeight()) return false;
                return true;
            }
        };
        
        dskPanel.setDesktopManager(manager);
    }//GEN-LAST:event_formComponentShown

    private void mnuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUsuarioActionPerformed
        this.dispose();
        new ingresar().show();
    }//GEN-LAST:event_mnuUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal("").setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCrear;
    private javax.swing.JButton btnGuardarCrear;
    public static javax.swing.JDesktopPane dskPanel;
    private javax.swing.JInternalFrame frmCrearExamen;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBarraEstado;
    private javax.swing.JLabel lblDescripcionCrear;
    private javax.swing.JLabel lblNombreCrear;
    private javax.swing.JList lstListaCrear;
    private javax.swing.JMenuBar mnbMenu;
    private javax.swing.JMenuItem mnuCrear;
    private javax.swing.JMenuItem mnuIniciar;
    private javax.swing.JMenu mnuInicio;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenuItem mnuUsuario;
    private javax.swing.JScrollPane pnlDescScrollCrear;
    private javax.swing.JPanel pnlListaCrear;
    private javax.swing.JTextArea txtDescripcionCrear;
    private javax.swing.JTextField txtNombreCrear;
    // End of variables declaration//GEN-END:variables
}
