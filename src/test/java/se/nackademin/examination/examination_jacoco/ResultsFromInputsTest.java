package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResultsFromInputsTest {
	
	
	@Test
	public void testNameGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForNameLenght(7);
		assertEquals("The result should be 7", resultsFromInputs.getResultForNameLenght(), 7);
	}

	@Test
	public void testAgeGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForAge(25);
		assertEquals("The result should be 25", resultsFromInputs.getResultForAge(), 25);
	}
	@Test
	public void testGenderGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForGender(0);
		assertEquals("The result should be 0", resultsFromInputs.getResultForGender(), 0);
		
		
	}
		

	@Test
	public void testHomeCityGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForHomeCity(5);
		assertEquals("The result should be 5", resultsFromInputs.getResultForHomeCity(), 5);
		
		
	}

}
