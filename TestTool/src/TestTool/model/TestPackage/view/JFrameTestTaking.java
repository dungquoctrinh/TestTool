/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTool.model.TestPackage.view;

//import TestTool.model.QuestionPackage.model.Question;
import TestTool.model.QuestionPackage.model.*;
import TestTool.model.RunPackage.model.StudentRun;
import TestTool.model.TestPackage.model.Test;
import TestTool.model.UserPackage.Student;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dung Trinh
 */
public class JFrameTestTaking extends javax.swing.JFrame {

    
    /**
     * Time counting. Experiment
     */
    DateFormat f = new SimpleDateFormat("mm:ss");
    //Start the time
    long startingTime = System.currentTimeMillis();
    
    private Student student;
    private StudentRun studentRun;
    private Test test;
    //for previous answer
    private static String previousAnswer = "";
    
    public boolean value = true;
    public String studentAnswer ="";
    private JFrameTestMatchingQuestion popUp;
    private DefaultListModel JListQuestionModel;
    
    /**
     * Try to get the counter every second
     */
    //Event to inturupt every 1000
    //public java.awt.event.ActionEvent interuptEvent  = new java.awt.event.ActionEvent(new Object(), 7, "");
    //Timer t = new Timer(1000, jTextFieldTimeRemainingActionPerformed(this.interuptEvent));
    //t.start();
    //Timer timer = new Timer();
    //timer.schedule(jTextFieldTimeRemainingActionPerformed(this.interuptEvent), 0, 5000);
    //ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
    
