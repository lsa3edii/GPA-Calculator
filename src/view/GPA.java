package view;

import controller.*;
import javax.swing.JOptionPane;

public class GPA extends javax.swing.JFrame {

    int hours2, hours3, hoursProject, fail2, fail3, failProject;
    Repository repo = new GPA_Equation();

    public GPA() {
        initComponents();
        setSelectionButton();
        setDisableButton();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        exitApp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sub1_button1 = new javax.swing.JRadioButton();
        currentTermGPA = new javax.swing.JLabel();
        jLable7 = new javax.swing.JLabel();
        cumulativeGPA = new javax.swing.JLabel();
        sub1_button2 = new javax.swing.JRadioButton();
        text1 = new javax.swing.JLabel();
        sub2_button1 = new javax.swing.JRadioButton();
        grade2 = new javax.swing.JComboBox<>();
        sub2_button2 = new javax.swing.JRadioButton();
        text2 = new javax.swing.JLabel();
        sub3_button1 = new javax.swing.JRadioButton();
        sub3_button2 = new javax.swing.JRadioButton();
        grade3 = new javax.swing.JComboBox<>();
        text3 = new javax.swing.JLabel();
        text4 = new javax.swing.JLabel();
        sub4_button2 = new javax.swing.JRadioButton();
        sub4_button1 = new javax.swing.JRadioButton();
        grade4 = new javax.swing.JComboBox<>();
        grade5 = new javax.swing.JComboBox<>();
        sub5_button2 = new javax.swing.JRadioButton();
        text5 = new javax.swing.JLabel();
        sub5_button1 = new javax.swing.JRadioButton();
        sub6_button1 = new javax.swing.JRadioButton();
        sub6_button2 = new javax.swing.JRadioButton();
        grade6 = new javax.swing.JComboBox<>();
        text6 = new javax.swing.JLabel();
        subject1 = new javax.swing.JCheckBox();
        subject2 = new javax.swing.JCheckBox();
        subject3 = new javax.swing.JCheckBox();
        subject4 = new javax.swing.JCheckBox();
        subject5 = new javax.swing.JCheckBox();
        subject6 = new javax.swing.JCheckBox();
        previousCompletedHours = new javax.swing.JTextField();
        previousGPA = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        subjectGPA5 = new javax.swing.JLabel();
        subjectGPA6 = new javax.swing.JLabel();
        subjectGPA4 = new javax.swing.JLabel();
        subjectGPA3 = new javax.swing.JLabel();
        subjectGPA2 = new javax.swing.JLabel();
        subjectGPA1 = new javax.swing.JLabel();
        hour = new javax.swing.JLabel();
        selectAll = new javax.swing.JRadioButton();
        grade1 = new javax.swing.JComboBox<>();
        icon1 = new javax.swing.JLabel();
        graduationProject = new javax.swing.JCheckBox();
        projectGrade = new javax.swing.JComboBox<>();
        project_button = new javax.swing.JRadioButton();
        projectText = new javax.swing.JLabel();
        projectGPA = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        exitApp.setBackground(new java.awt.Color(255, 255, 254));
        exitApp.setFont(new java.awt.Font("Century Schoolbook", 3, 27)); // NOI18N
        exitApp.setForeground(new java.awt.Color(51, 153, 255));
        exitApp.setText("X");
        exitApp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitAppMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("\"GPA Calculator\" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(331, 331, 331)
                .addComponent(exitApp, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(exitApp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Previous GPA");

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Previous Completed Hours");

        sub1_button1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(sub1_button1);
        sub1_button1.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        sub1_button1.setForeground(new java.awt.Color(0, 153, 255));
        sub1_button1.setText("2 Hours");

        currentTermGPA.setFont(new java.awt.Font("Century Schoolbook", 3, 20)); // NOI18N
        currentTermGPA.setForeground(new java.awt.Color(0, 153, 204));
        currentTermGPA.setText("Current Term GPA → 0.00");

        jLable7.setFont(new java.awt.Font("Century Schoolbook", 3, 20)); // NOI18N
        jLable7.setForeground(new java.awt.Color(0, 153, 204));
        jLable7.setText("Hours →");

        cumulativeGPA.setFont(new java.awt.Font("Century Schoolbook", 3, 20)); // NOI18N
        cumulativeGPA.setForeground(new java.awt.Color(0, 153, 204));
        cumulativeGPA.setText("Cumulative GPA → 0.00");

        sub1_button2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(sub1_button2);
        sub1_button2.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        sub1_button2.setForeground(new java.awt.Color(0, 153, 255));
        sub1_button2.setText("3 Hours");

        text1.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        text1.setForeground(new java.awt.Color(0, 153, 255));
        text1.setText("Subject GPA → ");

        sub2_button1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(sub2_button1);
        sub2_button1.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        sub2_button1.setForeground(new java.awt.Color(0, 153, 255));
        sub2_button1.setText("2 Hours");

        grade2.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        grade2.setForeground(new java.awt.Color(0, 153, 255));
        grade2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade", "A+", "A", "B+", "B", "C+", "C", "D+", "D", "F" }));
        grade2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade2ActionPerformed(evt);
            }
        });

        sub2_button2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(sub2_button2);
        sub2_button2.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        sub2_button2.setForeground(new java.awt.Color(0, 153, 255));
        sub2_button2.setText("3 Hours");

        text2.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        text2.setForeground(new java.awt.Color(0, 153, 255));
        text2.setText("Subject GPA → ");

        sub3_button1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(sub3_button1);
        sub3_button1.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        sub3_button1.setForeground(new java.awt.Color(0, 153, 255));
        sub3_button1.setText("2 Hours");

        sub3_button2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(sub3_button2);
        sub3_button2.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        sub3_button2.setForeground(new java.awt.Color(0, 153, 255));
        sub3_button2.setText("3 Hours");

        grade3.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        grade3.setForeground(new java.awt.Color(0, 153, 255));
        grade3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade", "A+", "A", "B+", "B", "C+", "C", "D+", "D", "F" }));
        grade3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade3ActionPerformed(evt);
            }
        });

        text3.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        text3.setForeground(new java.awt.Color(0, 153, 255));
        text3.setText("Subject GPA → ");

        text4.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        text4.setForeground(new java.awt.Color(0, 153, 255));
        text4.setText("Subject GPA → ");

        sub4_button2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(sub4_button2);
        sub4_button2.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        sub4_button2.setForeground(new java.awt.Color(0, 153, 255));
        sub4_button2.setText("3 Hours");

        sub4_button1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(sub4_button1);
        sub4_button1.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        sub4_button1.setForeground(new java.awt.Color(0, 153, 255));
        sub4_button1.setText("2 Hours");

        grade4.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        grade4.setForeground(new java.awt.Color(0, 153, 255));
        grade4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade", "A+", "A", "B+", "B", "C+", "C", "D+", "D", "F" }));
        grade4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade4ActionPerformed(evt);
            }
        });

        grade5.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        grade5.setForeground(new java.awt.Color(0, 153, 255));
        grade5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade", "A+", "A", "B+", "B", "C+", "C", "D+", "D", "F" }));
        grade5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade5ActionPerformed(evt);
            }
        });

        sub5_button2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup5.add(sub5_button2);
        sub5_button2.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        sub5_button2.setForeground(new java.awt.Color(0, 153, 255));
        sub5_button2.setText("3 Hours");

        text5.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        text5.setForeground(new java.awt.Color(0, 153, 255));
        text5.setText("Subject GPA → ");

        sub5_button1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup5.add(sub5_button1);
        sub5_button1.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        sub5_button1.setForeground(new java.awt.Color(0, 153, 255));
        sub5_button1.setText("2 Hours");

        sub6_button1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup6.add(sub6_button1);
        sub6_button1.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        sub6_button1.setForeground(new java.awt.Color(0, 153, 255));
        sub6_button1.setText("2 Hours");

        sub6_button2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup6.add(sub6_button2);
        sub6_button2.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        sub6_button2.setForeground(new java.awt.Color(0, 153, 255));
        sub6_button2.setText("3 Hours");

        grade6.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        grade6.setForeground(new java.awt.Color(0, 153, 255));
        grade6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade", "A+", "A", "B+", "B", "C+", "C", "D+", "D", "F" }));
        grade6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade6ActionPerformed(evt);
            }
        });

        text6.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        text6.setForeground(new java.awt.Color(0, 153, 255));
        text6.setText("Subject GPA → ");

        subject1.setBackground(new java.awt.Color(255, 255, 255));
        subject1.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        subject1.setForeground(new java.awt.Color(0, 153, 255));
        subject1.setText("Subject : 1");
        subject1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subject1MouseClicked(evt);
            }
        });

        subject2.setBackground(new java.awt.Color(255, 255, 255));
        subject2.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        subject2.setForeground(new java.awt.Color(0, 153, 255));
        subject2.setText("Subject : 2");
        subject2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subject2MouseClicked(evt);
            }
        });

        subject3.setBackground(new java.awt.Color(255, 255, 255));
        subject3.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        subject3.setForeground(new java.awt.Color(0, 153, 255));
        subject3.setText("Subject : 3");
        subject3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subject3MouseClicked(evt);
            }
        });

        subject4.setBackground(new java.awt.Color(255, 255, 255));
        subject4.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        subject4.setForeground(new java.awt.Color(0, 153, 255));
        subject4.setText("Subject : 4");
        subject4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subject4MouseClicked(evt);
            }
        });

        subject5.setBackground(new java.awt.Color(255, 255, 255));
        subject5.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        subject5.setForeground(new java.awt.Color(0, 153, 255));
        subject5.setText("Subject : 5");
        subject5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subject5MouseClicked(evt);
            }
        });

        subject6.setBackground(new java.awt.Color(255, 255, 255));
        subject6.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        subject6.setForeground(new java.awt.Color(0, 153, 255));
        subject6.setText("Subject : 6");
        subject6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subject6MouseClicked(evt);
            }
        });

        previousCompletedHours.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        previousCompletedHours.setForeground(new java.awt.Color(0, 153, 255));
        previousCompletedHours.setText("0");

        previousGPA.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        previousGPA.setForeground(new java.awt.Color(0, 153, 255));
        previousGPA.setText("0");

        calculate.setBackground(new java.awt.Color(255, 255, 254));
        calculate.setFont(new java.awt.Font("Century Schoolbook", 3, 25)); // NOI18N
        calculate.setForeground(new java.awt.Color(51, 153, 255));
        calculate.setText("Calculate");
        calculate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calculate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculateMouseClicked(evt);
            }
        });

        subjectGPA5.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        subjectGPA5.setForeground(new java.awt.Color(0, 153, 255));
        subjectGPA5.setText("0.0");

        subjectGPA6.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        subjectGPA6.setForeground(new java.awt.Color(0, 153, 255));
        subjectGPA6.setText("0.0");

        subjectGPA4.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        subjectGPA4.setForeground(new java.awt.Color(0, 153, 255));
        subjectGPA4.setText("0.0");

        subjectGPA3.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        subjectGPA3.setForeground(new java.awt.Color(0, 153, 255));
        subjectGPA3.setText("0.0");

        subjectGPA2.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        subjectGPA2.setForeground(new java.awt.Color(0, 153, 255));
        subjectGPA2.setText("0.0");

        subjectGPA1.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        subjectGPA1.setForeground(new java.awt.Color(0, 153, 255));
        subjectGPA1.setText("0.0");

        hour.setFont(new java.awt.Font("Century Schoolbook", 3, 20)); // NOI18N
        hour.setForeground(new java.awt.Color(0, 153, 204));
        hour.setText("0");

        selectAll.setBackground(new java.awt.Color(255, 255, 255));
        selectAll.setFont(new java.awt.Font("Century Schoolbook", 3, 19)); // NOI18N
        selectAll.setText("Select All");
        selectAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectAllMouseClicked(evt);
            }
        });

        grade1.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        grade1.setForeground(new java.awt.Color(0, 153, 255));
        grade1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade", "A+", "A", "B+", "B", "C+", "C", "D+", "D", "F" }));
        grade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade1ActionPerformed(evt);
            }
        });

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-gpa-calculator-64.png"))); // NOI18N

        graduationProject.setBackground(new java.awt.Color(255, 255, 255));
        graduationProject.setFont(new java.awt.Font("Century Schoolbook", 3, 17)); // NOI18N
        graduationProject.setText("Graduation Project");
        graduationProject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                graduationProjectMouseClicked(evt);
            }
        });

        projectGrade.setFont(new java.awt.Font("Century Schoolbook", 3, 17)); // NOI18N
        projectGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade", "A+", "A", "B+", "B", "C+", "C", "D+", "D", "F" }));
        projectGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectGradeActionPerformed(evt);
            }
        });

        project_button.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup7.add(project_button);
        project_button.setFont(new java.awt.Font("Century Schoolbook", 3, 17)); // NOI18N
        project_button.setText("6 Hours");

        projectText.setFont(new java.awt.Font("Century Schoolbook", 3, 17)); // NOI18N
        projectText.setText("Project GPA → ");

        projectGPA.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        projectGPA.setText("0.0");

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-bachelors-degree-50.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(icon1)
                        .addGap(192, 192, 192)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(previousGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(previousCompletedHours, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(271, 271, 271))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectAll)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subject1)
                                    .addComponent(grade1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sub1_button1)
                                    .addComponent(sub1_button2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(text1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(subjectGPA1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sub2_button1)
                                            .addComponent(grade2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sub2_button2)
                                            .addComponent(subject2)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(text2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(subjectGPA2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(17, 17, 17)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sub3_button1)
                                            .addComponent(grade3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sub3_button2)
                                            .addComponent(subject3)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(text3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(subjectGPA3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(17, 17, 17)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sub4_button1)
                                            .addComponent(grade4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sub4_button2)
                                            .addComponent(subject4)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(text4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(subjectGPA4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(17, 17, 17)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sub5_button1)
                                            .addComponent(grade5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sub5_button2)
                                            .addComponent(subject5)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(text5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(subjectGPA5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(17, 17, 17)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(subject6)
                                            .addComponent(sub6_button1)
                                            .addComponent(grade6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sub6_button2)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(text6)
                                                .addGap(6, 6, 6)
                                                .addComponent(subjectGPA6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(126, 126, 126)
                                        .addComponent(icon2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(project_button)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(projectText)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(projectGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(4, 4, 4))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(graduationProject)
                                                .addGap(12, 12, 12)
                                                .addComponent(projectGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(calculate)
                        .addGap(464, 464, 464))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLable7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cumulativeGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentTermGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(336, 336, 336))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(previousCompletedHours, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(previousGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(icon1))
                .addGap(26, 26, 26)
                .addComponent(currentTermGPA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cumulativeGPA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLable7)
                    .addComponent(hour))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(selectAll)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(graduationProject)
                                    .addComponent(projectGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(projectText)
                                    .addComponent(projectGPA)
                                    .addComponent(project_button)))
                            .addComponent(icon2))
                        .addGap(26, 26, 26)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subject1)
                    .addComponent(subject2)
                    .addComponent(subject3)
                    .addComponent(subject4)
                    .addComponent(subject5)
                    .addComponent(subject6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(grade2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grade1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sub2_button1)
                            .addComponent(sub1_button1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sub2_button2)
                            .addComponent(sub1_button2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(text1)
                                .addComponent(subjectGPA1))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(text2)
                                .addComponent(subjectGPA2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(grade3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sub3_button1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sub3_button2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text3)
                            .addComponent(subjectGPA3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(grade4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sub4_button1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sub4_button2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text4)
                            .addComponent(subjectGPA4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(grade5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sub5_button1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sub5_button2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text5)
                            .addComponent(subjectGPA5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(grade6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sub6_button1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sub6_button2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text6)
                            .addComponent(subjectGPA6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(calculate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void setPreviousData() {
        try {
            repo.data.setPreviousGPA(Double.valueOf(previousGPA.getText()));
        
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Input for 'Previous GPA' is Wrong!\n"
                    + ex.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
            
            previousGPA.setText("0");
        }
        
        try {
            repo.data.setPreviousCompletedHours(Integer.valueOf(previousCompletedHours.getText()));
        
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Input for 'Previous Completed Hours' is Wrong!\n" 
                    + ex.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);

            previousCompletedHours.setText("0");
        }
    }
    
    void setCurrentData() {
        currentTermGPA.setText("Current Term GPA → " + Math.round(repo.calculateTermGPA() * 1000) / 1000.0);
        cumulativeGPA.setText("Cumulative GPA → " + Math.round(repo.calculateCumulativeGPA() * 1000) / 1000.0);
        hour.setText("" + (Integer.valueOf(previousCompletedHours.getText()) + hours2 + hours3 + hoursProject 
                - (fail2 + fail3 + failProject)) );
    }
    
    void setSelectionButton() {
        sub1_button2.setSelected(true); sub2_button2.setSelected(true); sub3_button2.setSelected(true);
        sub4_button2.setSelected(true); sub5_button2.setSelected(true); sub6_button2.setSelected(true);
        project_button.setSelected(true);
    }
    
    void setDisableButton() {
        grade1.disable(); sub1_button1.setEnabled(false); sub1_button2.setEnabled(false);
        grade2.disable(); sub2_button1.setEnabled(false); sub2_button2.setEnabled(false);
        grade3.disable(); sub3_button1.setEnabled(false); sub3_button2.setEnabled(false);
        grade4.disable(); sub4_button1.setEnabled(false); sub4_button2.setEnabled(false);
        grade5.disable(); sub5_button1.setEnabled(false); sub5_button2.setEnabled(false);
        grade6.disable(); sub6_button1.setEnabled(false); sub6_button2.setEnabled(false);

        subjectGPA1.setEnabled(false); text1.setEnabled(false);
        subjectGPA2.setEnabled(false); text2.setEnabled(false);
        subjectGPA3.setEnabled(false); text3.setEnabled(false);
        subjectGPA4.setEnabled(false); text4.setEnabled(false);
        subjectGPA5.setEnabled(false); text5.setEnabled(false);
        subjectGPA6.setEnabled(false); text6.setEnabled(false);
        
        projectGrade.disable(); project_button.setEnabled(false);
        projectText.setEnabled(false); projectGPA.setEnabled(false);
    }
    
    void removeData() {
        hours2 = 0; hours3 = 0; fail2 = 0; fail3 = 0;
        hoursProject = 0; failProject = 0;

        repo.subject.setGPA1_hour2(0); repo.subject.setGPA2_hour2(0); repo.subject.setGPA3_hour2(0);
        repo.subject.setGPA4_hour2(0); repo.subject.setGPA5_hour2(0); repo.subject.setGPA6_hour2(0);

        repo.subject.setGPA1_hour3(0); repo.subject.setGPA2_hour3(0); repo.subject.setGPA3_hour3(0);
        repo.subject.setGPA4_hour3(0); repo.subject.setGPA5_hour3(0); repo.subject.setGPA6_hour3(0);

        repo.subject.setProjectGPA_hour6(0);
    }
    
    private void projectGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectGradeActionPerformed
        repo.gradeType(projectGrade.getSelectedItem().toString());
        projectGPA.setText("" + repo.subject.getSubjectGPA());
    }//GEN-LAST:event_projectGradeActionPerformed

    private void graduationProjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graduationProjectMouseClicked
        if(graduationProject.isSelected()) {
            projectGrade.setEnabled(true); project_button.setEnabled(true);
            projectText.setEnabled(true); projectGPA.setEnabled(true); }
        else {
            projectGrade.setEnabled(false); project_button.setEnabled(false);
            projectText.setEnabled(false); projectGPA.setEnabled(false); }
    }//GEN-LAST:event_graduationProjectMouseClicked

    private void grade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade1ActionPerformed
        repo.gradeType(grade1.getSelectedItem().toString());
        subjectGPA1.setText("" + repo.subject.getSubjectGPA());
    }//GEN-LAST:event_grade1ActionPerformed

    private void selectAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectAllMouseClicked
        if(selectAll.isSelected()) {
            subject1.setSelected(true); subject2.setSelected(true); subject3.setSelected(true);
            subject4.setSelected(true); subject5.setSelected(true); subject6.setSelected(true);

        } else {
            subject1.setSelected(false); subject2.setSelected(false); subject3.setSelected(false);
            subject4.setSelected(false); subject5.setSelected(false); subject6.setSelected(false);
        }

        this.subject1MouseClicked(evt);
        this.subject2MouseClicked(evt);
        this.subject3MouseClicked(evt);
        this.subject4MouseClicked(evt);
        this.subject5MouseClicked(evt);
        this.subject6MouseClicked(evt);
    }//GEN-LAST:event_selectAllMouseClicked

    private void calculateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateMouseClicked
        setPreviousData();

        if(Double.valueOf(previousGPA.getText()) > 4.0)
                JOptionPane.showMessageDialog(null, "'Previous GPA → " + previousGPA.getText() + "' Must be Less than or Equal to 4");
        
        else if (subject1.isSelected() == false && subject2.isSelected() == false && subject3.isSelected() == false
                && subject4.isSelected() == false && subject5.isSelected() == false && subject6.isSelected() == false
                && !graduationProject.isSelected())
            JOptionPane.showMessageDialog(null, "Please Complete your Information!!");

        else {
            if(!previousGPA.getText().isEmpty() && !previousCompletedHours.getText().isEmpty()
                && (!previousGPA.getText().isEmpty() || !previousCompletedHours.getText().isEmpty() )) {

                if(subject1.isSelected() && !grade1.getSelectedItem().equals("Grade")) {

                    if(sub1_button1.isSelected()) {
                        repo.subject.setGPA1_hour2(Double.valueOf(subjectGPA1.getText()));
                        hours2 = hours2 + 2;
                    }
                    else {
                        repo.subject.setGPA1_hour3(Double.valueOf(subjectGPA1.getText()));
                        hours3 = hours3 + 3;
                    }

                    if(grade1.getSelectedItem().equals("F") && sub1_button1.isSelected())
                        fail2 = fail2 + 2;

                    else if(grade1.getSelectedItem().equals("F"))
                        fail3 = fail3 + 3;
                }

                if(subject2.isSelected() && !grade2.getSelectedItem().equals("Grade")) {

                    if(sub2_button1.isSelected()) {
                        repo.subject.setGPA2_hour2(Double.valueOf(subjectGPA2.getText()));
                        hours2 = hours2 + 2;
                    }
                    else {
                        repo.subject.setGPA2_hour3(Double.valueOf(subjectGPA2.getText()));
                        hours3 = hours3 + 3;
                    }

                    if(grade2.getSelectedItem().equals("F") && sub2_button1.isSelected())
                        fail2 = fail2 + 2;

                    else if(grade2.getSelectedItem().equals("F"))
                        fail3 = fail3 + 3;
                }

                if(subject3.isSelected() && !grade3.getSelectedItem().equals("Grade")) {

                    if(sub3_button1.isSelected()) {
                        repo.subject.setGPA3_hour2(Double.valueOf(subjectGPA3.getText()));
                        hours2 = hours2 + 2;
                    }
                    else {
                        repo.subject.setGPA3_hour3(Double.valueOf(subjectGPA3.getText()));
                        hours3 = hours3 + 3;
                    }

                    if(grade3.getSelectedItem().equals("F") && sub3_button1.isSelected())
                        fail2 = fail2 + 2;

                    else if(grade3.getSelectedItem().equals("F"))
                        fail3 = fail3 + 3;
                }

                if(subject4.isSelected() && !grade4.getSelectedItem().equals("Grade")) {

                    if(sub4_button1.isSelected()) {
                        repo.subject.setGPA4_hour2(Double.valueOf(subjectGPA4.getText()));
                        hours2 = hours2 + 2;
                    }
                    else {
                        repo.subject.setGPA4_hour3(Double.valueOf(subjectGPA4.getText()));
                        hours3 = hours3 + 3;
                    }

                    if(grade4.getSelectedItem().equals("F") && sub4_button1.isSelected())
                        fail2 = fail2 + 2;

                    else if(grade4.getSelectedItem().equals("F"))
                        fail3 = fail3 + 3;
                }

                if(subject5.isSelected() && !grade5.getSelectedItem().equals("Grade")) {

                    if(sub5_button1.isSelected()) {
                        repo.subject.setGPA5_hour2(Double.valueOf(subjectGPA5.getText()));
                        hours2 = hours2 + 2;
                    }
                    else {
                        repo.subject.setGPA5_hour3(Double.valueOf(subjectGPA5.getText()));
                        hours3 = hours3 + 3;
                    }

                    if(grade5.getSelectedItem().equals("F") && sub5_button1.isSelected())
                        fail2 = fail2 + 2;

                    else if(grade5.getSelectedItem().equals("F"))
                        fail3 = fail3 + 3;
                }

                if(subject6.isSelected() && !grade6.getSelectedItem().equals("Grade")) {

                    if(sub6_button1.isSelected()) {
                        repo.subject.setGPA6_hour2(Double.valueOf(subjectGPA6.getText()));
                        hours2 = hours2 + 2;
                    }

                    else {
                        repo.subject.setGPA6_hour3(Double.valueOf(subjectGPA6.getText()));
                        hours3 = hours3 + 3;
                    }

                    if(grade6.getSelectedItem().equals("F") && sub6_button1.isSelected())
                        fail2 = fail2 + 2;

                    else if(grade6.getSelectedItem().equals("F"))
                        fail3 = fail3 + 3;
                }

                if(graduationProject.isSelected() && !projectGrade.getSelectedItem().equals("Grade")) {

                    if(project_button.isSelected()) {
                        repo.subject.setProjectGPA_hour6(Double.valueOf(projectGPA.getText()));
                        hoursProject = 6;
                    }

                    if(projectGrade.getSelectedItem().equals("F"))
                        failProject = 6;
                }
                
            }
        }

        repo.data.setTermHours(hours2 + hours3 + hoursProject);
        setCurrentData();
        removeData();
    }//GEN-LAST:event_calculateMouseClicked

    private void subject6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subject6MouseClicked
        if(subject6.isSelected()) {
            grade6.setEnabled(true); sub6_button1.setEnabled(true); sub6_button2.setEnabled(true);
            subjectGPA6.setEnabled(true); text6.setEnabled(true); }
        else {
            grade6.setEnabled(false); sub6_button1.setEnabled(false); sub6_button2.setEnabled(false);
            subjectGPA6.setEnabled(false); text6.setEnabled(false); }
    }//GEN-LAST:event_subject6MouseClicked

    private void subject5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subject5MouseClicked
        if(subject5.isSelected()) {
            grade5.setEnabled(true); sub5_button1.setEnabled(true); sub5_button2.setEnabled(true);
            subjectGPA5.setEnabled(true); text5.setEnabled(true); }
        else {
            grade5.setEnabled(false); sub5_button1.setEnabled(false); sub5_button2.setEnabled(false);
            subjectGPA5.setEnabled(false); text5.setEnabled(false); }
    }//GEN-LAST:event_subject5MouseClicked

    private void subject4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subject4MouseClicked
        if(subject4.isSelected()) {
            grade4.setEnabled(true); sub4_button1.setEnabled(true); sub4_button2.setEnabled(true);
            subjectGPA4.setEnabled(true); text4.setEnabled(true); }
        else {
            grade4.setEnabled(false); sub4_button1.setEnabled(false); sub4_button2.setEnabled(false);
            subjectGPA4.setEnabled(false); text4.setEnabled(false); }
    }//GEN-LAST:event_subject4MouseClicked

    private void subject3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subject3MouseClicked
        if(subject3.isSelected()) {
            grade3.setEnabled(true); sub3_button1.setEnabled(true); sub3_button2.setEnabled(true);
            subjectGPA3.setEnabled(true); text3.setEnabled(true); }
        else {
            grade3.setEnabled(false); sub3_button1.setEnabled(false); sub3_button2.setEnabled(false);
            subjectGPA3.setEnabled(false); text3.setEnabled(false); }
    }//GEN-LAST:event_subject3MouseClicked

    private void subject2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subject2MouseClicked
        if(subject2.isSelected()) {
            grade2.setEnabled(true); sub2_button1.setEnabled(true); sub2_button2.setEnabled(true);
            subjectGPA2.setEnabled(true); text2.setEnabled(true); }
        else {
            grade2.setEnabled(false); sub2_button1.setEnabled(false); sub2_button2.setEnabled(false);
            subjectGPA2.setEnabled(false); text2.setEnabled(false); }
    }//GEN-LAST:event_subject2MouseClicked

    private void subject1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subject1MouseClicked
        if(subject1.isSelected()) {
            grade1.setEnabled(true); sub1_button1.setEnabled(true); sub1_button2.setEnabled(true);
            subjectGPA1.setEnabled(true); text1.setEnabled(true); }
        else {
            grade1.setEnabled(false); sub1_button1.setEnabled(false); sub1_button2.setEnabled(false);
            subjectGPA1.setEnabled(false); text1.setEnabled(false); }
    }//GEN-LAST:event_subject1MouseClicked

    private void grade6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade6ActionPerformed
        repo.gradeType(grade6.getSelectedItem().toString());
        subjectGPA6.setText("" + repo.subject.getSubjectGPA());
    }//GEN-LAST:event_grade6ActionPerformed

    private void grade5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade5ActionPerformed
        repo.gradeType(grade5.getSelectedItem().toString());
        subjectGPA5.setText("" + repo.subject.getSubjectGPA());
    }//GEN-LAST:event_grade5ActionPerformed

    private void grade4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade4ActionPerformed
        repo.gradeType(grade4.getSelectedItem().toString());
        subjectGPA4.setText("" + repo.subject.getSubjectGPA());
    }//GEN-LAST:event_grade4ActionPerformed

    private void grade3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade3ActionPerformed
        repo.gradeType(grade3.getSelectedItem().toString());
        subjectGPA3.setText("" + repo.subject.getSubjectGPA());
    }//GEN-LAST:event_grade3ActionPerformed

    private void grade2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade2ActionPerformed
        repo.gradeType(grade2.getSelectedItem().toString());
        subjectGPA2.setText("" + repo.subject.getSubjectGPA());
    }//GEN-LAST:event_grade2ActionPerformed

    private void exitAppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitAppMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitAppMouseClicked

    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(GPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        new GPA().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JButton calculate;
    private javax.swing.JLabel cumulativeGPA;
    private javax.swing.JLabel currentTermGPA;
    private javax.swing.JButton exitApp;
    private javax.swing.JComboBox<String> grade1;
    private javax.swing.JComboBox<String> grade2;
    private javax.swing.JComboBox<String> grade3;
    private javax.swing.JComboBox<String> grade4;
    private javax.swing.JComboBox<String> grade5;
    private javax.swing.JComboBox<String> grade6;
    private javax.swing.JCheckBox graduationProject;
    private javax.swing.JLabel hour;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLable7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField previousCompletedHours;
    private javax.swing.JTextField previousGPA;
    private javax.swing.JLabel projectGPA;
    private javax.swing.JComboBox<String> projectGrade;
    private javax.swing.JLabel projectText;
    private javax.swing.JRadioButton project_button;
    private javax.swing.JRadioButton selectAll;
    private javax.swing.JRadioButton sub1_button1;
    private javax.swing.JRadioButton sub1_button2;
    private javax.swing.JRadioButton sub2_button1;
    private javax.swing.JRadioButton sub2_button2;
    private javax.swing.JRadioButton sub3_button1;
    private javax.swing.JRadioButton sub3_button2;
    private javax.swing.JRadioButton sub4_button1;
    private javax.swing.JRadioButton sub4_button2;
    private javax.swing.JRadioButton sub5_button1;
    private javax.swing.JRadioButton sub5_button2;
    private javax.swing.JRadioButton sub6_button1;
    private javax.swing.JRadioButton sub6_button2;
    private javax.swing.JCheckBox subject1;
    private javax.swing.JCheckBox subject2;
    private javax.swing.JCheckBox subject3;
    private javax.swing.JCheckBox subject4;
    private javax.swing.JCheckBox subject5;
    private javax.swing.JCheckBox subject6;
    private javax.swing.JLabel subjectGPA1;
    private javax.swing.JLabel subjectGPA2;
    private javax.swing.JLabel subjectGPA3;
    private javax.swing.JLabel subjectGPA4;
    private javax.swing.JLabel subjectGPA5;
    private javax.swing.JLabel subjectGPA6;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    private javax.swing.JLabel text6;
    // End of variables declaration//GEN-END:variables
}
