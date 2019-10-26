/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.Gui;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import speechrecog.LoginSR;
import techquizapp.Dao.ExamDao;
import techquizapp.Dao.QuestionDao;
import techquizapp.Pojo.ExamPojo;
import techquizapp.Pojo.QuestionPojo;
import techquizapp.Pojo.QuestionStore;
import techquizapp.Pojo.UserProfile;

/**
 *
 * @author DeepakChaurasia
 */
public class SetQuestionsFrame extends javax.swing.JFrame {

    private ExamPojo newExam;
    private QuestionStore qstore;
    private HashMap<String, String> options;
    private int qno;
    private String question, option1, option2, option3, option4, correctOption;

    private TextToVoice tv;
    private VoiceToText vt;

    public SetQuestionsFrame() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        lblUsername.setText("Hello " + UserProfile.getUsername());

        qstore = new QuestionStore();
        options = new HashMap<>();
        options.put("Option1", "Answer 1");
        options.put("Option2", "Answer 2");
        options.put("Option3", "Answer 3");
        options.put("Option4", "Answer 4");
        qno = 1;
        lblQno.setText("Q no. : " + lblQno.getText() + qno);

        tv = new TextToVoice();
        tv.speech = "Paper setting panel";
        tv.start();
        vt = new VoiceToText();
        vt.start();
    }

    public SetQuestionsFrame(ExamPojo newExam) {
        this();
        this.newExam = newExam;
        lblTitle.setText(this.newExam.getTotalQuestions() + " \tQuestions Remaning");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        lblTitle = new javax.swing.JLabel();
        txtOption1 = new javax.swing.JTextField();
        txtOption2 = new javax.swing.JTextField();
        txtOption3 = new javax.swing.JTextField();
        txtOption4 = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblQno = new javax.swing.JLabel();
        btnDone = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jcCorrectOption = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));

        txtQuestion.setColumns(20);
        txtQuestion.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 0));
        lblTitle.setText("Set Question Panel");

        txtOption1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N

        txtOption2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N

        txtOption3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N

        txtOption4.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        txtOption4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOption4ActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(255, 255, 255));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        btnNext.setForeground(new java.awt.Color(102, 0, 102));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(102, 0, 102));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblQno.setBackground(new java.awt.Color(0, 0, 0));
        lblQno.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblQno.setForeground(new java.awt.Color(255, 255, 0));

        btnDone.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        btnDone.setForeground(new java.awt.Color(102, 0, 102));
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        lblUsername.setBackground(new java.awt.Color(0, 0, 0));
        lblUsername.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 0));
        lblUsername.setText("jLabel1");

        lblLogout.setBackground(new java.awt.Color(0, 0, 0));
        lblLogout.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 0));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Correct Option");

        jcCorrectOption.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jcCorrectOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option1", "Option2", "Option3", "Option4", " " }));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Option 1");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Option 3");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Option 2");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Option 4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(315, 315, 315)
                                .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(295, 295, 295)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(603, 603, 603)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel3)
                                        .addGap(365, 365, 365)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jcCorrectOption, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtOption1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(210, 210, 210)
                                            .addComponent(txtOption2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(54, 54, 54)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(368, 368, 368)
                                            .addComponent(jLabel6))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(210, 210, 210)
                                            .addComponent(txtOption4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 341, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(623, 623, 623)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogout)
                    .addComponent(lblUsername))
                .addGap(31, 31, 31)
                .addComponent(lblTitle)
                .addGap(44, 44, 44)
                .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOption2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOption4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOption3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcCorrectOption, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnDone)
                    .addComponent(btnCancel))
                .addGap(99, 99, 99))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOption4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOption4ActionPerformed

    }//GEN-LAST:event_txtOption4ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (validateInput() == false) {
            JOptionPane.showMessageDialog(null, "Please fill all fields", "Cannnot add question!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String optionName = options.get(correctOption);
        QuestionPojo obj = new QuestionPojo(newExam.getExamId(), qno, newExam.getLanguage(), option1, option2, option3, option4, optionName, question);
        System.out.println(obj);
        qstore.addQuestion(obj);
        clearAll();
        lblTitle.setText((newExam.getTotalQuestions() - qno) + " QUESTIONS REMANING");
        qno++;

        if (qno > newExam.getTotalQuestions()) {
            disableAll();
            JOptionPane.showMessageDialog(null, "Your question set has been successfully created.\nPress the DONE button to add it to database", "Exam Added!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            lblQno.setText("Question no: " + qno);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        tv.changeState();
        this.dispose();
        LoginFrame optionsFrame = new LoginFrame();
        optionsFrame.setVisible(true);
        vt.stop();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        lblLogout.setForeground(Color.WHITE);
        Font f = new Font("Tohoma", Font.ITALIC, 25);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        lblLogout.setForeground(new Color(255, 255, 0));
        Font f = new Font("Tohoma", Font.PLAIN, 25);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        if (qno < newExam.getTotalQuestions()) {
            int remainingQuestions = newExam.getTotalQuestions() - qno + 1;
            JOptionPane.showMessageDialog(null, "You still have " + remainingQuestions + " left", "Cannot add Exam!", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            if (validateInput() == false) {
                JOptionPane.showMessageDialog(null, "Please fill all fields", "Cannnot add question!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                ExamDao.addExam(newExam);
                QuestionDao.addQuestion(qstore);
                disableAll();
                JOptionPane.showMessageDialog(null, "Your question set has been successfully added to the database", "Exam added!", JOptionPane.INFORMATION_MESSAGE);

                System.out.println(tv.isAlive());
                tv = new TextToVoice();
                tv.speech = "Your question set has been successfully added to the database";
                tv.start();
                Thread.sleep(5000);
                // AdminOptionsFrame adminFrame = new AdminOptionsFrame();
                SetPaperFrame pFrame = new SetPaperFrame();
                pFrame.setVisible(true);
                this.dispose();
                vt.stop();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error while connecting to database!", "Exception!", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } catch (InterruptedException ex) {
                Logger.getLogger(SetQuestionsFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        tv.changeState();
        SetPaperFrame paperFrame = new SetPaperFrame();
        paperFrame.setVisible(true);
        this.dispose();
        vt.stop();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(SetQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetQuestionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcCorrectOption;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtOption1;
    private javax.swing.JTextField txtOption2;
    private javax.swing.JTextField txtOption3;
    private javax.swing.JTextField txtOption4;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables

    public boolean validateInput() {
        question = txtQuestion.getText().trim();
        option1 = txtOption1.getText().trim();
        option2 = txtOption2.getText().trim();
        option3 = txtOption3.getText().trim();
        option4 = txtOption4.getText().trim();
        correctOption = jcCorrectOption.getSelectedItem().toString();

        if (question.isEmpty() || option1.isEmpty() || option2.isEmpty() || option3.isEmpty() || option4.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public void clearAll() {
        txtQuestion.setText("");
        txtOption1.setText("");
        txtOption2.setText("");
        txtOption3.setText("");
        txtOption4.setText("");
        jcCorrectOption.setSelectedIndex(0);
    }

    public void disableAll() {
        txtQuestion.setEnabled(false);
        txtOption1.setEnabled(false);
        txtOption2.setEnabled(false);
        txtOption3.setEnabled(false);
        txtOption4.setEnabled(false);
        jcCorrectOption.setEnabled(false);
        btnNext.setEnabled(false);
    }

    class TextToVoice extends Thread {

        public static final String VOICENAME = "kevin16";
        private Voice voice;
        public String speech = "";

        public void run() {

            try {
                //speech = "Paper setting panel";
                Thread.sleep(700);
                //	Voice voice;
                VoiceManager vm = VoiceManager.getInstance();
                voice = vm.getVoice(VOICENAME);
                voice.allocate();
                voice.speak(speech);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void changeState() {
            voice.deallocate();
        }
    }

    class VoiceToText extends Thread {
        private boolean flag = true;
        public void run() {
            try {
                Thread.sleep(500);
                //LoginSR s = new LoginSR();
                while (flag) {
                    String speech = LoginSR.speech();
                    System.out.println("speech: Set questions "+speech);
                    if (speech.equalsIgnoreCase("option one")) {
                        jcCorrectOption.setSelectedIndex(0);
                    } else if (speech.equalsIgnoreCase("option two")) {
                        jcCorrectOption.setSelectedIndex(1);
                    } else if (speech.equalsIgnoreCase("option three")) {
                        jcCorrectOption.setSelectedIndex(2);
                    } else if (speech.equalsIgnoreCase("option four")) {
                        jcCorrectOption.setSelectedIndex(3);
                    } else if (speech.equalsIgnoreCase("<unk>")); else if (speech.equalsIgnoreCase("logout")) {
                        disposeMethod();
                    } else if (speech.equalsIgnoreCase("done")) {
                        btnDone.doClick();
                    } else if (speech.equalsIgnoreCase("next")) {
                        btnNext.doClick();
                    } else if (speech.equalsIgnoreCase("cancel")) {
                        btnCancel.doClick();
                    } else;
                }
                //recognizer.stopRecognition();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void disposeMethod() {
        this.dispose();
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        vt.stop();
    }
}
