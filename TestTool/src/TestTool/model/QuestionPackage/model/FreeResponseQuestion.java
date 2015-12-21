/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTool.model.QuestionPackage.model;

import java.util.ArrayList;

/**
* Free response question class, has its own fields as well as its parent: Question.
*/
public class FreeResponseQuestion extends Question {
    /**
    * the String for the student's answer
    */
    public String studentAnswer;
    /**
     * the script given to grade the question
     */
    public String scriptForGrading;
  
    public FreeResponseQuestion(String name, int difficulty,
          double estimatedTime, int pointsWorth, String text, boolean isGradeable,
          String className, String teacherComment,
          String id, String studentAnswer, String scriptForGrading)
    {
        super(name, difficulty, estimatedTime, pointsWorth, text, isGradeable,
          className, teacherComment, id);
        this.scriptForGrading = scriptForGrading;
        this.studentAnswer = studentAnswer;
    }
    
    public void setStudentAnswer(String answer) {
        studentAnswer = answer;
    }
    
    public String getStudentAnswer() {
        return studentAnswer;
    }
}