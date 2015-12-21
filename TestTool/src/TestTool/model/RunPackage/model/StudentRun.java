/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTool.model.RunPackage.model;

import TestTool.model.QuestionPackage.model.*;
import TestTool.model.RunPackage.view.JFrameStudentHome;
import TestTool.model.TestPackage.model.*;
import TestTool.view.WindowPackage.JFrameLogin;
import TestTool.model.UserPackage.*;
import java.util.ArrayList;
import java.util.Date;
//import java.util.*;


/**
 * StudentRun is used when the program is run as a student
 * Every student when run program will run as a unique StudentRun object
 * @author Dung Trinh 
 * @version 1.0
 */
public class StudentRun {

    /**
     * The student that run the program 
     */
    private Student newStudent; 
    
    /**
     * The current test that is taking
     */
    private Test currentTest;
    
    /**
     * The index of the question in current test
     */
    public static int questionIndex;
    
    /**
     * Test for student 
     */
    private ArrayList<Test> takenTest, availableTest;
    
    /**
     * The number of answer question
     */
    public int answeredQuestions;
    
    /**
     * Constructor. Get the student object for implementation
     * @param student student object for the Student Run class
     pre:
        // Assume that the studentName is a valid name that 
        // exist in the database
      post:
        // None
     */
    public StudentRun(String student)
    {
        // Return student object. Getting it from the data based of the student
        this.newStudent = UserDatabase.getStudent(student);
        
        
        //This is used for testing since data base is haven't completed
        if (newStudent == null)
        {
            this.newStudent = mockingMethod();
        }
        
        //this.newStudent = mockingMethod();
        
        //new test so question index = 0
        StudentRun.questionIndex = 0;
        this.availableTest = this.newStudent.getAvailableTest();
        this.takenTest = this.newStudent.getTakenTest();
        
        //Open student home and display information about the student test
        JFrameStudentHome newJFrameStudentHome = 
                new JFrameStudentHome(this);
        
        this.answeredQuestions = 0;
        newJFrameStudentHome.setVisible(true);
    }

