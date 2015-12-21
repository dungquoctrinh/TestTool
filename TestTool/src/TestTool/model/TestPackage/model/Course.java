package TestTool.model.TestPackage.model;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import TestTool.model.UserPackage.Teacher;
import TestTool.model.UserPackage.Student;
import java.util.*;

public class Course {

    public Teacher teacher;
    public String name;
    public ArrayList<Student> students;
    public int courseNum;
    public int section;
    
    
    public Course(String name, Teacher teacher, int courseNum, int section)
    {
        this.name = name;
        students = new ArrayList<Student>();
        this.teacher = teacher;
        this.courseNum = courseNum;
        this.section = section;
    }
    
    /**
     * Return the name of the course
     * @return name Course name 
     */
    public String getCourseName()
    {
        return name;
    }
    
    /**
     * Return the professor name
     * @return name of the professor
     */
    public String getTeacherName()
    {
        return teacher.getName();
    }
   
    /**
     * Add a student in the course
     * In this program, maybe it is not necessary since we don't care about 
     * which student in which course
     * @param student
     * @return true if success 
     */
    public boolean addStudentCourse(Student student)
    {
        if (student == null)
        {
            return false;
        }
        else 
        {
            students.add(student);
            return true;
        }
    }
            
}
