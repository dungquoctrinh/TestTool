/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTool.model.TestPackage.model;
import TestTool.model.QuestionPackage.model.QuestionBank;
import TestTool.model.UserPackage.UserDatabase;

public class TestDB {
	
	QuestionBank qBank;
	UserDatabase uBank;
	TestBank tBank;

	/*
	* Constructs a new GalacTest Database with a given
	* Question Bank, User Database, and Test Bank.
	*/
	//public TestDB(QuestionBank qb, UserDB ub, TestBank tb);

	/*
	* Returns the Question Bank
        * pre: 
        *    TestDB.qBank != null;
        * post: 
        *    return == TestDB.qBank
	*/
	public QuestionBank getQuestionBank() {
           System.out.println("TestDB.getQuestionBank() called");
           return null;
        }

	/*
	* Returns the User Database
        * pre: 
        *    TestDB.uBank != null
        * post: 
        *    return TestDB.uBank
	*/
	public UserDatabase getUserDB() {
           System.out.println("TestDB.getUserDB() called");
           return null;
        }

	/*
	* Returns the Test Bank
        * pre:
        *    TestDB.tBank != null
        * post: 
        *    return == TestDB.tBank
	*/
	public TestBank getTestBank() {
           System.out.println("TestDB.getTestBank() called");
           return null;
        }
}
