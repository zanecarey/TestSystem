
package testSystem;
import java.io.Serializable;
import javax.swing.*;

import java.util.ArrayList;

/**
 *
 * @author Alejandro, Alec, Zane, Tucker
 * @version 12/5/14
 *
 */


public class User implements Serializable {
    private static final long serialVersionUID = 00000002;
    private int permissionNum;
    private String username;
    private String password;
    private String userEmail;
    private ArrayList<Course> classes;
    public ArrayList<Double> testScores;
    public final String [] USER_TYPES = { "Student", "Instructor", "Administrator"};

    /**
     * Creates a user with a given reference to a Student, Instructor, or Administrator. 
     * @param person a reference to Student, Instructor, or Administrator.
     */
    public User(String username, String password, String email, int permission) {
            this.username = username;
            this.password = password;
            this.userEmail = email;
            this.permissionNum = permission;
    }


    /**
     * This method returns the permission
     * number for the User.
     */
    public int getPermissionNum() {
        return this.permissionNum;
    }


    /**
            For these private methods they will be called when a particular user
            forgets his or her password. However, they will have to provide some other
            form of validation that will determined if they are in fact that particular
            user. (Answer some form of questions).
     */

     /**
     * The following methods handle classes for the User
     * he/she is enrolled in.
     */
    public ArrayList<Course> getClasses() {
        return this.classes;
    }

    public void setClasses(ArrayList<Course> classes) {
        this.classes = classes;
    }

    public void addClass(Course class1) {
        this.classes.add(class1);
    }

    /**
     * The following methods handle classes for the User
     * he/she is enrolled in.
     */
    public ArrayList<Double> getScores() {
        return this.testScores;
    }
    
    public Double getGrade(int i) {
        return this.testScores.get(i);
    }

    public void setScores(ArrayList<Double> scores) {
        this.testScores = scores;
    }

    public void addScores(Double score) {
        this.testScores.add(score);
    }

    /**
     * Gets the password of a particular user.
     * @return password 
     */
    public String getPassword() {
            return this.password;
    }

    /**
     * Sets the password for the particular user.
     * @param password the password of a particular user.
     */
    public void setPassword(String password) {
            this.password = password;
    }

    /**
     * Get the username of a particular person.
     * @return username the identity of a person online.
     */
    public String getUsername() {
            return this.username;
    }

    /**
     * Sets the username for the particular user.
     * @param username the identity of a person online.
     */
    public void setUsername(String username) {
            this.username = username;
    }
    
	
}