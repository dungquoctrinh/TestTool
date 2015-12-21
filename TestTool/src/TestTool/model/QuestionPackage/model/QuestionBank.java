/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTool.model.QuestionPackage.model;

import java.util.ArrayList;
import java.io.*;

/**
* This is to be used when generating the Tests. This holds all Questions in our database
* and you can use methods to get, add, and delete Questions.
*/
public class QuestionBank implements java.io.Serializable {

   public ArrayList<Question> bank;
  
   public QuestionBank() {
       /*get all questions from database*/
       bank = new ArrayList<>();
       bank = this.getQuestions();
   }
   
   /**
   * pre: question != null
   *
   * post: bank.contains(question)
   * 
   * validateQuestion is first called to make sure it's a valid Question Object
   * Adds a question to the bank
   * @param question question to be added.
   * @return returns true if it succeeded, otherwise false.
   */
   public boolean addQuestion(Question question) {
       if (question == null) {
           return false;
       }
       //else if (!validateQuestion(question)) {
       //    return false;
       //}
       else {
            try
            {
               File parentDir = new File("QuestionBank");
               parentDir.mkdir();
               String fileName = question.getId() + ".ser";
               File file = new File(parentDir, fileName);
               if (!file.exists())
                  file.createNewFile();
               FileOutputStream fileOut = new FileOutputStream(file, false);
               ObjectOutputStream out = new ObjectOutputStream(fileOut);
               out.writeObject(question);
               out.close();
               fileOut.close();
               System.out.println("Serialized data is saved in QuestionBank/" + fileName);
               System.out.println("Path: " + file.getAbsolutePath());
            }catch(IOException i)
            {
                //i.printStackTrace();
                System.out.println("IO Exception in addQuestion()");
                return false;
            }
           
           bank.add(question);
           return true;
       }
   }
   
   /**
    * This is to validate the question being entered into the bank
    * @param question the question to be validated
    * @return true if it's valid, otherwise false
    */
   public static boolean validateQuestion(Question question) {
       if (question.getDifficulty() > 10 || question.getDifficulty() < 0 ||
           question.getEstimatedTime() > 0 || question.getPointsWorth() <= 0 ||
           question.getText().length() == 0) {
           return false;
       }
       
       return true;
   }
   
   /**
   * pre: question != null && bank.contains(question)
   *
   * post: !bank.contains(question)
   *
   * validateQuestion is first called to make sure it's a valid Question Object
   * Deletes a question from the bank
   * @param question question to be deleted.
   * @return returns true if it succeeded, otherwise false.
   */
   public boolean deleteQuestion(Question question) {
      if (question == null || !bank.contains(question))
         return false;
      File qFile = new File("QuestionBank/" + question.getId() + ".ser");
      qFile.delete();
      return bank.remove(question);
   }
   
   /**
   * Gives the size of the Question Bank.
   * @return returns the size of the Question Bank.
   */
   public int size() {
           return bank.size();
   }
   
   public ArrayList<Question> getQuestions() {
       //Preliminary checks
        for (int i = 0; i < bank.size(); i++)
            bank.remove(i);
        File currentFolder = new File(".");
        File bankDir = new File(currentFolder, "QuestionBank");
        if (!bankDir.exists()) {
            bankDir.mkdir();
        }
        //Actual stuff after checks
        File[] directoryListing = bankDir.listFiles();
        if (directoryListing != null) {
          for (File child : directoryListing) {
              try {
                  FileInputStream fis = new FileInputStream(child);
                  ObjectInputStream ois = new ObjectInputStream(fis);
                  bank.add((Question)ois.readObject());
              }
              catch (IOException i) {
                  System.out.println("IOException in getQuestions()");
              }
              catch (ClassNotFoundException e) {
                  System.out.println("Class not found in getQuestions()");
              }
          }
        } else {
          System.out.println("directoryListing is null");
        }
       return bank;
   }
   
   public Question get(int index) {
       return bank.get(index);
   }
   
   /**
   * pre: none, if invalid, it returns empty set
   *
   * post: for(int i=0; i < return.size(); i++)
   *           return.get(i).className.equals(className)
   *        || return.isEmpty()
   *
   * This will give all the questions that have the className same as the one specified.
   * @param className The class name for the Question.
   * @return Returns a collection of Questions with the same className. Empty set if no matches
   */
   public ArrayList<Question> getQuestionsByClassName(String className) {
      ArrayList<Question> retArr = new ArrayList<Question>();
      
      for (int i = 0; i < bank.size(); i++) {
         if (bank.get(i).getClassName().equals(className))
            retArr.add(bank.get(i));
      }
      return retArr;
   }
   
   /**
   * This will give all the questions that have the keyword provided.
   * @param keyword the keyword to search for
   * @return This returns a collection of Questions containing that keyword.
   */
}
