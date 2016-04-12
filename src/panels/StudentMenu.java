
package panels;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import testSystem.Course;
import testSystem.MainFrame;
import testSystem.MultChoiceQuestion;
import testSystem.MultipleChoiceTest;
import testSystem.Test;
import testSystem.TestSelector;
import static testSystem.TestSelector.initTest;
import testSystem.TrueFalseQuestion;
import testSystem.TrueFalseTest;
import testSystem.User;

/**
 *
 * @author Alejandro, Alec, Zane, Tucker
 * @version 12/5/14
 *
 */
public class StudentMenu extends javax.swing.JPanel {
    private MainFrame parentFrame;
    private User loggedIn;
    private Test chosenTest;
    private ArrayList<Test> tests;
    private ArrayList<Course> courses;
    private static JFrame testFrame;
    private panels.TrueFalseTestSystem trueFalseTest;
    private panels.MultChoiceTestSystem multChoiceTest;
    private ArrayList<Course> allCourses;
    

    /**
     * Creates new form StudentMenu.
     * @param frame
     */
    public StudentMenu(MainFrame frame) {
        initComponents();
        this.parentFrame = frame;
    }
    
    public void gatherClassesTests() {
        // grab tests from all classes
        if (this.loggedIn != null
                && this.loggedIn.getClasses() != null) {      
                this.allCourses = this.parentFrame.getAllCourses();
            for (Course course : this.loggedIn.getClasses()) {
                this.courses.add(course);
                if (course.hasTests()) {
                    for (Test test : course.getTests()) {
                        this.tests.add(test);
                    } 
                }
            }
        }
    }
    
    public void setUser(User user) throws FileNotFoundException {
        resetListFields();
        String [] testingTests = {"Test1", "Test2"};
        this.loggedIn = user;
        this.nameLabel.setText("Welcome back, " + this.loggedIn.getUsername() + "!");
        this.availableTests.setModel(new DefaultComboBoxModel(testingTests));
        if (this.allCourses != null) {
            for (Course course : this.allCourses) {
                this.allClassesList.addItem(course.getName());
            }
        }
        if (this.loggedIn.getClasses() != null) {
            this.gatherClassesTests();
            this.populateLists();
        }
    }
    
    
    
    
    public void populateLists() {
        
        if (this.tests != null) {
            this.availableTests.setModel(new DefaultComboBoxModel());
            for ( Test test : this.tests) {
                this.availableTests.addItem(test.getName());
            }
            this.testList2.setModel(new DefaultComboBoxModel());
            for ( Test test : this.tests) {
                this.testList2.addItem(test.getName());
            }
        }
            
        if (this.courses != null) {
            this.classList.setModel(new DefaultComboBoxModel());
            for ( Course course : this.courses) {
                this.classList.addItem(course.getName());
            }
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        classList = new javax.swing.JComboBox();
        viewClassButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        allClassesList = new javax.swing.JComboBox();
        enrollButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        availableTests = new javax.swing.JComboBox();
        takeTestButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        testList2 = new javax.swing.JComboBox();
        scoreField = new javax.swing.JTextField();

        setBackground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(860, 560));
        setMinimumSize(new java.awt.Dimension(860, 560));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(860, 560));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/student-icon.png"))); // NOI18N

        nameLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(1, 1, 1));
        nameLabel.setText("Welcome back, [name]!");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("Your enrolled courses:");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Remaining Tests");

        jPanel1.setBackground(new java.awt.Color(82, 187, 231));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        classList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        viewClassButton.setText("View Class");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(classList, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewClassButton)
                .addGap(163, 163, 163))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(classList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewClassButton)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        settingsButton.setText("Account Settings");
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(82, 187, 231));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel2.setMaximumSize(new java.awt.Dimension(270, 39));
        jPanel2.setMinimumSize(new java.awt.Dimension(270, 39));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Enroll in a Course");

        allClassesList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        enrollButton.setText("Enroll");
        enrollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 93, Short.MAX_VALUE))
                    .addComponent(allClassesList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enrollButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(allClassesList, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(enrollButton)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(82, 187, 231));

        availableTests.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        takeTestButton.setText("Take Test");
        takeTestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeTestButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(availableTests, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(takeTestButton)
                        .addGap(170, 170, 170))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(availableTests, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(takeTestButton)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(82, 187, 231));

        jLabel5.setBackground(java.awt.Color.white);
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Test Grades");

        testList2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        testList2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testList2ActionPerformed(evt);
            }
        });

        scoreField.setMaximumSize(new java.awt.Dimension(76, 25));
        scoreField.setMinimumSize(new java.awt.Dimension(76, 25));
        scoreField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                scoreFieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(testList2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scoreField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scoreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testList2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(84, 84, 84))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(177, 177, 177))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(nameLabel)
                                .addGap(115, 115, 115))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel1, jPanel3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(nameLabel)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(settingsButton)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        this.parentFrame.changePanel(this.parentFrame.getAccountSettings(this.loggedIn));
    }//GEN-LAST:event_settingsButtonActionPerformed

    
    
    
    private void takeTestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeTestButtonActionPerformed
        final ArrayList<Test> t;
        try {
            t = initTest("TrueFalseQuestions.txt", "MultipleChoiceQuestions.txt");/* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new TestSelector(t).setVisible(true);
                }
            });
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_takeTestButtonActionPerformed

    private void scoreFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_scoreFieldFocusLost
       
    }//GEN-LAST:event_scoreFieldFocusLost

    private void testList2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testList2ActionPerformed
        if (this.tests != null)
            this.scoreField.setText(this.loggedIn.getGrade(this.testList2.getSelectedIndex()).toString());
    }//GEN-LAST:event_testList2ActionPerformed

    private void enrollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollButtonActionPerformed
        this.loggedIn.getClasses().add(this.allCourses.get(this.allClassesList.getSelectedIndex()));
    }//GEN-LAST:event_enrollButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox allClassesList;
    private javax.swing.JComboBox availableTests;
    private javax.swing.JComboBox classList;
    private javax.swing.JButton enrollButton;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField scoreField;
    private javax.swing.JButton settingsButton;
    private javax.swing.JButton takeTestButton;
    private javax.swing.JComboBox testList2;
    private javax.swing.JButton viewClassButton;
    // End of variables declaration//GEN-END:variables

    
    public void resetListFields() {
        this.testList2.removeAllItems();
        this.allClassesList.removeAllItems();
        this.availableTests.removeAllItems();
        this.classList.removeAllItems();
    }
    
    
    public static ArrayList<Test> initTest(String args1, String args2) throws FileNotFoundException {

        ArrayList<TrueFalseQuestion> q = new ArrayList<TrueFalseQuestion>();
        ArrayList<MultChoiceQuestion> q1 = new ArrayList<MultChoiceQuestion>();
        ArrayList<Test> allTest = new ArrayList<Test>();

        String question;
        String answer;
        File trueFalseQuestions = new File(args1);
        Scanner readFromFile = new Scanner(trueFalseQuestions);

        while (readFromFile.hasNextLine()) {
            question = readFromFile.nextLine();
            answer = readData(readFromFile);
            q.add(new TrueFalseQuestion(answer, question));
        }
        readFromFile.close();

        TrueFalseTest t1 = new TrueFalseTest(q, "Test1", "Java Class", 1);

        File multChoiceQuestions = new File(args2);
        readFromFile = new Scanner(multChoiceQuestions);
        String choice1;
        String choice2;
        String choice3;
        String choice4;
        while (readFromFile.hasNextLine()) {
            question = readFromFile.nextLine();
            choice1 = readData(readFromFile);
            choice2 = readData(readFromFile);
            choice3 = readData(readFromFile);
            choice4 = readData(readFromFile);
            answer = readData(readFromFile);

            ArrayList<String> choices = new ArrayList<>();
            choices.add(choice1);
            choices.add(choice2);
            choices.add(choice3);
            choices.add(choice4);
            q1.add(new MultChoiceQuestion(question, answer, choices));
        }

        readFromFile.close();
        MultipleChoiceTest t2 = new MultipleChoiceTest(q1, "Test2", "Java S", 2);

        allTest.add(t1);
        allTest.add(t2);
        
        return allTest;
    }

    public static String readData(Scanner s) {
        String rtrString = null;
        if (s.hasNextLine()) {
            rtrString = s.nextLine();
        } else {
            System.out.println("Data has been corrupted\n");
            System.exit(0);
        }

        return rtrString;

    }
    
  
    
    private Test getTest(String nameOfTest) {
        for (int i = 0; i < this.tests.size(); i++) {
            if (this.tests.get(i).getName().equals(nameOfTest)) {
                return this.tests.get(i);
            }
        }
        return null;
    }

    private String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }
}
