/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTool.model.QuestionPackage.model;
import TestTool.model.QuestionPackage.view.JFrameCreateMultipleChoice;
import TestTool.model.RunPackage.model.TeacherRun;
import java.util.*;

/**
* Multiple choice question class, has its own fields as well as its parent: Question.
*/
public class MultipleChoiceQuestion extends Question {
    /**
     * this is the correct answer of the question.
     */
    private String correctAnswer;
    /**
     * this is the student's answer.
     */
    private String studentAnswer;
    /**
     * these are the options the student will see.
     */
    private ArrayList<String> options;
    TeacherRun teacher;
    JFrameCreateMultipleChoice multipleChoiceWindow;
    
    public MultipleChoiceQuestion(TeacherRun teacher) {
        this.teacher = teacher;
        multipleChoiceWindow = new JFrameCreateMultipleChoice(teacher);
        multipleChoiceWindow.setVisible(true);
    }
    
    public MultipleChoiceQuestion(String type, int difficulty,
          double estimatedTime, int pointsWorth, String text, boolean isGradeable,
          String className, String teacherComment, String id,
          String correctAnswer, String studentAnswer, ArrayList<String> options) {
        
        super(type, difficulty, estimatedTime, pointsWorth, 
          text, isGradeable, className, teacherComment, id);
        
        this.correctAnswer = correctAnswer;
        this.studentAnswer = studentAnswer;
        this.options = options;
    }
    
    /**
     * This just simply returns the student's answer (mainly for grading).
     * @return The student's answer
     */
    public String getStudentAnswer() {
        return studentAnswer;
    }
    
    /**
     * This just simply returns the correct answer (mainly for grading).
     * @return The correct answer
     */
    public String getCorrectAnswer() {
       return correctAnswer;
    }
  
    /**
     * Sets the student's answer based on what they chose.
     * @param text the answer they chose
     */
    public void setStudentAnswer(String text) {
          studentAnswer = text;
    }

    /**
     * Sets the correct answer (mainly for editing the question).
     * @param text the answer they chose
     */
    public void setCorrectAnswer(String answer) {
        correctAnswer = answer;
    }

    /**
     * Removes an option from the choices, for editing.
     * @param option the option to be deleted
     * @return true if it was deleted, otherwise false.
     */
    public boolean deleteOption(String option) {
        if (!options.contains(option)) {
            return false;
        }

        options.remove(option);
        return true;
    }
    
    /**
     * Adds an option to the choices.
     * @param option the option to be added
     */
    public void addOption(String option) {
        options.add(option);
    }
    
    /**
     * Return all the 
     * @return available option
     */
    public ArrayList<String> getOption()
    {
        return this.options;
    }
}
