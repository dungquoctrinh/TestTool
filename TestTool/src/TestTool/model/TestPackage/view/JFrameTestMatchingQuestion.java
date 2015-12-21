/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTool.model.TestPackage.view;

import TestTool.model.RunPackage.model.StudentRun;
import java.util.ArrayList;

/**
 *
 * @author Dung Trinh
 */
public class JFrameTestMatchingQuestion extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMatching
     */
    //can just set the field directly
    ArrayList<String> answer;
            
    public JFrameTestMatchingQuestion(ArrayList<String> left, ArrayList<String> right) {
        this.answer = new ArrayList<String>();
        initComponents();
        jLabelQuestion1.setText(left.get(0));
        jLabelQuestion2.setText(left.get(1));
        jLabelQuestion3.setText(left.get(2));
        
        jLabelAnswer1.setText(left.get(0));
        jLabelAnswer2.setText(left.get(1));
        jLabelAnswer3.setText(left.get(2));
        
    }

    //Get all the answer
    public void setData()
    {
        answer.add(this.jTextField1.getText());
        answer.add(this.jTextField2.getText());
        answer.add(this.jTextField3.getText());
    }
    
    public ArrayList<String> getDataMatching()
    {
        return answer;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelQuestion1 = new javax.swing.JLabel();
        jLabelQuestion2 = new javax.swing.JLabel();
        jLabelQuestion3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelAnswer1 = new javax.swing.JLabel();
        jLabelAnswer2 = new javax.swing.JLabel();
        jLabelAnswer3 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jButtonMatchingSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Matching Window");

        jLabelQuestion1.setText("jLabel1");

        jLabelQuestion2.setText("jLabel2");

        jLabelQuestion3.setText("jLabel3");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelAnswer1.setText("jLabel4");

        jLabelAnswer2.setText("jLabel5");

        jLabelAnswer3.setText("jLabel6");

        jButtonBack.setText("Go Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jButtonMatchingSubmit.setText("Comfirm");
        jButtonMatchingSubmit.setToolTipText("");
        jButtonMatchingSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMatchingSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelQuestion1)
                            .addComponent(jLabelQuestion3)
                            .addComponent(jLabelQuestion2))
                        .addGap(95, 95, 95)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAnswer2)
                            .addComponent(jLabelAnswer1)
                            .addComponent(jLabelAnswer3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jButtonBack)
                        .addGap(78, 78, 78)
                        .addComponent(jButtonMatchingSubmit)))
                .addGap(0, 124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelQuestion1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelQuestion2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelQuestion3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabelAnswer1)
                        .addGap(29, 29, 29)
                        .addComponent(jLabelAnswer2)
                        .addGap(31, 31, 31)
                        .addComponent(jLabelAnswer3))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBack)
                    .addComponent(jButtonMatchingSubmit))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMatchingSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMatchingSubmitActionPerformed
        //set data and go back
        this.setData();
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMatchingSubmitActionPerformed

    //Same but data will be null
    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        //set data and go back
        this.setData();
        //should close the window
        this.setVisible(false);
    }//GEN-LAST:event_jButtonBackActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameTestMatchingQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTestMatchingQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTestMatchingQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTestMatchingQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonMatchingSubmit;
    private javax.swing.JLabel jLabelAnswer1;
    private javax.swing.JLabel jLabelAnswer2;
    private javax.swing.JLabel jLabelAnswer3;
    private javax.swing.JLabel jLabelQuestion1;
    private javax.swing.JLabel jLabelQuestion2;
    private javax.swing.JLabel jLabelQuestion3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
