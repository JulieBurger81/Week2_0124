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

public class TestBuildBreakfast {
	BuildBreakfast build = new BuildBreakfast();
	Breakfast julie = new Breakfast("Saturday", "Julie");
	Breakfast carl = new Breakfast("Sunday", "Carl");
	Breakfast mckenzie = new Breakfast("Monday", "Mckenzie");
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBuildNumOfTatorTots() {
		assertEquals(3, build.determineNumOfTatorTots(julie));
		assertEquals(16, build.determineNumOfTatorTots(carl));
		assertEquals(5, build.determineNumOfTatorTots(mckenzie));
	}
	
	@Test
	public void testBuildMeat() {
		assertEquals("Meatballs", build.determineMeat(julie));
		assertEquals("Turkey Sausage Patties", build.determineMeat(carl));
		assertNull(build.determineMeat(mckenzie));
	}
	
	@Test
	public void testBuildTopping() {
		assertEquals("Medium Salsa", build.determineTopping(julie));
		assertEquals("Mild Sauce", build.determineTopping(carl));
		assertNull(build.determineTopping(mckenzie));
	}

}
