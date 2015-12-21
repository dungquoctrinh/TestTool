/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTool.model.UserPackage;

import TestTool.model.QuestionPackage.model.QuestionBank;
import TestTool.model.TestPackage.model.Test;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author kid
 */
public class Teacher extends User{
    
    private ArrayList<Test> tests;
    private QuestionBank qBank;
    //FileInputStream teacherFileIn;
    
    public Teacher(String name, String password) {
        super(name, password);
        this.tests = new ArrayList<Test>();
    }
    
    /**
    * Opens a window and populates it with a tests information
    * @param test Test to be viewed
    pre:
       //Test object cannot be null
       test != null;
    */
    public void viewTest(Test test) {
        super.viewTest(test);
    }
    
    /**
    * View a list of grades for completed tests
    pre:
       //Collection of complete tests cannot be null
       testsComplete != null &&
    
       //Collection of complete tests cannot have a null Test object
       forall (int i; i>=0 && i < testsComplete.size()-1;
            testsComplete.get(i) != null);
    */
    public void viewGrades() {
        super.viewGrades();
    }
    
    /**
    * Returns the string of the QuestionBank related to the user
    * @return the QuestionBank related to the User
    post:
     //Name is not changed
     qBank' == qBank;
    */
    public QuestionBank getQuestionBank() {
        return qBank == null ? new QuestionBank() : qBank;
    }
    
    
    public ArrayList<Test> getTests() {
        return tests;
    }
            
}
