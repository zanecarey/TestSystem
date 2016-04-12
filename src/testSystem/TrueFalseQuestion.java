package testSystem;

/**
 *
 * @author Alejandro, Alec, Zane, Tucker
 * @version 12/5/14
 *
 */
public class TrueFalseQuestion {

    private String answer;
    private String question;

    public TrueFalseQuestion(String answer, String question) {
        this.answer = answer;
        this.question = question;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setAnswer(String an) {
        this.answer = an;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String qu) {
        this.question = qu;
    }

}
