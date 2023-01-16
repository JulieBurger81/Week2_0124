/**
 * @author Julie Burger - jaburger
 * CIS175 - Spring 2023
 * Jan 15, 2023
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Breakfast;
import model.BuildBreakfast;
import model.EatBreakfast;

public class TestEatBreakfast {
	EatBreakfast eat = new EatBreakfast();
	Breakfast adult = new Breakfast("Tuesday", "Julie");
	Breakfast child = new Breakfast("Wednesday", "Mckenzie");
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDetermineShowToWatch() {
		assertNotNull(eat.determineShowToWatch(adult));
		assertNull(eat.determineShowToWatch(child));
	}

}
