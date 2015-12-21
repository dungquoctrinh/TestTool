/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTool.model.QuestionPackage.view;

import TestTool.model.RunPackage.model.TeacherRun;

/**
 *
 * @author Zach
 */
public class JFrameCreateFreeAnswer extends javax.swing.JFrame {

    TeacherRun teacherRun;
    /**
     * Creates new form JFrameCreateFreeAnswer
     */
    public JFrameCreateFreeAnswer(TeacherRun teacherRun) {
        this.teacherRun = teacherRun;
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

        jTextFieldPoints = new javax.swing.JTextField();
        jButtonUpload = new javax.swing.JButton();
        jLabelClass = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jComboBoxClass = new javax.swing.JComboBox();
        jLabelDifficulty = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jComboBoxDifficulty = new javax.swing.JComboBox();
        jLabelTime = new javax.swing.JLabel();
        jTextFieldMinutes = new javax.swing.JTextField();
        jLabelQuestionText = new javax.swing.JLabel();
        jLabelMinutes = new javax.swing.JLabel();
        jScrollPaneQuestionText = new javax.swing.JScrollPane();
        jTextAreaQuestionText = new javax.swing.JTextArea();
        jLabelPoints = new javax.swing.JLabel();
        jLabelUpload = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Galactest - Free Answer");

        jTextFieldPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPointsActionPerformed(evt);
            }
        });

        jButtonUpload.setText("Upload");
        jButtonUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUploadActionPerformed(evt);
            }
        });

        jLabelClass.setText("Class:");

        jButtonSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jComboBoxClass.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "101", "102", "307" }));

        jLabelDifficulty.setText("Difficulty:");

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitle.setText("New Free Answer Question");

        jComboBoxDifficulty.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabelTime.setText("Time:");

        jTextFieldMinutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMinutesActionPerformed(evt);
            }
        });

        jLabelQuestionText.setText("Question Text:");

        jLabelMinutes.setText("Minutes");

        jTextAreaQuestionText.setColumns(20);
        jTextAreaQuestionText.setRows(5);
        jScrollPaneQuestionText.setViewportView(jTextAreaQuestionText);

        jLabelPoints.setText("Points:");

        jLabelUpload.setText("Upload auto grading script?");

        jButtonBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelQuestionText)
                        .addGap(304, 304, 304))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(82, 82, 82)
                                    .addComponent(jLabelTitle))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(59, 59, 59)
                                            .addComponent(jButtonBack))
                                        .addComponent(jLabelUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonUpload))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addComponent(jButtonSave)))))
                            .addGap(99, 99, 99))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPaneQuestionText, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldMinutes, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelTime, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelMinutes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextFieldPoints, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelPoints, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(jComboBoxDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelDifficulty)
                                        .addComponent(jComboBoxClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelClass))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGap(31, 31, 31)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuestionText)
                    .addComponent(jLabelClass, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPaneQuestionText, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelUpload)
                            .addComponent(jButtonUpload)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelDifficulty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMinutes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPoints)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonBack))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPointsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPointsActionPerformed

    private void jButtonUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUploadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonUploadActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        System.out.println("In Create Free Answer: Save Question and return to Question Bank Window");
        JFrameQuestionBank questionBankWindow = new JFrameQuestionBank(teacherRun);
        questionBankWindow.setVisible(true);
        this.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jTextFieldMinutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMinutesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMinutesActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        System.out.println("In Create Free Answer: Return to Create Question Window");
        JFrameCreateQuestion createQuestionWindow = new JFrameCreateQuestion(teacherRun);
        createQuestionWindow.setVisible(true);
        this.setVisible(false);         // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(JFrameCreateFreeAnswer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCreateFreeAnswer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCreateFreeAnswer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCreateFreeAnswer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCreateFreeAnswer(new TeacherRun("")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonUpload;
    private javax.swing.JComboBox jComboBoxClass;
    private javax.swing.JComboBox jComboBoxDifficulty;
    private javax.swing.JLabel jLabelClass;
    private javax.swing.JLabel jLabelDifficulty;
    private javax.swing.JLabel jLabelMinutes;
    private javax.swing.JLabel jLabelPoints;
    private javax.swing.JLabel jLabelQuestionText;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUpload;
    private javax.swing.JScrollPane jScrollPaneQuestionText;
    private javax.swing.JTextArea jTextAreaQuestionText;
    private javax.swing.JTextField jTextFieldMinutes;
    private javax.swing.JTextField jTextFieldPoints;
    // End of variables declaration//GEN-END:variables
}
