package TestTool.model.TestPackage.model;

import TestTool.model.QuestionPackage.model.QuestionBank;
import TestTool.model.RunPackage.model.TeacherRun;
import TestTool.model.TestPackage.view.JFrameCreateTest;
import TestTool.model.TestPackage.view.JFrameCreateTestQuestionBank;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author calin
 */
public class AutoGenerateTest {
    QuestionBank qBank;
    TeacherRun teacher;
    JFrameCreateTestQuestionBank generateWindow; /*generate test window*/
    JFrameCreateTest createWindow;           /*window created from*/
    TestBank tBank;
        
    public AutoGenerateTest (TeacherRun teacher, JFrameCreateTest createWindow) {
        this.teacher = teacher;
        
    }
}
