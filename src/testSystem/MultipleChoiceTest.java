package testSystem;

import java.util.ArrayList;


public class MultipleChoiceTest<T> extends Test<T> {

	public MultipleChoiceTest(ArrayList<T> questions, String testName,
			String className, int testID) {
		super(questions, testName, className, testID);
	}

}
