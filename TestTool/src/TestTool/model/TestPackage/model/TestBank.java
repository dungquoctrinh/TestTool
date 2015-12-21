/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTool.model.TestPackage.model;
import java.util.Collection;
import java.util.*;
import java.io.*;

public class TestBank implements java.io.Serializable {

   public ArrayList<Test> bank;

   public TestBank() {
       bank = new ArrayList<Test>();
   }
   
   public Test get(int index) {
       return bank.get(index);
   }
   
   /**
    Adds a test to the test bank. Returns false if test already is in bank
    
    pre: 
       test != null;
    post:
       (return == true && bank'.contains(test))
           ||
       (return == false);
   */
   public boolean addTest(Test test) {
      try
      {
         File parentDir = new File("TestBank");
         parentDir.mkdir();
         String fileName = test.getTestName() + ".ser";
         File file = new File(parentDir, fileName);
         if (!file.exists())
            file.createNewFile();
         FileOutputStream fileOut = new FileOutputStream(file, false);
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(test);
         out.close();
         fileOut.close();
         System.out.println("Serialized data is saved in TestBank/" + fileName);
         System.out.println("Path: " + file.getAbsolutePath());
      }catch(IOException i)
      {
          //i.printStackTrace();
          System.out.println("IO exception in addTest()");
          return false;
      }
      bank.add(test);
      //System.out.println("HERE" + bank.size());
      return true;
   }

   /**
   * Deletes test from test bank. Returns true if deletion successful,
   * false otherwise
   * 
    pre:
       test != null;
    post:
       (return == true && !bank'.contains(test))
           ||
       (return == false);
   */
   public boolean deleteTest(Test test) {
        if (test == null || !bank.contains(test))
           return false;
        File tFile = new File("TestBank/" + test.getTestName() + ".ser");
        tFile.delete();
        return bank.remove(test);
   }

   /**
   * Returns size of Test Bank.
   * 
    pre:
       bank.size() >= 0;
    post:
       return == bank.size();
   */
   public int size() {
        return bank.size();
   }
   
   public ArrayList<Test> fillTests() {
       //Preliminary checks
        for (int i = 0; i < bank.size(); i++)
            bank.remove(i);
        File currentFolder = new File(".");
        File bankDir = new File(currentFolder, "TestBank");
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
                  bank.add((Test)ois.readObject());
              }
              catch (IOException i) {
                  System.out.println("IOException in getTests()");
              }
              catch (ClassNotFoundException e) {
                  System.out.println("Class not found in fillTests()");
              }
          }
        } else {
          System.out.println("directoryListing is null");
        }
       return bank;
   }
  
}