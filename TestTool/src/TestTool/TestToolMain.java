/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestTool;
import TestTool.model.RunPackage.model.*;
import TestTool.model.RunPackage.view.*;
import TestTool.view.WindowPackage.JFrameLogin;
import java.io.*;
import java.util.*;


/**
 * Main program to direct the Test Tool program. 
 * This is used mainly for open the open program through Login Window
 * 
 * @author Dung Trinh 
 * @version 1.0
 */
public class TestToolMain 
{
    
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException for scan function
     */
    public static void main(String[] args) throws IOException
    {
        JFrameLogin login = new JFrameLogin();
        login.setVisible(true);
        //TeacherRun teacher = new TeacherRun();
        //StudentRun student = new StudentRun();
    }
    
}
