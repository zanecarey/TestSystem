package testSystem;
import java.util.ArrayList;

/**
 *
 * @author Alejandro, Alec, Zane, Tucker
 * @version 12/5/14
 *
 */

public abstract class Test<T> 
{
    private static final int NUM_QUESTIONS = 25;
    
    //array of questions for the test
    private ArrayList<T> questions = new ArrayList<>();
    
    //names for class, test
    private String testName, className;
    
    //test number
    private int testID;
    
    //constructor
    public Test(ArrayList<T> questions, String testName, String className, int testID)
    {
        this.questions = questions;
        this.testName = testName;
        this.className = className;
        this.testID = testID;
        
    }
    
    //access methods and mutators
    public ArrayList<T> getQuestions()
    {
        return this.questions;
    }
    
    public void setQuestions(ArrayList<T> questions)
    {
        this.questions = questions;
    }
    
    public String getName()
    {
        return this.testName;
    }
    
    public void setName(String name)
    {
        this.testName = name;
    }
    
    public String getClassName()
    {
        return this.className;
    }
    
    public void setClassName(String className)
    {
        this.className = className;
    }
         
    public int getTestID()
    {
        return this.testID;
    }
    
    public void setTestID(int ID)
    {
        this.testID = ID;
    }
    
    public String toString() {
        return "Name of Test = " + this.testName;
    }
}
