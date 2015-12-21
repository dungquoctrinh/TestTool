/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTool.model.QuestionPackage.model;

import org.testng.Assert;

/**
 *
 * @author funseeker
 */
public class QuestionBankTest {
    
    private QuestionBank qBank;
    
    public void testAll() {
        addQuestionTest();
        deleteQuestionTest();
    }
    
    public void addQuestionTest() {
        Question testQ = null;
        qBank = new QuestionBank();
        
        //adding null, should not add
        qBank.addQuestion(testQ);
        Assert.assertFalse(qBank.bank.contains(testQ));
        
        testQ = new Question("this is a dummy question", "test question");
        
        //adding one simple question
        qBank.addQuestion(testQ);
        Assert.assertTrue(qBank.bank.contains(testQ));
    }
    
    public void deleteQuestionTest() {
        Question testQ = null;
        qBank = new QuestionBank();
        
        Assert.assertFalse(qBank.deleteQuestion(testQ));
        
        testQ = new Question("this is a dummy question", "test question");
        
        Assert.assertFalse(qBank.deleteQuestion(testQ));
        
        qBank.addQuestion(testQ);
        
        Assert.assertTrue(qBank.deleteQuestion(testQ));
    }
}
