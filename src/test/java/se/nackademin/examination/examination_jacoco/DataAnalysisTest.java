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
	
	}

	
	@Test
	public void test_getResultStringNamesAndAge(){
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String s=dataAnalysis.getResultStringNamesAndAge(values);
		assertEquals (dataAnalysis.getResultStringNamesAndAge(values),"The first name is greater or equals in size to the last name and the participant older than 30");
		
		values.clear();
		values.addAll(Arrays.asList("Play", "Neda", "Salimi", "F", "25", "Tehran"));
		assertEquals (dataAnalysis.getResultStringNamesAndAge(values),"The first name is smaller or equals in size to the last name and the participant is 30 or younger");
		
		values.clear();
		values.addAll(Arrays.asList("Play", "Mandana", "Salimi", "F", "28", "Tehran"));
		assertEquals (dataAnalysis.getResultStringNamesAndAge(values),"No analysis was performed");	

	}
	@Test
	public void test_getResulStringHomecityAndAge(){
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "32", "Ghom"));
		String s=dataAnalysis.getResulStringHomecityAndAge(values);
		assertEquals (dataAnalysis.getResulStringHomecityAndAge(values),"The name of the homecity is small and the participant is 30 or older");
		
		values.clear();
		values.addAll(Arrays.asList("Play", "Neda", "Salimi", "F", "28", "Ghom"));
		assertEquals (dataAnalysis.getResulStringHomecityAndAge(values),
				"The name of the homecity is small and the participant is younger than 30");
		
		values.clear();
		values.addAll(Arrays.asList("Play", "Mandana", "Salimi", "F", "34","Stockholm" ));
		assertEquals (dataAnalysis.getResulStringHomecityAndAge(values),
				"The name of the homecity is big and the participant is 30 or older");	
		
		values.clear();
		values.addAll(Arrays.asList("Play", "Mandana", "Salimi", "F", "28", "Stockholm"));
		assertEquals (dataAnalysis.getResulStringHomecityAndAge(values),"The name of the homecity is big and the participant is younger than 30");	

	}
	
	}

