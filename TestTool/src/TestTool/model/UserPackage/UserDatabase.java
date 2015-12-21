/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTool.model.UserPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;

/**
 * List of all user(student/ teacher)
 * @author kid
 */
public class UserDatabase {
    private static ArrayList<Student> studentList = new ArrayList<Student>();
    private static ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
    
    /**
     * Adds a new Student object to the studentList
     * @param student Student object to be added to studentList
     pre:
       //student is a valid Student object and not null
       student != null;
     post:
       //student is in studentList
       exists (int i; i>=0 && i < studentList.size()-1;
           studentList.get(i) == student);
     */
    public static void addStudent (Student student)
    {
      try
      {
         File parentDir = new File("StudentDB");
         parentDir.mkdir();
         String fileName = student.getName() + ".ser";
         File file = new File(parentDir, fileName);
         if (!file.exists())
            file.createNewFile();
         FileOutputStream fileOut = new FileOutputStream(file, false);
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(student);
         out.close();
         fileOut.close();
         System.out.println("Serialized data is saved in /StudentDB/" + fileName);
         System.out.println("Path: " + file.getAbsolutePath());
      }catch(IOException i)
      {
          //i.printStackTrace();
          System.out.println(student.getName() + " not successfully added to StudentDB");
      }
        studentList.add(student);
    }
    
    /**
     * Adds a new Teacher object to the teacherList
     * @param teacher Teacher object to be added to teacherList
     pre:
       //teacher is a valid Teacher object and not null
       teacher != null;
     post:
       //teacher is in teacherList
       exists (int i; i>=0 && i < teacherList.size()-1;
           teacherList.get(i) == teacher);
     */
    public static void addTeacher (Teacher teacher)
    {
        try
        {
           File parentDir = new File("TeacherDB");
           parentDir.mkdir();
           String fileName = teacher.getName() + ".ser";
           File file = new File(parentDir, fileName);
           if (!file.exists())
              file.createNewFile();
           FileOutputStream fileOut = new FileOutputStream(file, false);
           ObjectOutputStream out = new ObjectOutputStream(fileOut);
           out.writeObject(teacher);
           out.close();
           fileOut.close();
           System.out.println("Serialized data is saved in /TeacherDB/" + fileName);
           System.out.println("Path: " + file.getAbsolutePath());
        }catch(IOException i)
        {
            //i.printStackTrace();
            System.out.println(teacher.getName() + " not successfully added to TeacherDB");
        }
        teacherList.add(teacher);
    }
    
    /**
     * Returns a student by the name entered in the parameters 
     * @param student Name of student to be returned
     * @return The student associated with name. Null if student is not in list.
     pre:
       //student is a valid String object and not null
       student != null;
     */
    public static Student getStudent(String student)
    {
        Student newStudent = null;
        int i;
        for (i= 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().equals(student))
            {
                newStudent = studentList.get(i);
            }
        }
        return newStudent;
    }
    
    
    /**
     * Returns a teacher by the name entered in the parameters.
     * @param teacher Search for teacher 
     * @return The teacher associated with name. Null if teacher is not in list.
     pre:
       //teacher is a valid String object and not null
       teacher != null;
     */
    public static Teacher getTeacher(String teacher)
    {
        Teacher newTeacher = null;
        int i;
        for (i= 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getName().equals(teacher))
            {
                newTeacher = teacherList.get(i);
            }
        }
        
        return newTeacher;
    }
    
    
    /**
    * Returns the list of students
    * @return The ArrayList of Student objects
    */
    public static ArrayList<Student> getStudentDB()
    {
        //Preliminary checks
        for (int i = 0; i < studentList.size(); i++)
            studentList.remove(i);
        File currentFolder = new File(".");
        File studentDir = new File(currentFolder, "StudentDB");
        if (!studentDir.exists()) {
            studentDir.mkdir();
        }
        //Actual stuff after checks
        File[] directoryListing = studentDir.listFiles();
        if (directoryListing != null) {
          for (File child : directoryListing) {
              try {
                  FileInputStream fis = new FileInputStream(child);
                  ObjectInputStream ois = new ObjectInputStream(fis);
                  studentList.add((Student)ois.readObject());
              }
              catch (IOException i) {
                  System.out.println("IOException in getStudentDB()");
              }
              catch (ClassNotFoundException e) {
                  System.out.println("Class not found in getStudentDB()");
              }
          }
        } else {
          System.out.println("directoryListing is null");
        }
        System.out.println("ALL DONE");
        return studentList;
    }
    
    /**
    * Returns the list of teachers
    * @return The ArrayList of Teacher objects
    */
    public static ArrayList<Teacher> getTeacherDB()
    {
        //Preliminary checks
        for (int i = 0; i < teacherList.size(); i++)
            teacherList.remove(i);
        File currentFolder = new File(".");
        File teacherDir = new File(currentFolder, "TeacherDB");
        if (!teacherDir.exists()) {
            teacherDir.mkdir();
        }
        //Actual stuff after checks
        File[] directoryListing = teacherDir.listFiles();
        if (directoryListing != null) {
          for (File child : directoryListing) {
              try {
                  FileInputStream fis = new FileInputStream(child);
                  ObjectInputStream ois = new ObjectInputStream(fis);
                  teacherList.add((Teacher)ois.readObject());
              }
              catch (IOException i) {
                  System.out.println("IOException in getTeacherDB()");
              }
              catch (ClassNotFoundException e) {
                  System.out.println("Class not found in getTeacherDB()");
              }
          }
        } else {
          System.out.println("directoryListing is null");
        }
        System.out.println("ALL DONE");
        return teacherList;
    }
}