    /** 
     * This method exist for testing. Won't be use in implementing
     * given tasks. Use for private testing. Please don't touch or modify this.
     * Make the student not null for testing.
     */
    public Student mockingMethod()
    {
        //Error to other member 
        //Us the calendar library
        //Date date = new Date();
        //date = Date(Calendar.set(int year,int month,int date)));
        Date date = new java.util.Date(5,7,1993);
        Teacher teacher = new Teacher("Fisher", "The Fish");
        ArrayList<String> keywords = new ArrayList<String>();
        
        keywords.add("binary");
        
        //Course(String name, Teacher teacher, int courseNum, int section)
        Course course = new Course("CPE307", teacher, 
                        new Integer(307), new Integer(007));
        
        //Create the student  
        Student student = new Student("Jun Trinh", "Singular");
        
        /*
        Test(String testName, Date dateCreated, double difficulty, double estimatedTime, 
             int pointsWorth, String className, Course course, boolean isGraded)
        */
        Test test1 = new Test("Quiz 1", date, new Double(5.0), new Double(30.00), 
                     new Integer(10), "307" , course,true);
        
        Test test2 = new Test("Midterm", date, new Double(7.0), new Double(30.00), 
                     new Integer(20), "307" , course,true);
        
        Test test3 = new Test("Final", date, new Double(8.0), new Double(100.00), 
                     new Integer(30), "307" , course,true);
              
        //Create the series of question 
        /*
        (String name, java.util.Date dateCreated, java.util.Date dateLastUsed, int difficulty,
          double estimatedTime, int pointsWorth, String text, boolean isGradeable,
          ArrayList<String> keywords, String className, String teacherComment,
          String id, boolean answer, boolean studentChoice)
        */
        
        TrueFalseQuestion question1 = new TrueFalseQuestion("Question 1", 9, new Double(30.00), 
                     new Integer(4), "" , 
                     true, "307", " ", "11302015", true, false);
        question1.setText("Java uses VM");
        
        TrueFalseQuestion question2 = new TrueFalseQuestion("Question 2", 9, new Double(30.00), 
                     new Integer(6), "" , 
                     true, "307", " ", "11302015", false, false);
        question2.setText("Quickest sort is selection sort");
        
        TrueFalseQuestion question3 = new TrueFalseQuestion("Question 3", 9, new Double(30.00), 
                     new Integer(7), "" , 
                     true, "307", " ", "11302015", true, false);
        question3.setText("Overloading functions can have the same name");
        
        TrueFalseQuestion question4 = new TrueFalseQuestion("Question 4", 9, new Double(30.00), 
                     new Integer(9), "" , 
                     true, "307", " ", "11302015", true, false);
        question4.setText("MIPS is a computers architecture");
        
        TrueFalseQuestion question5 = new TrueFalseQuestion("Question 5", 9, new Double(30.00), 
                     new Integer(3), "" , 
                     true, "307", " ", "11302015", true, false);
        question5.setText("Formal specification are formal enough to be analyze for completeness and \nconsistency");
        
        TrueFalseQuestion question6 = new TrueFalseQuestion("Question 6", 9, new Double(30.00), 
                     new Integer(4), "" , 
                     true, "307", " ", "11302015", false, false);
        question6.setText("Binary search run time is O(nlogn)");
        
        TrueFalseQuestion question7 = new TrueFalseQuestion("Question 7", 9, new Double(30.00), 
                     new Integer(6), "" , 
                     true, "307", " ", "11302015", true, false);
        question7.setText("The unix1 run 32-bit");
        
        TrueFalseQuestion question8 = new TrueFalseQuestion("Question 8", 9, new Double(30.00), 
                     new Integer(3), "" , 
                     true, "307", " ", "11302015", true, false);
        question8.setText("Fastest sort is quick sort?");
        
        TrueFalseQuestion question9 = new TrueFalseQuestion("Question 9", 9, new Double(30.00), 
                     new Integer(4), "" , 
                     true, "307", " ", "11302015", false, false);
        question9.setText("Human can read binary file");
        
        TrueFalseQuestion question10 = new TrueFalseQuestion("Question 10", 9, new Double(30.00), 
                     new Integer(1), "" , 
                     true, "307", " ", "11302015", true, false);
        question10.setText("Any array can use binary search");
        
        TrueFalseQuestion question11 = new TrueFalseQuestion("Question 11", 9, new Double(30.00), 
                     new Integer(4), "" , 
                     true, "307", " ", "11302015", true, false);
        question11.setText("There are 2n - 1 edge in a binary tree");
        
        TrueFalseQuestion question12 = new TrueFalseQuestion("Question 12", 9, new Double(30.00), 
                     new Integer(5), "" , 
                     true, "307", " ", "11302015", true, false);
        
        TrueFalseQuestion question13 = new TrueFalseQuestion("Question 13", 9, new Double(30.00), 
                     new Integer(5), "" , 
                     true, "307", " ", "11302015", false, false);
        
        TrueFalseQuestion question14 = new TrueFalseQuestion("Question 14", 9, new Double(30.00), 
                     new Integer(4), "" , 
                     true, "307", " ", "11302015", false, false);
        
        TrueFalseQuestion question15 = new TrueFalseQuestion("Question 15", 9, new Double(30.00), 
                     new Integer(3), "" , 
                     true, "307", " ", "11302015", true, false);
        
        
        
        question12.setText("Android is better than iOS");
        question13.setText("Collection.sort() can sort any array");
        question14.setText("1 GB = 1024 MB");
        question15.setText("There are more than 1 way to sort an array");
        /*
        MultipleChoiceQuestion(String name, Date dateCreated, Date dateLastUsed, int difficulty,
          double estimatedTime, int pointsWorth, String text, boolean isGradeable,
          ArrayList<String> keywords, String className, String teacherComment,
          String id, String correctAnswer, String sturdentAnswer, ArrayList<String> options)
        */
        
        ArrayList<String> options = new ArrayList<String>();
        options.add("Selection Sort");
        options.add("Insertion Sort");
        options.add("Quick sort");
        options.add("Monkey Sort");
        MultipleChoiceQuestion question16 = new MultipleChoiceQuestion("Question 16", 9, new Double(30.00), 
                     new Integer(2), "" , 
                     true, "307", " ", "11302015", "Quick sort", "", options);
        question16.setText("Fastest sort is");
        
        
        ArrayList<String> options1 = new ArrayList<String>();
        options1.add("1");
        options1.add("10");
        options1.add("4");
        options1.add("What?");
        MultipleChoiceQuestion question17 = new MultipleChoiceQuestion("Question 17", 9, new Double(30.00), 
                     new Integer(10), "" , 
                     true, "307", " ", "11302015", "4", "", options1);
        question17.setText("How many bytes is one integer");
        
        ArrayList<String> options2 = new ArrayList<String>();
        options2.add("Selection Sort");
        options2.add("Insertion Sort");
        options2.add("Quick sort");
        options2.add("Monkey Sort");
        MultipleChoiceQuestion question18 = new MultipleChoiceQuestion("Question 18", 9, new Double(30.00), 
                     new Integer(3), "" , 
                     true, "307", " ", "11302015", "Monkey Sort", "", options2);
        question18.setText("Slowest sort");
        
        ArrayList<String> options3 = new ArrayList<String>();
        options3.add("103");
        options3.add("4");
        options3.add("8");
        options3.add("10");
        MultipleChoiceQuestion question19 = new MultipleChoiceQuestion("Question 19", 9, new Double(30.00), 
                     new Integer(5), "" , 
                     true, "307", " ", "11302015", "4", "", options3);
        question19.setText("One integer is equals how many bytes in java ");
        
        
        /*
        FreeResponseQuestion(String name, java.util.Date dateCreated, java.util.Date dateLastUsed, int difficulty,
          double estimatedTime, int pointsWorth, String text, boolean isGradeable,
          ArrayList<String> keywords, String className, String teacherComment,
          String id,String studentAnswer,String scriptForGrading)
        */
        
        FreeResponseQuestion question20 = new FreeResponseQuestion("Question 20",
                new Integer(6), new Double(10),
                8, "The pointer to a pointer is called?", true, "307", " ", "110705", " ", "double pointer");
        //Add Test into student
        
        /*
        MatchingQuestion(String name, java.util.Date dateCreated, java.util.Date dateLastUsed, int difficulty,
          double estimatedTime, int pointsWorth, String text, boolean isGradeable,
          ArrayList<String> keywords, String className, String teacherComment,
          String id, ArrayList<String> questions, ArrayList<String> answers)
        */
        ArrayList<String> left = new ArrayList<String>();
        left.add("Question A");
        left.add("Question B");
        left.add("Question C");
        //left.add("Q")
        ArrayList<String> right = new ArrayList<String>();
        right.add("A. Option A");
        right.add("B. Option B");
        right.add("C. Option C");
        
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("A");
        sequence.add("B");
        sequence.add("C");
        MatchingQuestion question21 = new MatchingQuestion("Question 21", 9, new Double(30.00), 
                     new Integer(5), "Match the question on the right with the left" , 
                     true, "307", " ", "11302015", left, right, sequence);
        
        
        
        test1.addQuestion(question1);
        test1.addQuestion(question2);
        test1.addQuestion(question3);
        test1.addQuestion(question4);
        test1.addQuestion(question5);
        test1.addQuestion(question20);
        test1.addQuestion(question21);
        test1.addQuestion(question16);
        test1.addQuestion(question17);
        test1.addQuestion(question18);
        test1.addQuestion(question19);
        
        student.addAvailableTest(test1);
        student.addTakenTest(test1);
        
        
        test2.addQuestion(question6);
        test2.addQuestion(question7);
        test2.addQuestion(question8);
        test2.addQuestion(question9);
        test2.addQuestion(question10);
        student.addAvailableTest(test2);

        test3.addQuestion(question11);
        test3.addQuestion(question1);
        test3.addQuestion(question2);
        test3.addQuestion(question3);
        test3.addQuestion(question4);
        test3.addQuestion(question5);
        test3.addQuestion(question6);
        test3.addQuestion(question7);
        test3.addQuestion(question8);
        test3.addQuestion(question9);
        test3.addQuestion(question10);
        test3.addQuestion(question11);
        
        test3.addQuestion(question16);
        test3.addQuestion(question17);
        test3.addQuestion(question18);
        test3.addQuestion(question19);        
        test3.addQuestion(question12);
        test3.addQuestion(question13);
        test3.addQuestion(question14);
        test3.addQuestion(question15);

        student.addAvailableTest(test3);        
        //student.addTakenTest(test3);
        
        return student;
    }
    
