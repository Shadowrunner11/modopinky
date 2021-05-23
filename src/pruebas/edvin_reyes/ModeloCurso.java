/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.edvin_reyes;

import com.gt.correcion.Corrector;
import com.gt.modo_oscuro.Pintor;
import java.awt.Color;
import java.awt.MenuBar;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRadioButton;

/**
 *
 * @author Usuario
 */
public class ModeloCurso extends javax.swing.JFrame {
    
   
    
    public ModeloCurso() {
        initComponents();
        
        
         
        new Pintor(Color.BLUE).pintar(arribaPanel);
        new Pintor(Color.DARK_GRAY).pintar(centralPanel);
        new Pintor(Color.PINK).pintar(abajoPanel);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        rootPanel = new javax.swing.JPanel();
        arribaPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        centralPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        preguntasJPanel = new javax.swing.JPanel();
        pregunta1panel = new javax.swing.JPanel();
        enunciadoJLabel = new javax.swing.JLabel();
        infoJLabel = new javax.swing.JLabel();
        alternativasPanel = new javax.swing.JPanel();
        claveA = new javax.swing.JRadioButton();
        claveA1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        pregunta1panel1 = new javax.swing.JPanel();
        enunciadoJLabel1 = new javax.swing.JLabel();
        infoJLabel1 = new javax.swing.JLabel();
        alternativasPanel1 = new javax.swing.JPanel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        pregunta1panel2 = new javax.swing.JPanel();
        enunciadoJLabel2 = new javax.swing.JLabel();
        infoJLabel2 = new javax.swing.JLabel();
        alternativasPanel2 = new javax.swing.JPanel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        abajoPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 1800));

        rootPanel.setPreferredSize(new java.awt.Dimension(800, 2560));
        rootPanel.setLayout(new java.awt.BorderLayout());

        arribaPanel.setPreferredSize(new java.awt.Dimension(0, 100));
        arribaPanel.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ciencias Sociales");
        jLabel1.setToolTipText("");
        arribaPanel.add(jLabel1, java.awt.BorderLayout.CENTER);

        jToggleButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jToggleButton1.setText("Menú");
        jToggleButton1.setPreferredSize(new java.awt.Dimension(120, 25));
        arribaPanel.add(jToggleButton1, java.awt.BorderLayout.LINE_START);

        jPanel1.setPreferredSize(new java.awt.Dimension(120, 25));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        arribaPanel.add(jPanel1, java.awt.BorderLayout.LINE_END);

        rootPanel.add(arribaPanel, java.awt.BorderLayout.PAGE_START);

        centralPanel.setPreferredSize(new java.awt.Dimension(0, 100));
        centralPanel.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenido ");
        jLabel2.setToolTipText("");
        jLabel2.setPreferredSize(new java.awt.Dimension(34, 50));
        centralPanel.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        preguntasJPanel.setLayout(new java.awt.GridLayout(3, 0, 0, 20));

        pregunta1panel.setLayout(new java.awt.BorderLayout());

        enunciadoJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enunciadoJLabel.setText("jLabel4");
        pregunta1panel.add(enunciadoJLabel, java.awt.BorderLayout.PAGE_START);

        infoJLabel.setText("jLabel3");
        pregunta1panel.add(infoJLabel, java.awt.BorderLayout.PAGE_END);

        buttonGroup1.add(claveA);
        claveA.setText("jRadioButton1");
        alternativasPanel.add(claveA);

        buttonGroup1.add(claveA1);
        claveA1.setText("jRadioButton2");
        alternativasPanel.add(claveA1);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("jRadioButton3");
        alternativasPanel.add(jRadioButton3);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("jRadioButton4");
        alternativasPanel.add(jRadioButton4);

        pregunta1panel.add(alternativasPanel, java.awt.BorderLayout.CENTER);

        preguntasJPanel.add(pregunta1panel);

        pregunta1panel1.setLayout(new java.awt.BorderLayout());

        enunciadoJLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enunciadoJLabel1.setText("jLabel4");
        pregunta1panel1.add(enunciadoJLabel1, java.awt.BorderLayout.PAGE_START);

        infoJLabel1.setText("jLabel3");
        pregunta1panel1.add(infoJLabel1, java.awt.BorderLayout.PAGE_END);

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("jRadioButton1");
        alternativasPanel1.add(jRadioButton5);

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setText("jRadioButton2");
        alternativasPanel1.add(jRadioButton6);

        buttonGroup2.add(jRadioButton7);
        jRadioButton7.setText("jRadioButton3");
        alternativasPanel1.add(jRadioButton7);

        buttonGroup2.add(jRadioButton8);
        jRadioButton8.setText("jRadioButton4");
        alternativasPanel1.add(jRadioButton8);

        pregunta1panel1.add(alternativasPanel1, java.awt.BorderLayout.CENTER);

        preguntasJPanel.add(pregunta1panel1);

        pregunta1panel2.setLayout(new java.awt.BorderLayout());

        enunciadoJLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enunciadoJLabel2.setText("jLabel4");
        pregunta1panel2.add(enunciadoJLabel2, java.awt.BorderLayout.PAGE_START);

        infoJLabel2.setText("jLabel3");
        pregunta1panel2.add(infoJLabel2, java.awt.BorderLayout.PAGE_END);

        buttonGroup3.add(jRadioButton9);
        jRadioButton9.setText("jRadioButton1");
        alternativasPanel2.add(jRadioButton9);

        buttonGroup3.add(jRadioButton10);
        jRadioButton10.setText("jRadioButton2");
        alternativasPanel2.add(jRadioButton10);

        buttonGroup3.add(jRadioButton11);
        jRadioButton11.setText("jRadioButton3");
        alternativasPanel2.add(jRadioButton11);

        buttonGroup3.add(jRadioButton12);
        jRadioButton12.setText("jRadioButton4");
        alternativasPanel2.add(jRadioButton12);

        pregunta1panel2.add(alternativasPanel2, java.awt.BorderLayout.CENTER);

        preguntasJPanel.add(pregunta1panel2);

        centralPanel.add(preguntasJPanel, java.awt.BorderLayout.CENTER);

        rootPanel.add(centralPanel, java.awt.BorderLayout.CENTER);

        abajoPanel.setPreferredSize(new java.awt.Dimension(0, 100));
        abajoPanel.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Salir");
        abajoPanel.add(jButton1);

        jButton2.setText("Ver errores");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        abajoPanel.add(jButton2);

        jButton3.setText("Siguiente");
        abajoPanel.add(jButton3);

        rootPanel.add(abajoPanel, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(rootPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//       new Corrector().corregir(jRadioButton1, infoJLabel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
//       new Corrector().corregir(claveA , infoJLabel);
//       new Corrector().corregir(claveB3, infoJLabel1);
//       new Corrector().corregir(claveC2, infoJLabel2);
       
        JRadioButton [] respuestas={claveA,jRadioButton8,jRadioButton11};
        JLabel [] alertas = {infoJLabel,infoJLabel1,infoJLabel2};
        
        for (int i = 0; i < 3; i++) {
            new Corrector().corregir(respuestas[i], alertas[i]);
        }
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(ModeloCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModeloCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModeloCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModeloCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModeloCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abajoPanel;
    private javax.swing.JPanel alternativasPanel;
    private javax.swing.JPanel alternativasPanel1;
    private javax.swing.JPanel alternativasPanel2;
    private javax.swing.JPanel arribaPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JPanel centralPanel;
    private javax.swing.JRadioButton claveA;
    private javax.swing.JRadioButton claveA1;
    private javax.swing.JLabel enunciadoJLabel;
    private javax.swing.JLabel enunciadoJLabel1;
    private javax.swing.JLabel enunciadoJLabel2;
    private javax.swing.JLabel infoJLabel;
    private javax.swing.JLabel infoJLabel1;
    private javax.swing.JLabel infoJLabel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel pregunta1panel;
    private javax.swing.JPanel pregunta1panel1;
    private javax.swing.JPanel pregunta1panel2;
    private javax.swing.JPanel preguntasJPanel;
    private javax.swing.JPanel rootPanel;
    // End of variables declaration//GEN-END:variables
}