    /**
     * Creates new form JFrameTestingExample
     */
    public JFrameTestTaking(StudentRun studentRun) 
    {
        this.studentRun = studentRun;
        this.student = studentRun.getStudent();
        
        //get the current test taking
        this.test = studentRun.getCurrentTest();
        /*Set model for JList*/
        JListQuestionModel = new DefaultListModel();
        for(int i = 0; i < test.size(); i++)
        {
            String questionNumberText = "Question " + Integer.toString(i+1);
            this.JListQuestionModel.addElement(questionNumberText);
        }

        initComponents();
        //for time testing
        f.setTimeZone(TimeZone.getTimeZone("GMT"));
        
        
        jLabelTitle.setText(test.getTestName());
                
        System.out.println(this.test.size());
        //Why is this return 0?
        jLabelTotalQuestion.setText(Integer.toString(studentRun.getCurrentTest().size()));
        
        //Set up initial time - Original time
        long displayTs = (long)test.getTestTime() * 60000;
        String out;
        if (displayTs >= 0) 
        {
            out = f.format(new Date(displayTs));
        } 
        else 
        {
            out = "-" + f.format(new Date(-displayTs));
        }
        jTextFieldTimeRemaining.setText(out);
        
        if (test.questions.get(studentRun.getQuestionIndex()) instanceof TrueFalseQuestion)
        {
        //get cur question and set the value
            System.out.println("True false");
            this.jRadioButtonOption1.setVisible(false);
            this.jRadioButtonOption2.setVisible(false);
            this.jTextFieldFreeResponse.setVisible(false);
            
            this.jRadioButtonTrue.setVisible(true);
            this.jRadioButtonFalse.setVisible(true);
            
            this.jRadioButtonTrue.setText("True");
            this.jRadioButtonFalse.setText("False");
        //get the value from the set
        }
        else if (test.questions.get(studentRun.getQuestionIndex()) instanceof MultipleChoiceQuestion)
        {
            System.out.println("Multiple choice");
            //This is Multiple choice question
            this.jRadioButtonOption1.setVisible(true);
            this.jRadioButtonOption2.setVisible(true);            
            this.jRadioButtonTrue.setVisible(true);
            this.jRadioButtonFalse.setVisible(true);
            this.jTextFieldFreeResponse.setVisible(false);
            
            MultipleChoiceQuestion questionMul =(MultipleChoiceQuestion)test.questions.get(studentRun.getQuestionIndex());
            this.jRadioButtonOption1.setText(questionMul.getOption().get(0));
            this.jRadioButtonOption2.setText(questionMul.getOption().get(1));
            this.jRadioButtonTrue.setText(questionMul.getOption().get(2));
            this.jRadioButtonFalse.setText(questionMul.getOption().get(3));
        }
        else if (test.questions.get(studentRun.getQuestionIndex()) instanceof FreeResponseQuestion)
        {
            System.out.println("Free response");
            this.jRadioButtonOption1.setVisible(false);
            this.jRadioButtonOption2.setVisible(false);
            this.jRadioButtonTrue.setVisible(false);
            this.jRadioButtonFalse.setVisible(false);
            this.jTextFieldFreeResponse.setVisible(true);
        }
        else if (test.questions.get(studentRun.getQuestionIndex()) instanceof MatchingQuestion)
        {
            System.out.println("Matching");
            this.jRadioButtonOption1.setVisible(false);
            this.jRadioButtonOption2.setVisible(false);
            this.jRadioButtonTrue.setVisible(false);
            this.jRadioButtonFalse.setVisible(false);
            this.jTextFieldFreeResponse.setVisible(false);
            
            MatchingQuestion thisQuestion = (MatchingQuestion)test.questions.get(studentRun.getQuestionIndex());
            this.popUp = new JFrameTestMatchingQuestion(thisQuestion.getQuestionMatching(),thisQuestion.getAnswerMatching());
            //why two ?
            this.popUp.setVisible(true);
        }
        this.previousAnswer = "";
        studentRun.questionIndex = 0;

     }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTest = new javax.swing.ButtonGroup();
        jLabelTimeRemaining = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaQuestionText = new javax.swing.JTextArea();
        jTextFieldTimeRemaining = new javax.swing.JTextField();
        jRadioButtonTrue = new javax.swing.JRadioButton();
        jRadioButtonFalse = new javax.swing.JRadioButton();
        jButtonPrevious = new javax.swing.JButton();
        jButtonConfirm = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();
        jButtonSubmit = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jLabelQuestions = new javax.swing.JLabel();
        jLabelDivisor = new javax.swing.JLabel();
        jLabelCompleted = new javax.swing.JLabel();
        jLabelTotalQuestion = new javax.swing.JLabel();
        jRadioButtonOption1 = new javax.swing.JRadioButton();
        jRadioButtonOption2 = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListQuestions = new javax.swing.JList();
        jLabelPreviousAnswer = new javax.swing.JLabel();
        jTextFieldFreeResponse = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Galactest - Test Taking");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        jLabelTimeRemaining.setText("Time Remaining");

        jTextAreaQuestionText.setEditable(false);
        jTextAreaQuestionText.setColumns(20);
        jTextAreaQuestionText.setRows(5);
        jTextAreaQuestionText.setText(test.getQuestion(0).getText());
        jScrollPane1.setViewportView(jTextAreaQuestionText);