    /**
     * This return the student and used to get info on the student
     * @return student the student who run the StudentRun
      pre:
      post:
        // Return the student object
        return != null
     */
    public Student getStudent()
    {
        return newStudent;
    }
    
    /**
     * Return an ArrayList of complete test. 
     * Call getTakenTest() from Student class
     * @return completeTest list of tests that have been completed
      pre:
        // None 
      post:
        // The return ArrayList is not null
        return != null
     */
    public ArrayList<Test> getCompleteTest()
    {
        return this.takenTest;
    }
    
    /**
     * Return an ArrayList of test that is available to take
     * Call getAvailableTest() from Student
     * @return availableTest test is haven't taken 
     pre:
        // None
      post:
        // Return the available test array
        return.size() >= 0
     */
    public ArrayList<Test> getAvailableTest()
    {
        return this.availableTest;
    }
    
    /**
     * Return collection of test that will be taken/completed
     * as an array of string to display on the screen
     * @param tests the ArrayList of Test
     * @return testNames A string of test name 
     pre:
        // The arrayList of Tests is not null
        tests.size() != 0
      post:
        // An array of string that has all test name
        return.length == tests.size()
     */
    public String[] getTestName(ArrayList<Test> tests)
    {
        //return the collection of testName
        String[] testNames = new String[tests.size()];
        for (int i = 0; i < testNames.length; i++)
        {
            testNames[i] =tests.get(i).getTestName();
        }
        return testNames;
    }
    
