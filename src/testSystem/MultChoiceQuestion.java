package testSystem;

import java.util.ArrayList;

/**
 *
 * @author Alejandro, Alec, Zane, Tucker
 * @version 12/5/14
 *
 */
public class MultChoiceQuestion {

    private String question;
    private ArrayList<String> choice;
    private String correctAnswer;
    private int location;

    /**
     * used to select the appropiate string from the list
     */

    public MultChoiceQuestion(String question, String answer, ArrayList<String> choice) {
        this.question = question;
        this.correctAnswer = answer;
        this.choice = choice;
        this.location = 0;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswers() {
        return this.correctAnswer; //stub
    }

    public void setAnswers(String answer) {
        this.correctAnswer = answer;
    }

    public ArrayList<String> getListChoices() {
        return this.choice;
    }

    public void setListChoices(ArrayList<String> listChoices) {
        this.choice = listChoices;
    }

    /**
     * This method will be used to initialize the state of the gui. It selects
     * the string of choices one by one after each consecutive call. So if we
     * want to get the fourth String from the list simply call getChoice four
     * times.
     *
     * @return Choice a possible answer.
     */
    public String getChoice() {
        String selectedChoice = null;

        selectedChoice = this.choice.get(this.location);

        this.location = (this.location + 1) % this.choice.size();

        return selectedChoice;
    }

}
