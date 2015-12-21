/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTool.model.TestPackage.model;
//import java.util.*;
import TestTool.model.QuestionPackage.model.Question;
import TestTool.model.QuestionPackage.model.QuestionBank;
import TestTool.model.RunPackage.model.TeacherRun;
import TestTool.model.RunPackage.view.JFrameTeacherHome;
import TestTool.model.TestPackage.view.JFrameAutoGenerate;
import TestTool.model.TestPackage.view.JFrameCreateTest;
import TestTool.model.TestPackage.view.JFrameCreateTestQuestionBank;
import TestTool.model.UserPackage.Teacher;
import TestTool.model.UserPackage.User;
import java.util.*;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * GenerateTest is the model for the JFrameCreateTestQuestionBank view class
 * This class generates tests and saves them to the teachers TestBank
 * @author calin
 */
public class GenerateTest {
	
	QuestionBank qBank;
	TeacherRun teacher;
        JFrameCreateTestQuestionBank generateWindow; /*generate test window*/
        JFrameCreateTest createWindow;               /*window created from*/
	TestBank tBank;
        ArrayList<Integer> selectedQs;
        
        /**
         * calls the second constructor to initialize data and re-populates
         * the question bank by marking the questions selected by indices
         * as in use.
         */
        public GenerateTest(TeacherRun teacher, JFrameCreateTest createWindow,
                ArrayList<Integer> indices) {
            //
            this(teacher, createWindow);
            ((DefaultTableModel)generateWindow.getQuestionTable()
                    .getModel()).setRowCount(0);
            selectedQs = indices;
            populateWindow();
        }
        /*
        *  Gets questionbank and testbank from teacherRun passed in.
        */
        public GenerateTest(TeacherRun teacher, JFrameCreateTest createWindow) {
            this.teacher = teacher;
            
            selectedQs = null;
            
            /*close Create Test window*/
            this.createWindow = createWindow;
            this.createWindow.setVisible(false);
            
            generateWindow = new JFrameCreateTestQuestionBank(teacher, this);
            generateWindow.setVisible(true);
            
            qBank = teacher.getTeacher().getQuestionBank();
            tBank = teacher.getTeacher().getTestBank();
            
            populateWindow();
            
        }
        
        /**
         * populateWindow fills the question bank with the questions stored
         * in the qBank.
         */
        public void populateWindow() {
            JTable table = generateWindow.getQuestionTable();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            ArrayList<Question> questions = qBank.getQuestions();
            
            int avg = 0, total = 0, qs = questions.size();
            double time = 0;
            
            for (int i=0; i<questions.size(); i++) {
                Question cur = questions.get(i);
                Object[] row = {
                    "view",
                    false, 
                    cur.getText(),
                    cur.getId(),
                    cur.getType(), 
                    cur.getDifficulty(), 
                    cur.getEstimatedTime(), 
                    cur.getPointsWorth()};
                
                if (selectedQs != null && selectedQs.contains(new Integer(i))) {
                    row[1] = true;
                }
                
                avg += cur.getDifficulty();
                total += cur.getPointsWorth();
                time += cur.getEstimatedTime();
                
                model.addRow(row);
            }
            
            JTextField avgDif = generateWindow.getAverageDifficulty();
            avgDif.setText(String.valueOf(avg / qs));
            
            JTextField totalPoints = generateWindow.getTotalPoints();
            totalPoints.setText(String.valueOf(total));
            
            JTextField totalTime = generateWindow.getTotalTime();
            totalTime.setText(String.valueOf(time));
            
            JTextField numQuestions = generateWindow.getNumQuestionsLabel();
            numQuestions.setText(String.valueOf(qs));
        }
        
        /**
         * save questions in table into test and add to test bank
         * Does not save to database currently
         */
        public void saveTest() {
            Test test = new Test(
                    createWindow.getTestName().getText(),
                    new Date(11,11,2015),
                    new Double(generateWindow.getAverageDifficulty().getText()),
                    new Double(generateWindow.getTotalTime().getText()),
                    new Integer(generateWindow.getTotalPoints().getText()),
                    createWindow.getClassName().getSelectedItem().toString(),
                    null,
                    false);
            
            JTable table = generateWindow.getQuestionTable();
            
            for (int i=0; i<table.getRowCount(); i++) {
                if (table.getModel().getValueAt(i, 1).equals(new Boolean(true))) {
                    test.addQuestion(qBank.get(i));
                }
            }
            
            teacher.getTeacher().addTest(test);
            teacher.resetWindow();
        }
        
        /**
         * Move the selected question up in the table
         * @param index of the question to move up
         */
        public void moveUp(int index) {
            JTable table = generateWindow.getQuestionTable();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            
            if (index > 0) {
                for(int col=0; col<model.getColumnCount(); col++) {
                    Object o1 = model.getValueAt(index-1, col);
                    Object o2 = model.getValueAt(index, col);
                    model.setValueAt(o1, index, col);
                    model.setValueAt(o2, index-1, col);
                }
                table.setRowSelectionInterval(index-1, index-1);
            }
        }
        
        /**
         * Move the selected question down in the table
         * @param index of the question to move down
         */
        public void moveDown(int index) {
            JTable table = generateWindow.getQuestionTable();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            
            if (index < table.getRowCount() - 1) {
                for(int col=0; col<model.getColumnCount(); col++) {
                    Object o1 = model.getValueAt(index+1, col);
                    Object o2 = model.getValueAt(index, col);
                    model.setValueAt(o1, index, col);
                    model.setValueAt(o2, index+1, col);
                }
                
                table.setRowSelectionInterval(index+1, index+1);
            }
        }
}