    /**
     * Return a test based on the name of the test from the 
     * list of available test
     * @param testName the name to search for
     * @return test
      pre:
        //
        // testName exist in data
        testName != null
      post:
        // Exist a test with the same name
        return != null
     */
    public Test getTest(String testName)
    {
        Test test = null;
        for (Test curTest: getAvailableTest())
        {
            if (curTest.getTestName().equals(testName))
            {
                test = curTest;
            }
        }
        return test;
    }
    
    /**
     * Getting a test based on the index
     * @param index
     * @return test from the list of available test
      pre:
        // index is in the range
        index >= 0 && index < getAvailableTest().size()
      post:
        return != null
     */
    public Test getTest(int index)
    {
        return getAvailableTest().get(index);
    }
        
    /**
     * Return the next question to display on the screen 
     * @return question the next question in the question collection  
     */
    /**
      pre: 
      post: 
        return != null
     */
    public Question getNextQuestion() 
    {
        //questionIndex = index;
        //Size = 5 - Max Index = 4
        if (questionIndex < currentTest.size() - 1)
        {
            questionIndex++;
            
        }
        System.out.println("Question Index: " + questionIndex);
        Question newQuestion = currentTest.getQuestion(questionIndex);
        return newQuestion;
    }
    
    /**
     * Return the previous question to display on the screen
     * @return question the previous question in the question collection  
     */
    /**
      pre:
      post: 
         return != null
     */
    public Question getPreviousQuestion() 
    {
        //if index = 0 : no prvious
        if (questionIndex > 0)
        {
            questionIndex--;
        }
        System.out.println("Question Index: " + questionIndex);
        Question newQuestion = currentTest.getQuestion(questionIndex);
        return newQuestion;
    }   
    
    /**
     * Return the current question. 
     * @param index the index get from action listener
     * @return current question
      pre:
        //
        // Index in the range of the question size
        index >= 0 && index < currentTest.size()
      post:
        //None
        return != null
     */
    public Question getCurQuestion(int index)
    {
        if (index < 0 || index > currentTest.size() - 1)
        {
            return null;
        }
        questionIndex = index;
        System.out.println("Question Index: " + questionIndex);
        return currentTest.getQuestion(questionIndex);
    }
    
    /**
     * Return the current test that is taking or looking
     * @return currentTest Return the current test
      pre:
        // None
      post:
        return != null
     */
    public Test getCurrentTest()
    {
        return currentTest;
    }
    
    /**
     * Set the current test that is taking 
     * @param the index get from list listener
      pre:
        // None
      post:
        // None
     */
    public void setCurrentTest(int index)
    {
        this.currentTest = this.getAvailableTest().get(index);
    }
   
        
    /**
     * Return the score of the test after test
     * @param test the current test
     * @return the score of that test
      pre:
        // Test is not null
        test != null
      post:
        // None 
        return >= 0
     */
    public int getScore(Test test)
    {
        GradeTest grade = new GradeTest();
        return grade.gradeTest(test);
    }
    
    /**
     * Remove the available test and add it to taken test
     * @param test
     * @return 
     */
    public int removeTest(Test test)
    {
        Test returnTest = test; 
        //boolean 
        availableTest.remove(test);
        System.out.println("Available Test: " + this.availableTest.size());
        this.takenTest.add(returnTest);
        System.out.println("Taken Test: " + this.takenTest.size());
        return this.availableTest.size();
    }
    
    /**
     * Return the current current index
     * @return questionIndex the question index of 
     */
    public int getQuestionIndex()
    {
        return this.questionIndex;
    }
    
    public static void main(String arg[])
    {
        StudentRun newRun = new StudentRun("Something");
    }
}
