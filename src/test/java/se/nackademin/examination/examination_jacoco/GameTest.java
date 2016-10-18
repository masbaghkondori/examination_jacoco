package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GameTest {



	@Test
	public void test_calculateOutPutBasedOnNames() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", i, 1);
		
		int j = game.calculateOutPutBasedOnNames("Sina", "Jahani");
		assertEquals("The result should be 1", j, 0);
		
		int k = game.calculateOutPutBasedOnNames("Mina" ,"Abdi");
		assertEquals("The result should be 1", k, 2);
	}

	
	@Test
	public void test_getGenderFromInputValues() {
		Game game = new Game();

		ArrayList<String> arrayOfInputs1 = new ArrayList<String>();
		arrayOfInputs1.addAll(Arrays.asList("mm","Sara", "jalali", "F", "25", "Stockholm"));
		assertEquals(game.getGenderFromInputValues(arrayOfInputs1), 'F');
		
		ArrayList<String> arrayOfInputs2 = new ArrayList<String>();
		arrayOfInputs2.addAll(Arrays.asList("kjk","Reza", "jalali", "M", "25", "Stockholm"));
		assertEquals(game.getGenderFromInputValues(arrayOfInputs2), 'M');
		
	}

	@Test
	public void test_getAgeFromInputValues() {
		Game game = new Game();

		ArrayList<String> arrayOfInputs = new ArrayList<String>();
		arrayOfInputs.addAll(Arrays.asList("kjk","Sara", "jalali", "F", "25", "Stockholm"));
		assertEquals("The result should be 25", game.getAgeFromInputValues(arrayOfInputs), 25);
		/*arrayOfInputs.addAll(Arrays.asList("Sara", "jalali", "F", "35", "Stockholm"));
		assertEquals("The result should be 25", game.getAgeFromInputValues(arrayOfInputs), 1);*/
	}

	@Test
	public void test_calculateOutPutBasedOnGender() {
		Game game = new Game();

		int j1 = game.calculateOutPutBasedOnGender('M');
		assertEquals("The result should be 0", j1, 0);
		int j2 = game.calculateOutPutBasedOnGender('F');
		assertEquals("The result should be 1", j2, 1);
		int j3 = game.calculateOutPutBasedOnGender('H');
		assertEquals("The result should be 2", j3, 2);
		
	}

	@Test
	public void test_calculateOutPutBasedOnAge() {
		Game game = new Game();
		int a = game.calculateOutPutBasedOnAge(24);
		assertEquals("The result should be 1", a, 0);
		
		int b = game.calculateOutPutBasedOnAge(30);
		assertEquals("The result should be 1", b, 1);

	}

	@Test
	public void test_calculateOutPutBasedOnHomeCity() {
		Game game = new Game();

		assertEquals("The result should be 5", game.calculateOutPutBasedOnHomeCity("Athens"), 0);
		assertEquals("The result should be 5", game.calculateOutPutBasedOnHomeCity("Berlin"), 1);
		assertEquals("The result should be 5", game.calculateOutPutBasedOnHomeCity("Copenhagen"), 2);
		assertEquals("The result should be 5", game.calculateOutPutBasedOnHomeCity("Düsseldorf"), 3);
		assertEquals("The result should be 5", game.calculateOutPutBasedOnHomeCity("Edinburgh"), 4);

		assertEquals("The result should be 5", game.calculateOutPutBasedOnHomeCity("Fortaleza"), 5);
		assertEquals("The result should be 5", game.calculateOutPutBasedOnHomeCity("Genova"), 6);
		assertEquals("The result should be 5", game.calculateOutPutBasedOnHomeCity("Hamburg"), 7);

		assertEquals("The result should be 5", game.calculateOutPutBasedOnHomeCity("Istambul"), 8);
		assertEquals("The result should be 5", game.calculateOutPutBasedOnHomeCity("jakarta"), 9);
		assertEquals("The result should be 5", game.calculateOutPutBasedOnHomeCity("Malmö"), 10);

	}


}
