

package testSystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro, Alec, Zane, Tucker
 * @version 12/5/14
 *
 */

public class TestSystem implements Serializable {
    
    
    private ArrayList<User> users;
    private ArrayList<Course> classes;
    private final int STUDENT = 0;
    private final int INSTRUCTOR = 1;
    private final int ADMIN = 2;
    private static final long serialVersionUID = 00000001;

  
    
    public TestSystem() {
        this.users = new ArrayList<User>();
        this.classes = new ArrayList<Course>();
    }
    
    

        
    /**
     * Adds user's to the database.
     * @param newUser the new user that will be added to the database.
     */
    public void addUser(User newUser) {
        if (newUser != null) {
            this.users.add(newUser);
        }
    }
    
    /**
     * Removes a specific user from the database.
     * @param user the user to remove.
     * @return 1 if it was successful removing the user -1 otherwise.
     */
    public int removeUser(User user) {
        if (user != null) {
            int location = findUser(user);
            if (location != -1) {
                this.users.remove(location);
                return 1;
            }
        }
        return -1;
    }
    
    /**
     * Finds the location of a specific user in the database.
     * @param user the user we are trying to search for.
     * @return index the location were the user is located -1 if not found.
     */
    public int findUser(User user) {
        for (int index = 0; index < this.users.size(); index++) {
            User currentUser = this.users.get(index);
            if (user.equals(currentUser)) {
                return index;
            }
        }
        return -1; /** user was not found */
    }
    
    /**
     * Test if the correct input was given by matching it with one that
     * is found in the database.
     * @param userName the name of the user
     * @param passWord the password of the user
     * @param userID the user id number that is unique to each person.
     * @return the User data (null otherwise).
     */
    public User pass(String userName, String passWord) {
        for (int i = 0; i < this.users.size(); i++) {
            User currentUser = this.users.get(i);
            if (checkEntry(currentUser, userName, passWord) == true)
                return currentUser;
        }
        return null;
    }
    
    private boolean checkEntry(User user, String userName, String passWord) {
        return user.getUsername().equals(userName) &&
                user.getPassword().equals(passWord);
    }

   
    
/**
    * Method for adding classes to the system
    * @return 
    */
    public void addCourse( Course course ) {
        this.classes.add(course);
    }        

    

    /**
    * Method for the list of Users in the System
    * @return list of Users
    */
    public ArrayList<User> getUsers() {
        return this.users;
    }
    
    /**
    * Method Sets the List of users to the input parameters
    * @return 
    */
    public void setUsers( ArrayList<User> users1 ) {
        this.users = users1;
    }

    /**
    * Method the Course at the specified index in the System
    * @return class 
    */
    public Course getCourse( String className ) {
        for ( Course course : this.classes ) {
            if (className.equals(course.getName()))
                return course;
        }
        return null;
    }
    
    /**
    * Method for the list of Classes in the System
    * @return list of classes
    */// 
    public ArrayList<Course> getClasses() {
        return this.classes;
    }
    
    /**
    * Method Sets the List of classes to the input parameters
    * @return 
    */
    public void setClasses( ArrayList<Course> classes1 ) {
        this.classes = classes1;
    }

    /**
    * Method for removing a specific class from the list of classes
    * @return 
    */
    public void removeClass( Course class1) {
        this.classes.remove(class1);
    }
    
    
 


    


}