        jTextFieldTimeRemaining.setEditable(false);
        jTextFieldTimeRemaining.setText("40:00");
        jTextFieldTimeRemaining.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldTimeRemainingMouseClicked(evt);
            }
        });
        jTextFieldTimeRemaining.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTextFieldTimeRemainingMouseMoved(evt);
            }
        });
        jTextFieldTimeRemaining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTimeRemainingActionPerformed(evt);
            }
        });

        buttonGroupTest.add(jRadioButtonTrue);
        jRadioButtonTrue.setText("True");
        jRadioButtonTrue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTrueActionPerformed(evt);
            }
        });

        buttonGroupTest.add(jRadioButtonFalse);
        jRadioButtonFalse.setText("False");
        jRadioButtonFalse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFalseActionPerformed(evt);
            }
        });

        jButtonPrevious.setText("Previous");
        jButtonPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPreviousActionPerformed(evt);
            }
        });

        jButtonConfirm.setText("Confirm");
        jButtonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmActionPerformed(evt);
            }
        });

        jButtonNext.setText("Next");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jButtonSubmit.setText("Submit Test");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTitle.setText("Quiz 1");

        jLabelQuestions.setText("Questions");

        jLabelDivisor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDivisor.setText("/");

        jLabelCompleted.setText("0");

        jLabelTotalQuestion.setText("0");

        buttonGroupTest.add(jRadioButtonOption1);
        jRadioButtonOption1.setText("jRadioButton1");
        jRadioButtonOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOption1ActionPerformed(evt);
            }
        });

        buttonGroupTest.add(jRadioButtonOption2);
        jRadioButtonOption2.setText("jRadioButton2");
        jRadioButtonOption2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOption2ActionPerformed(evt);
            }
        });

        jListQuestions.setModel(JListQuestionModel);
        //jListQuestions.setModel(this.JListQuestionModel);
        jListQuestions.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListQuestionsValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jListQuestions);

        jTextFieldFreeResponse.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTextFieldFreeResponse.setText("(Type your answer in here)");
        jTextFieldFreeResponse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFreeResponseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(jLabelTitle)
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelTimeRemaining)
                                .addGap(28, 28, 28)
                                .addComponent(jTextFieldTimeRemaining, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(164, 164, 164)
                            .addComponent(jLabelPreviousAnswer))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(190, 190, 190)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButtonOption1)
                                        .addComponent(jRadioButtonOption2))
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButtonFalse)
                                        .addComponent(jRadioButtonTrue)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(156, 156, 156)
                                    .addComponent(jButtonPrevious)
                                    .addGap(48, 48, 48)
                                    .addComponent(jButtonConfirm)
                                    .addGap(45, 45, 45)
                                    .addComponent(jButtonNext)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jTextFieldFreeResponse, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCompleted, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabelDivisor, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelTotalQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelQuestions))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTimeRemaining, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTimeRemaining)
                    .addComponent(jLabelCompleted)
                    .addComponent(jLabelDivisor)
                    .addComponent(jLabelTotalQuestion)
                    .addComponent(jLabelQuestions))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabelPreviousAnswer)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButtonFalse)
                                    .addComponent(jRadioButtonOption2))
                                .addGap(3, 3, 3)
                                .addComponent(jTextFieldFreeResponse, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButtonOption1)
                                    .addComponent(jRadioButtonTrue))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirm)
                    .addComponent(jButtonNext)
                    .addComponent(jButtonPrevious)
                    .addComponent(jButtonSubmit))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Set up all the field and text field
     */
    public void setFieldVisible()
    {
        //Question question = test.questions.get(studentRun.getQuestionIndex());
        if (test.questions.get(studentRun.getQuestionIndex()) instanceof TrueFalseQuestion)
        {
        //get cur question and set the value
            System.out.println("True False");
            this.jRadioButtonOption1.setVisible(false);
            this.jRadioButtonOption2.setVisible(false);
            this.jTextFieldFreeResponse.setVisible(false);
            this.jRadioButtonTrue.setVisible(true);
            this.jRadioButtonFalse.setVisible(true);
            
            this.jRadioButtonTrue.setText("True");
            this.jRadioButtonFalse.setText("False");
            
            boolean value = ((TrueFalseQuestion)test.questions.get(studentRun.getQuestionIndex())).getStudentAnswer();
            if (value == true)
            {
                System.out.println("In with setting data");
                this.previousAnswer = "True";
            }
            else if (value == false)
            {
                this.previousAnswer = "False";
            }
            //in case the value is null
            else
            {
                this.previousAnswer = "";
            }
        //get the value from the set
        }
        else if (test.questions.get(studentRun.getQuestionIndex()) instanceof MultipleChoiceQuestion)
        {
            //This is Multiple choice question
            System.out.println("Multiple choice");
            this.jRadioButtonOption1.setVisible(true);
            this.jRadioButtonOption2.setVisible(true);
            this.jRadioButtonTrue.setVisible(true);
            this.jRadioButtonFalse.setVisible(true);
            this.jTextFieldFreeResponse.setVisible(false);
            
            
            MultipleChoiceQuestion questionMul =(MultipleChoiceQuestion)test.questions.get(studentRun.getQuestionIndex());
            this.jRadioButtonOption1.setText(questionMul.getOption().get(0));
            this.jRadioButtonOption2.setText(questionMul.getOption().get(1));
            this.jRadioButtonTrue.setText(questionMul.getOption().get(2));
            this.jRadioButtonFalse.setText(questionMul.getOption().get(3));
            this.previousAnswer = ((MultipleChoiceQuestion)test.questions.get(studentRun.getQuestionIndex())).getStudentAnswer();
        }
        else if (test.questions.get(studentRun.getQuestionIndex()) instanceof FreeResponseQuestion)
        {
            System.out.println("Free response");
            this.jRadioButtonOption1.setVisible(false);
            this.jRadioButtonOption2.setVisible(false);
            this.jRadioButtonTrue.setVisible(false);
            this.jRadioButtonFalse.setVisible(false);
            this.jTextFieldFreeResponse.setVisible(true);
            this.previousAnswer = " ";
        }
        else if (test.questions.get(studentRun.getQuestionIndex()) instanceof MatchingQuestion)
        {
            //turn off all field
            this.jRadioButtonOption1.setVisible(false);
            this.jRadioButtonOption2.setVisible(false);
            this.jRadioButtonTrue.setVisible(false);
            this.jRadioButtonFalse.setVisible(false);
            this.jTextFieldFreeResponse.setVisible(false);
            System.out.println("matching:...");
            //get the question
            MatchingQuestion thisQuestion = (MatchingQuestion)test.questions.get(studentRun.getQuestionIndex()); 

            this.popUp = new JFrameTestMatchingQuestion(thisQuestion.getQuestionMatching(),thisQuestion.getAnswerMatching());
            //call visible one
            this.popUp.setVisible(true);
            this.previousAnswer = " ";
        }
        
    }
    
    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        System.out.println("Test.submitTest()");
        this.studentRun.answeredQuestions = 0;
        
        //Remove the test from taken test
        //Set it out
        //JOptionPane.showMessageDialog(this, "End of testing/ display test result for the automated testing");
        JFrameTestResult testResult = new JFrameTestResult(this.studentRun);
        testResult.setVisible(true);
        this.setVisible(false);
        //DefaultTableModel table = new DefaultTableModel();
        //table.
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jButtonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmActionPerformed
        System.out.println("Test.confirm()");
        if (studentRun.answeredQuestions < test.size())
        {
            studentRun.answeredQuestions +=1;
            //Set the answerQUestion
            jLabelCompleted.setText(Integer.toString(studentRun.answeredQuestions));
        }
        
        //if it is true false question
        if (test.questions.get(studentRun.getQuestionIndex()) instanceof TrueFalseQuestion)
        {
        //get cur question and set the value
            ((TrueFalseQuestion)test.questions.get(studentRun.getQuestionIndex())).setStudentAnswer(value);
        //get the value from the set
        }
        else if (test.questions.get(studentRun.getQuestionIndex()) instanceof MultipleChoiceQuestion)
        {
            System.out.println(this.studentAnswer);
            //get cur question and set the value
            ((MultipleChoiceQuestion)test.questions.get(studentRun.getQuestionIndex())).setStudentAnswer(this.studentAnswer);
            //get the value from the set
        }
        else if (test.questions.get(studentRun.getQuestionIndex()) instanceof FreeResponseQuestion)
        {
            String answer = this.jTextFieldFreeResponse.getText();
            System.out.println(answer);
            //get cur question and set the value
            ((FreeResponseQuestion)test.questions.get(studentRun.getQuestionIndex())).setStudentAnswer(answer);
            //get the value from the set
        }
        else if (test.questions.get(studentRun.getQuestionIndex()) instanceof MatchingQuestion)
        {
            System.out.println("Send the matching question somehow.Not clear because"
                    +  "the class is not implemented");
            ArrayList<String> studentAnswer = this.popUp.getDataMatching();
            //get cur question and set the value
            //get the value from the set
        }
        
        //Set field
        //"Question " + Integer.toString(i+1);
       
        String display = "Question " + (studentRun.getQuestionIndex() + 1) + " - Submit";
        this.JListQuestionModel.setElementAt(display, studentRun.getQuestionIndex());
        this.jListQuestions.setModel(JListQuestionModel);
        
        
        //java.awt.event.ActionEvent something = new java.awt.event.ActionEvent(new Object(), 1, " ");
        this.jButtonNextActionPerformed(evt);
    }//GEN-LAST:event_jButtonConfirmActionPerformed
    
    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        //check null
        jTextAreaQuestionText.setText(studentRun.getNextQuestion().getText());
        System.out.println("Test.next()");
        
        this.setFieldVisible();
        
        //will go down here?
        this.jLabelPreviousAnswer.setText(this.previousAnswer);
        System.out.println(this.previousAnswer);
        
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jButtonPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPreviousActionPerformed
        //Check null
        jTextAreaQuestionText.setText(studentRun.getPreviousQuestion().getText());
        System.out.println("Test.previous()");
        
        this.setFieldVisible();
        //will go down here?
        this.jLabelPreviousAnswer.setText(this.previousAnswer);
    }//GEN-LAST:event_jButtonPreviousActionPerformed

    public void setClock()
    {
        long elapsed = System.currentTimeMillis() - startingTime;
        
        //Testtime - eplase 
        long displayTs = (long)test.getTestTime() * 60000 - elapsed;
        System.out.println("Test Time " + test.getTestTime());
        System.out.println("Time eslapse" + elapsed);
                
        String out;
        if (displayTs >= 0) {
            out = f.format(new Date(displayTs));
        } else {
            out = "-" + f.format(new Date(-displayTs));
        }
        jTextFieldTimeRemaining.setText(out);
        
    }
    //Success to get the time
    private void jTextFieldTimeRemainingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldTimeRemainingMouseClicked
        //increasing
        //How much time pass
        this.setClock();
    }//GEN-LAST:event_jTextFieldTimeRemainingMouseClicked

    private void jTextFieldTimeRemainingMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldTimeRemainingMouseMoved

        this.setClock();
    }//GEN-LAST:event_jTextFieldTimeRemainingMouseMoved

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        this.setClock();
    }//GEN-LAST:event_formMouseMoved

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
         this.setClock();
        /*
        long elapsed = System.currentTimeMillis() - startingTime;
        //Testtime - eplase 
        long displayTs = (long)test.getTestTime() * 60000 - elapsed;
        String out;
        if (displayTs >= 0) {
            out = f.format(new Date(displayTs));
        } else {
            out = "-" + f.format(new Date(-displayTs));
        }
        jTextFieldTimeRemaining.setText(out);
        */
    }//GEN-LAST:event_formMouseExited

  
    
    /**When the answer is true
     * 
     * @param evt 
     */
    private void jRadioButtonTrueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTrueActionPerformed
        // TODO add your handling code here:
        if (test.questions.get(studentRun.getQuestionIndex()) instanceof TrueFalseQuestion)
        {
            this.value = true;
        }
        else if (test.questions.get(studentRun.getQuestionIndex()) instanceof MultipleChoiceQuestion)
        {
            MultipleChoiceQuestion question = (MultipleChoiceQuestion)test.questions.get(studentRun.getQuestionIndex());
            this.studentAnswer = question.getOption().get(2);
        }
        
    }//GEN-LAST:event_jRadioButtonTrueActionPerformed

    private void jRadioButtonFalseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFalseActionPerformed
        // TODO add your handling code here:
        //make the other button mute
        if (test.questions.get(studentRun.getQuestionIndex()) instanceof TrueFalseQuestion)
        {
            this.value = false;
        }
        else if (test.questions.get(studentRun.getQuestionIndex()) instanceof MultipleChoiceQuestion)
        {
            MultipleChoiceQuestion question = (MultipleChoiceQuestion)test.questions.get(studentRun.getQuestionIndex());
            this.studentAnswer = question.getOption().get(3);
        }
        
    }//GEN-LAST:event_jRadioButtonFalseActionPerformed

    /**
     * Will react when the class is act on
     * @param evt 
     */
    private void jListQuestionsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListQuestionsValueChanged
        //System.out.print("Index at");
        //Set up the current question 
        
        if (!evt.getValueIsAdjusting()) 
        {//This line prevents double events
            Question question = studentRun.getCurQuestion(jListQuestions.getAnchorSelectionIndex());
            jTextAreaQuestionText.setText(question.getText());
            //why is this call two time?
            this.setFieldVisible();
            System.out.println("after call set  fields");
        }
        
        this.jLabelPreviousAnswer.setText(this.previousAnswer);
    }//GEN-LAST:event_jListQuestionsValueChanged

    private void jRadioButtonOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOption1ActionPerformed
        if (test.questions.get(studentRun.getQuestionIndex()) instanceof MultipleChoiceQuestion)
        {
            MultipleChoiceQuestion question = (MultipleChoiceQuestion)test.questions.get(studentRun.getQuestionIndex());
            this.studentAnswer = question.getOption().get(0);
        }
    }//GEN-LAST:event_jRadioButtonOption1ActionPerformed

    private void jRadioButtonOption2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOption2ActionPerformed
        if (test.questions.get(studentRun.getQuestionIndex()) instanceof MultipleChoiceQuestion)
        {
            MultipleChoiceQuestion question = (MultipleChoiceQuestion)test.questions.get(studentRun.getQuestionIndex());
            this.studentAnswer = question.getOption().get(1);
        }
    }//GEN-LAST:event_jRadioButtonOption2ActionPerformed

    private void jTextFieldTimeRemainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTimeRemainingActionPerformed
         //How much time pass
        long elapsed = System.currentTimeMillis() - startingTime;
        //Testtime - eplase 
        long displayTs = (long)test.getTestTime() * 60000 - elapsed;
        String out;
        if (displayTs >= 0) {
            out = f.format(new Date(displayTs));
        } else {
            out = "-" + f.format(new Date(-displayTs));
        }
        jTextFieldTimeRemaining.setText(out);
    }//GEN-LAST:event_jTextFieldTimeRemainingActionPerformed

    private void jTextFieldFreeResponseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFreeResponseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFreeResponseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameTestTaking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTestTaking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTestTaking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTestTaking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTestTaking(new StudentRun("")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTest;
    private javax.swing.JButton jButtonConfirm;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonPrevious;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabelCompleted;
    private javax.swing.JLabel jLabelDivisor;
    private javax.swing.JLabel jLabelPreviousAnswer;
    private javax.swing.JLabel jLabelQuestions;
    private javax.swing.JLabel jLabelTimeRemaining;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTotalQuestion;
    private javax.swing.JList jListQuestions;
    private javax.swing.JRadioButton jRadioButtonFalse;
    private javax.swing.JRadioButton jRadioButtonOption1;
    private javax.swing.JRadioButton jRadioButtonOption2;
    private javax.swing.JRadioButton jRadioButtonTrue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextAreaQuestionText;
    private javax.swing.JTextField jTextFieldFreeResponse;
    private javax.swing.JTextField jTextFieldTimeRemaining;
    // End of variables declaration//GEN-END:variables
}
