

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class homePage extends javax.swing.JFrame {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public homePage() {
        
        initComponents();
        conn = javaconnect.ConnecrDb();
        setLocationRelativeTo(null);
        setExtendedState(getBaseline(1055, 500));
        //Update_table();
    }
    
public void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addcvFrame = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        personalInfoPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        input_name = new javax.swing.JTextField();
        input_surname = new javax.swing.JTextField();
        input_nationality = new javax.swing.JTextField();
        input_living = new javax.swing.JTextField();
        birthPanel = new javax.swing.JPanel();
        input_birthday = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        input_phone = new javax.swing.JTextField();
        input_mail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        educationPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jButton2 = new javax.swing.JButton();
        input_school = new javax.swing.JTextField();
        input_uni = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        input_additional = new javax.swing.JTextArea();
        profExpPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        input_job2 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        input_job1 = new javax.swing.JTextArea();
        jLabel48 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        action_cancel = new javax.swing.JButton();
        action_clearall = new javax.swing.JButton();
        action_save = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel19 = new javax.swing.JLabel();
        sliderPanel = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSlider2 = new javax.swing.JSlider();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        browsecvFrame = new javax.swing.JFrame();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableEmployee = new javax.swing.JTable();
        analysisFrame = new javax.swing.JFrame();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        dashboardsFrame = new javax.swing.JFrame();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        helpMenu = new javax.swing.JDialog();
        jLabel17 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        addcvTab = new javax.swing.JPanel();
        addcvScrollPanel = new javax.swing.JScrollPane();
        addcvScrollTextArea = new javax.swing.JTextArea();
        browsecvsTab = new javax.swing.JPanel();
        browsecvScrollPanel = new javax.swing.JScrollPane();
        browsecvScrollTextArea = new javax.swing.JTextArea();
        dashboardsTab = new javax.swing.JPanel();
        dashboardsScrollPanel = new javax.swing.JScrollPane();
        dashboardsTextArea = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        aboutMenu = new javax.swing.JDialog();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        footerPanel = new javax.swing.JPanel();
        quitButton = new javax.swing.JButton();
        aboutButton = new javax.swing.JButton();
        aboutusLabel = new javax.swing.JLabel();
        quitLabel = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        helpButton = new javax.swing.JButton();
        helpLabel = new javax.swing.JLabel();
        middlePanel = new javax.swing.JPanel();
        addNewButton = new javax.swing.JButton();
        showButton = new javax.swing.JButton();
        dashboardsButton = new javax.swing.JButton();
        addCVLabel = new javax.swing.JLabel();
        browseLabel = new javax.swing.JLabel();
        dashboardsLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        addcvFrame.setTitle("Add CV");
        addcvFrame.setMinimumSize(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Create new profile:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Type of the profile:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Manager", "Engineer", "Technician", "Administrative" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        personalInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Personal Information"));

        jLabel3.setText("First Name:");

        jLabel4.setText("Last Name:");

        jLabel6.setText("Date of Birth:");

        jLabel7.setText("Nationality:");

        jLabel8.setText("Living in:");

        input_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nameActionPerformed(evt);
            }
        });

        input_birthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_birthdayActionPerformed(evt);
            }
        });

        jLabel11.setText("dd/mm/yy");

        javax.swing.GroupLayout birthPanelLayout = new javax.swing.GroupLayout(birthPanel);
        birthPanel.setLayout(birthPanelLayout);
        birthPanelLayout.setHorizontalGroup(
            birthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(birthPanelLayout.createSequentialGroup()
                .addComponent(input_birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11))
        );
        birthPanelLayout.setVerticalGroup(
            birthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, birthPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(birthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_birthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)))
        );

        jLabel12.setText("Phone:");

        jLabel13.setText("E-mail:");

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("First Name:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "M", "F" }));

        javax.swing.GroupLayout personalInfoPanelLayout = new javax.swing.GroupLayout(personalInfoPanel);
        personalInfoPanel.setLayout(personalInfoPanelLayout);
        personalInfoPanelLayout.setHorizontalGroup(
            personalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(personalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personalInfoPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(personalInfoPanelLayout.createSequentialGroup()
                        .addGroup(personalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel5))
                        .addGap(37, 37, 37)
                        .addGroup(personalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(personalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(input_surname)
                                .addComponent(input_living)
                                .addComponent(input_nationality)
                                .addComponent(birthPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(input_name)
                                .addComponent(input_phone)
                                .addComponent(input_mail))
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 81, Short.MAX_VALUE))))
        );

        personalInfoPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {birthPanel, input_living, input_name, input_nationality, input_surname});

        personalInfoPanelLayout.setVerticalGroup(
            personalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(personalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(input_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(input_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(personalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(birthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(personalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(input_nationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(input_living, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(input_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(input_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        educationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Education"));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel39.setText("High School:");

        jLabel40.setText("University:");

        jLabel46.setText("Points:");

        jLabel47.setText("Additional:");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        input_additional.setColumns(20);
        input_additional.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        input_additional.setLineWrap(true);
        input_additional.setRows(5);
        input_additional.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout educationPanelLayout = new javax.swing.GroupLayout(educationPanel);
        educationPanel.setLayout(educationPanelLayout);
        educationPanelLayout.setHorizontalGroup(
            educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(educationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, educationPanelLayout.createSequentialGroup()
                        .addComponent(input_school)
                        .addGap(28, 28, 28)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(educationPanelLayout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(educationPanelLayout.createSequentialGroup()
                        .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(input_uni, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(educationPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, educationPanelLayout.createSequentialGroup()
                                .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10)
                        .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, educationPanelLayout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addGap(14, 14, 14))
                            .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, educationPanelLayout.createSequentialGroup()
                        .addComponent(input_additional)
                        .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(educationPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, educationPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))))
                .addContainerGap())
        );
        educationPanelLayout.setVerticalGroup(
            educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(educationPanelLayout.createSequentialGroup()
                .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(educationPanelLayout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, educationPanelLayout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_school, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_uni, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addGap(4, 4, 4)
                .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(educationPanelLayout.createSequentialGroup()
                        .addGap(0, 122, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(input_additional, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        profExpPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Professional Experience"));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        input_job2.setColumns(20);
        input_job2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        input_job2.setLineWrap(true);
        input_job2.setRows(5);
        input_job2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(input_job2);

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        input_job1.setColumns(20);
        input_job1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        input_job1.setLineWrap(true);
        input_job1.setRows(5);
        input_job1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane3.setViewportView(input_job1);

        jLabel48.setText("Years:");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });

        jLabel49.setText("Job1:");

        jLabel50.setText("Job2:");

        javax.swing.GroupLayout profExpPanelLayout = new javax.swing.GroupLayout(profExpPanel);
        profExpPanel.setLayout(profExpPanelLayout);
        profExpPanelLayout.setHorizontalGroup(
            profExpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profExpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profExpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profExpPanelLayout.createSequentialGroup()
                        .addGroup(profExpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(profExpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(profExpPanelLayout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addGap(14, 14, 14))))
                    .addGroup(profExpPanelLayout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profExpPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profExpPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        profExpPanelLayout.setVerticalGroup(
            profExpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profExpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profExpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profExpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profExpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Save");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Clear All");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Cancel");

        action_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/homePage/icons/cancel_small.png"))); // NOI18N
        action_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        action_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                action_cancelActionPerformed(evt);
            }
        });

        action_clearall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/homePage/icons/clear_small.png"))); // NOI18N
        action_clearall.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        action_clearall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                action_clearallActionPerformed(evt);
            }
        });

        action_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/homePage/icons/save_small.png"))); // NOI18N
        action_save.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        action_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                action_saveActionPerformed(evt);
            }
        });

        jLabel19.setText("Progress");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(56, 56, 56)
                .addComponent(jLabel18)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(action_save)
                .addGap(18, 18, 18)
                .addComponent(action_clearall)
                .addGap(18, 18, 18)
                .addComponent(action_cancel)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(action_cancel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(action_clearall)
                    .addComponent(action_save, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18)
                    .addComponent(jLabel15)))
        );

        sliderPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Overall"));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Soft Skills:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Hard Skills:");

        jLabel22.setText("0");

        jLabel23.setText("100");

        jLabel25.setText("100");

        jLabel26.setText("0");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("Possible interview invitation:");

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/homePage/icons/approved_small.png"))); // NOI18N
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/homePage/icons/maybe_small.png"))); // NOI18N
        jToggleButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/homePage/icons/notapproved_small.png"))); // NOI18N
        jToggleButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout sliderPanelLayout = new javax.swing.GroupLayout(sliderPanel);
        sliderPanel.setLayout(sliderPanelLayout);
        sliderPanelLayout.setHorizontalGroup(
            sliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sliderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(sliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(sliderPanelLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, sliderPanelLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23))
                    .addComponent(jSlider1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSlider2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sliderPanelLayout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton3))
                    .addComponent(jLabel27))
                .addGap(106, 106, 106))
        );
        sliderPanelLayout.setVerticalGroup(
            sliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sliderPanelLayout.createSequentialGroup()
                .addGroup(sliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sliderPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(sliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(sliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(sliderPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addGroup(sliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton1)
                            .addComponent(jToggleButton3)
                            .addComponent(jToggleButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel25))
                .addContainerGap())
        );

        javax.swing.GroupLayout addcvFrameLayout = new javax.swing.GroupLayout(addcvFrame.getContentPane());
        addcvFrame.getContentPane().setLayout(addcvFrameLayout);
        addcvFrameLayout.setHorizontalGroup(
            addcvFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addcvFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addcvFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(addcvFrameLayout.createSequentialGroup()
                        .addComponent(personalInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(addcvFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(educationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(sliderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(addcvFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addcvFrameLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(profExpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 87, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addcvFrameLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        addcvFrameLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {educationPanel, personalInfoPanel, profExpPanel});

        addcvFrameLayout.setVerticalGroup(
            addcvFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addcvFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(addcvFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(personalInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(educationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(profExpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(addcvFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sliderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        addcvFrame.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);

        browsecvFrame.setTitle("Browse CVs");
        browsecvFrame.setMinimumSize(new java.awt.Dimension(400, 300));

        tableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tableEmployee);

        javax.swing.GroupLayout browsecvFrameLayout = new javax.swing.GroupLayout(browsecvFrame.getContentPane());
        browsecvFrame.getContentPane().setLayout(browsecvFrameLayout);
        browsecvFrameLayout.setHorizontalGroup(
            browsecvFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, browsecvFrameLayout.createSequentialGroup()
                .addContainerGap(276, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        browsecvFrameLayout.setVerticalGroup(
            browsecvFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(browsecvFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        analysisFrame.setTitle("Analysis Tool");
        analysisFrame.setMinimumSize(new java.awt.Dimension(400, 300));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/homePage/icons/construction.png"))); // NOI18N

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel43.setText("Under Construction ...");

        javax.swing.GroupLayout analysisFrameLayout = new javax.swing.GroupLayout(analysisFrame.getContentPane());
        analysisFrame.getContentPane().setLayout(analysisFrameLayout);
        analysisFrameLayout.setHorizontalGroup(
            analysisFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, analysisFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43)
                .addGap(57, 57, 57))
        );
        analysisFrameLayout.setVerticalGroup(
            analysisFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(analysisFrameLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(analysisFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel43)
                    .addComponent(jLabel42))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        dashboardsFrame.setTitle("Dashboards");
        dashboardsFrame.setMinimumSize(new java.awt.Dimension(400, 300));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/homePage/icons/construction.png"))); // NOI18N

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel45.setText("Under Construction ...");

        javax.swing.GroupLayout dashboardsFrameLayout = new javax.swing.GroupLayout(dashboardsFrame.getContentPane());
        dashboardsFrame.getContentPane().setLayout(dashboardsFrameLayout);
        dashboardsFrameLayout.setHorizontalGroup(
            dashboardsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardsFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addGap(57, 57, 57))
        );
        dashboardsFrameLayout.setVerticalGroup(
            dashboardsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardsFrameLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(dashboardsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel45)
                    .addComponent(jLabel44))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        helpMenu.setTitle("Help");
        helpMenu.setMinimumSize(new java.awt.Dimension(480, 750));
        helpMenu.setName("helpDialog"); // NOI18N
        helpMenu.setPreferredSize(new java.awt.Dimension(480, 750));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel17.setText("ProMA+");

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        addcvTab.setBackground(new java.awt.Color(255, 255, 255));

        addcvScrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        addcvScrollPanel.setBorder(null);
        addcvScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        addcvScrollPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        addcvScrollPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        addcvScrollTextArea.setEditable(false);
        addcvScrollTextArea.setColumns(20);
        addcvScrollTextArea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        addcvScrollTextArea.setLineWrap(true);
        addcvScrollTextArea.setRows(5);
        addcvScrollTextArea.setText("How to create a new Profile.\n\n1.- Click on the \"Add CV\" Icon. Now you will have a new window which you will use to fill the information \nrequired.\n\n2.- In the new window select the type of applicant in\nthe upper part, you can choose one between Manager, Engineer, Technician and Administrative.\n\n3.- Below you will see three tabs, in \"Personal informati- on\" type the the information required in the Text fields and choose the gender of the applicant, in the next\ntwo tabs you need to enter the information that the \nsystem will use to calculate the overall applicant’s points \nbased on a standardized evaluation criteria. In the tab of “Education” type in the Text field the names of langua- ges and degrees then select the corresponding number of languages and degrees in the right part, below you \ncan write additional remarks. In the tab of “Professional \nExperience” type the jobs the applicant has had and \nselect in the right side how many years has the applicantworked in every job. Click on the \"Clear\" button to erasethe information introduced in the current tab.\n\n4.- In the right side there is a panel where you see the points the applicant reached according to the informati- on you entered, click on the green arrow to get the \nnumber of points.\n\n5.- In the last panel click on the “save” button to store\nthe information of the applicant in the database. Click onthe “Clear All” button to erase all the information \nintroduced this is very useful when you want to create many profiles of applicants. \nClick on the “Home” button to return.\n");
        addcvScrollPanel.setViewportView(addcvScrollTextArea);

        javax.swing.GroupLayout addcvTabLayout = new javax.swing.GroupLayout(addcvTab);
        addcvTab.setLayout(addcvTabLayout);
        addcvTabLayout.setHorizontalGroup(
            addcvTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addcvScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );
        addcvTabLayout.setVerticalGroup(
            addcvTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addcvScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/my/homePage/icons/add_person_small.png")), addcvTab); // NOI18N

        browsecvsTab.setBackground(new java.awt.Color(255, 255, 255));

        browsecvScrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        browsecvScrollPanel.setBorder(null);
        browsecvScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        browsecvScrollPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        browsecvScrollTextArea.setEditable(false);
        browsecvScrollTextArea.setColumns(20);
        browsecvScrollTextArea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        browsecvScrollTextArea.setLineWrap(true);
        browsecvScrollTextArea.setRows(5);
        browsecvScrollTextArea.setText("Searching Applicants\n\n1.- Click on the Browse CV's Icon. The next window will show you a list with all the applicants stored in the data-base. \n\n2.- Click on the applicant of your interest to see detailed information. Here the information will be separated into 4 different tabs:\n -Basic info\n-Contact\n-Education\n-Work experience\nClick on the tab you want to see detailed information.\n\n3.- You also have the possibility to create a PDF file with all the information about the selected applicant. Click on the \"Export to PDF\" button to execute this operation. \nThe location of the file created will be indicated.\n\n4.- Click on the “Delete entry” button to delete the se-\nlected applicant from the database.\n\n5.- If you are done in this window or simply you want to return to the main menu click on the \"Home\" Button.\n");
        browsecvScrollTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        browsecvScrollPanel.setViewportView(browsecvScrollTextArea);

        javax.swing.GroupLayout browsecvsTabLayout = new javax.swing.GroupLayout(browsecvsTab);
        browsecvsTab.setLayout(browsecvsTabLayout);
        browsecvsTabLayout.setHorizontalGroup(
            browsecvsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(browsecvScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );
        browsecvsTabLayout.setVerticalGroup(
            browsecvsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(browsecvScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/my/homePage/icons/stored_data_small.png")), browsecvsTab); // NOI18N

        dashboardsTab.setBackground(new java.awt.Color(255, 255, 255));
        dashboardsTab.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        dashboardsScrollPanel.setBorder(null);
        dashboardsScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dashboardsScrollPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        dashboardsTextArea.setEditable(false);
        dashboardsTextArea.setColumns(20);
        dashboardsTextArea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dashboardsTextArea.setLineWrap(true);
        dashboardsTextArea.setRows(5);
        dashboardsTextArea.setText("Visualizing information\n\nProMA also includes a menu to see all the information of the applicants organized into five different classifications and represented by Pie charts which display the informa-tion in percentage as well as Bar charts which display theinformation in quantities. \n\nThe classifications are: \n-Education\n-Total points\n-Experience\n-Profession \n-Gender\n\nClick on the one you need information to show a chart.  \n");
        dashboardsScrollPanel.setViewportView(dashboardsTextArea);

        javax.swing.GroupLayout dashboardsTabLayout = new javax.swing.GroupLayout(dashboardsTab);
        dashboardsTab.setLayout(dashboardsTabLayout);
        dashboardsTabLayout.setHorizontalGroup(
            dashboardsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardsScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );
        dashboardsTabLayout.setVerticalGroup(
            dashboardsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardsScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/my/homePage/icons/add_chart_small.png")), dashboardsTab); // NOI18N

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Description");

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/homePage/icons/project_manager.jpg"))); // NOI18N

        javax.swing.GroupLayout helpMenuLayout = new javax.swing.GroupLayout(helpMenu.getContentPane());
        helpMenu.getContentPane().setLayout(helpMenuLayout);
        helpMenuLayout.setHorizontalGroup(
            helpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpMenuLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(helpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTabbedPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, helpMenuLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14))
                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        helpMenuLayout.setVerticalGroup(
            helpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, helpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53)
                .addGap(24, 24, 24)
                .addGroup(helpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Add");

        helpMenu.getAccessibleContext().setAccessibleName("helpDialog");
        helpMenu.getAccessibleContext().setAccessibleDescription("helpDialog");

        aboutMenu.setTitle("About Us");
        aboutMenu.setMinimumSize(new java.awt.Dimension(1020, 550));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField1.setText("ABOUT US");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("ProMa+ (Maintenance Practitioners Recruitment Tool - MPRT)\nVersion: MPRT.1.000 \n\nProject Group for the course of Software Engineering\n\nGroup C:\n\nOwais Fazal Syed         976901\nHamza Bilal                   976163\nMustafa Shuqair            976228\nGeorgi Georgiev            977890\nCarlos Domínguez       976558\n\nSupervisor: Prof. Dr.-Ing. Madjid Fathi\nSupervisor2: M.Sc. Fazel Ansari\n\nInstitute of Knowledge Based Systems and Knowledge Management\nFaculty of Science and Technology, University of Siegen, Germany\n\nWinter Semester 2012/13\n\n\n© 2012-2013 | All right reserved for University of Siegen");
        jScrollPane7.setViewportView(jTextArea1);

        javax.swing.GroupLayout aboutMenuLayout = new javax.swing.GroupLayout(aboutMenu.getContentPane());
        aboutMenu.getContentPane().setLayout(aboutMenuLayout);
        aboutMenuLayout.setHorizontalGroup(
            aboutMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(aboutMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addContainerGap())
        );
        aboutMenuLayout.setVerticalGroup(
            aboutMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ProMA+");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("mainFrame"); // NOI18N

        footerPanel.setOpaque(false);

        quitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/homePage/icons/quit_button.png"))); // NOI18N
        quitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        quitButton.setOpaque(false);
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        aboutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/homePage/icons/info_button.png"))); // NOI18N
        aboutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        aboutButton.setOpaque(false);
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });

        aboutusLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        aboutusLabel.setForeground(new java.awt.Color(255, 255, 255));
        aboutusLabel.setText("About Us");

        quitLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        quitLabel.setForeground(new java.awt.Color(255, 255, 255));
        quitLabel.setText("Quit");

        javax.swing.GroupLayout footerPanelLayout = new javax.swing.GroupLayout(footerPanel);
        footerPanel.setLayout(footerPanelLayout);
        footerPanelLayout.setHorizontalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerPanelLayout.createSequentialGroup()
                .addGroup(footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(footerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(aboutButton))
                    .addGroup(footerPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(aboutusLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(footerPanelLayout.createSequentialGroup()
                        .addComponent(quitButton)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerPanelLayout.createSequentialGroup()
                        .addComponent(quitLabel)
                        .addGap(43, 43, 43))))
        );
        footerPanelLayout.setVerticalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aboutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aboutusLabel)
                    .addComponent(quitLabel)))
        );

        headerPanel.setOpaque(false);

        helpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/homePage/icons/help_support.png"))); // NOI18N
        helpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        helpButton.setOpaque(false);
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        helpLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        helpLabel.setForeground(new java.awt.Color(255, 255, 255));
        helpLabel.setText("Help");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(helpButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(helpLabel)
                .addGap(44, 44, 44))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(helpButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        middlePanel.setOpaque(false);
        middlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addNewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/homePage/icons/add_person.png"))); // NOI18N
        addNewButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addNewButton.setMaximumSize(null);
        addNewButton.setMinimumSize(null);
        addNewButton.setOpaque(false);
        addNewButton.setPreferredSize(new java.awt.Dimension(128, 128));
        addNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewButtonActionPerformed(evt);
            }
        });
        middlePanel.add(addNewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 13, 140, 140));

        showButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/homePage/icons/stored_data.png"))); // NOI18N
        showButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        showButton.setOpaque(false);
        showButton.setPreferredSize(new java.awt.Dimension(128, 128));
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });
        middlePanel.add(showButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 13, 140, 140));

        dashboardsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/homePage/icons/add_chart.png"))); // NOI18N
        dashboardsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dashboardsButton.setOpaque(false);
        dashboardsButton.setPreferredSize(new java.awt.Dimension(128, 128));
        dashboardsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardsButtonActionPerformed(evt);
            }
        });
        middlePanel.add(dashboardsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 13, 140, 140));

        addCVLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addCVLabel.setForeground(new java.awt.Color(255, 255, 255));
        addCVLabel.setText("Add CV");
        middlePanel.add(addCVLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 160, -1, -1));

        browseLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        browseLabel.setForeground(new java.awt.Color(255, 255, 255));
        browseLabel.setText("Browse CVs");
        middlePanel.add(browseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 160, -1, -1));

        dashboardsLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        dashboardsLabel.setForeground(new java.awt.Color(255, 255, 255));
        dashboardsLabel.setText("Dashboards");
        middlePanel.add(dashboardsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 160, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/homePage/icons/F14-wallpaper-remix-em-rev2-dark-nosupernova.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(middlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(802, 802, 802)
                .addComponent(footerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(914, 914, 914)
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(middlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addComponent(footerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitButtonActionPerformed

    private void addNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewButtonActionPerformed
        /*   Toolkit tk = Toolkit.getDefaultToolkit();
         int xSize = ((int) tk.getScreenSize().getWidth());
         int ySize = ((int) tk.getScreenSize().getHeight());
         addcvFrame.setSize(xSize, ySize); */
        close();
        Addcv_frame a = new Addcv_frame();
        a.setVisible(true);
        //browsecvFrame.setVisible(true);
        a.setLocationRelativeTo(null); // centering
        a.setExtendedState(a.getBaseline(1055, 500));
       //addcvFrame.setVisible(true);
       // addcvFrame.setLocationRelativeTo(null); // centering
        //addcvFrame.setExtendedState(addcvFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);


    }//GEN-LAST:event_addNewButtonActionPerformed

    private void input_birthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_birthdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_birthdayActionPerformed

    private void input_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_nameActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        helpMenu.setVisible(true);
        helpMenu.setLocationRelativeTo(null);

        //    jDialog1.getContentPane().setBackground(Color.WHITE);
    }//GEN-LAST:event_helpButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        input_name.setText("");
        input_surname.setText("");
        input_nationality.setText("");
        input_living.setText("");
        input_phone.setText("");
        input_birthday.setText("");
        input_mail.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        input_job2.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void action_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_action_cancelActionPerformed
        addcvFrame.dispose();
    }//GEN-LAST:event_action_cancelActionPerformed

    private void action_clearallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_action_clearallActionPerformed
        jComboBox1.setSelectedIndex(0); //upper panel
        input_name.setText("");
        input_surname.setText("");
        input_nationality.setText("");
        input_living.setText("");
        input_phone.setText("");
        input_birthday.setText("");
        input_mail.setText("");
       // jTextArea1.setText(""); //panel2
        input_job2.setText(""); //panel3
        jToggleButton1.setSelected(false); //togglebuttons set to 0
        jToggleButton2.setSelected(false);
        jToggleButton3.setSelected(false);
        jSlider1.setValue(0); //set the sliders to default position
        jSlider2.setValue(0); 
    }//GEN-LAST:event_action_clearallActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        aboutMenu.setVisible(true);
        aboutMenu.setLocationRelativeTo(null);
        aboutMenu.getContentPane().setBackground(Color.WHITE);
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showButtonActionPerformed
        close();
        Browse_frame s = new Browse_frame();
        s.setVisible(true);
        //browsecvFrame.setVisible(true);
        s.setLocationRelativeTo(null); // centering
        s.setExtendedState(s.getBaseline(1055, 500));
    }//GEN-LAST:event_showButtonActionPerformed

    private void dashboardsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardsButtonActionPerformed
        //dashboardsFrame.setVisible(true);
        //dashboardsFrame.setLocationRelativeTo(null);
        close();
        Dashboards_jframe d = new Dashboards_jframe();
        d.setVisible(true);
        //browsecvFrame.setVisible(true);
        d.setLocationRelativeTo(null); // centering
        //d.setExtendedState(d.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        d.setExtendedState(d.getBaseline(1056, 500));
    }//GEN-LAST:event_dashboardsButtonActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //      jTextArea1.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void action_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_action_saveActionPerformed
        try
        {
            String sql = "INSERT INTO applicants (Name, Surname, Birthday, Nationality, Living, Phone, Mail, School, University, Additional, Job1, Job2) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pst = conn.prepareStatement(sql);
            //pst.setString(1, txt_employeeid.getText());
            pst.setString(2, input_name.getText());
            pst.setString(3, input_surname.getText());
            pst.setString(4, input_birthday.getText());
            pst.setString(5, input_nationality.getText());
            pst.setString(6, input_living.getText());
            pst.setString(7, input_phone.getText());
            pst.setString(8, input_mail.getText());
            pst.setString(9, input_school.getText());
            pst.setString(10, input_uni.getText());
            pst.setString(11, input_additional.getText());
            pst.setString(12, input_job1.getText());
            pst.setString(13, input_job2.getText());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Data saved");
        }
        catch(Exception e)
                {
                  JOptionPane.showMessageDialog(null, e);
                }
//        Update_table(); 
    }//GEN-LAST:event_action_saveActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homePage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutButton;
    private javax.swing.JDialog aboutMenu;
    private javax.swing.JLabel aboutusLabel;
    private javax.swing.JButton action_cancel;
    private javax.swing.JButton action_clearall;
    private javax.swing.JButton action_save;
    private javax.swing.JLabel addCVLabel;
    private javax.swing.JButton addNewButton;
    private javax.swing.JFrame addcvFrame;
    private javax.swing.JScrollPane addcvScrollPanel;
    private javax.swing.JTextArea addcvScrollTextArea;
    private javax.swing.JPanel addcvTab;
    private javax.swing.JFrame analysisFrame;
    private javax.swing.JPanel birthPanel;
    private javax.swing.JLabel browseLabel;
    private javax.swing.JFrame browsecvFrame;
    private javax.swing.JScrollPane browsecvScrollPanel;
    private javax.swing.JTextArea browsecvScrollTextArea;
    private javax.swing.JPanel browsecvsTab;
    private javax.swing.JButton dashboardsButton;
    private javax.swing.JFrame dashboardsFrame;
    private javax.swing.JLabel dashboardsLabel;
    private javax.swing.JScrollPane dashboardsScrollPanel;
    private javax.swing.JPanel dashboardsTab;
    private javax.swing.JTextArea dashboardsTextArea;
    private javax.swing.JPanel educationPanel;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel helpLabel;
    private javax.swing.JDialog helpMenu;
    private javax.swing.JTextArea input_additional;
    private javax.swing.JTextField input_birthday;
    private javax.swing.JTextArea input_job1;
    private javax.swing.JTextArea input_job2;
    private javax.swing.JTextField input_living;
    private javax.swing.JTextField input_mail;
    private javax.swing.JTextField input_name;
    private javax.swing.JTextField input_nationality;
    private javax.swing.JTextField input_phone;
    private javax.swing.JTextField input_school;
    private javax.swing.JTextField input_surname;
    private javax.swing.JTextField input_uni;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JPanel middlePanel;
    private javax.swing.JPanel personalInfoPanel;
    private javax.swing.JPanel profExpPanel;
    private javax.swing.JButton quitButton;
    private javax.swing.JLabel quitLabel;
    private javax.swing.JButton showButton;
    private javax.swing.JPanel sliderPanel;
    private javax.swing.JTable tableEmployee;
    // End of variables declaration//GEN-END:variables

}
