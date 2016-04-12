package testSystem;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Alejandro, Alec, Zane, Tucker
 * @version 12/5/14
 *
 */

public class Course implements Serializable {
    private static final long serialVersionUID = 00000003;
    
    private static final int NUM_TESTS = 25;
    
    //the tests
    private Test [] tests; 
    
    //name of class, and class description
    private String className, description;
    private User instructor;
    private String subject;
    
    
    //constructor
    public Course(Test[] tests, String className, String description, String subject)
    {
        this.tests = tests;
        this.className = className;
        this.description = description;
        this.subject = subject;
    }
    
    public boolean hasTests() {
        if (this.tests != null)
            return true;
        else
            return false;
    }
    
    //accessors and mutators
    public String getName()
    {
        return this.className;
    }
    
    public void setName(String name)
    {
        this.className = name;
    }

    //accessors and mutators
    public String getSubject()
    {
        return this.subject;
    }
    
    public void setSubject(String subject)
    {
        this.subject = subject;
    }
    
    public User getInstructor()
    {
        return this.instructor;
    }
    
    public void setInstructor(User teacher)
    {
        this.instructor = teacher;
    }
    
    public String getDescription()
    {
        return this.description;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public Test [] getTests()
    {
        return this.tests;
    }
    
    public void addTest(Test testToAdd) {
        Test [] temp = new Test[this.tests.length + 1];
        for (int i = 0; i < this.tests.length; i++) {
            temp[i] = tests[i];
        }
        temp[temp.length-1] = testToAdd;
        this.tests = temp;
    }
}
