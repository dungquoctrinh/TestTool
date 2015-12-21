/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTool.model.UserPackage;

import TestTool.model.TestPackage.model.Test;
import TestTool.model.TestPackage.model.TestBank;
import java.util.*;

/**
 * Student object extends User class
 * 
 * @author Dung Trinh 
 * @version 1.0
 */

public class Student extends User{
    
    public ArrayList<Test> testsAvailable;
    public ArrayList<Test> testsComplete;
    private ArrayList<Test> allTests;
    private TestBank tBank;
    
    /**
     * Constructor for the 
     * @param name student name for unique student 
      pre:
        //Valid name
      post:
        // object 
        testAvalable.size() == 0 && testsComplete.size() == 0
     */
    public Student(String name, String password) {
        super(name, password);
        this.testsAvailable = new ArrayList<Test>();
        this.testsComplete = new ArrayList<Test>();
        tBank = new TestBank();
        allTests = tBank.fillTests();
    }
    
    /**
     * Return the name of the student
     * @return student name
      pre:
        //None
      post:
        //student name
        exists(int i; i >= 0 && i < studentList.size();
            studentList.get(i).getStudentName() != null);
     */
    public String getStudentName()
    {
        return super.getName();
    }
     
    /**
     * Return the ArrayList of the test that can be taken
     * @return testAvailable test that is available to take
      pre:
        //None
      post:
        // The ArrayList of available Test
        exists(testVailable)
     */
    public ArrayList<Test> getAvailableTest()
    {
        testsAvailable.clear();
        for (int i = 0; i < allTests.size(); i++) {
            if (allTests.get(i).isPublished()) {
                testsAvailable.add(allTests.get(i));
            }
        }
        return testsAvailable;
    }
    
    /**
     * Return the ArrayList of the test that have been taken
     * @return testCompleted the test that student did
      pre:
        // None
      post:
        // Test complete
        exists(testComplete)
     */
    public ArrayList<Test> getTakenTest()
    {
        testsComplete.clear();
        for (int i = 0; i < allTests.size(); i++) {
            if (allTests.get(i).isGraded()) {
                testsComplete.add(allTests.get(i));
            }
        }
        return testsComplete;
    }
    
    /**
     * Add test in available test
     * @param test
     * @return true if success
     *          false if fail to add
      pre:
        // The test is not null and a valid test
        test != null;
      post:
        // add test
       if (!exists(test))
          return false
       else
          return true
     */
    public boolean addAvailableTest(Test test)
    {
        if (test == null)
        {
            return false;
        }
        testsAvailable.add(test);
        return true;
    }
    
    /**
     * Add the test into taken test. After a test is completed.
     * The test will have new field for score
     * @return true if success
     *        false if fail to add
        pre:
        // The test is not null and a valid test
        test != null;
        post:
           // add test
           if (!exists(test))
              return false
           else
              return true
     */
    public boolean addTakenTest(Test test)
    {
        if (test == null)
        {
            return false;
        }
        testsComplete.add(test);
        return true;
    }
}
