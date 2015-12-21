/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTool.model.TestPackage.model;
import TestTool.model.QuestionPackage.model.Question;
import TestTool.model.QuestionPackage.model.QuestionBank;
import java.util.*;

/**
 * Test object. Each present a test with a collection of question
 * 
 * @author Dung Trinh 
 * @version 1.0
 */

public class Test implements java.io.Serializable {

    /**
     * The name of the test
     * Ex: Final, Quiz, etc
     */
    public String testName;
    
    /**
     * Date created 
     */
    public Date dateCreated;
    
    /**
     * Difficulty from 1-10
     */
    public double difficulty;
    
    /**
     * Total time for the test.
     * Is set by the professor 
     */
    public double estimatedTime;
    
    /**
     * Total point 
     */
    public int pointsWorth;
    
    /**
     * The array list of question that each test has
     */
    public ArrayList<Question> questions;
    
    /**
     * Class name
     */
    public String className;
    
    /**
     * Course number of the class
     */
    public Course course;
    
    /**
     * Is graded or not
     */
    private boolean isGraded;
    private boolean isPublished;
   
   public boolean isGraded() {
       return isGraded;
   }
   
   public Date getDateCreated() {
       return dateCreated;
   }
   
   public double getDateDue() {
       return estimatedTime;
   }
   
    public Test(){} /*only for use while implementing and needing dummy tests*/

    /**
     * 
     * @param testName Name of the test
     * @param dateCreated date that the test is created 
     * @param difficulty test difficulty
     * @param estimatedTime total time of the test 
     * @param pointsWorth total point of the test
     * @param className name of the class
     * @param course name of the course
     * @param isGraded if the test is graded 
       pre:
         // Assume that every data is not null in order to get data.
         exists (testName) && exists (dateCreated) && exists(difficulty) 
                && exists(estimatedTime) && exists(pointWorth)
                && exists(className) && exists(course) && !isGradded 
       post:
         // None
     */
    public Test(String testName, Date dateCreated, double difficulty, double estimatedTime, 
             int pointsWorth, String className, Course course, boolean isGraded)
    {    
         this.testName = testName;
         this.dateCreated = dateCreated;
         this.difficulty = difficulty;
         this.estimatedTime = estimatedTime;
         this.pointsWorth = pointsWorth;
         this.className = className;
         this.course = course;


         //size = 0
         this.questions = new ArrayList<Question>();
         this.isGraded = isGraded;
         this.isPublished = false;
    }


    /**
     * If success return true else return false
     * @param  question to be added
      pre:
        // Question is added in the test 
        exists(question)
      post:
        // boolean value depend on the question added 
        if exists(question)
           return true
        else
           return false
     */
    public boolean addQuestion(Question question)
    {       
        /*
        if (question == null || !QuestionBank.validateQuestion(question))
        {
            
            return false;
        }
        */
        ///FOR TESTING. LET IT BE
        if (question == null)
        {
            return false;
        }
        else {
            questions.add(question);
            return true;
        }        
    }


    /**
     * Return the collection of answer question for grading
     * @return Collection of questions that have been answered
      pre:
        //None
      post:
        //
        // exist (retArr)
     */
    public ArrayList<Question> getAnsweredQuestions() {
        ///THIS MAKE NO SENSE. IS THIS FOR DEEP COPY OF THE TEST?
        ArrayList<Question> retArr = new ArrayList<Question>();

        for (int i = 0; i < questions.size(); i++) {
            retArr.add(questions.get(i));
        }
        return retArr;    
    }

    /**
     * Return the name of the test
     * @return testName Test name
      pre:
        //
        // None
      post:
        //
        exist (testName)
     */
    public String getTestName()
    {
        return testName;
    }

    /**
     * Set the name for the test
     * @param testName name to set
     */
    public void setTestName(String testName)
    {
        this.testName = testName;
    }


    /**
     * Return the name of the class 
     * @return  className
      pre:
        //None
      post:
        //
        exists(className)
     */
    public String getClassname()
    {
        return className;
    }

    /**
     * Set name for the class that this belong to
     * @param className 
     */
    public void setClassname(String className)
    {
        this.className = className;
    }
     
    /**
     * Return the difficulty of the test
     * @return difficulty
      pre:
        //difficulty is not null
        exists(difficulty)
      post:
        //the string exist
     */
    public double getDifficulty()
    {
        return difficulty;
    }

    /**
     * Set the difficulty for the test
     * @param difficulty 
     */
    public void setDifficulty(double difficulty)
    {
        this.difficulty = difficulty;
    }

    /**
     * Return the total time for the test
     * @return the time for the test
      pre:
        //
        // 
      post:
        // String of estimate time
     */
    public double getTestTime()
    {
        return estimatedTime;
    }
    

    /**
     * Return instructor name for displaying
     * @return Teacher's name
      pre:
        // None
      post:
        // Teacher name that the test is taken
     */
    public String getInstructor()
    {
        return course.getTeacherName();
    }


    /**
     * Return the size of the test. How many questions in that test
     * @return size of test
      pre:
        // Assume the questions is not null 
      post:
        // 
        exist (size)
     */
    public int size()
    {
        return questions.size();
    }

    /**
     * Return the question at a specific index
     * @param questionIndex
     * @return question
      pre:
        // question index is greater or equal 0 and  
        (questionIndex < question.size()) && (questionIndex >= 0)
      post:
        // The question at the index 
     */
    public Question getQuestion(int questionIndex)
    {
        return questions.get(questionIndex);
    }

    /**
     * Return the maximum point that the student can get from the test 
     * @return point return total point of the test
      pre: 
        //None

      post:
        //
        // Total point of the test 
     */
    public int getPoint()
    {
        return pointsWorth;
    }
    
    public Course getCourse() {
        return course;
    }
    
    public boolean isPublished() {
        return isPublished;
    }
    public void setPublished(boolean p) {
        isPublished = p;
    }
}
