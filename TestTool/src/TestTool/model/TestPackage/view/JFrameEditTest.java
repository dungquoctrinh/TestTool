/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTool.model.TestPackage.view;

import TestTool.model.QuestionPackage.view.JFrameCreateQuestion;
import TestTool.model.RunPackage.model.TeacherRun;
import TestTool.model.RunPackage.view.JFrameTeacherHome;
import TestTool.model.TestPackage.model.Test;

/**
 *
 * @author Zach
 */
public class JFrameEditTest extends javax.swing.JFrame {

    TeacherRun teacherRun;
    Test test;
    //private StudentRun studentRun; 
    
    /**
     * Creates new form JFrameViewTest
     */
    public JFrameEditTest(TeacherRun teacherRun, Test test) {
        this.teacherRun = teacherRun;
        this.test = test;
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

        jLabelTotalPoints = new javax.swing.JLabel();
        jTextFieldTotalPoints = new javax.swing.JTextField();
        jLabelCreateTest = new javax.swing.JLabel();
        jLabelTotalTime = new javax.swing.JLabel();
        jLabelQuestionBank = new javax.swing.JLabel();
        jTextFieldTotalTime = new javax.swing.JTextField();
        jLabelSort = new javax.swing.JLabel();
        jLabelQuestions = new javax.swing.JLabel();
        jComboBoxSort = new javax.swing.JComboBox();
        jTextFieldQuestions = new javax.swing.JTextField();
        jScrollPaneQuestion = new javax.swing.JScrollPane();
        jTableQuestions = new javax.swing.JTable();
        jToggleButtonCancel = new javax.swing.JToggleButton();
        jToggleButtonSave = new javax.swing.JToggleButton();
        jButtonCreateQuestion = new javax.swing.JButton();
        jLabelAverageDifficulty = new javax.swing.JLabel();
        jTextFieldAverageDifficulty = new javax.swing.JTextField();
        jButtonRemoveQuestion = new javax.swing.JButton();
        jButtonAddQuestion = new javax.swing.JButton();
        jLabelTestType = new javax.swing.JLabel();
        jLabelTimer = new javax.swing.JLabel();
        jComboBoxClass = new javax.swing.JComboBox();
        jComboBoxTestType = new javax.swing.JComboBox();
        jLabelHour = new javax.swing.JLabel();
        jLabelMinutes = new javax.swing.JLabel();
        jTextFieldHour = new javax.swing.JTextField();
        jTextFieldMinutes = new javax.swing.JTextField();
        jLabelClass = new javax.swing.JLabel();
        jLabelTestName = new javax.swing.JLabel();
        jTextFieldTestName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Galactest - Edit Test");

        jLabelTotalPoints.setText("Total Points:");

        jTextFieldTotalPoints.setEditable(false);
        jTextFieldTotalPoints.setText(test.getPoint() + "");
        jTextFieldTotalPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalPointsActionPerformed(evt);
            }
        });

        jLabelCreateTest.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCreateTest.setText("Edit Test");

        jLabelTotalTime.setText("Exected Time:");

        jLabelQuestionBank.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelQuestionBank.setText("Question Bank:");

        jTextFieldTotalTime.setEditable(false);
        jTextFieldTotalTime.setText(test.getTestTime() + "");
        jTextFieldTotalTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalTimeActionPerformed(evt);
            }
        });

        jLabelSort.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelSort.setText("Sort:");

        jLabelQuestions.setText("Questions:");

        jComboBoxSort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Difficulty", "Type", "Date", "Time", "Points" }));

        jTextFieldQuestions.setEditable(false);
        jTextFieldQuestions.setText(test.size() + "");
        jTextFieldQuestions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuestionsActionPerformed(evt);
            }
        });

        jTableQuestions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"View", "What is a bit?", "FA", "2", "2", "3"},
                {"View", "Java is object oriented?", "TF", "1", "1", "8"},
                {"View", "What language do you prefer and why?", "FA", "8", "10", "4"},
                {"View", "Why are there no pointers in java?", "MC", "6", "5", "5"}
            },
            new String [] {
                "View/Edit", "Question", "Type", "Difficulty", "Time", "Points"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneQuestion.setViewportView(jTableQuestions);

        jToggleButtonCancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jToggleButtonCancel.setText("Cancel");
        jToggleButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonCancelActionPerformed(evt);
            }
        });

        jToggleButtonSave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jToggleButtonSave.setText("Save");
        jToggleButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonSaveActionPerformed(evt);
            }
        });

        jButtonCreateQuestion.setText("Create Question");
        jButtonCreateQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateQuestionActionPerformed(evt);
            }
        });

        jLabelAverageDifficulty.setText("Average Difficulty:");

        jTextFieldAverageDifficulty.setEditable(false);
        jTextFieldAverageDifficulty.setText(test.getDifficulty() + "");
        jTextFieldAverageDifficulty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAverageDifficultyActionPerformed(evt);
            }
        });

        jButtonRemoveQuestion.setText("Remove Question");
        jButtonRemoveQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveQuestionActionPerformed(evt);
            }
        });

        jButtonAddQuestion.setText("Add Question");
        jButtonAddQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddQuestionActionPerformed(evt);
            }
        });

        jLabelTestType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTestType.setText("Test Type:");

        jLabelTimer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTimer.setText("Timer:");

        jComboBoxClass.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CPE 307", "CPE 101", "CPE 102", "CPE 103" }));
        jComboBoxClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClassActionPerformed(evt);
            }
        });

        jComboBoxTestType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Take Home", "Practice", "Proctored" }));

        jLabelHour.setText("Hr");

        jLabelMinutes.setText("Min");

        jTextFieldHour.setText("0");
        jTextFieldHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHourActionPerformed(evt);
            }
        });

        jTextFieldMinutes.setText("0");

        jLabelClass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelClass.setText("Class:");

        jLabelTestName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTestName.setText("Test Name:");

        jTextFieldTestName.setText(test.getTestName());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(jLabelCreateTest))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelQuestionBank)
                                .addGap(89, 89, 89)
                                .addComponent(jLabelSort)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addComponent(jButtonCreateQuestion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelQuestions)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelAverageDifficulty)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldAverageDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelTotalPoints)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldTotalPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelTotalTime)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldTotalTime, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelClass)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBoxClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelTestType)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jComboBoxTestType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabelTimer))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(63, 63, 63)
                                                .addComponent(jToggleButtonCancel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jToggleButtonSave)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldHour, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelHour)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelMinutes)
                                .addGap(2, 2, 2))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTestName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTestName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonAddQuestion)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRemoveQuestion)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCreateTest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuestionBank)
                    .addComponent(jLabelSort)
                    .addComponent(jComboBoxSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCreateQuestion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddQuestion)
                    .addComponent(jButtonRemoveQuestion)
                    .addComponent(jLabelTestName)
                    .addComponent(jTextFieldTestName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAverageDifficulty)
                    .addComponent(jTextFieldAverageDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTotalPoints)
                    .addComponent(jTextFieldTotalPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTotalTime)
                    .addComponent(jTextFieldTotalTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelQuestions)
                    .addComponent(jTextFieldQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTestType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHour)
                    .addComponent(jLabelMinutes)
                    .addComponent(jTextFieldHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelClass)
                    .addComponent(jLabelTestType)
                    .addComponent(jLabelTimer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonCancel)
                    .addComponent(jToggleButtonSave))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTotalPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalPointsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalPointsActionPerformed

    private void jTextFieldTotalTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalTimeActionPerformed

    private void jTextFieldQuestionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuestionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuestionsActionPerformed

    private void jToggleButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonCancelActionPerformed
        //JFrameTeacherHome teacherOverviewWindow = new JFrameTeacherHome(teacherRun);
        //teacherOverviewWindow.setVisible(true);
        teacherRun.resetWindow();
        this.setVisible(false);       // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonCancelActionPerformed

    private void jToggleButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonSaveActionPerformed
        JFrameTeacherHome teacherOverviewWindow = new JFrameTeacherHome(teacherRun);
        teacherOverviewWindow.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonSaveActionPerformed

    private void jButtonCreateQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateQuestionActionPerformed
        JFrameCreateQuestion createQuestionWindow = new JFrameCreateQuestion(teacherRun);
        createQuestionWindow.setVisible(true);
        this.setVisible(false);               // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateQuestionActionPerformed

    private void jTextFieldAverageDifficultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAverageDifficultyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAverageDifficultyActionPerformed

    private void jButtonRemoveQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveQuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRemoveQuestionActionPerformed

    private void jButtonAddQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddQuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddQuestionActionPerformed

    private void jComboBoxClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxClassActionPerformed

    private void jTextFieldHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHourActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameEditTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameEditTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameEditTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameEditTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameEditTest(new TeacherRun(""), new Test()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddQuestion;
    private javax.swing.JButton jButtonCreateQuestion;
    private javax.swing.JButton jButtonRemoveQuestion;
    private javax.swing.JComboBox jComboBoxClass;
    private javax.swing.JComboBox jComboBoxSort;
    private javax.swing.JComboBox jComboBoxTestType;
    private javax.swing.JLabel jLabelAverageDifficulty;
    private javax.swing.JLabel jLabelClass;
    private javax.swing.JLabel jLabelCreateTest;
    private javax.swing.JLabel jLabelHour;
    private javax.swing.JLabel jLabelMinutes;
    private javax.swing.JLabel jLabelQuestionBank;
    private javax.swing.JLabel jLabelQuestions;
    private javax.swing.JLabel jLabelSort;
    private javax.swing.JLabel jLabelTestName;
    private javax.swing.JLabel jLabelTestType;
    private javax.swing.JLabel jLabelTimer;
    private javax.swing.JLabel jLabelTotalPoints;
    private javax.swing.JLabel jLabelTotalTime;
    private javax.swing.JScrollPane jScrollPaneQuestion;
    private javax.swing.JTable jTableQuestions;
    private javax.swing.JTextField jTextFieldAverageDifficulty;
    private javax.swing.JTextField jTextFieldHour;
    private javax.swing.JTextField jTextFieldMinutes;
    private javax.swing.JTextField jTextFieldQuestions;
    private javax.swing.JTextField jTextFieldTestName;
    private javax.swing.JTextField jTextFieldTotalPoints;
    private javax.swing.JTextField jTextFieldTotalTime;
    private javax.swing.JToggleButton jToggleButtonCancel;
    private javax.swing.JToggleButton jToggleButtonSave;
    // End of variables declaration//GEN-END:variables
}
