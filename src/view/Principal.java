/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author onew_
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        
        this.setExtendedState(Principal.MAXIMIZED_BOTH);
        this.setIconImage(new ImageIcon(getClass().getResource("save.png")).getImage());
        int xx = 0;
        jTextField1.setText(""+ xx);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("compras_bg.png"));

        Image img = icon.getImage();
        desktopInternal = new javax.swing.JDesktopPane() {
            public void paintComponent(Graphics g) {
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jTextField1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnAddAluno = new javax.swing.JMenuItem();
        btnAddInstrutor = new javax.swing.JMenuItem();
        btnAddInstrutor1 = new javax.swing.JMenuItem();
        btnAddInstrutor2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GoTodo 1.0 ~ By. Flavio Ever");
        setIconImages(null);

        jTextField1.setText("jTextField1");

        desktopInternal.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopInternalLayout = new javax.swing.GroupLayout(desktopInternal);
        desktopInternal.setLayout(desktopInternalLayout);
        desktopInternalLayout.setHorizontalGroup(
            desktopInternalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopInternalLayout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(590, Short.MAX_VALUE))
        );
        desktopInternalLayout.setVerticalGroup(
            desktopInternalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopInternalLayout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 546, Short.MAX_VALUE))
        );

        jMenu1.setText("ToDo");

        btnAddAluno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btnAddAluno.setText("Cadastrar");
        btnAddAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAlunoActionPerformed(evt);
            }
        });
        jMenu1.add(btnAddAluno);

        btnAddInstrutor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btnAddInstrutor.setText("Relatório");
        btnAddInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddInstrutorActionPerformed(evt);
            }
        });
        jMenu1.add(btnAddInstrutor);

        btnAddInstrutor1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btnAddInstrutor1.setText("Sobre");
        btnAddInstrutor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddInstrutor1ActionPerformed(evt);
            }
        });
        jMenu1.add(btnAddInstrutor1);

        btnAddInstrutor2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        btnAddInstrutor2.setText("Sair");
        btnAddInstrutor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddInstrutor2ActionPerformed(evt);
            }
        });
        jMenu1.add(btnAddInstrutor2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopInternal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopInternal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        setSize(new java.awt.Dimension(1044, 626));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddInstrutorActionPerformed
        desktopInternal.removeAll();
        Relatorio relatorio = new Relatorio();
        desktopInternal.add(relatorio);
        relatorio.setVisible(true);
    }//GEN-LAST:event_btnAddInstrutorActionPerformed

    private void btnAddAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAlunoActionPerformed
        desktopInternal.removeAll();
        Cadastro cadastro = new Cadastro();
        desktopInternal.add(cadastro);
        cadastro.setVisible(true);
    }//GEN-LAST:event_btnAddAlunoActionPerformed

    private void btnAddInstrutor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddInstrutor1ActionPerformed
        desktopInternal.removeAll();
        Sobre sobre = new Sobre();
        desktopInternal.add(sobre);
        sobre.setVisible(true);
    }//GEN-LAST:event_btnAddInstrutor1ActionPerformed

    private void btnAddInstrutor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddInstrutor2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnAddInstrutor2ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAddAluno;
    private javax.swing.JMenuItem btnAddInstrutor;
    private javax.swing.JMenuItem btnAddInstrutor1;
    private javax.swing.JMenuItem btnAddInstrutor2;
    private javax.swing.JDesktopPane desktopInternal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}