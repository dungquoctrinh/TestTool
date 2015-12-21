/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTool.model.UserPackage;
import TestTool.model.QuestionPackage.model.QuestionBank;
import TestTool.model.TestPackage.model.Test;
import TestTool.model.TestPackage.model.TestBank;
import java.util.*;


///DON'T IMPLEMENT THIS. JUST DON'T

/**
 * Maybe is not useful
* User abstract class to be shared by all types of Users
*/
public class User implements java.io.Serializable {

    private String name;
    private String userID;
    private TestBank tBank;
    private String password;

    public User(String name, String password) 
    {
        this.name = name;
        this.password = password;
        tBank = new TestBank();
        //qBank = new QuestionBank();
    }
    
    /**
    * Returns the string of the name of the user
    * @return the name of the User
    post:
     //Name is not changed
     name' == name;
    */
    public String getName() {
        return name;
    }
    
    /**
    * Returns the string of the ID of the user
    * @return the ID of the User
    post:
     //userID is not changed
     userID' == userID;
    */
    public String getUserID() {
        return userID;
    }
    
    /**
    * Returns the string of the TestBank related to the user
    * @return the TestBank related to the User
    post:
     //Name is not changed
     tBank' == tBank;
    */
    public TestBank getTestBank() {
        return tBank;
    }
    
    /**
    * Adds a test to the TestBank related to the User
    * @param test Test to be added to TestBank related to User
    pre:
     //test is not null
     test != null;
    post:
     //test is in tBank
     exists (int i; i>=0 && i < tBank.size()-1;
            tBank.get(i) == test);
    */
    public void addTest(Test test) {
        tBank.addTest(test);
    } 
    
    /**
    * Opens a window and populates it with a tests information
    * @param test Test to be viewed
    pre:
       //Test object cannot be null
       test != null;
    */
    public void viewTest(Test test)
    {
        //return the test somehow?
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
    public void viewGrades()
    {
        
    }
    
    public String getPassword() {
        return password;
    }
}
