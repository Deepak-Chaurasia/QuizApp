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
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import speechrecog.LoginSR;
import techquizapp.Dao.PerformanceDao;
import techquizapp.Pojo.StudentScorePojo;
import techquizapp.Pojo.UserProfile;

/**
 *
 * @author DeepakChaurasia
 */
public class ViewSingleScoreFrame extends javax.swing.JFrame {

    private TextToVoice tv;
    private VoiceToText vt;

    public ViewSingleScoreFrame() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        lblUserName.setText("Hello " + UserProfile.getUsername());
        loadStudentId();

        tv = new TextToVoice();
        tv.start();
        vt = new VoiceToText();
        vt.start();
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
        lblUserName = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcStudentId = new javax.swing.JComboBox<>();
        jcExamId = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtLanguage = new javax.swing.JTextField();
        txtPercentage = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));

        lblUserName.setBackground(new java.awt.Color(0, 0, 0));
        lblUserName.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 0));
        lblUserName.setText("jLabel1");

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

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Single Student Score Details");

        jLabel4.setText("jLabel4");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Student Scores Details");

        jcStudentId.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jcStudentId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcStudentId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcStudentIdItemStateChanged(evt);
            }
        });
        jcStudentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcStudentIdActionPerformed(evt);
            }
        });

        jcExamId.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jcExamId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcExamId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcExamIdItemStateChanged(evt);
            }
        });
        jcExamId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcExamIdActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Select Student");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Select Exam ID");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Language");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Percentage");

        txtLanguage.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        txtLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLanguageActionPerformed(evt);
            }
        });

        txtPercentage.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        btnBack.setForeground(new java.awt.Color(102, 0, 102));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(498, 498, 498)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addGap(110, 110, 110)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcExamId, 0, 174, Short.MAX_VALUE)
                                    .addComponent(txtLanguage)
                                    .addComponent(txtPercentage)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(762, 762, 762)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 618, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(587, 587, 587))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(832, 832, 832)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(lblLogout))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(48, 48, 48)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel5)
                                                .addGap(80, 80, 80)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jcStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(111, 111, 111)
                                        .addComponent(jLabel7))
                                    .addComponent(jcExamId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(127, 127, 127)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(124, 124, 124)
                .addComponent(btnBack)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        tv.changeState();
        this.dispose();
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        tv.changeState();
        ViewScoreFrame viewScoresFrame = new ViewScoreFrame();
        viewScoresFrame.setVisible(true);
        this.dispose();
        vt.stop();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jcStudentIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcStudentIdItemStateChanged
        if (evt.getStateChange() == ItemEvent.DESELECTED) // this event will be called twice but we want our method to run only once
        {
            return;
        }
        String studentId = jcStudentId.getSelectedItem().toString();
        try {
            ArrayList<String> examIdList = PerformanceDao.getAllExamId(studentId);
            jcExamId.removeAllItems();

            for (String exid : examIdList) {
                jcExamId.addItem(exid);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error while connecting to database", "Exception!", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jcStudentIdItemStateChanged

    private void jcExamIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcExamIdItemStateChanged
        if (evt.getStateChange() == ItemEvent.DESELECTED) {
            return;
        }
        String studentId = jcStudentId.getSelectedItem().toString();
        String examId = jcExamId.getSelectedItem().toString();

        try {
            StudentScorePojo scoreObj = PerformanceDao.getScore(studentId, examId);
            txtLanguage.setText(scoreObj.getLanguage());
            txtPercentage.setText(String.valueOf(scoreObj.getPer()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error while connecting to database", "Exception!", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jcExamIdItemStateChanged

    private void jcStudentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcStudentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcStudentIdActionPerformed

    private void jcExamIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcExamIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcExamIdActionPerformed

    private void txtLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLanguageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLanguageActionPerformed

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
            java.util.logging.Logger.getLogger(ViewSingleScoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSingleScoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSingleScoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSingleScoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSingleScoreFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcExamId;
    private javax.swing.JComboBox<String> jcStudentId;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtLanguage;
    private javax.swing.JTextField txtPercentage;
    // End of variables declaration//GEN-END:variables

    private void loadStudentId() {
        try {
            ArrayList<String> studentid = PerformanceDao.getAllStudentId();
            /*  Iterator<String> it = studentid.iterator();
        if(!it.hasNext()){
            JOptionPane.showMessageDialog(null, "No Student has yet appeared for the exam","Information!", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            while(it.hasNext()){
                jcStudentId.addItem(it.next());
            }
        }*/
            if (studentid.isEmpty() == true) {
                JOptionPane.showMessageDialog(null, "No Student has yet appeared for the exam", "Information!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                jcStudentId.removeAllItems();
                for (String sid : studentid) {
                    jcStudentId.addItem(sid);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error while connecting to database", "Exception!", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    class TextToVoice extends Thread {

        public static final String VOICENAME = "kevin16";
        private Voice voice;

        public void run() {

            try {
                Thread.sleep(700);
                //	Voice voice;
                VoiceManager vm = VoiceManager.getInstance();
                voice = vm.getVoice(VOICENAME);
                voice.allocate();
                voice.speak("To View Student score. Select student i d and exam i d ");
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
                    System.out.println("speech: View single score " + speech);
                    int index = loadStudents(speech);
                    if (index != -1) {
                        jcStudentId.setSelectedIndex(index);
                    }
                    if (loadExamIDs(speech) != -1) {
                        jcExamId.setSelectedIndex(loadExamIDs(speech));
                    }
                    if (speech.equalsIgnoreCase("<unk>")); else if (speech.equalsIgnoreCase("logout")) {
                        disposeMethod();
                    } else if (speech.equalsIgnoreCase("back")) {
                        btnBack.doClick();
                    } else;
                }
                //recognizer.stopRecognition();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private int loadStudents(String id) {
            try {
                ArrayList<String> studentid = PerformanceDao.getAllStudentId();
                if (studentid.isEmpty() == true) {
                    return -1;
                } else {
                    int index = 0;
                    for (String sid : studentid) {
                        if (sid.equalsIgnoreCase(id)) {
                            return index;
                        }
                        index++;
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error while connecting to database", "Exception!", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
            return -1;
        }

        private int loadExamIDs(String id) {
            int items = jcExamId.getItemCount();
            for (int i = 0; i < items; i++) {
                if (jcExamId.getItemAt(i).equalsIgnoreCase(id)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public void disposeMethod() {
        this.dispose();
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        vt.stop();
    }
}
