package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {

	@Test
	public void test1() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
		result.contains("The name of the homecity is big and the participant is 30 or older"));
		
		Game game = new Game();
		assertEquals (dataAnalysis.getResultStringNamesAndAge(values),"The first name is greater or equals in size to the last name and the participant older than 30");
		assertEquals (dataAnalysis.getResulStringHomecityAndAge(values),"The name of the homecity is big and the participant is 30 or older");
	
	}

}
