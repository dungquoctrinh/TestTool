/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTool.model.QuestionPackage.model;
import java.util.Collection;

/**
 *
 * @author kid
 */

/**
* Code based question class, has its own fields as well as its parent: Question.
*/
public class CodeBasedQuestion extends Question {
    /**
     * the String for the student's answer
     */
    public String studentAnswer;
    
    /**
     * the script given to grade the question
     */
    public String scriptForGrading;
      
    public CodeBasedQuestion()
    {
       
    }
  

    
}