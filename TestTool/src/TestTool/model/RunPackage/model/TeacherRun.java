/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTool.model.RunPackage.model;

import TestTool.model.QuestionPackage.model.Question;
import TestTool.model.RunPackage.view.JFrameTeacherHome;
import TestTool.model.TestPackage.model.Test;
import TestTool.model.TestPackage.model.TestBank;
import TestTool.model.UserPackage.Teacher;
import TestTool.model.UserPackage.UserDatabase;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Will run the program as teacher with the functionality as the teacher
 * @author Dung Trinh
 */
public class TeacherRun {
    
    /**
    * Create the JFrameTeacherHome object, the JFrame will display the information about the 
    * teacher's database, question base, etc. The model is open for implement if needed to sastify the GUI requirement
    * 
    */
    private Teacher newTeacher;
    private JFrameTeacherHome teacherHome;
    private Question questionRemoved;
    
    public TeacherRun(String teacher)
    {
        newTeacher = UserDatabase.getTeacher(teacher);
        teacherHome = new JFrameTeacherHome(this);
        teacherHome.setVisible(true); 
        System.out.println("Welcome back, " + newTeacher.getName() + "!");
        //populateTable();
    }
    
    public TeacherRun(Teacher teacher) {
        newTeacher = teacher;
        
        teacherHome = new JFrameTeacherHome(this);
        teacherHome.setVisible(true); 
        
        //populateTable();
    }
    
    public void resetWindow() {
        teacherHome.setVisible(true);
        ((DefaultTableModel)teacherHome.getTable().getModel()).setRowCount(0);
        populateTable();
    }
    
    public void populateTable() {
        JTable table = teacherHome.getTable();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TestBank tBank = newTeacher.getTestBank();
        ArrayList<Test> tests = tBank.fillTests();
        
        for (int i=0; i<tests.size(); i++) {
            Test cur = tests.get(i);
            Object[] row = {
                cur.getTestName(),
                cur.isGraded(),
                cur.getDateCreated(),
                cur.getDateDue(),
            };
            
            model.addRow(row);
        }
    }
    
    /*
    * return the teacher object
    */
    public Teacher getTeacher()
    {
        return newTeacher;
    }
    
    public Question getQuestionRemoved() {
        return questionRemoved;
    }
    public void setQuestionRemoved(Question q) {
        questionRemoved = q;
    }
}
