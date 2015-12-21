/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTool.model.TestPackage.model;
import TestTool.model.QuestionPackage.model.MultipleChoiceQuestion;
import TestTool.model.QuestionPackage.model.MatchingQuestion;
import TestTool.model.QuestionPackage.model.CodeBasedQuestion;
import TestTool.model.QuestionPackage.model.FreeResponseQuestion;
import TestTool.model.QuestionPackage.model.TrueFalseQuestion;
import TestTool.model.QuestionPackage.model.Question;
import java.util.ArrayList;

/****
 * Class GradeTest grades the questions within a test individually or as a group.
 * This also accesses the students' answers.
 *
 * @Zach Rose (ztrose@calpoly.edu)
 */

public class GradeTest {
       
   /**
   * Grades all of the questions in a test and combines all the question scores.
   * 
    pre:
       test != null;
    * @param test input test for all answered questions to be graded
    * @return returns score of combined graded points of all questions 
   */
     public int gradeTest(Test test) {
         //score that is totaled from all the graded questions
         int score = 0;
         
         //loops through all answered questions and grades them.
         for (int i = 0; i < test.getAnsweredQuestions().size(); i++) {
              score += gradeQuestion(test.getAnsweredQuestions().get(i));            
         }
         
         return score;
     }
     
    /**
     * Combines all of the question scores.
     * 
     pre:
        test != null;
     * @param test input test for all questions score to be counted
     * @return returns score of combined graded points of all questions 
     */
     public int combineScore(Test test) {
         //score that is totaled from all the questions points
         int score = 0;
         
         //loops through all questions and combine all the questions' points
         for (int i = 0; i < test.questions.size(); i++) {
             score += test.questions.get(i).getPointsEarned();
         }
         
         return score;
     }
    
    /**
     * First, checks what type of question it is, then based on that,
     * it calls a separate function for grading that Question.
     pre:
        question != null;
     post:
        question.pointsEarned = score;
     * @param question Question to grade
     * @return score for this question
     */
    public int gradeQuestion(Question question) {
        // score of question that is graded
        int score = 0;
        
        //each if statement includes setting the question points earned to the 
        //graded score
        
        //grades question if the question is multiple choice
        if (question instanceof MultipleChoiceQuestion) {
            score = gradeMultChoice((MultipleChoiceQuestion) question);
            question.setPointsEarned(score);
        }
        
        //grades question if question is true false
        else if (question instanceof TrueFalseQuestion) {
            score = gradeTrueFalse((TrueFalseQuestion) question); 
            question.setPointsEarned(score);           
        }
        
        //grades question if question is matching
        else if (question instanceof MatchingQuestion) {
            score = gradeMatching((MatchingQuestion) question);
            question.setPointsEarned(score);
        }
        
        return score;
    }
    
     /**
     * First, checks what type of question it is, then based on that,
     * it returns the student answer if applicable. (some methods have yet
     * to be implemented)
     pre:
        question != null;
        
     * @param question Question to grade
     * @return student's answer for this question
     */
    
    public static String getStudentAnswer(Question question) {
        
        //returns the student answer if it is a multiple choice question
        if (question instanceof MultipleChoiceQuestion) {
            return ((MultipleChoiceQuestion)question).getStudentAnswer();
        }
        
        //returns the student answer if it is a true false question
        else if (question instanceof TrueFalseQuestion) {
            return "" + ((TrueFalseQuestion)question).getStudentAnswer();            
        }
        
        //returns the student answer if it is a matching question
        else if (question instanceof MatchingQuestion) {
            return "Matching";
        }
        
        //returns the student answer if it is a free response question
        else if (question instanceof FreeResponseQuestion) {
            return ((FreeResponseQuestion)question).getStudentAnswer();
        }
        
        //returns the student answer if it is a coding question
        else if (question instanceof CodeBasedQuestion) {
            return "Code stuff";
        }
        
        //returns an error if the question is not one of the specified classes
        else {
            return "Error, not a valid question type";
        }
    }
    
     /**
     * Checks if answer is same as the student answer, if so return points of
     * the question. Else return 0;
     pre:
        question.getIsGradeable() == true;
     post:
        question.pointsEarned = score;
     * @param question MultipleChoiceQuestion to grade
     * @return score for this question
     */
    int gradeMultChoice(MultipleChoiceQuestion question) {
        //score of the question
        int score = 0;
        
        //compares answer of question to the student answer and adjust score accordingly
        if (question.getCorrectAnswer().equals(question.getStudentAnswer()))
            score = question.getPointsWorth();
        
        //sets the questions points earned to the score of the answer
        question.setPointsEarned(score);
        
        return score;
    }

     /**
     * Checks if answer is same as the student answer, if so return points of
     * the question. Else return 0. Not implemented yet.
     pre:
        question.getIsGradeable() == true;
     post:
        question.pointsEarned = score;
     * @param question MatchingQuestion to grade
     * @return score for this question
     */
     int gradeMatching(MatchingQuestion question)
     {
         return 0;
     }

     /**
     * Checks if answer is same as the student answer, if so return points of
     * the question. Else return 0.
     pre:
        question.getIsGradeable() == true;
     post:
        question.pointsEarned = score;
     * @param question TrueFalseQuestion to grade
     * @return score for this question
     */
    public int gradeTrueFalse(TrueFalseQuestion question)
    {
        //score of the question
        int score = 0;

        //compares answer of question to the student answer and adjust score accordingly
        if (question.getCorrectAnswer() == question.getStudentAnswer())
            score = question.getPointsWorth();
        
        //sets the questions points earned to the score of the answer
        question.setPointsEarned(score);
        
        return score;
    }

     /**
     * TODO IDK what yet to do here lol
     * @param question CodeBasedQuestion to grade
     * @return score for this question
     */
    public int gradeCode(CodeBasedQuestion question)
    {
        return 0;
    }

}
