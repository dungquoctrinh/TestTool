/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTool.model.QuestionPackage.model;

import java.util.*;

/**
* This is the main Question data structure for all of our types of questions. 
* Each of the types of questions inherit this class.
*/
public class Question implements java.io.Serializable{
  
  /**
   * type of question.
   * Ex: data structure, binary, algorithm.
   */
  private String type;
  private int difficulty;
  private double estimatedTime;
  private int pointsWorth;
  private int pointsEarned;
  //the question it self 
  private String text;
  private boolean isGradeable;
  private String className;
  private String teacherComment;
  private String id;

  
  public Question()
  {
      //we can't have this in here, it won't do anything. 
      //I'm leaving it in because it needs to compile
  
      //YES IT DOES A LOT OF THINGS
      //This is the parent of other question type. If you follow the type 
      //of constructor below. Fix the constructor call in all of them so you 
      //can extend the class 
  }
  
  /*added this for making dummy questions*/
  public Question(String text, String type) {
      this.type = type;
      this.difficulty = 5;
      this.estimatedTime = 1.0;
      this.pointsWorth = 5;
      this.pointsEarned = 5;
      this.text = text;
      this.isGradeable = true;
      this.className = null;
      this.teacherComment = null;
      this.id = null;
  }
  
  public Question(int difficulty, double estimatedTime,
          int pointsWorth, String text, boolean isGradeable,
          String className, String teacherComment, String id) {
      this.type = null;
      this.difficulty = difficulty;
      this.estimatedTime = estimatedTime;
      this.pointsWorth = pointsWorth;
      this.pointsEarned = 0;
      this.text = text;
      this.isGradeable = isGradeable;
      this.className = className;
      this.teacherComment = teacherComment;
      this.id = id;
   }
  
  /*added this for specifying type of question, can replace constructor below if
  we want this*/
  public Question(String type, int difficulty,
          double estimatedTime, int pointsWorth, String text, boolean isGradeable,
          String className, String teacherComment, String id) {
      this.type = type;
      this.difficulty = difficulty;
      this.estimatedTime = estimatedTime;
      this.pointsWorth = pointsWorth;
      this.pointsEarned = 0;
      this.text = text;
      this.isGradeable = isGradeable;
      this.className = className;
      this.teacherComment = teacherComment;
      this.id = id;
   }
  
  public String getType() { /*added this, idk if best solution*/
      return type;
  }
  
  public String getId() { /*added this*/
      return id;
  }
  
  public int getDifficulty() {
      return difficulty;
  }
  
  public void setDifficulty(int diff) {
     this.difficulty = diff;
  }

  public double getEstimatedTime() {
      return estimatedTime;
  }
  
  public void setEstimatedTime(double newTime) {
     estimatedTime = newTime;
  }

  public int getPointsWorth() {
      return pointsWorth;
  }
 
  public void setPointsWorth(int points) {
     pointsWorth = points;
  }

  public String getText() {
      return text;
  }
  
  public void setText(String newText) {
     text = newText;
  }

  public void addText(String newText) {
     text += newText;
  }

  public boolean getIsGradeable() {
      return isGradeable;
  }

  public String getClassName() {
      return className;
  }

  public void setClassName(String newName) {
     className = newName;
  }

  public void setTeacherComment(String text) {
    teacherComment = text;
  }
  
  public String getTeacherComment() {
    return teacherComment;
  }
  
  public void setPointsEarned(int points) {
      pointsEarned = points;
  }
  
  public int getPointsEarned() {
      return pointsEarned;
  }
  
}
