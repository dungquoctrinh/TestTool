/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTool.model.QuestionPackage.model;
import TestTool.model.QuestionPackage.view.JFrameCreateTrueFalse;
import TestTool.model.RunPackage.model.TeacherRun;
import java.util.*;

/**
* True or false question class, has its own fields as well as its parent: Question.
*/
public class TrueFalseQuestion extends Question {

    /**
     * True/False question so answer is under true/false
     */
    private boolean answer;
    JFrameCreateTrueFalse trueFalseWindow;
    TeacherRun teacher;
    
    /**
     * Get the student choice
     */
    private boolean studentChoice;
    
    private Date date = new Date();
    
    public TrueFalseQuestion(TeacherRun teacher) {
        this.teacher = teacher;
        trueFalseWindow = new JFrameCreateTrueFalse(teacher);
        trueFalseWindow.setVisible(true);
    }
    
    public TrueFalseQuestion(String type, int difficulty,
          double estimatedTime, int pointsWorth, String text, boolean isGradeable,
          String className, String teacherComment,
          String id, boolean answer, boolean studentChoice) {
        
        super(type, difficulty, estimatedTime, pointsWorth, 
          text, isGradeable, className, teacherComment, id);
        
        this.answer = answer;
        this.studentChoice = studentChoice;
    }
  
  public boolean getCorrectAnswer() {
     return answer;
  }

  public void setCorrectAnswer(boolean correctAnswer) {
     answer = correctAnswer;
  }

  public boolean getStudentAnswer() {
     return studentChoice;
  }

  public void setStudentAnswer(boolean studentAnswer) {
     studentChoice = studentAnswer;
  }
}
