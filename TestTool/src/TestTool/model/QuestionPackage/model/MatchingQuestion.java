/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTool.model.QuestionPackage.model;
import TestTool.model.QuestionPackage.view.JFrameCreateMatching;
import TestTool.model.RunPackage.model.TeacherRun;
import java.util.*;

/**
* Matching based question class, has its own fields as well as its parent: Question.
*/
public class MatchingQuestion extends Question {
    /**
     * this is the collection of all possible "questions" as in one side of the matching.
     * Limit size == 3
     */
    private ArrayList<String> questions;
    /**
     * this is the collection of all possible "answers" as in one side of the matching.
     * Limit size == 3
     */
    private ArrayList<String> answers;
    
    /**
     * The right order to get the correct sequence
     */
    private ArrayList<String> actualAnswer;
  
    JFrameCreateMatching multipleChoiceWindow;
    TeacherRun teacher;
    
    public MatchingQuestion(TeacherRun teacher) {
        this.teacher = teacher;
        multipleChoiceWindow = new JFrameCreateMatching(teacher);
        multipleChoiceWindow.setVisible(true);
    }
    
    /**
     * Parameter
     * @param name
     * @param dateCreated
     * @param dateLastUsed
     * @param difficulty
     * @param estimatedTime
     * @param pointsWorth
     * @param text
     * @param isGradeable
     * @param keywords
     * @param className
     * @param teacherComment
     * @param id
     * @param questions
     * @param answers 
     */
    public MatchingQuestion(String name, int difficulty, double estimatedTime,
          int pointsWorth, String text, boolean isGradeable,
          String className, String teacherComment,
          String id, ArrayList<String> questions, ArrayList<String> answers, ArrayList<String> actualAnswer)
    {
       super(name, difficulty, estimatedTime, pointsWorth, 
          text, isGradeable, className, teacherComment, id);
       this.questions = questions;
       this.answers = answers;
    }
    
    public ArrayList<String> getQuestionMatching()
    {
        return questions;
    }
    
    public ArrayList<String> getAnswerMatching()
    {
        return answers;
    }
}