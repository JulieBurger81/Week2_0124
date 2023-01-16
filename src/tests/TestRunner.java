/**
 * @author Julie Burger - jaburger
 * CIS175 - Spring 2023
 * Jan 15, 2023
 */
package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Result buildResult = JUnitCore.runClasses(TestBuildBreakfast.class);
		Result eatResult = JUnitCore.runClasses(TestEatBreakfast.class);
		
		for (Failure failure : buildResult.getFailures()) {
			System.out.println(failure.toString());
		}
		
		for (Failure failure : eatResult.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println("Build Result - " + buildResult.wasSuccessful());
		System.out.println("Eat Result - " + buildResult.wasSuccessful());

	}

}
